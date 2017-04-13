package calculadora;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.math.NumberUtils;

import com.mk.bandas.dao.FaixaVariavelDao;
import com.mk.bandas.dao.ZonaDao;
import com.mk.bandas.model.FaixaVariavel;
import com.mk.bandas.model.Zona;

public class CalculadoraVariavelMov {

	private MatrizValidacaoHelper matrizHelper = new MatrizValidacaoHelper();
	private Integer qtdeFusoes;
	private ZonaDao zonaDao;
	private FaixaVariavelDao faixaVariavelDao;
	private final String NOME_VARIAVEL = "mov";
	private Integer maxZonasEmAgrupamento; 

	public CalculadoraVariavelMov(ParamsCalculadora params) {
		this.qtdeFusoes = params.getQtdeFusoes();
		this.maxZonasEmAgrupamento = params.getMaxZonasEmAgrupamento();
		this.zonaDao = params.getZonaDao();
		this.faixaVariavelDao = params.getFaixaVariavelDao();
		
	}

	public Float calcular(String solucao) throws Exception {
		Float somaParciais = 0F;
		String[][] matriz = this.matrizHelper.criarMatriz(solucao, this.maxZonasEmAgrupamento);
		//this.printMatrix(matriz);
		List<Integer> listaZonasNaLinhaDaMatriz = new ArrayList<Integer>();
		for (int i = 0; i < matriz.length; i++) {
			listaZonasNaLinhaDaMatriz = new ArrayList<Integer>();
			for (int j = 0; j < matriz[i].length; j++) {
				if (NumberUtils.isDigits(matriz[i][j])) {
					listaZonasNaLinhaDaMatriz.add(Integer.parseInt(matriz[i][j]));
				}
				
			}
			if (listaZonasNaLinhaDaMatriz.size() > 0) {
				somaParciais = somaParciais + this.calcularParcial(listaZonasNaLinhaDaMatriz);
			}
		}
		//return somaParciais / qtdeFusoes;
		return somaParciais / matriz.length; //dividindo pelo numero de agrupamentos
	}

	private Float calcularParcial(List<Integer> listaZonasNaLinhaDaMatriz) throws Exception {
		Float somaMovimentacoes = 0F;
		for (int i = 0; i < listaZonasNaLinhaDaMatriz.size(); i++) {
			Integer numZona = listaZonasNaLinhaDaMatriz.get(i);
			Zona zona =  zonaDao.buscar(numZona);
			somaMovimentacoes = somaMovimentacoes + zona.getMovimentacao();
		}
		FaixaVariavel faixa = this.faixaVariavelDao.buscar(NOME_VARIAVEL, somaMovimentacoes);;
		return faixa.getPontuacao();		
	}
	
	public void printMatrix(String[][] m){
	    try{
	        int rows = m.length;
	        int columns = m[0].length;
	        String str = "|\t";

	        for(int i=0;i<rows;i++){
	            for(int j=0;j<columns;j++){
	                str += m[i][j] + "\t";
	            }

	            System.out.println(str + "|");
	            str = "|\t";
	        }

	    }catch(Exception e){System.out.println("Matrix is empty!!");}
	}

}

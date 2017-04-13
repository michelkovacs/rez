import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.math.NumberUtils;

import com.mk.bandas.dao.FaixaVariavelDao;
import com.mk.bandas.dao.ZonaDao;
import com.mk.bandas.model.FaixaVariavel;
import com.mk.bandas.model.Zona;

import calculadora.MatrizValidacaoHelper;

public class CalculadoraVariavelEleit {

	private List<FaixaVariavel> listaFaixas;
	private MatrizValidacaoHelper matrizHelper = new MatrizValidacaoHelper();
	private Integer qtdeFusoes;
	private ZonaDao zonaDao;
	private FaixaVariavelDao faixaVariavelDao;
	private final String NOME_VARIAVEL = "eleat";
	private Integer qtdeMaximaDeFusoes; 

	public CalculadoraVariavelEleit(Integer qtdeFusoes, Integer qtdeMaximaDeFusoes, ZonaDao zonaDao, FaixaVariavelDao faixaVariavelDao) {
		this.qtdeFusoes = qtdeFusoes;
		this.qtdeMaximaDeFusoes = qtdeMaximaDeFusoes;
		this.zonaDao = zonaDao;
		this.faixaVariavelDao = faixaVariavelDao;
		
	}

	public Float calcular(String combinacao) throws Exception {
		Float somaParciais = 0F;
		String[][] matriz = this.matrizHelper.criarMatriz(combinacao, this.qtdeMaximaDeFusoes);
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
		return somaParciais / qtdeFusoes;
	}

	private Float calcularParcial(List<Integer> listaZonasNaLinhaDaMatriz) throws Exception {
		Float somaEleitores = 0F;
		for (int i = 0; i < listaZonasNaLinhaDaMatriz.size(); i++) {
			Integer numZona = listaZonasNaLinhaDaMatriz.get(i);
			Zona zona =  zonaDao.buscar(numZona);
			somaEleitores = somaEleitores + zona.getEleitoradoAtual();
		}
		FaixaVariavel faixa = this.faixaVariavelDao.buscar(NOME_VARIAVEL, somaEleitores);;
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

package calculadora;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.math.NumberUtils;

import com.google.common.collect.Table;
import com.mk.bandas.dao.FaixaVariavelDao;
import com.mk.bandas.dao.ZonaDao;
import com.mk.bandas.model.FaixaVariavel;
import com.mk.bandas.model.Zona;

public class CalculadoraVariavelEleat {

	private MatrizValidacaoHelper matrizHelper = new MatrizValidacaoHelper();
	private ZonaDao zonaDao;
	private FaixaVariavelDao faixaVariavelDao;
	public static final String NOME_VARIAVEL = "eleat";
	public final static String NOME_COLUNA_SOMA = "soma eleitores atuais";
	private ParamsCalculadora paramsCalculadora;

	public CalculadoraVariavelEleat(ParamsCalculadora params) {
		this.zonaDao = params.getZonaDao();
		this.faixaVariavelDao = params.getFaixaVariavelDao();
		this.paramsCalculadora = params;
	}
	
	public Float calcular(String solucao) throws Exception {
		return calcular(solucao, null);
	}
	
	public Float calcular(String solucao, Table<Integer, String, Float> tabelaDetalhes) throws Exception {
		Float somaParciais = 0F;
		String[][] matriz = this.matrizHelper.criarMatriz(solucao, paramsCalculadora.getMaxZonasEmAgrupamento(), paramsCalculadora.getVetorZonas());
		List<Integer> listaZonasNaLinhaDaMatriz = new ArrayList<Integer>();
		for (int i = 0; i < matriz.length; i++) {
			listaZonasNaLinhaDaMatriz = new ArrayList<Integer>();
			for (int j = 0; j < matriz[i].length; j++) {
				if (NumberUtils.isDigits(matriz[i][j])) {
					listaZonasNaLinhaDaMatriz.add(Integer.parseInt(matriz[i][j]));
				}
				
			}
			if (listaZonasNaLinhaDaMatriz.size() > 0) {
				somaParciais = somaParciais + this.calcularParcial(listaZonasNaLinhaDaMatriz, tabelaDetalhes, i);
			}
		}
		
		//return somaParciais / qtdeFusoes;
		return somaParciais / matriz.length; //dividindo pelo numero de agrupamentos
	}

	private Float calcularParcial(List<Integer> listaZonasNaLinhaDaMatriz, Table<Integer, String, Float> tabelaDetalhes, int numLinhaMatriz) throws Exception {
		Float somaEleitores = 0F;
		Float pontuacao = 0F;
		for (int i = 0; i < listaZonasNaLinhaDaMatriz.size(); i++) {
			Integer numZona = listaZonasNaLinhaDaMatriz.get(i);
			Zona zona =  zonaDao.buscar(numZona);
			somaEleitores = somaEleitores + zona.getEleitoradoAtual();
		}
		FaixaVariavel faixa = this.faixaVariavelDao.buscar(NOME_VARIAVEL, somaEleitores);;
		
		pontuacao = faixa.getPontuacao();
		if (tabelaDetalhes != null) {
			tabelaDetalhes.put(numLinhaMatriz, NOME_VARIAVEL, pontuacao);
			tabelaDetalhes.put(numLinhaMatriz, NOME_COLUNA_SOMA, somaEleitores);
		}
		return pontuacao;		
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

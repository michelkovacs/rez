package br.jus.trerj.rezon.calculadora;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.math.NumberUtils;

import com.google.common.collect.Table;

import br.jus.trerj.rezon.dao.FaixaVariavelDao;
import br.jus.trerj.rezon.dao.ZonaDao;
import br.jus.trerj.rezon.model.FaixaVariavel;
import br.jus.trerj.rezon.model.Zona;

public class CalculadoraVariavelMov {

	private MatrizValidacaoHelper matrizHelper = new MatrizValidacaoHelper();
	private ZonaDao zonaDao;
	private FaixaVariavelDao faixaVariavelDao;
	public static final String NOME_VARIAVEL = "mov";
	public final static String NOME_COLUNA_SOMA = "soma movimentacoes";
	private ParamsCalculadora paramsCalculadora;

	public CalculadoraVariavelMov(ParamsCalculadora params) {
		this.zonaDao = params.getZonaDao();
		this.faixaVariavelDao = params.getFaixaVariavelDao();
		this.paramsCalculadora = params;
	}

	public Float calcular(String solucao) throws Exception {
		return calcular(solucao, null);
	}
	
	public Float calcular(String solucao, Table<Integer, String, Float> tabelaDetalhes) throws Exception {
		Float somaParciais = 0F;
		String[][] matriz = this.matrizHelper.criarMatriz(solucao, this.paramsCalculadora.getMaxZonasEmAgrupamento(), paramsCalculadora.getVetorZonas());
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
				somaParciais = somaParciais + this.calcularParcial(listaZonasNaLinhaDaMatriz, tabelaDetalhes, i);
			}
		}
		//return somaParciais / qtdeFusoes;
		return somaParciais / matriz.length; //dividindo pelo numero de agrupamentos
	}

	private Float calcularParcial(List<Integer> listaZonasNaLinhaDaMatriz, Table<Integer, String, Float> tabelaDetalhes, int numLinhaMatriz) throws Exception {
		Float somaMovimentacoes = 0F;
		Float pontuacao = 0F;
		for (int i = 0; i < listaZonasNaLinhaDaMatriz.size(); i++) {
			Integer numZona = listaZonasNaLinhaDaMatriz.get(i);
			Zona zona =  zonaDao.buscar(numZona);
			somaMovimentacoes = somaMovimentacoes + zona.getMovimentacao();
		}
		FaixaVariavel faixa = this.faixaVariavelDao.buscar(NOME_VARIAVEL, somaMovimentacoes);
		
		pontuacao = faixa.getPontuacao();
		if (tabelaDetalhes != null) {
			tabelaDetalhes.put(numLinhaMatriz, NOME_VARIAVEL, pontuacao);
			tabelaDetalhes.put(numLinhaMatriz, NOME_COLUNA_SOMA, somaMovimentacoes);
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

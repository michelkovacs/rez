package br.jus.trerj.rezon.model;

import java.util.Arrays;

import br.jus.trerj.rezon.calculadora.MatrizValidacaoHelper;
import br.jus.trerj.rezon.tx.GerenciadorDeTransacao;

/***
 * @author 104144350310
 * Esta classe serve para exibicao de solucoes não repetidas
 * pois o algoritmo gera solucoes iguais, devido a biblioteca de combinacoes, onde apenas algumas zonas mudam de posicao dentro de um agrupamento.
 * Ex:  o programa pode gerar as seguintes solucoes
 * 
 * 1-2
 * 3-4-5
 * 
 * 1-2
 * 3-5-4
 * 
 * Então, esta classe sobrescreve os metodos equals e hashcode, para que possamos trabalhar com colecoes
 * que contenham apenas solucoes nao repetidas.  E assim poder exibi-las para o usuario ou gerar o CSV.
 */


public class SolucaoUnica {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6836036030616830275L;	
	private Solucao solucao;
	private MatrizValidacaoHelper matrizHelper = new MatrizValidacaoHelper();
	private int maxZonasEmAgrupamento;
	private String[][] matrizSolucao;

	public Solucao getSolucao() {
		return solucao;
	}
	
	public SolucaoUnica(Solucao solucao, int qtdeMaximaFusoes) {
		this.maxZonasEmAgrupamento = qtdeMaximaFusoes;
		this.solucao = solucao;
		this.matrizSolucao = matrizHelper.criarMatriz(this.solucao.textoSolucao, this.maxZonasEmAgrupamento);
		
		//criando uma matriz de solucao com os itens ordenados, 
		//para ajudar na identificacao de solucoes iguais atraves do hashcode e equals
		for (int i = 0; i < matrizSolucao.length; i++) {
			for (int j = 0; j < matrizSolucao[i].length; j++) {
				if (matrizSolucao[i][j] == null)
					matrizSolucao[i][j] = "";
			}
			
		}
		
		for (String[] agrupamento : matrizSolucao) {
			Arrays.sort(agrupamento);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(matrizSolucao);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SolucaoUnica other = (SolucaoUnica) obj;
		if (!Arrays.deepEquals(matrizSolucao, other.matrizSolucao))
			return false;
		return true;
	}
	
}

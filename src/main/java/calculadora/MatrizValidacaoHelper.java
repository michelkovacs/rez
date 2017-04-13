package calculadora;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.linear.MatrixUtils;

public class MatrizValidacaoHelper {
	public class EnderecoNaMatriz {
		public String elemento;
		public int linha;
		public int coluna;		
	}
	
	public static final String DELIMITADOR_COMBINACOES = ",";
	public static final String CHAR_ENVOLVE_COMBINACAO = "|";
	public static final String CHAR_INICIO_ZONA = "(";
	public static final String CHAR_FIM_ZONA = ")";
	public static final String CHAR_FUSAO_ZONAS = "-";
	
	public void validacaoSimples(String textoCombinacoes, int maximoDeZonasEmFusao) {
		
	}
	
	public String geraString(String[][] m) {
		String saida = "";
		try {
			int rows = m.length;
			int columns = m[0].length;
			String str = "|\t";

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					saida += m[i][j] + "\t";
				}

				saida = saida + "|";
				saida = saida + "|\t";
			}

		} catch (Exception e) {
			System.out.println("Matrix is empty!!");
		}

		 return saida;
	}
	
	public String[][] criarMatriz(String combinacoes, int qtdeMaximaDeFusoes) {

		combinacoes = combinacoes.replace(CHAR_ENVOLVE_COMBINACAO, "");
		String[] arrayCombinacoes = combinacoes.split(DELIMITADOR_COMBINACOES);
		int largura = arrayCombinacoes.length*qtdeMaximaDeFusoes;
		int altura = arrayCombinacoes.length;
		
		//inicio com largura bem grande, para caber todos
		//em uma linha se for necessario
		//ao final as colunas serao reduzidas
		String[][] matrizValidacao = new String[altura][largura]; 
		
		/*******fazendo o parse da string passada para um vetor de duas colunas com todos os pares**********/
		String[][] pares = new String[altura][2];
		int larguraFinal= 2;
		for (int i = 0; i < arrayCombinacoes.length; i++) {
			String[] par = new String[2];
			par = arrayCombinacoes[i].split(CHAR_FUSAO_ZONAS);
			par[0] = par[0].replace(CHAR_INICIO_ZONA, "").replace(CHAR_FIM_ZONA, "");
			par[1] = par[1].replace(CHAR_INICIO_ZONA, "").replace(CHAR_FIM_ZONA, "");
			pares[i][0] = par[0];
			pares[i][1] = par[1];
		}
		/********* fim do parse************/
		//crio um mapa com o endereco de cada elemento na matriz
		HashMap<String, EnderecoNaMatriz> mapaEnderecos = new HashMap<String, EnderecoNaMatriz>();
		
		//tenho que colocar os pares na matriz de validacao
		//percorrendo a matrix de pares
		int ultimaLinhaUtilizada = -1;
		int maiorColuna = 1;
		
		for (int i = 0; i < pares.length; i++) {
			//decidir onde colocar na matriz
			/*
			 * SE NENHUMA DAS DUAS ZONAS ESTA NA MATRIZ ENTAO
			 *   COLOCA O PAR NA PROXIMA LINHA LIVRE
			 * SE AO MENOS UMA DAS ZONAS JA ESTA NA MATRIZ ENTAO
			 *   ENCONTRA A LINHA
			 *   SE A ESTA NA LINHA, COLOCA B NA LINHA, NA PRIMEIRA COLUNA VAZIA
			 *   SE B ESTA NA LINHA, COLOCA A NA LINHA, NA PRIMEIRA COLUNA VAZIA
			 */
			String zonaA = pares[i][0];
			String zonaB = pares[i][1];
			if (! aoMenosUmaZonaEstaNaMatriz(zonaA, zonaB, mapaEnderecos)) {
				//nenhuma das duas na matriz
				//colocar em uma nova linha
				++ultimaLinhaUtilizada;
				inserirEmNovaLinhaNaMatriz(zonaA, zonaB, matrizValidacao, ultimaLinhaUtilizada);
				EnderecoNaMatriz enderecoNaMatrizA = new EnderecoNaMatriz();
				enderecoNaMatrizA.linha = ultimaLinhaUtilizada;
				enderecoNaMatrizA.coluna = 0;
				enderecoNaMatrizA.elemento = zonaA;
				mapaEnderecos.put(zonaA, enderecoNaMatrizA);
				EnderecoNaMatriz enderecoNaMatrizB = new EnderecoNaMatriz();
				enderecoNaMatrizB.linha = ultimaLinhaUtilizada;
				enderecoNaMatrizB.coluna = 1;
				enderecoNaMatrizB.elemento = zonaB;
				mapaEnderecos.put(zonaB, enderecoNaMatrizB);
				
			} else {
				int colunaOndeEncaixou = 0;
				//ao menos uma esta na matriz
				EnderecoNaMatriz enderecoNaMatriz;
				if (mapaEnderecos.containsKey(zonaA)) {
					enderecoNaMatriz = mapaEnderecos.get(zonaA);
					colunaOndeEncaixou = insereZonaNaLinha(zonaB, enderecoNaMatriz.linha, matrizValidacao);
					EnderecoNaMatriz enderecoNaMatrizB = new EnderecoNaMatriz();
					enderecoNaMatrizB.linha = enderecoNaMatriz.linha;
					enderecoNaMatrizB.coluna = colunaOndeEncaixou;
					enderecoNaMatrizB.elemento = zonaB;
					mapaEnderecos.put(zonaB, enderecoNaMatrizB);
				} else {
					if (mapaEnderecos.containsKey(zonaB)) {
						enderecoNaMatriz = mapaEnderecos.get(zonaB);
						colunaOndeEncaixou = insereZonaNaLinha(zonaA, enderecoNaMatriz.linha, matrizValidacao);
						EnderecoNaMatriz enderecoNaMatrizA = new EnderecoNaMatriz();
						enderecoNaMatrizA.linha = enderecoNaMatriz.linha;
						enderecoNaMatrizA.coluna = colunaOndeEncaixou;
						enderecoNaMatrizA.elemento = zonaA;
						mapaEnderecos.put(zonaA, enderecoNaMatrizA);
					}
				}
				
				if (colunaOndeEncaixou > maiorColuna)
					maiorColuna = colunaOndeEncaixou;
					
			}

		}

		String[][] matrizResumida = reduzColunasMatriz(matrizValidacao, maiorColuna+1);
		// initialize elements

		return matrizResumida;
	}


	private int insereZonaNaLinha(String zona, int linha, String[][] matrizValidacao) {
		//insere zona na primeira coluna livre na linha passada
		for (int coluna = 0; coluna < matrizValidacao[linha].length; coluna++) {
			if (matrizValidacao[linha][coluna] == null) {
				matrizValidacao[linha][coluna] = zona;
				return coluna;
			}
		}
		
		return 0;
		
	}

	private void inserirEmNovaLinhaNaMatriz(String zonaA, String zonaB, String[][] matrizValidacao, int ultimaLinhaUtilizada) {
		matrizValidacao[ultimaLinhaUtilizada][0] = zonaA;
		matrizValidacao[ultimaLinhaUtilizada][1] = zonaB;		
	}

	private boolean aoMenosUmaZonaEstaNaMatriz(String zonaA, String zonaB, HashMap<String, EnderecoNaMatriz> mapaEnderecos) {
		if (mapaEnderecos.containsKey(zonaA) || mapaEnderecos.containsKey(zonaB))
			return true;
		else
			return false;
	}

	private String[][] reduzColunasMatriz(String[][] matrizOriginal, int novaLargura) {
		//para eliminar linhas que ficaram com somente valores null, encontro o primeiro valor null na coluna zero, para definir a altura da matriz
		int novaAltura = 0;
		for (int i = 0; i < matrizOriginal.length; i++) {
			if (matrizOriginal[i][0] == null) {
				novaAltura = i;
				break;
			}
			novaAltura = i;
		}
		
		String[][] matrizReduzida = new String[novaAltura][novaLargura];
		for (int i = 0; i < novaAltura; i++) {
			for (int j = 0; j < novaLargura; j++) {
				matrizReduzida[i][j] = matrizOriginal[i][j];
			}
		}
		return matrizReduzida;
		
	}

	public boolean validarCombinacoes(String combinacoes, int qtdeDeFusoes, int maximoDeZonasEmFusao) {
 		String[][] matrizValidacao = this.criarMatriz(combinacoes, qtdeDeFusoes);
		if (matrizValidacao[0].length > maximoDeZonasEmFusao) 
			return false;
		
		//verifica se um elemento aparece em mais de uma linha na matriz gerada
		//ex invalido, pois o 12 esta em duas linhas diferentes:
		/*  
		 * 	|	5	8	12	|
			|	6	10	7	|
			|	9	11	12	|
		 */
		//pegando o conteudo da matriz e colocando em uma linha
		String matrizEmLinha = "";
		for (int i = 0; i < matrizValidacao.length; i++) {
			for (int j = 0; j < matrizValidacao[i].length; j++) {
				matrizEmLinha = matrizEmLinha + "-(" + matrizValidacao[i][j] + ")";
			}
		}
		//percorrendo a matriz e contando quantas vezes cada elemento aparece
		//utilizando a variavel com seu conteudo em uma linha
		for (int i = 0; i < matrizValidacao.length; i++) {
			for (int j = 0; j < matrizValidacao[i].length; j++) {
				if (matrizValidacao[i][j] == null) continue;
				int aparicoes = StringUtils.countMatches(matrizEmLinha, "(" + matrizValidacao[i][j] + ")");
				if (aparicoes > 1) {
					return false;
				}
			}
		}
		
		return true;
	}
}

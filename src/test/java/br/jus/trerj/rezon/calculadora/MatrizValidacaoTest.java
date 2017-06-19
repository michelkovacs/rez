package br.jus.trerj.rezon.calculadora;
import org.junit.Assert;
import org.junit.Test;

import br.jus.trerj.rezon.calculadora.MatrizValidacaoHelper;

public class MatrizValidacaoTest {

	public boolean assertMatrixEquals(String[][]m1, String[][]m2) {
		
		if (m1.length != m2.length) {
			return false;
		}
		
		if (m1[0].length != m2[0].length) {
			return false;
		}
		
		for (int i = 0; i < m1.length-1; i++) {
			for (int j = 0; j < m1[i].length-1; j++) {
				if(m1[i][j].equals( m2[i][j]) == false) {
					System.out.println("matrizes diferentes");
					System.out.println("M1");
					printMatrix(m1);
					System.out.println("M2");
					printMatrix(m2);
					return false;
					
				};
			}
		}
		
		
		return true;
		
	}
	@Test
	public void montarMatrizCenario1Simples() {
		int qtdeFusoes = 4;
		String[][] r = new String[4][2];
		String combinacoes = "|(1)-(2)|,|(3)-(4)|,|(5)-(6)|,|(7)-(8)|";
		MatrizValidacaoHelper matrizHelper = new MatrizValidacaoHelper();
		String[][] m = matrizHelper.criarMatriz(combinacoes, qtdeFusoes);
		/*matriz resultante esperada
		 *  | 1 | 2 | 
      		| 3 | 4 | 
      		| 5 | 6 | 
      		| 7 | 8 | 
		 */
		r[0][0] = "1";
		r[0][1] = "2";
		r[1][0] = "3";
		r[1][1] = "4";
		r[2][0] = "5";
		r[2][1] = "6";
		r[3][0] = "7";
		r[3][1] = "8";
		
		Assert.assertTrue(assertMatrixEquals(r, m));
	}
	
	@Test
	public void montarMatrizSomenteUmAgrupamentoCom3Zonas() {
		int maxZonasEmAgrupamento = 3;
		String[][] r = new String[1][3];
		String combinacoes = "|(241)-(242)|,|(242)-(243)|";
		MatrizValidacaoHelper matrizHelper = new MatrizValidacaoHelper();
		String[][] m = matrizHelper.criarMatriz(combinacoes, maxZonasEmAgrupamento);
		/*matriz resultante esperada
		 *  | 241 | 242 | 243 |
		 */
		r[0][0] = "241";
		r[0][1] = "242";
		r[0][2] = "243";
		
		Assert.assertTrue(assertMatrixEquals(r, m));
	}
	
	@Test
	public void MontarMatrizCenario2Com3ElementosEmUmaLinhaDaMatriz() {
		int maxZonasEmAgrupamento = 3;
		String[][] r = new String[3][3];
		String combinacoes = "|(1)-(2)|,|(2)-(4)|,|(5)-(6)|,|(7)-(8)|";
		MatrizValidacaoHelper matrizHelper = new MatrizValidacaoHelper();
		String[][] m = matrizHelper.criarMatriz(combinacoes, maxZonasEmAgrupamento);
		/*matriz resultante esperada
		 *  | 1 | 2 | 4 |
		    | 5 | 6 | - |
		    | 7 | 8 | - |
		 */
		r[0][0] = "1";
		r[0][1] = "2";
		r[0][2] = "2";
		r[1][0] = "5";
		r[1][1] = "6";
		r[1][2] = null;
		r[2][0] = "7";
		r[2][1] = "8";
		r[2][2] = null;

		printMatrix(m);
		
		Assert.assertTrue(assertMatrixEquals(r, m));
	}
	
	
	
	@Test
	public void montarMatrizCom5ElementosEmUmaLinha() {
		int maxZonasEmAgrupamento = 5;
		String[][] r = new String[2][5];
		String solucao = "|(1)-(2)|,|(2)-(3)|,|(3)-(4)|,|(4)-(5)|,|(9)-(10)|,|(10)-(11)|";
		MatrizValidacaoHelper matrizHelper = new MatrizValidacaoHelper();
		String[][] m = matrizHelper.criarMatriz(solucao, maxZonasEmAgrupamento);
		/*matriz resultante esperada
		 *  | 1  | 2  | 3 | 4 | 5 |
		    | 10 | 11 | - | - | - |  
		 */
		r[0][0] = "1";
		r[0][1] = "2";
		r[0][2] = "3";
		r[0][3] = "4";
		r[0][4] = "5";
		r[1][0] = "10";
		r[1][1] = "11";
	
		Assert.assertTrue(assertMatrixEquals(r, m));
	}
	
	@Test
	public void montarMatrizComApenasDuasZonasEmUmaLinha() {
		int maxZonasEmAgrupamento = 2;
		String[][] r = new String[1][2];
		String solucao = "|(1001)-(1002)|";
		MatrizValidacaoHelper matrizHelper = new MatrizValidacaoHelper();
		String[][] m = matrizHelper.criarMatriz(solucao, maxZonasEmAgrupamento);
		/*matriz resultante esperada
		 *  | 1001 | 1002 | 
		 */
		r[0][0] = "1001";
		r[0][1] = "1002";
		
		Assert.assertTrue(assertMatrixEquals(r, m));
	}
	
	
	private boolean testaCombinacao(int qtdeFusoes, int maxZonasEmFusao, String combinacoes) {
		boolean resultado;
		MatrizValidacaoHelper matrizHelper = new MatrizValidacaoHelper();
		String[][] m = matrizHelper.criarMatriz(combinacoes, maxZonasEmFusao);
		resultado = matrizHelper.validarCombinacoes(combinacoes, qtdeFusoes, maxZonasEmFusao);

		printMatrix(m);
		System.out.println();
		return resultado;
	}
	
	@Test
	public void testeMassaInvalidos() {
		Assert.assertFalse("1", this.testaCombinacao(4, 3, "|(3)-(6)|,|(5)-(6)|,|(5)-(8)|,|(7)-(8)|"));
		Assert.assertFalse("2", this.testaCombinacao(6, 3, "|(5)-(8)|,|(6)-(10)|,|(7)-(10)|,|(8)-(12)|,|(9)-(11)|,|(11)-(12)|"));
		Assert.assertFalse("3", this.testaCombinacao(7, 3, "|(3)-(6)|,|(5)-(8)|,|(7)-(10)|,|(8)-(11)|,|(9)-(11)|,|(12)-(13)|,|(12)-(14)|"));
	}
	
	@Test	
	public void testeMassaValidos() {
		Assert.assertTrue("0", this.testaCombinacao(4, 3, "|(1)-(3)|,|(2)-(4)|,|(2)-(6)|,|(5)-(8)|"));
		Assert.assertTrue("1", this.testaCombinacao(8, 3, "|(1)-(2)|,|(3)-(4)|,|(5)-(8)|,|(6)-(10)|,|(7)-(9)|,|(8)-(11)|,|(13)-(14)|,|(16)-(12)|"));
		Assert.assertTrue("2", this.testaCombinacao(7, 3, "|(3)-(6)|,|(5)-(8)|,|(7)-(10)|,|(8)-(11)|,|(9)-(10)|,|(12)-(13)|,|(12)-(14)|"));
		Assert.assertTrue("3", this.testaCombinacao(4, 3, "|(1)-(2)|,|(3)-(4)|,|(5)-(6)|,|(7)-(8)|"));
		Assert.assertTrue("4", this.testaCombinacao(4, 3, "|(1)-(2)|,|(2)-(3)|,|(5)-(6)|,|(7)-(8)|"));
		Assert.assertTrue("5", this.testaCombinacao(5, 3, "|(1)-(2)|,|(3)-(4)|,|(5)-(6)|,|(7)-(8)|,|(9)-(10)|"));
		Assert.assertTrue("6", this.testaCombinacao(6, 3, "|(1)-(2)|,|(3)-(4)|,|(5)-(6)|,|(7)-(8)|,|(9)-(10)|,|(11)-(12)|"));
		Assert.assertTrue("7", this.testaCombinacao(9, 3, "|(1)-(2)|,|(2)-(6)|,|(3)-(4)|,|(7)-(8)|,|(9)-(10)|,|(11)-(13)|,|(15)-(12)|,|(18)-(19)|,|(20)-(19)|"));   
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

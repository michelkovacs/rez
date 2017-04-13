import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.paukov.combinatorics.Factory;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;

public class TestaCombinacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create combinatorics vector
		/*
		//zonas 1 - 15, cada uma com 3 vizinhos
		//total 41 vizinhos
		ICombinatoricsVector<String> initialVector = 
				Factory.createVector(new String[] { 
					"1-2", "1-3", "1-4",
					"2-5", "2-6", "2-7",
					"3-8", "3-9",
					"4-5", "4-7", "4-8",
					"5-3",
					"6-7", "6-8",
					"8-9",
					"A-1", "A-7", "A-3",
					"B-2", "B-9", "B-A",
					"C-8", "C-9", "C-A", "C-B",
					"D-5", "D-6", "D-B", "D-C",
					"E-5", "E-A", "E-B", "E-C",
					"F-A", "F-C", "F-D", "F-E",
					"G-6", "G-4", "G-F", "G-8" });
					
		String[] caracteresExistentes = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B",
				"C", "D", "E", "F"};
		*/
		
		//zonas 1 - 13, cada uma com 3 vizinhos
		//total 26 vizinhos
		ICombinatoricsVector<String> initialVector = 
				Factory.createVector(new String[] { 
					"1-2", "1-3", "1-4",
					"2-5", "2-6", "2-7",
					"3-8", "3-9",
					"4-5", "4-7",
					"5-3",
					"6-7", "6-8", "6-9",
					"8-9", "8-4",
					"A-1", "A-7",
					"B-2", "B-9",
					"C-8", "C-9", "C-A",
					"D-8", "D-9", "D-A"	 });
					
		String[] caracteresExistentes = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B",
				"C", "D"};
		
		int qtdeElementos = 26;
		int combinacoesPaP = 7;
		int maximoDeZonasEmFusao = 3;
		int N = maximoDeZonasEmFusao;
		
		/*for (int j=1;j <= qtdeElementos; j++) {
			initialVector.addValue("" + j + "");
		}*/

		
		/*for (int i = 1; i <= qtdeElementos; i++) {
			int j = i+1;
			for (;j <= qtdeElementos; j++) {
				initialVector.addValue(i + "-" + j);
			}
		}*/
		
		// create simple combination generator to generate 3-combination
		
		Generator<String> gen = Factory.createSimpleCombinationGenerator(initialVector, combinacoesPaP);

		// create iterator
		Iterator<ICombinatoricsVector<String>> itr = gen.iterator();

		// print the number of combinations
		System.out.println(gen.getNumberOfGeneratedObjects());

		// go through the iterator
		
		int estourados = 0;
		while (itr.hasNext()) {
			ICombinatoricsVector<String> combination = itr.next();
			//System.out.println(combination);
			
			String texto = "";
			for (int k = 0; k < combinacoesPaP; k++) {
				texto = texto + "-" + combination.getValue(k);
			}
			
			for (String caract : caracteresExistentes) {
				if ( StringUtils.countMatches(texto, String.valueOf(caract)) >= N) {
					++estourados;
					break;
				}	
			}
						

		}

		List<ICombinatoricsVector<String>> list = gen.generateAllObjects();
		System.out.println("TAMANHO = " + list.size());
		System.out.println("ELIMINADOS = " + estourados);
		System.out.println("VALIDOS = " + (list.size()-estourados));
		
	}

}
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.paukov.combinatorics.Factory;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;

public class SimuladorCombinacoesETempoExecucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create combinatorics vector
		long numZonasNaRegiao = 15L;
		int qtdeDeVizinhos = 26;
		int qtdeDeFusoes = 7;
		long resultado = 0L;
		int maximoDeZonasEmFusao = 3;
		double tempoParaGerarEArmazenarCadaCombinacao = 0.050; //30ms
		double tempoParaCalcularFuncaoObjetivoDeCadaCombinacao = 0.250; //250ms

		String fazerSimulacao = "S";
		
		while (fazerSimulacao.equals("S")) {
		
			Scanner scanner = new Scanner(System.in);
			System.out.print("Entre com o numero de zonas da regiao: ");
			numZonasNaRegiao = scanner.nextInt();

			System.out.print("Entre com a quantidade de zonas que são vizinhas nessa região: ");
			qtdeDeVizinhos = scanner.nextInt();

			System.out.print("Entre com a quantidade de fusões desejadas: ");
			qtdeDeFusoes = scanner.nextInt();
			System.out.print("Caculando...\n\n");

			/*
			 * System.out.print(
			 * "Entre com o tempo médio para calcular e armazenar cada combinação em segundos: "
			 * ); tempoParaGerarEArmazenarCadaCombinacao = scanner.nextDouble();
			 * 
			 * System.out.print(
			 * "Entre com o tempo médio para calcular a função objetivo de cada combinação em segundos: "
			 * ); tempoParaCalcularFuncaoObjetivoDeCadaCombinacao =
			 * scanner.nextDouble();
			 */

			// calcular combinacoes possiveis
			// n! / ((p!)*(n-p)!)
			// n=numero de vizinhos
			// p = numero de fusoes
			int n = qtdeDeVizinhos;
			double nFatorial = CombinatoricsUtils.factorialDouble(n);
			int p = qtdeDeFusoes;
			double pFatorial = CombinatoricsUtils.factorialDouble(p);

			double combinacoesPossiveis = nFatorial / ((pFatorial) * CombinatoricsUtils.factorialDouble(n - p));

			NumberFormat formatter = new DecimalFormat("#0");
			System.out.println("Combinações possíveis = " + formatter.format(Math.ceil(combinacoesPossiveis)));
			NumberFormat formatoTempo = new DecimalFormat("#0.00");
			double tempoGeracaoArmazenamento = combinacoesPossiveis * tempoParaGerarEArmazenarCadaCombinacao / 60 / 60;
			System.out.println("Tempo estimado para gerar e armazenar as combinações em horas: "
					+ formatoTempo.format(tempoGeracaoArmazenamento));
			double tempoCalcularFuncoesObjetivos = combinacoesPossiveis
					* tempoParaCalcularFuncaoObjetivoDeCadaCombinacao;
			System.out.println("Tempo estimado para calcular funcoes objetivo em horas: "
					+ formatoTempo.format(tempoCalcularFuncoesObjetivos / 60 / 60));

			System.out.print("Simular corte por restrição de Max de Zonas em fusão para reduzir o tempo? (S/N): ");
			String resposta = scanner.next();
			if (resposta.toUpperCase().equals("S")) {
				simulaCorteMaxZonasEmFusao(numZonasNaRegiao, qtdeDeFusoes, qtdeDeVizinhos);
			}
			
			System.out.print("Fazer nova simulação? (S/N)");
			fazerSimulacao = scanner.next().toUpperCase();
		}
		System.out.print("FIM");
		
	}
	
	public static void simulaCorteMaxZonasEmFusao(long numZonasNaRegiao, int qtdeDeFusoes, int qtdeDeVizinhos) {
		String[] vetorZonas = new String[] {};
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		
		System.out.print("Entre com a restrição - Máximo de zonas em uma fusão: ");
		int maximoDeZonasEmFusao = scanner.nextInt();
		
		System.out.print("Entre com as zonas, separadas por virgula. Ex: 1,2,3,10,44: ");
		String listaZonasLeitura = scanner.next();
		vetorZonas = listaZonasLeitura.split(",");
		for (int i = 0; i < vetorZonas.length; i++) {
			vetorZonas[i] = "|" + vetorZonas[i] + "|";
		}
		
		ArrayList<String> arrayVizinhos = new ArrayList<String>();
		System.out.println("Entre com a lista de zonas vizinhas, ex: 1-2,3-4,10-45,18-58: ");
		String vizinho = "";
		String[] vetorVizinhosAux = new String[] {};
		vetorVizinhosAux = arrayVizinhos.toArray(vetorVizinhosAux);
		String listaVizinhosLeitura = scanner.next();
		vetorVizinhosAux = listaVizinhosLeitura.split(",");
		for (int i = 0; i < vetorVizinhosAux.length; i++) {
			vetorVizinhosAux[i] = "|" + vetorVizinhosAux[i] + "|";
		}
		
		System.out.println("Calculando...");

		vetorVizinhosAux = arrayVizinhos.toArray(vetorVizinhosAux);
		ICombinatoricsVector<String> vetorVizinhas = Factory.createVector(vetorVizinhosAux);
		
		int N = maximoDeZonasEmFusao;
		
		Generator<String> gen = Factory.createSimpleCombinationGenerator(vetorVizinhas, qtdeDeFusoes);
		Iterator<ICombinatoricsVector<String>> itr = gen.iterator();

		int estourados = 0;
		while (itr.hasNext()) {
			ICombinatoricsVector<String> combination = itr.next();
			//System.out.println(combination);
			
			String texto = "";
			for (int k = 0; k < qtdeDeFusoes; k++) {
				texto = texto + "-" + combination.getValue(k);
			}
			
			for (String caract : vetorZonas) {
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
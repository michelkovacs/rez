import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.paukov.combinatorics.Factory;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;

import com.mk.bandas.dao.JPAUtil;
import com.mk.bandas.dao.SolucaoDao;
import com.mk.bandas.model.Solucao;

public class SimuladorTempoNoBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create combinatorics vector
		long numZonasNaRegiao = 15L;
		int qtdeDeVizinhos = 26;
		int qtdeDeFusoes = 7;
		long resultado = 0L;
		int maximoDeZonasEmFusao = 3;
		double tempoParaGerarEArmazenarCadaCombinacao = 0.030; //30ms
		double tempoParaCalcularFuncaoObjetivoDeCadaCombinacao = 0.250; //250ms

		String fazerSimulacao = "S";
		
		EntityManager em = new JPAUtil().getEntityManager();

		//a cada 100 inicia uma nova transacao... gravar de 100 em 100
		em.getTransaction().begin();
        	
		// ... do something ...
		
        Long idExperimento = 1L;
        SolucaoDao dao = new SolucaoDao(em);
        long startTime = System.currentTimeMillis();
        long qtdePassos = 1000;
        for (long passo = 1; passo <= qtdePassos; passo++) {
        	Solucao solucao = new Solucao();
        	solucao.setIdExperimento(idExperimento);
        	solucao.setNumeroPasso(passo);
        	solucao.setTextoSolucao("teste");
        	dao.incluir(solucao);
		}
        
        //commita a transacao
        em.getTransaction().commit();

        //fecha a entity manager
        em.close();
        
        long estimatedTime = System.currentTimeMillis() - startTime;
        long tempoEstimadoPorUnidade = estimatedTime / qtdePassos;
        System.out.println("duracao: " + DurationFormatUtils.formatDuration(estimatedTime, "H:mm:ss", true));
        System.out.println("duracao 1 operacao (ms): " + tempoEstimadoPorUnidade);
        return;/*

		
		while (fazerSimulacao.equals("S")) {
		
			Scanner scanner = new Scanner(System.in);
			System.out.print("Entre com o numero de zonas da regiao: ");
			numZonasNaRegiao = scanner.nextInt();

			System.out.print("Entre com a quantidade de zonas que são vizinhas nessa região: ");
			qtdeDeVizinhos = scanner.nextInt();

			System.out.print("Entre com a quantidade de fusões desejadas: ");
			qtdeDeFusoes = scanner.nextInt();
			System.out.print("Caculando...\n\n");

			

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
		System.out.print("FIM");*/
		
	}
	
	public static void simulaCorteMaxZonasEmFusao(long numZonasNaRegiao, int qtdeDeFusoes, int qtdeDeVizinhos) {
		String[] vetorZonas = new String[] {};
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		
		System.out.print("Entre com a restrição - Máximo de zonas em uma fusão: ");
		int maximoDeZonasEmFusao = scanner.nextInt();
		
		System.out.print("Entre com as zonas, uma por uma. ");
		for (int i = 1; i <= numZonasNaRegiao; i++) {
			System.out.print("Entre com a zona " + i + " de " + numZonasNaRegiao + ":");
			String zona = "|" + scanner.next() + "|";
			array.add(zona);
		}
		vetorZonas = array.toArray(vetorZonas);
		
		ArrayList<String> arrayVizinhos = new ArrayList<String>();
		System.out.println("Entre com as zonas vizinhas, uma por uma, como no exemplo: 1-2");
		String vizinho = "";
		
		for(int i = 1; i<= qtdeDeVizinhos; i++) {
			System.out.print("(" + i + ")" + "Entre com os vizinhos: ");
			vizinho = scanner.next().replace(" ", "");
			String temp[] = vizinho.split("-");
			vizinho = "|" + temp[0] + "|" + "-" + "|" + temp[1] + "|";
			arrayVizinhos.add(vizinho);
		}
		
		System.out.println("Calculando...");

		String[] vetorVizinhosAux = new String[] {};
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
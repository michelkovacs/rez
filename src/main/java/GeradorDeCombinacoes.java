import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;
import org.paukov.combinatorics.Factory;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;

import com.mk.bandas.dao.FaixaVariavelDao;
import com.mk.bandas.dao.JPAUtil;
import com.mk.bandas.dao.SolucaoDao;
import com.mk.bandas.dao.ZonaDao;
import com.mk.bandas.model.Solucao;

import calculadora.CalculadoraFuncObjetivo;
import calculadora.MatrizValidacaoHelper;
import calculadora.ParamsCalculadora;


/*** dicas para performance no hiberante 
 * http://blog.caelum.com.br/trabalhando-com-batch-processing-de-maneira-eficaz-utilizando-a-jpa/
 */
public class GeradorDeCombinacoes {

	public static Long idExperimento = 7L;
	
	public static void main(String[] args) throws Exception {
		//carregando dados basicos
		CarregadorDadosBasicosUtil.carregarDadosBasicos();
		
		// TODO Auto-generated method stub
		// create combinatorics vector
		long numZonasNaRegiao = 15L;
		int qtdeDeVizinhos = 26;
		int qtdeDeFusoes = 7;
		int opcaoSelecionada = 0;
		Float pesoEleAt = 0f;
		Float pesoCrEleit = 0f;
		Float pesoMov = 0f;
		long resultado = 0L;
		int maxZonasEmAgrupamento = 3;
		double percCorteTempoPelasEliminacoes = 0.1;
		double tempoParaGerarEArmazenarCadaCombinacao = 8; //10ms
		double tempoParaCalcularFuncaoObjetivoDeCadaCombinacao = 150; //150ms
		
		/**** inicializando EntityManager, daos e calculadora *********/
		EntityManager em = new JPAUtil().getEntityManager();
		ZonaDao zonaDao = new ZonaDao(em);
		FaixaVariavelDao faixaVariavelDao = new FaixaVariavelDao(em);
		ParamsCalculadora paramsCalculadora = new ParamsCalculadora();
		paramsCalculadora.setFaixaVariavelDao(faixaVariavelDao);
		paramsCalculadora.setZonaDao(zonaDao);
		
		paramsCalculadora.setQtdeFusoes(qtdeDeFusoes);
		paramsCalculadora.setMaxZonasEmAgrupamento(maxZonasEmAgrupamento);
		CalculadoraFuncObjetivo calculadoraFuncObjetivo = new CalculadoraFuncObjetivo(paramsCalculadora);

		String fazerSimulacao = "S";
		
		
		
		while (fazerSimulacao.equals("S")) {
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.print(	"----------------------\n" +
								"SIMULADOR REZONEAMENTO\n" +
								"----------------------\n\n" +
								"ESCOLHA UMA OPCAO:\n\n" +
								"1 - GERAR SOLUCOES COM FUNCAO OBJETIVO PADRAO: FObj = 1EleAt + 1CrEleit + 1Mov\n" +
								"2 - GERAR SOLUCOES AJUSTANDO PESOS DA FUNCAO OBJETIVO\n" +
								"3 - CALCULAR A PONTUACAO DE UMA DETERMINADA SOLUCAO\n");
			
			System.out.print("\nOpcao: ");
			opcaoSelecionada = scanner.nextInt();
			
			if (opcaoSelecionada == 1) {
				paramsCalculadora.setPesoVariavelEleit(1f);
				paramsCalculadora.setPesoVariavelCrEleit(1f);
				paramsCalculadora.setPesoVariavelMov(1f);
			}
			if (opcaoSelecionada == 2) {
				System.out.print("\nDigite o peso da variavel EleAt (Numero de eleitores atuais): ");
				pesoEleAt = scanner.nextFloat();
				paramsCalculadora.setPesoVariavelEleit(pesoEleAt);
				System.out.print("\nDigite o peso da variavel CrEleit (Numero de eleitores futuros (em 2021): ");
				pesoCrEleit = scanner.nextFloat();
				paramsCalculadora.setPesoVariavelCrEleit(pesoCrEleit);
				
				System.out.print("\nDigite o peso da variavel Mov (Numero de movimentacoes RAE e ASE): ");
				pesoMov = scanner.nextFloat();
				paramsCalculadora.setPesoVariavelMov(pesoMov);
			}
			
			System.out.print("\nNumero de zonas da regiao: ");
			numZonasNaRegiao = scanner.nextInt();

			System.out.print("\nQuantidade de zonas que sao vizinhas nesta regiao: ");
			qtdeDeVizinhos = scanner.nextInt();

			System.out.print("\nQuantidade de fusoes desejadas: ");
			qtdeDeFusoes = scanner.nextInt();
			
			System.out.print("\nRestricao - numero maximo de zonas em um agrupamento: ");
			maxZonasEmAgrupamento = scanner.nextInt();
						
			System.out.print("\nCalculando...");

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
			System.out.println("\nNumero de combinacoes a serem processadas: = " + formatter.format(Math.ceil(combinacoesPossiveis)));
			/*
			NumberFormat formatoTempo = new DecimalFormat("#0.00");
			double tempoGeracaoArmazenamento = percCorteTempoPelasEliminacoes * combinacoesPossiveis * tempoParaGerarEArmazenarCadaCombinacao;
			System.out.println("Tempo estimado para gerar e armazenar as combina��es em horas: "
					+ DurationFormatUtils.formatDuration((long) tempoGeracaoArmazenamento, "HH:mm:ss", true));
			double tempoCalcularFuncoesObjetivos = percCorteTempoPelasEliminacoes * combinacoesPossiveis
					* tempoParaCalcularFuncaoObjetivoDeCadaCombinacao;
			System.out.println("Tempo estimado para calcular funcoes objetivo em horas: "
					+ DurationFormatUtils.formatDuration((long) tempoCalcularFuncoesObjetivos, "HH:mm:ss", true));

			System.out.print("Simular corte por restri��o de Max de Zonas em fus�o para reduzir o tempo? (S/N): ");
			String resposta = scanner.next();
			*/
			
			iniciaProcessamento(em, calculadoraFuncObjetivo, numZonasNaRegiao, qtdeDeFusoes, qtdeDeVizinhos, maxZonasEmAgrupamento);
						
			System.out.print("\n\nFazer nova simulacao? (S/N)");
			fazerSimulacao = scanner.next().toUpperCase();
		}
		//fechando entity manager
        em.close();
		System.out.print("FIM");
		
	}
	
	public static void iniciaProcessamento(EntityManager em, CalculadoraFuncObjetivo calculadoraFuncObjetivo, long numZonasNaRegiao, int qtdeDeFusoes, int qtdeDeVizinhos, int maxZonasEmAgrupamento) throws Exception {
		String[] vetorZonas = new String[] {};
		String[] vetorVizinhosAux;
		Scanner scanner = new Scanner(System.in);
		int contInvalidos = 0;
		long passo = 1;
		long qtdeCombinacoes = 0;
		SolucaoDao solucaoDao = new SolucaoDao(em);
		
		vetorZonas = lerZonas(scanner);
		vetorVizinhosAux = lerVizinhos(scanner);
				
		System.out.println("Executando...");
		
		/*** inicializa entity manager, calculadora e matrizValidacaoHelper ***/
		
		em.getTransaction().begin();
	
		MatrizValidacaoHelper matrizValidacaoHelper = new MatrizValidacaoHelper();      
		
        long startTime = System.currentTimeMillis();
        int tamanhoBatch = 50;
        
		/*** inicializando objetos de combinat�ria **********/
		ICombinatoricsVector<String> vetorVizinhas = Factory.createVector(vetorVizinhosAux);
		Generator<String> gen = Factory.createSimpleCombinationGenerator(vetorVizinhas, qtdeDeFusoes);
		Iterator<ICombinatoricsVector<String>> itr = gen.iterator();

		System.out.printf("processados: 0");
				
		while (itr.hasNext()) {
			qtdeCombinacoes++;
			boolean invalido = false;
			String textoSolucao = "";
			ICombinatoricsVector<String> combination = itr.next();
						
			textoSolucao = montaStringSolucao(qtdeDeFusoes, combination);
			
			if (!matrizValidacaoHelper.validarCombinacoes(textoSolucao, qtdeDeFusoes, maxZonasEmAgrupamento)) {
				++contInvalidos;
				invalido = true;
			}

			/*****incluindo no banco ********/
			if (invalido == false) {
				Solucao solucao = new Solucao();
				solucao.setIdExperimento(idExperimento);
				solucao.setNumeroPasso(passo);
				solucao.setTextoSolucao(textoSolucao);
				solucao.setValorFuncObjetivo(calculadoraFuncObjetivo.calcular(textoSolucao));
				
				solucaoDao.incluir(solucao);
			}
        	/*****fim inclusao no banco ********/
        	
        	++passo;

        	//ver se chegou ao tamanho do batch
        	if ((passo % tamanhoBatch) == 0 ) {
        		//salvando no banco
        		 em.flush();
                 em.clear();
                 if ((passo % 10000) == 0)
                	 System.out.print("->" + passo);
                 if ((passo % 100000) == 0)
                	 System.out.println();
        	}
		}		

		/************** FIM EXECUCAO **************/

		System.out.println();
		System.out.println();
		System.out.println("TOTAL DE COMBINACOES POSSIVEIS = " + qtdeCombinacoes);
		System.out.println("COMBINACOES INVALIDAS = " + contInvalidos);
		System.out.println("COMBINACOES VALIDAS = " + (qtdeCombinacoes-contInvalidos));
		
		long estimatedTime = System.currentTimeMillis() - startTime;
		long tempoEstimadoPorUnidade = estimatedTime / qtdeCombinacoes;
        System.out.println("tempo total de processamento: " + DurationFormatUtils.formatDuration(estimatedTime, "HH:mm:ss", true));
        //System.out.println("duracao 1 operacao (ms): " + tempoEstimadoPorUnidade);
        
        System.out.println("\n50 SOLUCOES MELHORES CLASSIFICADAS");
        System.out.println("----------------------------------");
        //listando primeiros colocados na tela
        List<Solucao> solucoes = solucaoDao.listarPrimeirosColocados(idExperimento, 50);
        printSolucoes(solucoes);
       	salvarCSV(solucoes);
        
        //rollback
        em.getTransaction().rollback();

	}

	private static void salvarCSV(List<Solucao> solucoes) {
		int classificacao = 1;
		String conteudo = "";
		MatrizValidacaoHelper matrizValidacaoHelper = new MatrizValidacaoHelper();
		
		for (Solucao solucao : solucoes) {
			
			String matriz[][] = matrizValidacaoHelper.criarMatriz(solucao.getTextoSolucao(), 3);
			
			conteudo = conteudo + "Solucao," + classificacao + ",Pontuacao Funcao Objetivo," + solucao.getValorFuncObjetivo() +"\n";
					
			conteudo = conteudo + 		
					"agrupamentos,,,soma eleitorado,soma eleitorado 2021, EleAt parcial, CrEleit parcial, Mov parcial" + "\n";
			for (int i = 0; i < matriz.length; i++) {
				for (int j=0; j< matriz[i].length; j++) {
					conteudo = conteudo + matriz[i][j] + ',';
				}
				conteudo = conteudo + "\n";				
			}
				conteudo = conteudo + "EleAt,50 CrEleit,40 Mov,30" + "\n";
			conteudo = conteudo + "\n";
						
			classificacao++;
		}
		
		String nomeArquivo = "rezon" + System.currentTimeMillis() + ".csv";
		final File file = new File(nomeArquivo); 
		try {
			org.apache.commons.io.FileUtils.writeStringToFile(file, conteudo, "UTF-8");
		} catch (IOException e) {
			System.out.println("erro ao gravar arquivo CSV de detalhes: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Arquivo CSV detalhado gerado: " + nomeArquivo);
		
	}

	private static String montaStringSolucao(int qtdeDeFusoes, ICombinatoricsVector<String> combination) {
		String textoSolucao = "";
		for (int k = 0; k < qtdeDeFusoes; k++) {
			textoSolucao = textoSolucao + combination.getValue(k) + ",";
		}
		
		//eliminando ultima virgula
		textoSolucao = textoSolucao.substring(0, textoSolucao.length()-1);
		return textoSolucao;
	}

	private static String[] lerVizinhos(Scanner scanner) {
		System.out.println("\nEntre com a lista de zonas vizinhas, ex: (1)-(2),(3)-(4),(10)-(45),(18)-(58) : ");
		ArrayList<String> arrayVizinhos = new ArrayList<String>();
		String[] vetorVizinhosAux = new String[] {};
		vetorVizinhosAux = arrayVizinhos.toArray(vetorVizinhosAux);
		String listaVizinhosLeitura = scanner.next();
		vetorVizinhosAux = listaVizinhosLeitura.split(",");
		for (int i = 0; i < vetorVizinhosAux.length; i++) {
			vetorVizinhosAux[i] = "|" + vetorVizinhosAux[i] + "|";
		}
		return vetorVizinhosAux;
	}

	private static String[] lerZonas(Scanner scanner) {
		String[] vetorZonas;
		System.out.print("\nEntre com as zonas, separadas por virgula. Ex: 1,2,3,10,44 : ");
		String listaZonasLeitura = scanner.next();
		vetorZonas = listaZonasLeitura.split(",");
		for (int i = 0; i < vetorZonas.length; i++) {
			vetorZonas[i] = "(" + vetorZonas[i] + ")";
		}
		
		return vetorZonas;
	}
	
	private static void printSolucoes(List<Solucao> solucoes) {
		int classificacao = 1;
		for (Solucao solucao : solucoes) {
			System.out.println();
			System.out.print("CLASSIF: " + classificacao  + " , PONTUACAO:" + solucao.getValorFuncObjetivo() + "  SOLUCAO:" + solucao.getTextoSolucao());
			classificacao++;
		}
	}

}
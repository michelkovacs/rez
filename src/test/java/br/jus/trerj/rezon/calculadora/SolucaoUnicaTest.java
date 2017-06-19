package br.jus.trerj.rezon.calculadora;
import org.junit.Assert;
import org.junit.Test;

import br.jus.trerj.rezon.model.Solucao;
import br.jus.trerj.rezon.model.SolucaoUnica;

public class SolucaoUnicaTest {

	
	@Test
	public void verificaIdentificacaoDeSolucoesIguais() {
		//setup, criando duas solucoes que deverao gerar solucoes iguais, porem com ordem de zonas diferentes em um agrupamento
		int qtdeMaximaFusoes = 3;
		Solucao solucao1 = new Solucao();
		Solucao solucao2 = new Solucao();
		solucao1.setTextoSolucao("|(1)-(2)|,|(3)-(4)|,|(4)-(5)|");
		solucao2.setTextoSolucao("|(1)-(2)|,|(3)-(5)|,|(5)-(4)|");
		
		SolucaoUnica unica1 = new SolucaoUnica(solucao1, qtdeMaximaFusoes);
		SolucaoUnica unica2 = new SolucaoUnica(solucao2, qtdeMaximaFusoes);
		
		Assert.assertEquals(unica1, unica2);
	}
	
	@Test
	public void verificaIdentificacaoDeSolucoesDiferentes() {
		//setup, criando duas solucoes que deverao gerar solucoes diferentes
		int qtdeMaximaFusoes = 3;
		Solucao solucao1 = new Solucao();
		Solucao solucao2 = new Solucao();
		solucao1.setTextoSolucao("|(1)-(2)|,|(3)-(4)|,|(4)-(5)|");
		solucao2.setTextoSolucao("|(1)-(2)|,|(3)-(5)|,|(5)-(6)|");
		
		SolucaoUnica unica1 = new SolucaoUnica(solucao1, qtdeMaximaFusoes);
		SolucaoUnica unica2 = new SolucaoUnica(solucao2, qtdeMaximaFusoes);
		
		Assert.assertNotEquals(unica1, unica2);
	}
}

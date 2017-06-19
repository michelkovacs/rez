package br.jus.trerj.rezon.calculadora;
import java.util.Map;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import br.jus.trerj.rezon.calculadora.CalculadoraFuncObjetivo;
import br.jus.trerj.rezon.calculadora.CalculadoraVariavelCrEleit;
import br.jus.trerj.rezon.calculadora.CalculadoraVariavelEleat;
import br.jus.trerj.rezon.calculadora.CalculadoraVariavelMov;
import br.jus.trerj.rezon.calculadora.ParamsCalculadora;
import br.jus.trerj.rezon.dao.FaixaVariavelDao;
import br.jus.trerj.rezon.dao.JPAUtil;
import br.jus.trerj.rezon.dao.ZonaDao;
import br.jus.trerj.rezon.model.FaixaVariavel;
import br.jus.trerj.rezon.model.Zona;

public class CalculadoraFuncaoObjetivoTest {
	
	EntityManager em = new JPAUtil().getEntityManager();
	ZonaDao zonaDao = new ZonaDao(em);
	FaixaVariavelDao faixaVariavelDao = new FaixaVariavelDao(em);
		
	@Before
	public void antesMetodo() {
		em.getTransaction().begin();
		carregarTabelasBasicasParaTestes();
	}
	
	private void carregarTabelasBasicasParaTestes() {
		faixaVariavelDao.incluir(new FaixaVariavel("mov", 0F, 999999F, 1F));
		faixaVariavelDao.incluir(new FaixaVariavel("eleat", 0F, 2F, 0.2F));
		faixaVariavelDao.incluir(new FaixaVariavel("eleat", 3F, 4F, 0.4F));
		faixaVariavelDao.incluir(new FaixaVariavel("eleat", 5F, 6F, 0.6F));
		faixaVariavelDao.incluir(new FaixaVariavel("eleat", 7F, 8F, 0.8F));
		faixaVariavelDao.incluir(new FaixaVariavel("eleat", 9F, 10F, 1F));
		faixaVariavelDao.incluir(new FaixaVariavel("eleat", 11F, 12F, 0.8F));
		faixaVariavelDao.incluir(new FaixaVariavel("eleat", 13F, 14F, 0.6F));
		faixaVariavelDao.incluir(new FaixaVariavel("eleat", 15F, 16F, 0.4F));
		faixaVariavelDao.incluir(new FaixaVariavel("eleat", 17F, 18F, 0.2F));
		faixaVariavelDao.incluir(new FaixaVariavel("eleat", 19F, 99999999F, 0.1F));
		faixaVariavelDao.incluir(new FaixaVariavel("creleit", 0F, 1F, 0.2F));
		faixaVariavelDao.incluir(new FaixaVariavel("creleit", 2F, 2F, 0.4F));
		faixaVariavelDao.incluir(new FaixaVariavel("creleit", 3F, 3F, 0.6F));
		faixaVariavelDao.incluir(new FaixaVariavel("creleit", 4F, 4F, 0.8F));
		faixaVariavelDao.incluir(new FaixaVariavel("creleit", 5F, 5F, 0.10F));
		faixaVariavelDao.incluir(new FaixaVariavel("creleit", 6F, 6F, 0.8F));
		faixaVariavelDao.incluir(new FaixaVariavel("creleit", 7F, 7F, 0.6F));
		faixaVariavelDao.incluir(new FaixaVariavel("creleit", 8F, 8F, 0.4F));
		faixaVariavelDao.incluir(new FaixaVariavel("creleit", 9F, 9F, 0.2F));
		faixaVariavelDao.incluir(new FaixaVariavel("creleit", 10F, 99999999F, 0.1F));
		
		
		zonaDao.incluir(new Zona(1001, "", -1f, -1f, 1, 1, 10));
		zonaDao.incluir(new Zona(1002, "", -1f, -1f, 2, 1, 11));
		zonaDao.incluir(new Zona(1003, "", -1f, -1f, 3, 4, 12));
		zonaDao.incluir(new Zona(1004, "", -1f, -1f, 4, 1, 0));
		zonaDao.incluir(new Zona(1005, "", -1f, -1f, 5, 1, 0));
		zonaDao.incluir(new Zona(1006, "", -1f, -1f, 6, 1, 0));
		zonaDao.incluir(new Zona(1007, "", -1f, -1f, 7, 1, 0));
		zonaDao.incluir(new Zona(1008, "", -1f, -1f, 8, 1, 0));
		zonaDao.incluir(new Zona(1009, "", -1f, -1f, 9, 1, 0));
		zonaDao.incluir(new Zona(10010, "", -1f, -1f, 10, 1, 0));
	}

	@After
	public void depoisMetodo() {
		em.getTransaction().rollback();
	}	
	
	@Test
	public void calcularComTodosOsPesos1() throws Exception {
		
		String solucao = "|(1001)-(1002)|";
		Float valorEsperado = 1F;
		Integer qtdeFusoes = 1;
		Integer maxZonasEmAgrupamento = 3;
		ParamsCalculadora params = new ParamsCalculadora();
		params.setFaixaVariavelDao(faixaVariavelDao);
		params.setZonaDao(zonaDao);
		params.setMaxZonasEmAgrupamento(maxZonasEmAgrupamento);
		params.setQtdeFusoes(qtdeFusoes);
		params.setPesoVariavelCrEleit(1f);
		params.setPesoVariavelEleit(1f);
		
		CalculadoraFuncObjetivo calculadora = new CalculadoraFuncObjetivo(params);
		
		Float valor = calculadora.calcular(solucao);
		
		Assert.assertEquals(valorEsperado, valor);
	}
	
	@Test
	public void verificaTabelaDeDetalhesDoCalculo() throws Exception {
		String solucao = "|(1001)-(1002)|";
		Integer qtdeFusoes = 1;
		Integer maxZonasEmAgrupamento = 3;
		float somaEleitoresFuturosEsperado = 2.0f;
		float creleitEsperado = 0.4f;
		float somaEleitoresAtuaisEsperado = 3.0f;
		float eleatEsperado = 0.4f;
		
		ParamsCalculadora params = new ParamsCalculadora();
		params.setFaixaVariavelDao(faixaVariavelDao);
		params.setZonaDao(zonaDao);
		params.setMaxZonasEmAgrupamento(maxZonasEmAgrupamento);
		params.setQtdeFusoes(qtdeFusoes);
		params.setPesoVariavelCrEleit(1f);
		params.setPesoVariavelEleit(1f);
		
		CalculadoraFuncObjetivo calculadora = new CalculadoraFuncObjetivo(params);
		Table<Integer, String, Float> tabelaDetalhes = HashBasedTable.create();
		Float valor = calculadora.calcular(solucao, tabelaDetalhes);
		
		/*for (int i = 0; i < tabelaDetalhes.rowKeySet().size(); i++) {
			Map<String, Float> map = tabelaDetalhes.row(i);
			System.out.println("linha " + i + " creleit: " + map.get("creleit").floatValue());
			System.out.println("linha " + i + " soma creleit: " + map.get("soma eleitores futuros").floatValue());
			
		}*/
		
		Assert.assertEquals(creleitEsperado,  tabelaDetalhes.row(0).get(CalculadoraVariavelCrEleit.NOME_VARIAVEL).floatValue(), 0.00001f);
		Assert.assertEquals(somaEleitoresFuturosEsperado,  tabelaDetalhes.row(0).get(CalculadoraVariavelCrEleit.NOME_COLUNA_SOMA).floatValue(), 0.00001f);
		Assert.assertEquals(eleatEsperado,  tabelaDetalhes.row(0).get(CalculadoraVariavelEleat.NOME_VARIAVEL).floatValue(), 0.00001f);
		Assert.assertEquals(somaEleitoresAtuaisEsperado,  tabelaDetalhes.row(0).get(CalculadoraVariavelEleat.NOME_COLUNA_SOMA).floatValue(), 0.00001f);
	}
	
	@Test
	public void verificaTabelaDeDetalhesDoCalculoComZonaSemAgrupamento() throws Exception {
		//setup
		String solucao = "|(1001)-(1002)|";
		String[] vetorZonas = new String[] {"(1001)", "(1002)", "(1003)"};//a zona 1003 deve aparecer isolada em um agrupamento
		Integer qtdeFusoes = 1;
		Integer maxZonasEmAgrupamento = 3;
		float somaEleitoresFuturosEsperado = 4.0f;
		float somaEleitoresAtuaisEsperado = 3.0f;
		float somaMovimentacoesEsperado = 12.0f;
		
		ParamsCalculadora params = new ParamsCalculadora();
		params.setFaixaVariavelDao(faixaVariavelDao);
		params.setZonaDao(zonaDao);
		params.setMaxZonasEmAgrupamento(maxZonasEmAgrupamento);
		params.setQtdeFusoes(qtdeFusoes);
		params.setPesoVariavelCrEleit(1f);
		params.setPesoVariavelEleit(1f);
		params.setVetorZonas(vetorZonas);
		CalculadoraFuncObjetivo calculadora = new CalculadoraFuncObjetivo(params);
		Table<Integer, String, Float> tabelaDetalhes = HashBasedTable.create();
		
		//execucao
		Float valor = calculadora.calcular(solucao, tabelaDetalhes);
		
		//validacao
		//verificar se o somatorio da zona que ficou em um agrupamento sozinha na segunda linha, tem 
		//os somatorios iguais ao propria quantidade da zona de eleitorado, movimentacoes, etc.
		Assert.assertEquals(somaEleitoresAtuaisEsperado,  tabelaDetalhes.row(1).get(CalculadoraVariavelEleat.NOME_COLUNA_SOMA).floatValue(), 0.00001f);
		Assert.assertEquals(somaEleitoresFuturosEsperado,  tabelaDetalhes.row(1).get(CalculadoraVariavelCrEleit.NOME_COLUNA_SOMA).floatValue(), 0.00001f);
		Assert.assertEquals(somaMovimentacoesEsperado,  tabelaDetalhes.row(1).get(CalculadoraVariavelMov.NOME_COLUNA_SOMA).floatValue(), 0.00001f);
	}
	
	
	@Test
	public void calcularComEleatDePeso2() throws Exception {
		
		String solucao = "|(1001)-(1002)|";
		Float valorEsperado = 1.4F;
		Integer qtdeFusoes = 1;
		Integer maxZonasEmAgrupamento = 3;
		ParamsCalculadora params = new ParamsCalculadora();
		params.setFaixaVariavelDao(faixaVariavelDao);
		params.setZonaDao(zonaDao);
		params.setMaxZonasEmAgrupamento(maxZonasEmAgrupamento);
		params.setQtdeFusoes(qtdeFusoes);
		params.setPesoVariavelCrEleit(1f);
		params.setPesoVariavelEleit(2f);
		
		CalculadoraFuncObjetivo calculadora = new CalculadoraFuncObjetivo(params);
		
		Float valor = calculadora.calcular(solucao);
		
		Assert.assertEquals(valorEsperado, valor, 0.0001);
	}
	
	@Test
	public void testTabelaGuava() {
		Table<Integer, String, Float> tabelaDetalhes = HashBasedTable.create();
		tabelaDetalhes.put(1, "creleit", 120f);
		tabelaDetalhes.put(1, "eleat", 100f);
		tabelaDetalhes.put(1, "soma eleitores", 5000f);
		tabelaDetalhes.put(1, "soma eleitores fut", 5700f);
		tabelaDetalhes.put(2, "creleit", 220f);
		tabelaDetalhes.put(2, "eleat", 200f);
		tabelaDetalhes.put(2, "soma eleitores", 6000f);
		tabelaDetalhes.put(2, "soma eleitores fut", 6700f);
		
		for (int i = 0; i < tabelaDetalhes.rowKeySet().size(); i++) {
			Map<String,Float> map = tabelaDetalhes.row(i);
			System.out.println("linha " + i + " eleat: " + map.get("eleat").floatValue());
			System.out.println("linha " + i + " soma eleitores: " + map.get("soma eleitores").floatValue());
			
		}
					
	}
	
}

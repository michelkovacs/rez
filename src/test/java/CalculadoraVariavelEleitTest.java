import java.util.Random;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.mk.bandas.dao.FaixaVariavelDao;
import com.mk.bandas.dao.JPAUtil;
import com.mk.bandas.dao.ZonaDao;
import com.mk.bandas.model.FaixaVariavel;
import com.mk.bandas.model.Zona;

public class CalculadoraVariavelEleitTest {
	
	EntityManager em = new JPAUtil().getEntityManager();
	ZonaDao zonaDao = new ZonaDao(em);
	FaixaVariavelDao faixaVariavelDao = new FaixaVariavelDao(em);
		
	@Before
	public void antesMetodo() {
		em.getTransaction().begin();
		carregarTabelasBasicasParaTestes();
	}
	
	private void carregarTabelasBasicasParaTestes() {
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
		
		/*
		zonaDao.incluir(new Zona(1001, 1, 0));
		zonaDao.incluir(new Zona(1002, 2, 0));
		zonaDao.incluir(new Zona(1003, 3, 0));
		zonaDao.incluir(new Zona(1004, 4, 0));
		zonaDao.incluir(new Zona(1005, 5, 0));
		zonaDao.incluir(new Zona(1006, 6, 0));
		zonaDao.incluir(new Zona(1007, 7, 0));
		zonaDao.incluir(new Zona(1008, 8, 0));
		zonaDao.incluir(new Zona(1009, 9, 0));
		zonaDao.incluir(new Zona(1010, 10, 0));*/
	}

	@After
	public void depoisMetodo() {
		em.getTransaction().rollback();
	}	
	
	@Test
	public void calcular2ZonasFazendoFusaoEmUmaNova() throws Exception {
		
		String combinacoes = "|(1001)-(1002)|";
		Float valorEsperado = 0.4F;
		Integer qtdeFusoes = 1;
		Integer qtdeMaxFusoes = 3;
		CalculadoraVariavelEleit calc = new CalculadoraVariavelEleit(qtdeFusoes, qtdeMaxFusoes, zonaDao, faixaVariavelDao);
		
		Float valor = calc.calcular(combinacoes);
		
		Assert.assertEquals(valorEsperado, valor);
	}
	
	@Test
	public void calcular3ZonasFazendoFusaoEmUmaNova() throws Exception {
		// setup
		//1001-1002-1003
		String combinacoes = "|(1001)-(1002)|,|(1002)-(1003)|";
		Float valorEsperado = 0.3F;
		Integer qtdeFusoes = 2;
		Integer qtdeMaxFusoes = 3;
		
		// execucao
		CalculadoraVariavelEleit calc = new CalculadoraVariavelEleit(qtdeFusoes, qtdeMaxFusoes, zonaDao, faixaVariavelDao);
		Float valor = calc.calcular(combinacoes);
		
		// verificacao
		Assert.assertEquals(valorEsperado, valor);
	}
	
	@Test
	public void calcular4ZonasFazendoFusaoEmUmaNova() throws Exception {
		// setup
		// 1001-1002-1003-1004
		String combinacoes = "|(1001)-(1002)|,|(1002)-(1003)|,|(1003)-(1004)|";
		Float valorEsperado = (float) (1f/3f);
		Integer qtdeFusoes = 3;
		Integer qtdeMaxFusoes = 3;
		CalculadoraVariavelEleit calc = new CalculadoraVariavelEleit(qtdeFusoes, qtdeMaxFusoes, zonaDao, faixaVariavelDao);
		
		Float valor = calc.calcular(combinacoes);
		
		Assert.assertEquals(valorEsperado, valor);
	}
	
	@Ignore
	public void calcularFusoesComDiferentesNumerosDeZonasCombinandoEm3NovasZonas() throws Exception {
		String combinacoes = "|(1001)-(1002)|,|(1003)-(1004)-(1005)-(1006)|,|(1007)-(1008)-(1009)|";
		Float valorEsperado = 0.1F;
		Integer qtdeFusoes = 6;
		Integer qtdeMaxFusoes = 4;
		CalculadoraVariavelEleit calc = new CalculadoraVariavelEleit(qtdeFusoes, qtdeMaxFusoes, zonaDao, faixaVariavelDao);
//
		Float valor = calc.calcular(combinacoes);
		
		Assert.assertEquals(valorEsperado, valor);
	}
	
}

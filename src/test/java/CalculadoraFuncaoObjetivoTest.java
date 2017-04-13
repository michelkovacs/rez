import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.mk.bandas.dao.FaixaVariavelDao;
import com.mk.bandas.dao.JPAUtil;
import com.mk.bandas.dao.ZonaDao;
import com.mk.bandas.model.FaixaVariavel;
import com.mk.bandas.model.Zona;

import calculadora.CalculadoraFuncObjetivo;
import calculadora.ParamsCalculadora;

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
		
		
		zonaDao.incluir(new Zona(1001, "", -1f, -1f, 1, 1, 0));
		zonaDao.incluir(new Zona(1002, "", -1f, -1f, 2, 1, 0));
		zonaDao.incluir(new Zona(1003, "", -1f, -1f, 3, 1, 0));
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
	
	
}

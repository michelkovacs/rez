package calculadora;

import com.mk.bandas.dao.FaixaVariavelDao;
import com.mk.bandas.dao.ZonaDao;

public class ParamsCalculadora {

	private int maxZonasEmAgrupamento;
	private Float pesoVariavelEleit = 1f;
	private Float pesoVariavelCrEleit = 1f;
	private Float pesoVariavelMov = 1f;
	private int qtdeFusoes;
	private FaixaVariavelDao faixaVariavelDao;
	private ZonaDao zonaDao;
	
	public int getMaxZonasEmAgrupamento() {
		return maxZonasEmAgrupamento;
	}
	public void setMaxZonasEmAgrupamento(int maxZonasEmAgrupamento) {
		this.maxZonasEmAgrupamento = maxZonasEmAgrupamento;
	}
	public Float getPesoVariavelEleit() {
		return pesoVariavelEleit;
	}
	public void setPesoVariavelEleit(Float pesoVariavelEleit) {
		this.pesoVariavelEleit = pesoVariavelEleit;
	}
	public Float getPesoVariavelCrEleit() {
		return pesoVariavelCrEleit;
	}
	public void setPesoVariavelCrEleit(Float pesoVariavelCrEleit) {
		this.pesoVariavelCrEleit = pesoVariavelCrEleit;
	}
	
	public Float getPesoVariavelMov() {
		return pesoVariavelMov;
	}
	
	public void setPesoVariavelMov(Float pesoVariavelMov) {
		this.pesoVariavelMov = pesoVariavelMov;
	}
	
	public int getQtdeFusoes() {
		return qtdeFusoes;
	}
	
	public void setQtdeFusoes(int qtdeFusoes) {
		this.qtdeFusoes = qtdeFusoes;
	}
	
	public FaixaVariavelDao getFaixaVariavelDao() {
		return faixaVariavelDao;
	}
	
	public void setFaixaVariavelDao(FaixaVariavelDao faixaVariavelDao) {
		this.faixaVariavelDao = faixaVariavelDao;
	}
	
	public ZonaDao getZonaDao() {
		return zonaDao;
	}
	
	public void setZonaDao(ZonaDao zonaDao) {
		this.zonaDao = zonaDao;
	}
	
}

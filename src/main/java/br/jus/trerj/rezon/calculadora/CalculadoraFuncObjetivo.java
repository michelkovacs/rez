package br.jus.trerj.rezon.calculadora;
import com.google.common.collect.Table;

public class CalculadoraFuncObjetivo {

	private ParamsCalculadora paramsCalculadora;
	private CalculadoraVariavelEleat calculadoraVariavelEleit;
	private CalculadoraVariavelCrEleit calculadoraVariavelCrEleit;
	private CalculadoraVariavelMov calculadoraVariavelMov;
	
	public CalculadoraFuncObjetivo(ParamsCalculadora paramsCalculadora) {
		this.paramsCalculadora = paramsCalculadora;
		this.calculadoraVariavelEleit = new CalculadoraVariavelEleat(paramsCalculadora);
		this.calculadoraVariavelCrEleit = new CalculadoraVariavelCrEleit(paramsCalculadora);
		this.calculadoraVariavelMov = new CalculadoraVariavelMov(paramsCalculadora);
	}

	public ParamsCalculadora getParamsCalculadora() {
		return paramsCalculadora;
	}
	
	public Float calcular(String solucao) throws Exception {
		return this.calcular(solucao, null);
		
	}
	public Float calcular(String solucao, Table<Integer, String, Float> tabelaDetalhes) throws Exception {
		Float valor = 0f;
		
		if (this.paramsCalculadora.getPesoVariavelEleit() > 0) {
			valor = valor + (this.paramsCalculadora.getPesoVariavelEleit() * this.calculadoraVariavelEleit.calcular(solucao, tabelaDetalhes));
		}
		
		if (this.paramsCalculadora.getPesoVariavelCrEleit() > 0) {
			valor = valor + (this.paramsCalculadora.getPesoVariavelCrEleit() * this.calculadoraVariavelCrEleit.calcular(solucao, tabelaDetalhes));
		}
		
		if (this.paramsCalculadora.getPesoVariavelMov() > 0) {
			valor = valor + (this.paramsCalculadora.getPesoVariavelMov() * this.calculadoraVariavelMov.calcular(solucao, tabelaDetalhes));
		}
		return valor;
	}
	

}

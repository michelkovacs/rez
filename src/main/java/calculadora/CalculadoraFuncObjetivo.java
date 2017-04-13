package calculadora;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.math.NumberUtils;

import com.mk.bandas.dao.FaixaVariavelDao;
import com.mk.bandas.dao.ZonaDao;
import com.mk.bandas.model.FaixaVariavel;
import com.mk.bandas.model.Zona;

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

	public Float calcular(String solucao) throws Exception {
		Float valor = 0f;
		
		if (this.paramsCalculadora.getPesoVariavelEleit() > 0) {
			valor = valor + (this.paramsCalculadora.getPesoVariavelEleit() * this.calculadoraVariavelEleit.calcular(solucao));
		}
		
		if (this.paramsCalculadora.getPesoVariavelCrEleit() > 0) {
			valor = valor + (this.paramsCalculadora.getPesoVariavelCrEleit() * this.calculadoraVariavelCrEleit.calcular(solucao));
		}
		
		if (this.paramsCalculadora.getPesoVariavelMov() > 0) {
			valor = valor + (this.paramsCalculadora.getPesoVariavelMov() * this.calculadoraVariavelCrEleit.calcular(solucao));
		}
		return valor;
	}
	

}

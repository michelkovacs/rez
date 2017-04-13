package com.mk.bandas.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Zona implements Serializable {

	private static final long serialVersionUID = 8051282414521326562L;
	@Id
	private Integer numero;
	private String microRegiao;
	private Float latitude;
	private Float longitude;
	private Integer eleitoradoAtual;
	private Integer eleitoradoFuturo;
	private Integer movimentacao;

	public Zona() {
		
	}

	public Zona(Integer numero, String microRegiao, Float latitude, Float longitude, Integer eleitoradoAtual,
			Integer eleitoradoFuturo, Integer movimentacao) {
		super();
		this.numero = numero;
		this.microRegiao = microRegiao;
		this.latitude = latitude;
		this.longitude = longitude;
		this.eleitoradoAtual = eleitoradoAtual;
		this.eleitoradoFuturo = eleitoradoFuturo;
		this.movimentacao = movimentacao;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getMicroRegiao() {
		return microRegiao;
	}

	public void setMicroRegiao(String microRegiao) {
		this.microRegiao = microRegiao;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public Integer getEleitoradoAtual() {
		return eleitoradoAtual;
	}

	public void setEleitoradoAtual(Integer eleitoradoAtual) {
		this.eleitoradoAtual = eleitoradoAtual;
	}

	public Integer getEleitoradoFuturo() {
		return eleitoradoFuturo;
	}

	public void setEleitoradoFuturo(Integer eleitoradoFuturo) {
		this.eleitoradoFuturo = eleitoradoFuturo;
	}

	public Integer getMovimentacao() {
		return movimentacao;
	}

	public void setMovimentacao(Integer movimentacao) {
		this.movimentacao = movimentacao;
	}

	
	


}

package br.jus.trerj.rezon.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FaixaVariavel implements Serializable {
	@Id
	@GeneratedValue
	private Integer id;
	private String nomeVariavel;
	Float minimo;
	Float maximo;
	Float pontuacao;
	
	public FaixaVariavel() {
		
	}
	public FaixaVariavel(String nomeVariavel, Float minimo, Float maximo, Float pontuacao) {
		super();
		this.nomeVariavel = nomeVariavel;
		this.minimo = minimo;
		this.maximo = maximo;
		this.pontuacao = pontuacao;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeVariavel() {
		return nomeVariavel;
	}
	public void setNomeVariavel(String nomeVariavel) {
		this.nomeVariavel = nomeVariavel;
	}
	public Float getMinimo() {
		return minimo;
	}
	public void setMinimo(Float minimo) {
		this.minimo = minimo;
	}
	public Float getMaximo() {
		return maximo;
	}
	public void setMaximo(Float maximo) {
		this.maximo = maximo;
	}
	public Float getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(Float pontuacao) {
		this.pontuacao = pontuacao;
	}
	private static final long serialVersionUID = 7927737970947541032L;

}

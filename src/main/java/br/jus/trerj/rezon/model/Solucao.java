package com.mk.bandas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Solucao implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2128816238599390897L;
	@Id
	@GeneratedValue
	protected Long id;
	protected Float valorFuncObjetivo;
	protected Long numeroPasso;	
	@Column(nullable = false, columnDefinition = "TEXT")
	protected String textoSolucao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Float getValorFuncObjetivo() {
		return valorFuncObjetivo;
	}
	public void setValorFuncObjetivo(Float valorFuncObjetivo) {
		this.valorFuncObjetivo = valorFuncObjetivo;
	}
	public Long getNumeroPasso() {
		return numeroPasso;
	}
	public void setNumeroPasso(Long numeroPasso) {
		this.numeroPasso = numeroPasso;
	}
	public String getTextoSolucao() {
		return textoSolucao;
	}
	public void setTextoSolucao(String textoSolucao) {
		this.textoSolucao = textoSolucao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numeroPasso == null) ? 0 : numeroPasso.hashCode());
		result = prime * result + ((textoSolucao == null) ? 0 : textoSolucao.hashCode());
		result = prime * result + ((valorFuncObjetivo == null) ? 0 : valorFuncObjetivo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Solucao other = (Solucao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numeroPasso == null) {
			if (other.numeroPasso != null)
				return false;
		} else if (!numeroPasso.equals(other.numeroPasso))
			return false;
		if (textoSolucao == null) {
			if (other.textoSolucao != null)
				return false;
		} else if (!textoSolucao.equals(other.textoSolucao))
			return false;
		if (valorFuncObjetivo == null) {
			if (other.valorFuncObjetivo != null)
				return false;
		} else if (!valorFuncObjetivo.equals(other.valorFuncObjetivo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Solucao [id=" + id + ", valorFuncObjetivo=" + valorFuncObjetivo
				+ ", numeroPasso=" + numeroPasso + ", textoSolucao=" + textoSolucao + "]";
	}
	
}

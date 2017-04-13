package com.mk.bandas.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.mk.bandas.model.FaixaVariavel;
import com.mk.bandas.model.Solucao;
import com.mk.bandas.model.Zona;

public class ZonaDao implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1952521094479811051L;

	EntityManager em;
	
	private DAO<Zona> dao;
	
	public ZonaDao(EntityManager em) {
		this.em = em;
		this.dao = new DAO<Zona>(this.em, Zona.class);
	}
	
	public void incluir(Zona zona) {
		this.dao.adiciona(zona);
	}
	
	public void atualizar(Zona zona) {
		this.dao.atualiza(zona);
	}
	
	public Zona buscar(Integer numeroZona) {
		return this.dao.buscaPorId(numeroZona);
	}

}

package com.mk.bandas.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.hibernate.mapping.List;

import com.mk.bandas.model.FaixaVariavel;

public class FaixaVariavelDao implements Serializable {
	private static final long serialVersionUID = -7040792643609549890L;

	EntityManager em;
	
	private DAO<FaixaVariavel> dao;
	
	public FaixaVariavelDao(EntityManager em) {
		this.em = em;
		this.dao = new DAO<FaixaVariavel>(this.em, FaixaVariavel.class);
	}
	
	public void incluir(FaixaVariavel faixa) {
		this.dao.adiciona(faixa);
	}
	
	public void atualizar(FaixaVariavel faixa) {
		this.dao.atualiza(faixa);
	}
	
	public FaixaVariavel buscar(String nomeVariavel, Float valor) throws Exception {
		String jpql = "select f " +
					" from FaixaVariavel f " + 
					" where :pValor >= f.minimo and :pValor <= f.maximo " +
					" and f.nomeVariavel = :pNomeVariavel";
		
		TypedQuery<FaixaVariavel> query = em.createQuery(jpql, FaixaVariavel.class);
		query.setParameter("pValor", valor);
		query.setParameter("pNomeVariavel", nomeVariavel);		
		
		java.util.List<FaixaVariavel> lista = query.getResultList();
		if (lista.size() < 1) {
			throw new Exception("Nenhuma faixa de valores encontrada para a variavel " 
					+ nomeVariavel + " para o valor " + valor);
		}
		return lista.get(0);
	}

}

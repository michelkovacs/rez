package br.jus.trerj.rezon.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.jus.trerj.rezon.model.Solucao;

public class SolucaoDao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 19449264301587322L;

	EntityManager em;
	
	private DAO<Solucao> dao;
	
	public SolucaoDao(EntityManager em) {
		this.em = em;
		this.dao = new DAO<Solucao>(this.em, Solucao.class);
	}
	
	public void incluir(Solucao solucao) {
		this.dao.adiciona(solucao);
	}
	
	public void atualizar(Solucao solucao) {
		this.dao.atualiza(solucao);
	}
	
	public List<Solucao> listarPrimeirosColocados(int qtdeResultados) {
		String jpql = "select solucao from Solucao solucao " +
					" order by solucao.valorFuncObjetivo DESC ";
		
		TypedQuery<Solucao> query = em.createQuery(jpql, Solucao.class)
				.setFirstResult(0)
				.setMaxResults(qtdeResultados);
		//query.setParameter("pIdExperimento", idExperimento);
		
		List<Solucao> lista = query.getResultList();
		return lista;
	}

}

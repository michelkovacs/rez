package com.mk.bandas.bean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.hibernate.ejb.HibernateEntityManagerFactory;
import org.hibernate.stat.Statistics;

@Named
@ApplicationScoped
public class HibernateStatisticsBean {
	
	@Inject
	EntityManager em;
	Statistics statistics;
	
	@PostConstruct
	public void init() {
		HibernateEntityManagerFactory hemf = (HibernateEntityManagerFactory) em.getEntityManagerFactory();
		this.statistics = hemf.getSessionFactory().getStatistics();
	}
	
	public Statistics getStatistics() {
		return statistics;
	}

}

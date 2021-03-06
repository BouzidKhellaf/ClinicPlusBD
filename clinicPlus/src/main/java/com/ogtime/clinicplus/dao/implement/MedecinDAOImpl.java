package com.ogtime.clinicplus.dao.implement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.ogtime.clinicplus.entities.*;
import com.ogtime.clinicplus.dao.IMedecinDAO;

public class MedecinDAOImpl implements IMedecinDAO{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void ajouterMedecin(Medecin medecin) {
		em.persist(medecin);
	}

	@Override
	public void modifierMedecin() {
		em.merge(getMedecin());
	}

	@Override
	public Medecin getMedecin(long idMedecin) {
		return em.find(Medecin.class, idMedecin);
	}

	@Override
	public void supprimerMedecin(long idMedecin) {
		Medecin medecin=em.find(Medecin.class, idMedecin);
		em.remove(medecin);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<com.ogtime.clinicplus.entities.Medecin> getMedecin() {
		Query req = em.createQuery("select m from Medecin m");
		return req.getResultList();
	}
	
}

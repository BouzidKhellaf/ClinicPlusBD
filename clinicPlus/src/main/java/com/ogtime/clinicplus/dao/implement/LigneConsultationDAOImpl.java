package com.ogtime.clinicplus.dao.implement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.ogtime.clinicplus.dao.ILigneConsultationDAO;
import com.ogtime.clinicplus.entities.LigneConsultation;

public class LigneConsultationDAOImpl implements ILigneConsultationDAO{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void ajouterLigneConsultation(LigneConsultation ligneConsultation) {
		em.persist(ligneConsultation);
	}

	@Override
	public void modifierLigneConsultation() {
		em.merge(getLigneConsultation());
	}

	@Override
	public LigneConsultation getLigneConsultation(long idLigneConsultation) {
		return em.find(LigneConsultation.class, idLigneConsultation);
	}

	@Override
	public void supprimerLigneConsultation(long idLigneConsultation) {
		LigneConsultation ligneConsultation=em.find(LigneConsultation.class, idLigneConsultation);
		em.remove(ligneConsultation);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LigneConsultation> getLigneConsultation() {
		Query req = em.createQuery("select lc from LConsultation lc");
		return req.getResultList();
	}

}

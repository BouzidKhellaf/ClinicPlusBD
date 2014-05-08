package com.ogtime.clinicplus.dao.implement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.ogtime.clinicplus.dao.IDossierDAO;
import com.ogtime.clinicplus.entities.Dossier;

public class DossierDAOImpl implements IDossierDAO{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void ajouterDossier(Dossier dossier) {
		em.persist(dossier);
	}

	@Override
	public void modifierDossier() {
		em.merge(getDossier());
	}

	@Override
	public Dossier getDossier(long idDossier) {
		return em.find(Dossier.class, idDossier);
	}

	@Override
	public void supprimerDossier(long idDossier) {
		Dossier dossier=em.find(Dossier.class, idDossier);
		em.remove(dossier);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dossier> getDossier() {
		Query req = em.createQuery("select d from Dossier d");
		return req.getResultList();
	}

}

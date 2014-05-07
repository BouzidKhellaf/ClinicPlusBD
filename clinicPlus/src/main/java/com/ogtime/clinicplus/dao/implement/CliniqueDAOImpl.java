package com.ogtime.clinicplus.dao.implement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ogtime.clinicplus.dao.ICliniqueDAO;
import com.ogtime.clinicplus.entities.Clinique;

@Repository
public class CliniqueDAOImpl implements ICliniqueDAO{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void ajouterClinique(Clinique clinique) {
		em.persist(clinique);
	}

	@Override
	public void modifierAdmin() {
		em.merge(getClinique());
	}

	@Override
	public Clinique getClinique(long idClinique) {
		return em.find(Clinique.class, idClinique);
	}

	@Override
	public void supprimerClinique(long idClinique) {
		Clinique clinique=em.find(Clinique.class, idClinique);
		em.remove(clinique);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Clinique> getClinique() {
		Query req = em.createQuery("select c from Cliniques c");
		return req.getResultList();
	}

}

package com.ogtime.clinicplus.dao.implement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.ogtime.clinicplus.dao.IHoraireDAO;
import com.ogtime.clinicplus.entities.Horaire;

public class HoraireDAOImpl implements IHoraireDAO{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void ajouterHoraire(Horaire horaire) {
		em.persist(horaire);
	}

	@Override
	public void modifierHoraire() {
		em.merge(getHoraire());
	}

	@Override
	public Horaire getHoraire(long idHoraire) {
		return em.find(Horaire.class, idHoraire);
	}

	@Override
	public void supprimerHoraire(long idHoraire) {
		Horaire horaire=em.find(Horaire.class, idHoraire);
		em.remove(horaire);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Horaire> getHoraire() {
		Query req = em.createQuery("select c from Horaire c");
		return req.getResultList();
	}

}

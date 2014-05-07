package com.ogtime.clinicplus.dao.implement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ogtime.clinicplus.dao.IConsultationDAO;
import com.ogtime.clinicplus.entities.Consultation;

@Repository
public class ConsultationDAOImpl implements IConsultationDAO{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void ajouterConsultation(Consultation consultation) {
		em.persist(consultation);
	}

	@Override
	public void modifierConsultation() {
		em.merge(getConsultation());
	}

	@Override
	public Consultation getConsultation(long idConsultation) {
		return em.find(Consultation.class, idConsultation);
	}

	@Override
	public void supprimerConsultation(long idConsultation) {
		Consultation consultation=em.find(Consultation.class, idConsultation);
		em.remove(consultation);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Consultation> getConsultation() {
		Query req = em.createQuery("select c from Consultations c");
		return req.getResultList();
	}

}
package com.ogtime.clinicplus.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ogtime.clinicplus.entities.Clinique;
import com.ogtime.clinicplus.entities.Horaire;
import com.ogtime.clinicplus.entities.Medecin;
import com.ogtime.clinicplus.entities.Patient;
import com.ogtime.clinicplus.entities.Rendezvous;

public class PatientDAO implements IPatientDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Patient> listPatients() {

		Query req = em.createQuery("select p from Patient p");
		return req.getResultList();

	}

	@Override
	public List<Patient> patientsParMotCle(String mc) {
		Query req = em.createQuery("select p from Patient p where p.nom like:x or p.telephone like:x");
		req.setParameter("x", "%" + mc + "%");
		return req.getResultList();
	}

	@Override
	public Patient getPatient(Long idPatient) {
		return em.find(Patient.class, idPatient);
	}

	@Override
	public void supprimerPatient(Long idPatient) {
		Patient p=em.find(Patient.class, idPatient);
		em.remove(p);

	}

	@Override
	public void modifierPatient(Patient patient) {
		em.merge(patient);
	}

	@Override
	public Long ajouterPatient(Patient patient) {
		em.persist(patient);
		return patient.getIdPatient();

	}

	@Override
	public List<Medecin> medecinParMotCle(String mc) {
		Query req = em.createQuery("select m from Medecin m where m.specialite like:x or  m.nom like:x");
		req.setParameter("x", "%" + mc + "%");
		return req.getResultList();
	}

	@Override
	public List<Horaire> getHoraireMedecin(Long idMedecin) {
		Query req=em.createQuery("select h from Horaire h where	h.medecin.idMedecin=:x");
				req.setParameter("x", idMedecin);
				return req.getResultList();
	}

	@Override
	public void prendreRendezVouz(Patient patient, Medecin medecin, Clinique clinique,Date dateRendezvous) {
		Rendezvous rd=new Rendezvous();
		rd.setPatient(patient);
		rd.setMedecin(medecin);
		rd.setClinique(clinique);
		rd.setDateRendezvous(dateRendezvous);
		
		em.persist(rd);

	}

	@Override
	public List<Clinique> listCliniques() {
		Query req = em.createQuery("select c from Clinique c");
		return req.getResultList();
	}

	@Override
	public Long ajouterClinique(Clinique clinique) {
		em.persist(clinique);
		return clinique.getIdClinique();
	}

}

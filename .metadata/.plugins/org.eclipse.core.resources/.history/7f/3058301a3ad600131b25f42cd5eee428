package com.ogtime.clinicplus.metier.implement;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ogtime.clinicplus.dao.IPatientDAO;
import com.ogtime.clinicplus.entities.Clinique;
import com.ogtime.clinicplus.entities.Horaire;
import com.ogtime.clinicplus.entities.Medecin;
import com.ogtime.clinicplus.entities.Patient;
import com.ogtime.clinicplus.metier.IPatientMetier;

@Service
@Transactional
public class PatientMetier implements IPatientMetier {
	
	@Autowired
	private IPatientDAO dao;

	@Override
	public List<Patient> listPatients() {
		
		return dao.listPatients();
	}

	@Override
	public List<Patient> patientsParMotCle(String mc) {
		
		return dao.patientsParMotCle(mc);
	}

	@Override
	public Patient getPatient(Long idPatient) {
		
		return dao.getPatient(idPatient);
	}

	@Override
	public void supprimerPatient(Long idPatient) {
		dao.supprimerPatient(idPatient);
	}

	@Override
	public void modifierPatient(Patient patient) {
		dao.modifierPatient(patient);

	}

	@Override
	public Long ajouterPatient(Patient patient) {
		
		return dao.ajouterPatient(patient);
	}

	@Override
	public List<Medecin> medecinParMotCle(String mc) {
		
		return dao.medecinParMotCle(mc);
	}

	@Override
	public List<Horaire> getHoraireMedecin(Long idMedecin) {
		
		return dao.getHoraireMedecin(idMedecin);
	}

	@Override
	public void prendreRendezVouz(Patient patient, Medecin medecin,
			Clinique clinique, Date dateRendezvous) {
		dao.prendreRendezVouz(patient, medecin, clinique, dateRendezvous);

	}
	
	@Override
	public List<Clinique> listCliniques() {
		
		return dao.listCliniques();
	}

	public IPatientDAO getDao() {
		return dao;
	}

	public void setDao(IPatientDAO dao) {
		this.dao = dao;
	}

	@Override
	public Long ajouterClinique(Clinique clinique) {
		
		return dao.ajouterClinique(clinique);
	}

}

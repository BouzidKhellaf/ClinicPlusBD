package com.ogtime.clinicplus.dao;

import java.util.Date;
import java.util.List;

import com.ogtime.clinicplus.entities.*;

public interface IPatientDAO {	
	
	public List<Patient> listPatients();
	public List<Patient> patientsParMotCle(String mc);
	
	public Patient getPatient(Long idPatient);
	public void supprimerPatient(Long idPatient);
	public void modifierPatient(Patient patient);	
	public Long ajouterPatient(Patient patient);
	
	public List<Medecin> medecinParMotCle(String mc);
	public List<Horaire> getHoraireMedecin(Long idMedecin);
	
	public void prendreRendezVouz(Patient patient,Medecin medecin,Clinique clinique,Date dateRendezvous);
	
	public List<Clinique> listCliniques();
	public Long ajouterClinique(Clinique clinique);

}


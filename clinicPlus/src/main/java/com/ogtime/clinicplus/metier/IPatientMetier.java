package com.ogtime.clinicplus.metier;

import java.util.Date;
import java.util.List;

import com.ogtime.clinicplus.entities.Clinique;
import com.ogtime.clinicplus.entities.Horaire;
import com.ogtime.clinicplus.entities.Medecin;
import com.ogtime.clinicplus.entities.Patient;

public interface IPatientMetier {
	
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

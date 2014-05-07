package com.ogtime.clinicplus.metier;

import java.util.List;

import com.ogtime.clinicplus.entities.Clinique;

public interface ICliniqueMetier {
	
	public void ajouterClinique(Clinique clinique);
	public void modifierAdmin();
	public Clinique getClinique(long idClinique);
	public void supprimerClinique(long idClinique);
	public List<Clinique> getClinique();

}

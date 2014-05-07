package com.ogtime.clinicplus.dao;

import java.util.List;

import com.ogtime.clinicplus.entities.Clinique;

public interface ICliniqueDAO {
	
	public void ajouterClinique(Clinique clinique);
	public void modifierAdmin();
	public Clinique getClinique(long idClinique);
	public void supprimerClinique(long idClinique);
	public List<Clinique> getClinique();

}

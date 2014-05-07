package com.ogtime.clinicplus.dao;

import java.util.List;

import com.ogtime.clinicplus.entities.Medecin;

public interface IMedecinDAO {
	
	public void ajouterMedecin(Medecin medecin);
	public void modifierMedecin();
	public Medecin getMedecin(long idMedecin);
	public void supprimerMedecin(long idMedecin);
	public List<Medecin> getMedecin();

}

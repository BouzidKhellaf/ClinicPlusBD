package com.ogtime.clinicplus.dao;

import java.util.List;

import com.ogtime.clinicplus.entities.LigneConsultation;

public interface ILigneConsultationDAO {
	
	public void ajouterLigneConsultation(LigneConsultation ligneConsultation);
	public void modifierLigneConsultation();
	public LigneConsultation getLigneConsultation(long idLigneConsultation);
	public void supprimerLigneConsultation(long idLigneConsultation);
	public List<LigneConsultation> getLigneConsultation();

}

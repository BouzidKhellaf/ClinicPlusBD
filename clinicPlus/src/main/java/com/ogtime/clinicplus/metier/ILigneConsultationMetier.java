package com.ogtime.clinicplus.metier;

import java.util.List;

import com.ogtime.clinicplus.entities.LigneConsultation;

public interface ILigneConsultationMetier {
	
	public void ajouterLigneConsultation(LigneConsultation ligneConsultation);
	public void modifierLigneConsultation();
	public LigneConsultation getLigneConsultation(long idLigneConsultation);
	public void supprimerLigneConsultation(long idLigneConsultation);
	public List<LigneConsultation> getLigneConsultation();

}

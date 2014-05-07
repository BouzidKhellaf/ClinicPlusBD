package com.ogtime.clinicplus.metier;

import java.util.List;

import com.ogtime.clinicplus.entities.Consultation;

public interface IConsultationMetier {
	
	public void ajouterConsultation(Consultation consultation);
	public void modifierConsultation();
	public Consultation getConsultation(long idConsultation);
	public void supprimerConsultation(long idConsultation);
	public List<Consultation> getConsultation();

}

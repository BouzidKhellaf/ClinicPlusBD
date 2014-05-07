package com.ogtime.clinicplus.dao;

import java.util.List;

import com.ogtime.clinicplus.entities.Consultation;

public interface IConsultationDAO {
	
	public void ajouterConsultation(Consultation consultation);
	public void modifierConsultation();
	public Consultation getConsultation(long idConsultation);
	public void supprimerConsultation(long idConsultation);
	public List<Consultation> getConsultation();

}

package com.ogtime.clinicplus.metier.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ogtime.clinicplus.dao.IConsultationDAO;
import com.ogtime.clinicplus.entities.Consultation;
import com.ogtime.clinicplus.metier.IConsultationMetier;

@Service
@Transactional
public class ConsultationMetier implements IConsultationMetier{
	
	@Autowired
	private IConsultationDAO iConsultationDAO;

	@Override
	public void ajouterConsultation(Consultation consultation) {
		iConsultationDAO.ajouterConsultation(consultation);
	}

	@Override
	public void modifierConsultation() {
		iConsultationDAO.modifierConsultation();
	}

	@Override
	public Consultation getConsultation(long idConsultation) {
		return iConsultationDAO.getConsultation(idConsultation);
	}

	@Override
	public void supprimerConsultation(long idConsultation) {
		iConsultationDAO.supprimerConsultation(idConsultation);
	}

	@Override
	public List<Consultation> getConsultation() {
		return iConsultationDAO.getConsultation();
	}

}

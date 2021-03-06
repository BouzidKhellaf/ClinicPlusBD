package com.ogtime.clinicplus.metier.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ogtime.clinicplus.dao.ILigneConsultationDAO;
import com.ogtime.clinicplus.entities.LigneConsultation;
import com.ogtime.clinicplus.metier.ILigneConsultationMetier;

@Service
@Transactional
public class LigneConsultationMetier implements ILigneConsultationMetier{
	
	@Autowired
	private ILigneConsultationDAO iLigneConsultationDAO;

	@Override
	public void ajouterLigneConsultation(LigneConsultation ligneConsultation) {
		iLigneConsultationDAO.ajouterLigneConsultation(ligneConsultation);
	}

	@Override
	public void modifierLigneConsultation() {
		iLigneConsultationDAO.modifierLigneConsultation();
	}

	@Override
	public LigneConsultation getLigneConsultation(long idLigneConsultation) {
		return iLigneConsultationDAO.getLigneConsultation(idLigneConsultation);
	}

	@Override
	public void supprimerLigneConsultation(long idLigneConsultation) {
		iLigneConsultationDAO.supprimerLigneConsultation(idLigneConsultation);
	}

	@Override
	public List<LigneConsultation> getLigneConsultation() {
		return iLigneConsultationDAO.getLigneConsultation();
	}

}

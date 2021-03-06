package com.ogtime.clinicplus.metier.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ogtime.clinicplus.dao.IMedecinDAO;
import com.ogtime.clinicplus.entities.Medecin;
import com.ogtime.clinicplus.metier.IMedecinMetier;

@Service
@Transactional
public class MedecinMetier implements IMedecinMetier{
	
	@Autowired
	private IMedecinDAO iMedecinDAO;

	@Override
	public void ajouterMedecin(com.ogtime.clinicplus.entities.Medecin medecin) {
		iMedecinDAO.ajouterMedecin(medecin);
	}

	@Override
	public void modifierMedecin() {
		iMedecinDAO.modifierMedecin();
	}

	@Override
	public Medecin getMedecin(long idMedecin) {
		return iMedecinDAO.getMedecin(idMedecin);
	}

	@Override
	public void supprimerMedecin(long idMedecin) {
		iMedecinDAO.supprimerMedecin(idMedecin);
	}

	@Override
	public List<com.ogtime.clinicplus.entities.Medecin> getMedecin() {
		return iMedecinDAO.getMedecin();
	}

}

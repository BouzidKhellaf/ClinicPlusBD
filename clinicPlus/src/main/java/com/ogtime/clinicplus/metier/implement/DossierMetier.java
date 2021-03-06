package com.ogtime.clinicplus.metier.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ogtime.clinicplus.dao.IDossierDAO;
import com.ogtime.clinicplus.entities.Dossier;
import com.ogtime.clinicplus.metier.IDossierMetier;

@Service
@Transactional
public class DossierMetier implements IDossierMetier{
	
	@Autowired
	private IDossierDAO iDossierDAO;

	@Override
	public void ajouterDossier(Dossier dossier) {
		iDossierDAO.ajouterDossier(dossier);
	}

	@Override
	public void modifierDossier() {
		iDossierDAO.modifierDossier();
	}

	@Override
	public Dossier getDossier(long idDossier) {
		return iDossierDAO.getDossier(idDossier);
	}

	@Override
	public void supprimerDossier(long idDossier) {
		iDossierDAO.supprimerDossier(idDossier);
	}

	@Override
	public List<Dossier> getDossier() {
		return iDossierDAO.getDossier();
	}

}

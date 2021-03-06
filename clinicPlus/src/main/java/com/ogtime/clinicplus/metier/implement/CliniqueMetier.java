package com.ogtime.clinicplus.metier.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ogtime.clinicplus.dao.ICliniqueDAO;
import com.ogtime.clinicplus.entities.Clinique;
import com.ogtime.clinicplus.metier.ICliniqueMetier;

@Service
@Transactional
public class CliniqueMetier implements ICliniqueMetier{
	
	@Autowired
	private ICliniqueDAO iCliniqueDAO;

	@Override
	public void ajouterClinique(Clinique clinique) {
		iCliniqueDAO.ajouterClinique(clinique);
	}

	@Override
	public void modifierAdmin() {
		iCliniqueDAO.modifierAdmin();
	}

	@Override
	public Clinique getClinique(long idClinique) {
		return iCliniqueDAO.getClinique(idClinique);
	}

	@Override
	public void supprimerClinique(long idClinique) {
		iCliniqueDAO.supprimerClinique(idClinique);
	}

	@Override
	public List<Clinique> getClinique() {
		return iCliniqueDAO.getClinique();
	}

}

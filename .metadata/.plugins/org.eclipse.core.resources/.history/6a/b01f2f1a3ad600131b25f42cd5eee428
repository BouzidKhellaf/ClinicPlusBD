package com.ogtime.clinicplus.metier.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ogtime.clinicplus.dao.IHoraireDAO;
import com.ogtime.clinicplus.entities.Horaire;
import com.ogtime.clinicplus.metier.IHoraireMetier;

@Service
@Transactional
public class HoraireMetier implements IHoraireMetier{
	
	@Autowired
	private IHoraireDAO iHoraireDAO;

	@Override
	public void ajouterHoraire(Horaire horaire) {
		iHoraireDAO.ajouterHoraire(horaire);
	}

	@Override
	public void modifierHoraire() {
		iHoraireDAO.modifierHoraire();
	}

	@Override
	public Horaire getHoraire(long idHoraire) {
		return iHoraireDAO.getHoraire(idHoraire);
	}

	@Override
	public void supprimerHoraire(long idHoraire) {
		iHoraireDAO.supprimerHoraire(idHoraire);
	}

	@Override
	public List<Horaire> getHoraire() {
		return iHoraireDAO.getHoraire();
	}

}

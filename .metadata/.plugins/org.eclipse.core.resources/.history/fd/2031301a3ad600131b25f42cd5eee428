package com.ogtime.clinicplus.metier.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ogtime.clinicplus.dao.IRendezvousDAO;
import com.ogtime.clinicplus.entities.Rendezvous;
import com.ogtime.clinicplus.metier.IRendezvousMetier;

@Service
@Transactional
public class RendezvousMetier implements IRendezvousMetier{
	
	@Autowired
	private IRendezvousDAO iRendezvousDAO;

	@Override
	public void ajouterRendezvous(Rendezvous rendezvous) {
		iRendezvousDAO.ajouterRendezvous(rendezvous);
	}

	@Override
	public void modifierRendezvous() {
		iRendezvousDAO.modifierRendezvous();
	}

	@Override
	public Rendezvous getRendezvous(long idRendezvous) {
		return iRendezvousDAO.getRendezvous(idRendezvous);
	}

	@Override
	public void supprimerRendezvous(long idRendezvous) {
		iRendezvousDAO.supprimerRendezvous(idRendezvous);
	}

	@Override
	public List<Rendezvous> getRendezvous() {
		return iRendezvousDAO.getRendezvous();
	}

}

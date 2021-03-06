package com.ogtime.clinicplus.dao;

import java.util.List;

import com.ogtime.clinicplus.entities.Rendezvous;

public interface IRendezvousDAO {
	
	public void ajouterRendezvous(Rendezvous rendezvous);
	public void modifierRendezvous();
	public Rendezvous getRendezvous(long idRendezvous);
	public void supprimerRendezvous(long idRendezvous);
	public List<Rendezvous> getRendezvous();

}

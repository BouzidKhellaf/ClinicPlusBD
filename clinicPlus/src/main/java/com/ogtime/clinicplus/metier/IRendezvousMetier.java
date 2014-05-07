package com.ogtime.clinicplus.metier;

import java.util.List;

import com.ogtime.clinicplus.entities.Rendezvous;

public interface IRendezvousMetier {
	
	public void ajouterRendezvous(Rendezvous rendezvous);
	public void modifierRendezvous();
	public Rendezvous getRendezvous(long idRendezvous);
	public void supprimerRendezvous(long idRendezvous);
	public List<Rendezvous> getRendezvous();

}

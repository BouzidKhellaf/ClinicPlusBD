package com.ogtime.clinicplus.metier;

import java.util.List;

import com.ogtime.clinicplus.entities.Horaire;

public interface IHoraireMetier {

	public void ajouterHoraire(Horaire horaire);
	public void modifierHoraire();
	public Horaire getHoraire(long idHoraire);
	public void supprimerHoraire(long idHoraire);
	public List<Horaire> getHoraire();
}

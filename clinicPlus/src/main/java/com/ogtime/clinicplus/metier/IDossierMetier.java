package com.ogtime.clinicplus.metier;

import java.util.List;

import com.ogtime.clinicplus.entities.Dossier;

public interface IDossierMetier {
	
	public void ajouterDossier(Dossier dossier);
	public void modifierDossier();
	public Dossier getDossier(long idDossier);
	public void supprimerDossier(long idDossier);
	public List<Dossier> getDossier();

}

package com.ogtime.clinicplus.metier;

import java.util.List;

import com.ogtime.clinicplus.entities.Admin;

public interface IAdminMetier {
	
	public void ajouterAdmin(Admin admin);
	public void modifierAdmin();
	public Admin getAdmin(long idAdmin);
	public void supprimerAdmin(long idAdmin);
	public List<Admin> getAdmin();

}

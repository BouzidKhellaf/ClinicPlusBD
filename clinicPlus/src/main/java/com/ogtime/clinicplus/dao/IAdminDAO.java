package com.ogtime.clinicplus.dao;

import java.util.List;

import com.ogtime.clinicplus.entities.Admin;

public interface IAdminDAO {
	
	public void ajouterAdmin(Admin admin);
	public void modifierAdmin();
	public Admin getAdmin(long idAdmin);
	public void supprimerAdmin(long idAdmin);
	public List<Admin> getAdmin();
}

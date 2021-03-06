package com.ogtime.clinicplus.metier.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ogtime.clinicplus.dao.IAdminDAO;
import com.ogtime.clinicplus.entities.Admin;
import com.ogtime.clinicplus.metier.IAdminMetier;

@Service
@Transactional
public class AdminMetier implements IAdminMetier{
	
	@Autowired
	private IAdminDAO iAdminDAO;

	@Override
	public void ajouterAdmin(Admin admin) {
		iAdminDAO.ajouterAdmin(admin);
	}

	@Override
	public void modifierAdmin() {
		iAdminDAO.modifierAdmin();
	}

	@Override
	public Admin getAdmin(long idAdmin) {
		return iAdminDAO.getAdmin(idAdmin);
	}

	@Override
	public void supprimerAdmin(long idAdmin) {
		iAdminDAO.supprimerAdmin(idAdmin);
	}

	@Override
	public List<Admin> getAdmin() {
		return iAdminDAO.getAdmin();
	}

}

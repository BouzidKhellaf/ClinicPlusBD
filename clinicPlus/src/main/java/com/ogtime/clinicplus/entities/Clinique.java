package com.ogtime.clinicplus.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Clinique implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClinique;
	@NotEmpty
	@NotNull
	private String nom;
	@NotEmpty
	@NotNull
	private String adresse;
	@NotEmpty
	@NotNull
	private String codePostal;
	@NotEmpty
	@NotNull
	private String ville;
	@NotEmpty
	@NotNull
	private String province;
	@NotEmpty
	@NotNull
	private String telephone;
	private String siteweb;
	private String fax;
	
	
	@OneToMany(mappedBy="clinique")
	private Collection<Admin>admins;
	@OneToMany(mappedBy="clinique")
	private Collection<Patient>patients;
	@OneToMany(mappedBy="clinique")
	private Collection<Medecin>medecins;
	@OneToMany(mappedBy="clinique")
	private Collection<Rendezvous>rendezvous;
	
	
	
	
	public Clinique() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Clinique(String nom, String adresse, String codePostal, String ville,
			String province, String telephone, String siteweb, String fax) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.province = province;
		this.telephone = telephone;
		this.siteweb = siteweb;
		this.fax = fax;
	}


	public Long getIdClinique() {
		return idClinique;
	}
	public void setIdClinique(Long idClinique) {
		this.idClinique = idClinique;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getSiteweb() {
		return siteweb;
	}
	public void setSiteweb(String siteweb) {
		this.siteweb = siteweb;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}


	public Collection<Rendezvous> getRendezvous() {
		return rendezvous;
	}


	public void setRendezvous(Collection<Rendezvous> rendezvous) {
		this.rendezvous = rendezvous;
	}


	public Collection<Admin> getAdmins() {
		return admins;
	}


	public void setAdmins(Collection<Admin> admins) {
		this.admins = admins;
	}


	public Collection<Patient> getPatients() {
		return patients;
	}


	public void setPatients(Collection<Patient> patients) {
		this.patients = patients;
	}


	public Collection<Medecin> getMedecins() {
		return medecins;
	}


	public void setMedecins(Collection<Medecin> medecins) {
		this.medecins = medecins;
	}
	


	

}

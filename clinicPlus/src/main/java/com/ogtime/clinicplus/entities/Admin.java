package com.ogtime.clinicplus.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Admin implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAdmin;
	@NotEmpty
	private String matricule;
	@NotEmpty
	@Size(min=4,max=20)
	private String nomUtilisateur;
	@NotEmpty
	@Size(min=4,max=20)
	private String motDePasse;
	@NotEmpty
	@Size(min=4,max=20)
	private String nom;
	@NotEmpty
	@Size(min=4,max=20)
	private String prenom;
	@NotEmpty
	private String adresse;
	@NotEmpty
	private String telephone;
	@NotEmpty
	@Email
	private String courriel;
	
	@ManyToOne
	@JoinColumn(name="idClinique")
	private Clinique clinique;
	
	@OneToMany(mappedBy="admin")
	private Collection<Patient> patients;
	
	@OneToMany(mappedBy="admin")
	private Collection<Medecin> medecins;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(Long idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
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

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCourriel() {
		return courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	public Clinique getClinique() {
		return clinique;
	}

	public void setClinique(Clinique clinique) {
		this.clinique = clinique;
	}
	
	
	
}

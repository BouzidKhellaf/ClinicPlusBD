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
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Medecin implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idMedecin;
	@NotEmpty
	private String specialite;
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
	
	@OneToMany(mappedBy="medecin")
	private Collection<Horaire> horaires;
	@OneToMany(mappedBy="medecin")
	private Collection<LigneConsultation> lignesConsultation;
	
	private Rendezvous rendezvous;
	@ManyToOne
	@JoinColumn(name="idAdmin")
	private Admin admin;
	
	
	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getIdMedecin() {
		return idMedecin;
	}
	public void setIdMedecin(Long idMedecin) {
		this.idMedecin = idMedecin;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public Collection<Horaire> getHoraires() {
		return horaires;
	}
	public void setHoraires(Collection<Horaire> horaires) {
		this.horaires = horaires;
	}
	public Collection<LigneConsultation> getLignesConsultation() {
		return lignesConsultation;
	}
	public void setLignesConsultation(
			Collection<LigneConsultation> lignesConsultation) {
		this.lignesConsultation = lignesConsultation;
	}
	
	public Rendezvous getRendezvous() {
		return rendezvous;
	}

	public void setRendezvous(Rendezvous rendezvous) {
		this.rendezvous = rendezvous;
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

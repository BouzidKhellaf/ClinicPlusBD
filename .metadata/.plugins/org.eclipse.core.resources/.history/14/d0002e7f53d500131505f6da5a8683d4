package com.ogtime.clinicplus.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Dossier implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDossier;
	@OneToOne
	@JoinColumn(name="idPatient")
	private Patient patient;
	@OneToMany(mappedBy="dossier")
	private Collection<Consultation>consultations;
	
	public Dossier() {
		super();
		// TODO Auto-generated constructor stub
	}	


	public Long getIdDossier() {
		return idDossier;
	}


	public void setIdDossier(Long idDossier) {
		this.idDossier = idDossier;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public Collection<Consultation> getConsultations() {
		return consultations;
	}


	public void setConsultations(Collection<Consultation> consultations) {
		this.consultations = consultations;
	}
	

}

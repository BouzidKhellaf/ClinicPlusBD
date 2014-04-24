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

@Entity
public class Consultation implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idConsultation;
	
	@ManyToOne
	@JoinColumn(name="idDossier")
	private Dossier dossier;
	@ManyToOne
	@JoinColumn(name="idPatient")
	private Patient patient;
	@OneToMany(mappedBy="consultation")
	private Collection<LigneConsultation> ligneConsultation;
	
	public Consultation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Consultation(Patient patient) {
		super();
		this.patient = patient;
		
	}
	public Long getIdConsultation() {
		return idConsultation;
	}
	public void setIdConsultation(Long idConsultation) {
		this.idConsultation = idConsultation;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Dossier getDossier() {
		return dossier;
	}
	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}
	public Collection<LigneConsultation> getLigneConsultation() {
		return ligneConsultation;
	}
	public void setLigneConsultation(Collection<LigneConsultation> ligneConsultation) {
		this.ligneConsultation = ligneConsultation;
	}
	
	
	

}

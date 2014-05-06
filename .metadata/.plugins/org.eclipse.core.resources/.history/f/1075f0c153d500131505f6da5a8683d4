package com.ogtime.clinicplus.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Rendezvous implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idRendezvous;
	
	@ManyToOne
	@JoinColumn(name="idClinique")
	private Clinique clinique;
	
	@JoinColumn(name="idMedecin")
	private Medecin medecin;
	
	@JoinColumn(name="idPatient")
	private Patient patient;
	public Rendezvous() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rendezvous(Patient patient) {
		super();
		this.patient = patient;
	}
	
	public Long getIdRendezvous() {
		return idRendezvous;
	}
	public void setIdRendezvous(Long idRendezvous) {
		this.idRendezvous = idRendezvous;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Clinique getClinique() {
		return clinique;
	}
	public void setClinique(Clinique clinique) {
		this.clinique = clinique;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	
	
}

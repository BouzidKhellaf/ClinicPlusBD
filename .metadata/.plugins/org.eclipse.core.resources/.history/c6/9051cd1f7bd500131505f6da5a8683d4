package com.ogtime.clinicplus.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class LigneConsultation implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLigneConsultation;
	@NotEmpty
	private Date dateConsultation;	
	private String note;
	
	@ManyToOne
	@JoinColumn(name="idMedecin")
	private Medecin medecin;
	@ManyToOne
	@JoinColumn(name="idConsultation")
	private Consultation consultation;
	
	
	
	public LigneConsultation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LigneConsultation(Consultation consultation, Medecin medecin,
			Date dateConsultation, String note) {
		super();
		this.consultation = consultation;
		this.medecin = medecin;
		this.dateConsultation = dateConsultation;
		this.note = note;
	}
	public Long getIdLigneConsultation() {
		return idLigneConsultation;
	}
	public void setIdLigneConsultation(Long idLigneConsultation) {
		this.idLigneConsultation = idLigneConsultation;
	}
	public Consultation getConsultation() {
		return consultation;
	}
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public Date getDateConsultation() {
		return dateConsultation;
	}
	public void setDateConsultation(Date dateConsultation) {
		this.dateConsultation = dateConsultation;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	

}

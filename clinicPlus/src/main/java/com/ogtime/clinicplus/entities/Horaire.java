package com.ogtime.clinicplus.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
public class Horaire implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idHoraire;
	@NotEmpty
	@NotNull
	private Date heure;
	@NotEmpty
	@NotNull
	private boolean etatHoraire;
	
	@ManyToOne
	@JoinColumn(name="idMedecin")
	private Medecin medecin;
	public Horaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Horaire(Medecin medecin, Date heure, boolean etatHoraire) {
		super();
		this.medecin = medecin;
		this.setHeure(heure);
		this.etatHoraire = etatHoraire;
	}
	public long getIdHoraire() {
		return idHoraire;
	}
	public void setIdHoraire(long idHoraire) {
		this.idHoraire = idHoraire;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	public boolean isEtatHoraire() {
		return etatHoraire;
	}
	public void setEtatHoraire(boolean etatHoraire) {
		this.etatHoraire = etatHoraire;
	}
	public Date getHeure() {
		return heure;
	}
	public void setHeure(Date heure) {
		this.heure = heure;
	}
	
	

}

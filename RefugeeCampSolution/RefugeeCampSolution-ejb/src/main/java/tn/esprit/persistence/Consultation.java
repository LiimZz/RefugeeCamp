package tn.esprit.persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Consultation
 *
 */
@Entity
@Table(name="Consultations")
public class Consultation implements Serializable {

	@EmbeddedId
	private ConsultationPK id;
	
	@Column(name="Maladie")
	private String maladie;
	
	@Column(name="Etat")
	private String etat;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="RefugID", insertable = false, updatable = false)
	private Refug refug;

	@ManyToOne
	@JoinColumn(name="MedecinID", insertable = false, updatable = false)
	private MedicalCare medicalCare;
	
	public Consultation() {
		super();
	}   
	public String getMaladie() {
		return this.maladie;
	}

	public void setMaladie(String maladie) {
		this.maladie = maladie;
	}   
	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	public ConsultationPK getId() {
		return id;
	}
	public void setId(ConsultationPK id) {
		this.id = id;
	}
	public Refug getRefug() {
		return refug;
	}
	public void setRefug(Refug refug) {
		this.refug = refug;
	}
	public MedicalCare getMedicalCare() {
		return medicalCare;
	}
	public void setMedicalCare(MedicalCare medicalCare) {
		this.medicalCare = medicalCare;
	}
   
}

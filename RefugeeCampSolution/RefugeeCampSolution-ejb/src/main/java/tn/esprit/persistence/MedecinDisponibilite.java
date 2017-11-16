package tn.esprit.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the MedecinDisponibilites database table.
 * 
 */
@Entity
@Table(name="MedecinDisponibilites")
public class MedecinDisponibilite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="DispoID")
	private int dispoID;

	@Column(name="DateDebut")
	private Date dateDebut;

	@Column(name="DateFin")
	private Date dateFin;

	//bi-directional many-to-one association to MedicalCare
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="MedecinID")
	private MedicalCare medicalCare;

	public MedecinDisponibilite() {
	}

	public int getDispoID() {
		return this.dispoID;
	}

	public void setDispoID(int dispoID) {
		this.dispoID = dispoID;
	}

	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public MedicalCare getMedicalCare() {
		return this.medicalCare;
	}

	public void setMedicalCare(MedicalCare medicalCare) {
		this.medicalCare = medicalCare;
	}

}
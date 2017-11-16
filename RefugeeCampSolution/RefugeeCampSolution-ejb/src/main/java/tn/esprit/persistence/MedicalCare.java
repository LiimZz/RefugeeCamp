package tn.esprit.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the MedicalCares database table.
 * 
 */
@Entity
@Table(name="MedicalCares")
public class MedicalCare implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MedecinID")
	private int medecinID;

	@Column(name="Field")
	private String field;

	@Column(name="FirstName")
	private String firstName;

	@Column(name="LastName")
	private String lastName;

	@Column(name="MiddleName")
	private String middleName;

	//bi-directional many-to-one association to MedecinDisponibilite
	@OneToMany(mappedBy="medicalCare")
	private List<MedecinDisponibilite> medecinDisponibilites;

	//bi-directional many-to-one association to Consultation
	@OneToMany(mappedBy="medicalCare")
	private List<Consultation> consultations;

	public MedicalCare() {
	}

	public int getMedecinID() {
		return this.medecinID;
	}

	public void setMedecinID(int medecinID) {
		this.medecinID = medecinID;
	}

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public List<MedecinDisponibilite> getMedecinDisponibilites() {
		return this.medecinDisponibilites;
	}

	public void setMedecinDisponibilites(List<MedecinDisponibilite> medecinDisponibilites) {
		this.medecinDisponibilites = medecinDisponibilites;
	}

	public MedecinDisponibilite addMedecinDisponibilite(MedecinDisponibilite medecinDisponibilite) {
		getMedecinDisponibilites().add(medecinDisponibilite);
		medecinDisponibilite.setMedicalCare(this);

		return medecinDisponibilite;
	}

	public MedecinDisponibilite removeMedecinDisponibilite(MedecinDisponibilite medecinDisponibilite) {
		getMedecinDisponibilites().remove(medecinDisponibilite);
		medecinDisponibilite.setMedicalCare(null);

		return medecinDisponibilite;
	}

	public List<Consultation> getConsultations() {
		return this.consultations;
	}

	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}

	public Consultation addConsultation(Consultation consultation) {
		getConsultations().add(consultation);
		consultation.setMedicalCare(this);

		return consultation;
	}

	public Consultation removeConsultation(Consultation consultation) {
		getConsultations().remove(consultation);
		consultation.setMedicalCare(null);

		return consultation;
	}

}
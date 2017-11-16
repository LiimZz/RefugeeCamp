package tn.esprit.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Refugs database table.
 * 
 */
@Entity
@Table(name="Refugs")
public class Refug implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RefugID")
	private int refugID;

	@Column(name="Age_Day")
	private int age_Day;

	@Column(name="Age_Month")
	private int age_Month;

	@Column(name="Age_Year")
	private int age_Year;

	@Column(name="FirstName")
	private String firstName;

	@Column(name="HealthStatus")
	private String healthStatus;

	@Column(name="LastName")
	private String lastName;

	@Column(name="MiddleName")
	private String middleName;

	@Column(name="Nationality")
	private String nationality;

	@Column(name="Skills")
	private String skills;

	@Column(name="Status")
	private int status;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="AdminID")
	private User aspNetUser;

	//bi-directional many-to-one association to Tent
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TentID")
	private Tent tent;

	//bi-directional many-to-one association to Consultation
	@OneToMany(mappedBy="refug")
	private List<Consultation> consultations;

	//bi-directional many-to-one association to JobOffer
	@OneToMany(mappedBy="refug")
	private List<JobOffer> jobOffers;

	//bi-directional many-to-one association to Adoption
	@OneToMany(mappedBy="refug")
	private List<Adoption> adoptions;

	public Refug() {
	}

	public int getRefugID() {
		return this.refugID;
	}

	public void setRefugID(int refugID) {
		this.refugID = refugID;
	}

	public int getAge_Day() {
		return this.age_Day;
	}

	public void setAge_Day(int age_Day) {
		this.age_Day = age_Day;
	}

	public int getAge_Month() {
		return this.age_Month;
	}

	public void setAge_Month(int age_Month) {
		this.age_Month = age_Month;
	}

	public int getAge_Year() {
		return this.age_Year;
	}

	public void setAge_Year(int age_Year) {
		this.age_Year = age_Year;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getHealthStatus() {
		return this.healthStatus;
	}

	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
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

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getSkills() {
		return this.skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public int getStaus() {
		return this.status;
	}

	public void setStaus(int status) {
		this.status = status;
	}

	public User getAspNetUser() {
		return this.aspNetUser;
	}

	public void setAspNetUser(User aspNetUser) {
		this.aspNetUser = aspNetUser;
	}

	public Tent getTent() {
		return this.tent;
	}

	public void setTent(Tent tent) {
		this.tent = tent;
	}

	public List<Consultation> getConsultations() {
		return this.consultations;
	}

	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}

	public Consultation addConsultation(Consultation consultation) {
		getConsultations().add(consultation);
		consultation.setRefug(this);

		return consultation;
	}

	public Consultation removeConsultation(Consultation consultation) {
		getConsultations().remove(consultation);
		consultation.setRefug(null);

		return consultation;
	}

	public List<JobOffer> getJobOffers() {
		return this.jobOffers;
	}

	public void setJobOffers(List<JobOffer> jobOffers) {
		this.jobOffers = jobOffers;
	}

	public JobOffer addJobOffer(JobOffer jobOffer) {
		getJobOffers().add(jobOffer);
		jobOffer.setRefug(this);

		return jobOffer;
	}

	public JobOffer removeJobOffer(JobOffer jobOffer) {
		getJobOffers().remove(jobOffer);
		jobOffer.setRefug(null);

		return jobOffer;
	}

	public List<Adoption> getAdoptions() {
		return this.adoptions;
	}

	public void setAdoptions(List<Adoption> adoptions) {
		this.adoptions = adoptions;
	}

	public Adoption addAdoption(Adoption adoption) {
		getAdoptions().add(adoption);
		adoption.setRefug(this);

		return adoption;
	}

	public Adoption removeAdoption(Adoption adoption) {
		getAdoptions().remove(adoption);
		adoption.setRefug(null);

		return adoption;
	}

}
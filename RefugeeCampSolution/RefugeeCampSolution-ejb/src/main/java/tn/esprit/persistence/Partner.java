package tn.esprit.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Partners database table.
 * 
 */
@Entity
@Table(name="Partners")
public class Partner implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PartnerID")
	private int partnerID;

	@Column(name="Name")
	private String name;

	@Column(name="Specialty")
	private String specialty;

	//bi-directional many-to-one association to PartnerDoc
	@OneToMany(mappedBy="partner")
	private List<PartnerDoc> partnerDocs;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="AdminID")
	private User aspNetUser;

	//bi-directional many-to-one association to JobOffer
	@OneToMany(mappedBy="partner")
	private List<JobOffer> jobOffers;

	public Partner() {
	}

	public int getPartnerID() {
		return this.partnerID;
	}

	public void setPartnerID(int partnerID) {
		this.partnerID = partnerID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialty() {
		return this.specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public List<PartnerDoc> getPartnerDocs() {
		return this.partnerDocs;
	}

	public void setPartnerDocs(List<PartnerDoc> partnerDocs) {
		this.partnerDocs = partnerDocs;
	}

	public PartnerDoc addPartnerDoc(PartnerDoc partnerDoc) {
		getPartnerDocs().add(partnerDoc);
		partnerDoc.setPartner(this);

		return partnerDoc;
	}

	public PartnerDoc removePartnerDoc(PartnerDoc partnerDoc) {
		getPartnerDocs().remove(partnerDoc);
		partnerDoc.setPartner(null);

		return partnerDoc;
	}

	public User getAspNetUser() {
		return this.aspNetUser;
	}

	public void setAspNetUser(User aspNetUser) {
		this.aspNetUser = aspNetUser;
	}

	public List<JobOffer> getJobOffers() {
		return this.jobOffers;
	}

	public void setJobOffers(List<JobOffer> jobOffers) {
		this.jobOffers = jobOffers;
	}

	public JobOffer addJobOffer(JobOffer jobOffer) {
		getJobOffers().add(jobOffer);
		jobOffer.setPartner(this);

		return jobOffer;
	}

	public JobOffer removeJobOffer(JobOffer jobOffer) {
		getJobOffers().remove(jobOffer);
		jobOffer.setPartner(null);

		return jobOffer;
	}

}
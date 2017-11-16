package tn.esprit.persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: JobOffer
 *
 */
@Entity
@Table(name="JobOffers")
public class JobOffer implements Serializable {

	@EmbeddedId
	private JobOfferPK id;
	
	@Column(name="Post")
	private String post;
	
	@Column(name="Salary")
	private float salary;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="RefugID", insertable = false, updatable = false)
	private Refug refug;

	@ManyToOne
	@JoinColumn(name="PartnerID", insertable = false, updatable = false)
	private Partner partner;

	public JobOffer() {
		super();
	}   
	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}   
	public float getSalary() {
		return this.salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	public JobOfferPK getId() {
		return id;
	}
	public void setId(JobOfferPK id) {
		this.id = id;
	}
	public Refug getRefug() {
		return refug;
	}
	public void setRefug(Refug refug) {
		this.refug = refug;
	}
	public Partner getPartner() {
		return partner;
	}
	public void setPartner(Partner partner) {
		this.partner = partner;
	}
   
}

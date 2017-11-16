package tn.esprit.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Donation
 *
 */
@Entity
@Table(name="Donations")
public class Donation implements Serializable {
	
	@Id
	@Column(name="DonationID")
	private int donationID;
	
	@Column(name="DateDonation")
	private Date dateDonation;
	
	@Column(name="TypeDonation")
	private String typeDonation;
	
	@Column(name="Amount")
	private float amount;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="MemberID")
	private User aspNetUser;
	
	@ManyToOne
	@JoinColumn(name="CampID")
	private Camp camp;

	public Donation() {
		super();
	}   
	public int getDonationID() {
		return this.donationID;
	}

	public void setDonationID(int donationID) {
		this.donationID = donationID;
	}   
	public Date getDateDonation() {
		return this.dateDonation;
	}

	public void setDateDonation(Date dateDonation) {
		this.dateDonation = dateDonation;
	}   
	public String getTypeDonation() {
		return this.typeDonation;
	}

	public void setTypeDonation(String typeDonation) {
		this.typeDonation = typeDonation;
	}   
	public float getAmount() {
		return this.amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	public User getAspNetUser() {
		return aspNetUser;
	}
	public void setAspNetUser(User aspNetUser) {
		this.aspNetUser = aspNetUser;
	}
	public Camp getCamp() {
		return camp;
	}
	public void setCamp(Camp camp) {
		this.camp = camp;
	}
   
}

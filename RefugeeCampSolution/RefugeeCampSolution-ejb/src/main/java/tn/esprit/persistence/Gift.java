package tn.esprit.persistence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Gifts database table.
 * 
 */
@Entity
@Table(name="Gifts")
public class Gift implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="GiftID")
	private int giftID;

	@Column(name="Amount")
	private double amount;

	@Column(name="Description")
	private String description;

	@Column(name="Name")
	private String name;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="AdminID")
	private User aspNetUser;

	public Gift() {
	}

	public int getGiftID() {
		return this.giftID;
	}

	public void setGiftID(int giftID) {
		this.giftID = giftID;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getAspNetUser() {
		return this.aspNetUser;
	}

	public void setAspNetUser(User aspNetUser) {
		this.aspNetUser = aspNetUser;
	}

}
package tn.esprit.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Camps database table.
 * 
 */
@Entity
@Table(name="Camps")
public class Camp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CampID")
	private int campID;

	@Column(name="CampName")
	private String campName;

	@Column(name="Localisation_Country")
	private String localisation_Country;

	@Column(name="Localisation_Latitude")
	private String localisation_Latitude;

	@Column(name="Localisation_Longitude")
	private String localisation_Longitude;

	@Column(name="Localisation_Street")
	private String localisation_Street;

	@Column(name="Localisation_ZipCode")
	private String localisation_ZipCode;

	@Column(name="Size")
	private int size;

	//bi-directional many-to-one association to Tent
	@OneToMany(mappedBy="camp")
	private List<Tent> tents;

	//bi-directional many-to-one association to Donation
	@OneToMany(mappedBy="camp")
	private List<Donation> donations;

	public Camp() {
	}

	public int getCampID() {
		return this.campID;
	}

	public void setCampID(int campID) {
		this.campID = campID;
	}

	public String getCampName() {
		return this.campName;
	}

	public void setCampName(String campName) {
		this.campName = campName;
	}

	public String getLocalisation_Country() {
		return this.localisation_Country;
	}

	public void setLocalisation_Country(String localisation_Country) {
		this.localisation_Country = localisation_Country;
	}

	public String getLocalisation_Latitude() {
		return this.localisation_Latitude;
	}

	public void setLocalisation_Latitude(String localisation_Latitude) {
		this.localisation_Latitude = localisation_Latitude;
	}

	public String getLocalisation_Longitude() {
		return this.localisation_Longitude;
	}

	public void setLocalisation_Longitude(String localisation_Longitude) {
		this.localisation_Longitude = localisation_Longitude;
	}

	public String getLocalisation_Street() {
		return this.localisation_Street;
	}

	public void setLocalisation_Street(String localisation_Street) {
		this.localisation_Street = localisation_Street;
	}

	public String getLocalisation_ZipCode() {
		return this.localisation_ZipCode;
	}

	public void setLocalisation_ZipCode(String localisation_ZipCode) {
		this.localisation_ZipCode = localisation_ZipCode;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<Tent> getTents() {
		return this.tents;
	}

	public void setTents(List<Tent> tents) {
		this.tents = tents;
	}

	public Tent addTent(Tent tent) {
		getTents().add(tent);
		tent.setCamp(this);

		return tent;
	}

	public Tent removeTent(Tent tent) {
		getTents().remove(tent);
		tent.setCamp(null);

		return tent;
	}

	public List<Donation> getDonations() {
		return this.donations;
	}

	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}

	public Donation addDonation(Donation donation) {
		getDonations().add(donation);
		donation.setCamp(this);

		return donation;
	}

	public Donation removeDonation(Donation donation) {
		getDonations().remove(donation);
		donation.setCamp(null);

		return donation;
	}

}
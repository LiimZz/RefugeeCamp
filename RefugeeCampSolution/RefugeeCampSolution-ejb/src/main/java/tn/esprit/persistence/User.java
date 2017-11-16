package tn.esprit.persistence;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Date;
import java.util.List;

/**
 * The persistent class for the AspNetUsers database table.
 * 
 */
@Entity
@Table(name = "AspNetUsers")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "User")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Id")
	@JsonProperty("Id")
	private String id;

	@Column(name = "AccessFailedCount")
	@JsonProperty("AccessFailedCount")
	private int accessFailedCount;

	@Column(name = "ConfirmPassword")
	private String confirmPassword;

	@Column(name = "Email")
	@JsonProperty("Email")
	private String email;

	@Column(name = "EmailConfirmed")
	private boolean emailConfirmed;

	@Column(name = "LockoutEnabled")
	private boolean lockoutEnabled;

	@Column(name = "LockoutEndDateUtc")
	private Date lockoutEndDateUtc;

	@Column(name = "Password")
	private String password;

	@Column(name = "PasswordHash")
	private String passwordHash;

	@Column(name = "PhoneNumber")

	private String phoneNumber;

	@Column(name = "PhoneNumberConfirmed")
	private boolean phoneNumberConfirmed;

	@Column(name = "SecurityStamp")
	private String securityStamp;

	@Column(name = "Token")
	@JsonProperty("Token")
	private String token;

	@Column(name = "TwoFactorEnabled")
	private boolean twoFactorEnabled;

	@Column(name = "UserName")
	@JsonProperty("UserName")
	private String userName;

	@Column(name = "UserRole")
	@JsonProperty("UserRole")
	private String userRole;

	// bi-directional many-to-one association to Cours
	@OneToMany(mappedBy = "aspNetUser")
	private List<Cours> courses;

	// bi-directional many-to-one association to Gift
	@OneToMany(mappedBy = "aspNetUser")
	private List<Gift> gifts;

	// bi-directional many-to-one association to Partner
	@OneToMany(mappedBy = "aspNetUser")
	private List<Partner> partners;

	// bi-directional many-to-one association to Refug
	@OneToMany(mappedBy = "aspNetUser")
	private List<Refug> refugs;

	// bi-directional many-to-one association to Adoption
	@OneToMany(mappedBy = "user")
	private List<Adoption> adoptions;

	// bi-directional many-to-one association to Donation
	@OneToMany(mappedBy = "aspNetUser")
	private List<Donation> donations;

	public User() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAccessFailedCount() {
		return this.accessFailedCount;
	}

	public void setAccessFailedCount(int accessFailedCount) {
		this.accessFailedCount = accessFailedCount;
	}

	public String getConfirmPassword() {
		return this.confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getEmailConfirmed() {
		return this.emailConfirmed;
	}

	public void setEmailConfirmed(boolean emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}

	public boolean getLockoutEnabled() {
		return this.lockoutEnabled;
	}

	public void setLockoutEnabled(boolean lockoutEnabled) {
		this.lockoutEnabled = lockoutEnabled;
	}

	public Date getLockoutEndDateUtc() {
		return this.lockoutEndDateUtc;
	}

	public void setLockoutEndDateUtc(Date lockoutEndDateUtc) {
		this.lockoutEndDateUtc = lockoutEndDateUtc;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordHash() {
		return this.passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean getPhoneNumberConfirmed() {
		return this.phoneNumberConfirmed;
	}

	public void setPhoneNumberConfirmed(boolean phoneNumberConfirmed) {
		this.phoneNumberConfirmed = phoneNumberConfirmed;
	}

	public String getSecurityStamp() {
		return this.securityStamp;
	}

	public void setSecurityStamp(String securityStamp) {
		this.securityStamp = securityStamp;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean getTwoFactorEnabled() {
		return this.twoFactorEnabled;
	}

	public void setTwoFactorEnabled(boolean twoFactorEnabled) {
		this.twoFactorEnabled = twoFactorEnabled;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRole() {
		return this.userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public List<Cours> getCourses() {
		return this.courses;
	}

	public void setCourses(List<Cours> courses) {
		this.courses = courses;
	}

	public Cours addCours(Cours cours) {
		getCourses().add(cours);
		cours.setAspNetUser(this);

		return cours;
	}

	public Cours removeCours(Cours cours) {
		getCourses().remove(cours);
		cours.setAspNetUser(null);

		return cours;
	}

	public List<Gift> getGifts() {
		return this.gifts;
	}

	public void setGifts(List<Gift> gifts) {
		this.gifts = gifts;
	}

	public Gift addGift(Gift gift) {
		getGifts().add(gift);
		gift.setAspNetUser(this);

		return gift;
	}

	public Gift removeGift(Gift gift) {
		getGifts().remove(gift);
		gift.setAspNetUser(null);

		return gift;
	}

	public List<Partner> getPartners() {
		return this.partners;
	}

	public void setPartners(List<Partner> partners) {
		this.partners = partners;
	}

	public Partner addPartner(Partner partner) {
		getPartners().add(partner);
		partner.setAspNetUser(this);

		return partner;
	}

	public Partner removePartner(Partner partner) {
		getPartners().remove(partner);
		partner.setAspNetUser(null);

		return partner;
	}

	public List<Refug> getRefugs() {
		return this.refugs;
	}

	public void setRefugs(List<Refug> refugs) {
		this.refugs = refugs;
	}

	public Refug addRefug(Refug refug) {
		getRefugs().add(refug);
		refug.setAspNetUser(this);

		return refug;
	}

	public Refug removeRefug(Refug refug) {
		getRefugs().remove(refug);
		refug.setAspNetUser(null);

		return refug;
	}

	public List<Adoption> getAdoptions() {
		return this.adoptions;
	}

	public void setAdoptions(List<Adoption> adoptions) {
		this.adoptions = adoptions;
	}

	public Adoption addAdoption(Adoption adoption) {
		getAdoptions().add(adoption);
		adoption.setUser(this);

		return adoption;
	}

	public Adoption removeAdoption(Adoption adoption) {
		getAdoptions().remove(adoption);
		adoption.setUser(null);

		return adoption;
	}

	public List<Donation> getDonations() {
		return this.donations;
	}

	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}

	public Donation addDonation(Donation donation) {
		getDonations().add(donation);
		donation.setAspNetUser(this);

		return donation;
	}

	public Donation removeDonation(Donation donation) {
		getDonations().remove(donation);
		donation.setAspNetUser(null);

		return donation;
	}

}
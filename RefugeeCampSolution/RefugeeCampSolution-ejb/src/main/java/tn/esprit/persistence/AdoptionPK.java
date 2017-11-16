package tn.esprit.persistence;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AdoptionPK
 *
 */
@Embeddable
public class AdoptionPK implements Serializable {

	@Column(name="DateAdoption")
	private Date dateAdoption;
	
	@Column(name="RefugID")
	private int refugID;
	
	@Column(name="MemberID")
	private String memberID;
	private static final long serialVersionUID = 1L;

	public AdoptionPK() {
		super();
	}   
	public Date getDateAdoption() {
		return this.dateAdoption;
	}

	public void setDateAdoption(Date dateAdoption) {
		this.dateAdoption = dateAdoption;
	}   
	public int getRefugID() {
		return this.refugID;
	}

	public void setRefugID(int refugID) {
		this.refugID = refugID;
	}   
	public String getMemberID() {
		return this.memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateAdoption == null) ? 0 : dateAdoption.hashCode());
		result = prime * result + ((memberID == null) ? 0 : memberID.hashCode());
		result = prime * result + refugID;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdoptionPK other = (AdoptionPK) obj;
		if (dateAdoption == null) {
			if (other.dateAdoption != null)
				return false;
		} else if (!dateAdoption.equals(other.dateAdoption))
			return false;
		if (memberID == null) {
			if (other.memberID != null)
				return false;
		} else if (!memberID.equals(other.memberID))
			return false;
		if (refugID != other.refugID)
			return false;
		return true;
	}
   
}

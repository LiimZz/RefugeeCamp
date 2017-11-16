package tn.esprit.persistence;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: JobOfferPK
 *
 */
@Embeddable
public class JobOfferPK implements Serializable {

	@Column(name="RefugID")
	private int refugID;
	
	@Column(name="PartnerID")
	private int partnerID;
	private static final long serialVersionUID = 1L;

	public JobOfferPK() {
		super();
	}   
	public int getRefugID() {
		return this.refugID;
	}

	public void setRefugID(int refugID) {
		this.refugID = refugID;
	}   
	public int getPartnerID() {
		return this.partnerID;
	}

	public void setPartnerID(int partnerID) {
		this.partnerID = partnerID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + partnerID;
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
		JobOfferPK other = (JobOfferPK) obj;
		if (partnerID != other.partnerID)
			return false;
		if (refugID != other.refugID)
			return false;
		return true;
	}
   
}

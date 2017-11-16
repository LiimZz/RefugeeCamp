package tn.esprit.persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ConsultationPK
 *
 */
@Embeddable
public class ConsultationPK implements Serializable {

	@Column(name="DateConsultation")
	private Date dateConsultation;
	
	@Column(name="RefugID")
	private int refugID;
	
	@Column(name="MedecinID")
	private int medecinID;
	private static final long serialVersionUID = 1L;

	public ConsultationPK() {
		super();
	}   
	public Date getDateConsultation() {
		return this.dateConsultation;
	}

	public void setDateConsultation(Date dateConsultation) {
		this.dateConsultation = dateConsultation;
	}   
	public int getRefugID() {
		return this.refugID;
	}

	public void setRefugID(int refugID) {
		this.refugID = refugID;
	}   
	public int getMedecinID() {
		return this.medecinID;
	}

	public void setMedecinID(int medecinID) {
		this.medecinID = medecinID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateConsultation == null) ? 0 : dateConsultation.hashCode());
		result = prime * result + medecinID;
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
		ConsultationPK other = (ConsultationPK) obj;
		if (dateConsultation == null) {
			if (other.dateConsultation != null)
				return false;
		} else if (!dateConsultation.equals(other.dateConsultation))
			return false;
		if (medecinID != other.medecinID)
			return false;
		if (refugID != other.refugID)
			return false;
		return true;
	}
   
}

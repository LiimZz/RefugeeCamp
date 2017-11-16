package tn.esprit.persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Adoption
 *
 */
@Entity
@Table(name="Adoptions")
public class Adoption implements Serializable {

	@EmbeddedId
	private AdoptionPK id;
	
	@Column(name="Description")
	private String description;
	
	@Column(name="Etat")
	private String etat;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="MemberID", insertable = false, updatable = false)
	private User user;

	@ManyToOne
	@JoinColumn(name="RefugID", insertable = false, updatable = false)
	private Refug refug;

	public Adoption() {
		super();
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	public AdoptionPK getId() {
		return id;
	}
	public void setId(AdoptionPK id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Refug getRefug() {
		return refug;
	}
	public void setRefug(Refug refug) {
		this.refug = refug;
	}
   
}

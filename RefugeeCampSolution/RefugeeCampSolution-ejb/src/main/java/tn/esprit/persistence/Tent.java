package tn.esprit.persistence;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Tents database table.
 * 
 */
@Entity
@Table(name="Tents")
public class Tent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TentID")
	private int tentID;

	@Column(name="Img")
	private String img;

	@Column(name="Taille")
	private int taille;

	@Column(name="Type")
	private String type;

	//bi-directional many-to-one association to Refug
	@OneToMany(mappedBy="tent")
	private List<Refug> refugs;

	//bi-directional many-to-one association to Camp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CampID")
	private Camp camp;

	public Tent() {
	}

	public int getTentID() {
		return this.tentID;
	}

	public void setTentID(int tentID) {
		this.tentID = tentID;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getTaille() {
		return this.taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Refug> getRefugs() {
		return this.refugs;
	}

	public void setRefugs(List<Refug> refugs) {
		this.refugs = refugs;
	}

	public Refug addRefug(Refug refug) {
		getRefugs().add(refug);
		refug.setTent(this);

		return refug;
	}

	public Refug removeRefug(Refug refug) {
		getRefugs().remove(refug);
		refug.setTent(null);

		return refug;
	}

	public Camp getCamp() {
		return this.camp;
	}

	public void setCamp(Camp camp) {
		this.camp = camp;
	}

}
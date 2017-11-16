package tn.esprit.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the Courses database table.
 * 
 */
@Entity
@Table(name="Courses")
public class Cours implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CourseID")
	private int courseID;

	@Column(name="DateCourse")
	private Date dateCourse;

	@Column(name="Matiere")
	private String matiere;

	@Column(name="NbrPlaceDispo")
	private int nbrPlaceDispo;

	@Column(name="ZoneAge")
	private String zoneAge;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="AdminID")
	private User aspNetUser;

	public Cours() {
	}

	public int getCourseID() {
		return this.courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public Date getDateCourse() {
		return this.dateCourse;
	}

	public void setDateCourse(Date dateCourse) {
		this.dateCourse = dateCourse;
	}

	public String getMatiere() {
		return this.matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public int getNbrPlaceDispo() {
		return this.nbrPlaceDispo;
	}

	public void setNbrPlaceDispo(int nbrPlaceDispo) {
		this.nbrPlaceDispo = nbrPlaceDispo;
	}

	public String getZoneAge() {
		return this.zoneAge;
	}

	public void setZoneAge(String zoneAge) {
		this.zoneAge = zoneAge;
	}

	public User getAspNetUser() {
		return this.aspNetUser;
	}

	public void setAspNetUser(User aspNetUser) {
		this.aspNetUser = aspNetUser;
	}

}
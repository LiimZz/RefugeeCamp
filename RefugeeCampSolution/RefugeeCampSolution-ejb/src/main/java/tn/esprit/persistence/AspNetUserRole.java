package tn.esprit.persistence;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AspNetUserRoles database table.
 * 
 */
@Entity
@Table(name="AspNetUserRoles")
public class AspNetUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AspNetUserRolePK id;

	public AspNetUserRole() {
	}

	public AspNetUserRolePK getId() {
		return this.id;
	}

	public void setId(AspNetUserRolePK id) {
		this.id = id;
	}

}
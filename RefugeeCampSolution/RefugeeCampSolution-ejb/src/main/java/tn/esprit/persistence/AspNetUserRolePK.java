package tn.esprit.persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AspNetUserRolePK
 *
 */
@Embeddable
public class AspNetUserRolePK implements Serializable {

	@Column(name="UserId")
	private String userId;
	
	@Column(name="RoleId")
	private String roleId;
	private static final long serialVersionUID = 1L;

	public AspNetUserRolePK() {
		super();
	}   
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String UserId) {
		this.userId = UserId;
	}   
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String RoleId) {
		this.roleId = RoleId;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		AspNetUserRolePK other = (AspNetUserRolePK) obj;
		if (roleId == null) {
			if (other.roleId != null)
				return false;
		} else if (!roleId.equals(other.roleId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
   
}

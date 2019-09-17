package it.objectmethod.cloudide.domain.view;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VIEW_REGISTRY_USERS")
public class UserRegistry {
	
	@Id
	@Column(name = "USER_ID")
	private Long userId;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "COMPANY_NAME")
	private String companyName;
	
	@Column(name = "PROFILE")
	private String profile;
	
	@Column(name = "ID_ROLE")
	private String idRole;
	
	@Column(name = "UNB")
	private String unb;
	
	@Column(name = "UNB_DESCRIPTION")
	private String unbDescription;
	
	//-------------------------------
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getIdRole() {
		return idRole;
	}

	public void setIdRole(String idRole) {
		this.idRole = idRole;
	}

	public String getUnb() {
		return unb;
	}

	public void setUnb(String unb) {
		this.unb = unb;
	}

	public String getUnbDescription() {
		return unbDescription;
	}

	public void setUnbDescription(String unbDescription) {
		this.unbDescription = unbDescription;
	}
	
	
	
}

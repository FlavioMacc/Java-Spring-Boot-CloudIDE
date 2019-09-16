package it.objectmethod.cloudide.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UNB_TEMP")
public class UnbTemp {
	
	@Id
	@Column(name = "UNB_ID")
	private Long unbId;
	
	@Column(name = "USER_ID")
	private Long userId;
	
	@Column(name = "UNB")
	private String unb;
	
	@Column(name = "UNB_REFERENCE")
	private String unbReference;
	
	@Column(name = "MAIL")
	private String mail;
	
	@Column(name = "ENABLED")
	private String enabled;

	//----------------------
	
	public Long getUnbId() {
		return unbId;
	}

	public void setUnbId(Long unbId) {
		this.unbId = unbId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUnb() {
		return unb;
	}

	public void setUnb(String unb) {
		this.unb = unb;
	}

	public String getUnbReference() {
		return unbReference;
	}

	public void setUnbReference(String unbReference) {
		this.unbReference = unbReference;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

}

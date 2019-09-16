package it.objectmethod.cloudide.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UNB_APPLICATION_SERVICES")
public class UnbApplicationService {
	
	@Id
	@Column(name = "UNB_APPLICATION_SERVICE_ID")
	private Long unbApplicationServiceId;
	
	@Column(name = "APPLICATION_SERVICE_ID")
	private Long applicationServiceId;
	
	@Column(name = "ENABLED")
	private String enabled;
	
	@Column(name = "UNB_ID")
	private Long unbId;

	//-----------------------------
	
	public Long getUnbApplicationServiceId() {
		return unbApplicationServiceId;
	}

	public void setUnbApplicationServiceId(Long unbApplicationServiceId) {
		this.unbApplicationServiceId = unbApplicationServiceId;
	}

	public Long getApplicationServiceId() {
		return applicationServiceId;
	}

	public void setApplicationServiceId(Long applicationServiceId) {
		this.applicationServiceId = applicationServiceId;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public Long getUnbId() {
		return unbId;
	}

	public void setUnbId(Long unbId) {
		this.unbId = unbId;
	}
	
	
	
}

package it.objectmethod.cloudide.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APPLICATION_SERVICES")
public class ApplicationService {
	
	@Id
	@Column(name = "APPLICATION_SERVICE_ID")
	private Long applicationServiceId;
	
	@Column(name = "SERVICE_NAME")
	private String serviceName;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "ACTIVATION_TYPE")
	private Long ActivationType;
	
	//------------------------------

	public Long getApplicationServiceId() {
		return applicationServiceId;
	}

	public void setApplicationServiceId(Long applicationServiceId) {
		this.applicationServiceId = applicationServiceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getActivationType() {
		return ActivationType;
	}

	public void setActivationType(Long activationType) {
		ActivationType = activationType;
	}
	
	

}

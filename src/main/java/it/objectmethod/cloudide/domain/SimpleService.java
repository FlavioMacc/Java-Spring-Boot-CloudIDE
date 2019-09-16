package it.objectmethod.cloudide.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APPLICATION_SERVICES")
public class SimpleService {
	
	@Id
	@Column(name = "SIMPLE_SERVICE_ID")
	private Long simpleServiceId;
	
	@Column(name = "SERVICE_NAME")
	private String serviceName;
	
	@Column(name = "DESCRIPTION")
	private Long description;
	
	//-----------------------------
	
	public Long getSimpleServiceId() {
		return simpleServiceId;
	}

	public void setSimpleServiceId(Long simpleServiceId) {
		this.simpleServiceId = simpleServiceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Long getDescription() {
		return description;
	}

	public void setDescription(Long description) {
		this.description = description;
	}
	
	
}

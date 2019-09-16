package it.objectmethod.cloudide.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DOCUMENT_SERVICES")
public class DocumentService {
	
	@Id
	@Column(name = "DOCUMENT_SERVICE_ID")
	private Long documentServiceId;
	
	@Column(name = "SERVICE_NAME")
	private String serviceName;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "DOCUMENT_TYPE")
	private String documentType;
	
	@Column(name = "ALERT_DAYS")
	private Long alertDays;
	
	@Column(name = "DEADLINE_DAYS")
	private Long deadlineDays;
	
	@Column(name = "LOGICAL_DELETE_DAYS")
	private Long logicalDeleteDays;
	
	@Column(name = "PHYSICAL_DELETE_DAYS")
	private Long physicalDeleteDays;
	
	@Column(name = "MANDATORY_VALIDATION_TYPE")
	private String mandatoryValidationType;

	//--------------------------------
	
	public Long getDocumentServiceId() {
		return documentServiceId;
	}

	public void setDocumentServiceId(Long documentServiceId) {
		this.documentServiceId = documentServiceId;
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

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public Long getAlertDays() {
		return alertDays;
	}

	public void setAlertDays(Long alertDays) {
		this.alertDays = alertDays;
	}

	public Long getDeadlineDays() {
		return deadlineDays;
	}

	public void setDeadlineDays(Long deadlineDays) {
		this.deadlineDays = deadlineDays;
	}

	public Long getLogicalDeleteDays() {
		return logicalDeleteDays;
	}

	public void setLogicalDeleteDays(Long logicalDeleteDays) {
		this.logicalDeleteDays = logicalDeleteDays;
	}

	public Long getPhysicalDeleteDays() {
		return physicalDeleteDays;
	}

	public void setPhysicalDeleteDays(Long physicalDeleteDays) {
		this.physicalDeleteDays = physicalDeleteDays;
	}

	public String getMandatoryValidationType() {
		return mandatoryValidationType;
	}

	public void setMandatoryValidationType(String mandatoryValidationType) {
		this.mandatoryValidationType = mandatoryValidationType;
	}
	
	

}

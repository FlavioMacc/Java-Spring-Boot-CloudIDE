package it.objectmethod.cloudide.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UNB_DOCUMENTS_SERVICES")
public class UnbDocumentsService {
	
	@Id
	@Column(name = "UNB_DOCUMENTS_SERVICE_ID")
	private Long unbDocumentServiceId;
	
	@Column(name = "DOCUMENTS_SERVICE_ID")
	private Long documentServiceId;
	
	@Column(name = "FORMAT_TYPE")
	private String formatType;
	
	@Column(name = "ENABLED")
	private String enabled;
	
	@Column(name = "UNB_ID")
	private Long unbId;
	
	@Column(name = "VALIDATION_TYPE")
	private String validationType;
	
	@Column(name = "DATE")
	private String date;
	
	//------------------------------

	public Long getUnbDocumentServiceId() {
		return unbDocumentServiceId;
	}

	public void setUnbDocumentServiceId(Long unbDocumentServiceId) {
		this.unbDocumentServiceId = unbDocumentServiceId;
	}

	public Long getDocumentServiceId() {
		return documentServiceId;
	}

	public void setDocumentServiceId(Long documentServiceId) {
		this.documentServiceId = documentServiceId;
	}

	public String getFormatType() {
		return formatType;
	}

	public void setFormatType(String formatType) {
		this.formatType = formatType;
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

	public String getValidationType() {
		return validationType;
	}

	public void setValidationType(String validationType) {
		this.validationType = validationType;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	

}

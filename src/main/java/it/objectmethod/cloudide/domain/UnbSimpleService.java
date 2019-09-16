package it.objectmethod.cloudide.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UNB_SIMPLE_SERVICE")
public class UnbSimpleService {
	
	@Id
	@Column(name = "UNB_SIMPLE_SERVICE_ID")
	private Long unbSimpleServiceId;
	
	@Column(name = "SIMPLE_SERVICE_ID")
	private Long simpleServiceId;
	
	@Column(name = "UNB_ID")
	private Long unbId;
	
	@Column(name = "ENABLED")
	private String enabled;
	
	//-----------------------

	public Long getUnbSimpleServiceId() {
		return unbSimpleServiceId;
	}

	public void setUnbSimpleServiceId(Long unbSimpleServiceId) {
		this.unbSimpleServiceId = unbSimpleServiceId;
	}

	public Long getSimpleServiceId() {
		return simpleServiceId;
	}

	public void setSimpleServiceId(Long simpleServiceId) {
		this.simpleServiceId = simpleServiceId;
	}

	public Long getUnbId() {
		return unbId;
	}

	public void setUnbId(Long unbId) {
		this.unbId = unbId;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	
}

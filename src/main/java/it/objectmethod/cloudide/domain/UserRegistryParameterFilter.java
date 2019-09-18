package it.objectmethod.cloudide.domain;


public class UserRegistryParameterFilter {
	
	private String userName;

	private String companyName;
	
	private String idRole;
	
	private String unb;
	
	private String unbDescription;
	
	private String partitaIva;
	
	//-------------------------------

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

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}
	
}

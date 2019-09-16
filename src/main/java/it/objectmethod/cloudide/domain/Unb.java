package it.objectmethod.cloudide.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UNB")
public class Unb {
	
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
	
	@Column(name = "UNB_DESCRIPTION")
	private String unbDescription;
	
	@Column(name = "MAIL_PA_OK")
	private String mailPaOk;
	
	@Column(name = "MAIL_PA_ERROR")
	private String mailPaError;
	
	@Column(name = "CERTIFIED")
	private String certified;
	
	@Column(name = "DEFAUL_BY_VAT")
	private String defaultByVat;
	
	@Column(name = "VAT_NUMBER")
	private String vatNumber;
	
	@Column(name = "MAIL_B2B")
	private String mailB2B;
	
	@Column(name = "UNB_REFERENCE_B2B")
	private String unbReferenceB2B;
	
	@Column(name = "USE_VAT_INCOME")
	private String useVatIncome;
	
	@Column(name = "USE_VAT_OUTGO")
	private String useVatOutgo;
	
	@Column(name = "TAX_CODE")
	private String taxCode;
	
	@Column(name = "USE_TAXCODE_INCOME")
	private String useTaxcodeIncome;
	
	@Column(name = "USE_TAXCODE_OUTGO")
	private String usetaxcodeOutgo;

	//-----------------------------------
	
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

	public String getUnbDescription() {
		return unbDescription;
	}

	public void setUnbDescription(String unbDescription) {
		this.unbDescription = unbDescription;
	}

	public String getMailPaOk() {
		return mailPaOk;
	}

	public void setMailPaOk(String mailPaOk) {
		this.mailPaOk = mailPaOk;
	}

	public String getMailPaError() {
		return mailPaError;
	}

	public void setMailPaError(String mailPaError) {
		this.mailPaError = mailPaError;
	}

	public String getCertified() {
		return certified;
	}

	public void setCertified(String certified) {
		this.certified = certified;
	}

	public String getDefaultByVat() {
		return defaultByVat;
	}

	public void setDefaultByVat(String defaultByVat) {
		this.defaultByVat = defaultByVat;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	public String getMailB2B() {
		return mailB2B;
	}

	public void setMailB2B(String mailB2B) {
		this.mailB2B = mailB2B;
	}

	public String getUnbReferenceB2B() {
		return unbReferenceB2B;
	}

	public void setUnbReferenceB2B(String unbReferenceB2B) {
		this.unbReferenceB2B = unbReferenceB2B;
	}

	public String getUseVatIncome() {
		return useVatIncome;
	}

	public void setUseVatIncome(String useVatIncome) {
		this.useVatIncome = useVatIncome;
	}

	public String getUseVatOutgo() {
		return useVatOutgo;
	}

	public void setUseVatOutgo(String useVatOutgo) {
		this.useVatOutgo = useVatOutgo;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getUseTaxcodeIncome() {
		return useTaxcodeIncome;
	}

	public void setUseTaxcodeIncome(String useTaxcodeIncome) {
		this.useTaxcodeIncome = useTaxcodeIncome;
	}

	public String getUsetaxcodeOutgo() {
		return usetaxcodeOutgo;
	}

	public void setUsetaxcodeOutgo(String usetaxcodeOutgo) {
		this.usetaxcodeOutgo = usetaxcodeOutgo;
	}
	
	

}

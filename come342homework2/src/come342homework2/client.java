package come342homework2;

public class client {
	String companyName;
	String companyAddress;
	String companyEmail;
	String contactName;
	String contactEmail;
	public String getCompanyName() {
		return companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public String getContactName() {
		return contactName;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void assignClient(String companyName,String companyAddress,String companyEmail, String contactName,String contactEmail) {
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyEmail=companyEmail;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
	}
}


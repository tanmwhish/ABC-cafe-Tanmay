
public class Order {
	
	private String no;
	private String name;
	private String address;
	private String address2;
	private String city;
	private String county;
	private String country;
	private String phoneNo;
	private String postalCode;
	private String contact;
	private String accountStatus;
	private String billToCustomerNo;
	private String salespersonCode;
	private String analysisCode1;
	private String analysisCode2;
	private String lastModifiedDate;
	private String priceCardCode;
	
	
	public Order(){
		this.no = null;
		this.name = null;
		this.address = null;
		this.address2 = null;
		this.city = null;
		this.county = null;
		this.country = null;
		this.phoneNo = null;
		this.postalCode = null;
		this.contact = null;
		this.accountStatus = null;
		this.billToCustomerNo = null;
		this.salespersonCode = null;
		this.analysisCode1 = null;
		this.analysisCode2 = null;
		this.lastModifiedDate = null;
		this.priceCardCode = null;
	}
	
	public Order(String no, String name, String address, String address2, String city, String county, String country,
			String phoneNo, String postalCode, String contact, String accountStatus, String billToCustomerNo,
			String salespersonCode, String analysisCode1, String analysisCode2, String lastModifiedDate,
			String priceCardCode) {
		super();
		this.no = no;
		this.name = name;
		this.address = address;
		this.address2 = address2;
		this.city = city;
		this.county = county;
		this.country = country;
		this.phoneNo = phoneNo;
		this.postalCode = postalCode;
		this.contact = contact;
		this.accountStatus = accountStatus;
		this.billToCustomerNo = billToCustomerNo;
		this.salespersonCode = salespersonCode;
		this.analysisCode1 = analysisCode1;
		this.analysisCode2 = analysisCode2;
		this.lastModifiedDate = lastModifiedDate;
		this.priceCardCode = priceCardCode;
	}
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getBillToCustomerNo() {
		return billToCustomerNo;
	}

	public void setBillToCustomerNo(String billToCustomerNo) {
		this.billToCustomerNo = billToCustomerNo;
	}

	public String getSalespersonCode() {
		return salespersonCode;
	}

	public void setSalespersonCode(String salespersonCode) {
		this.salespersonCode = salespersonCode;
	}

	public String getAnalysisCode1() {
		return analysisCode1;
	}

	public void setAnalysisCode1(String analysisCode1) {
		this.analysisCode1 = analysisCode1;
	}

	public String getAnalysisCode2() {
		return analysisCode2;
	}

	public void setAnalysisCode2(String analysisCode2) {
		this.analysisCode2 = analysisCode2;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getPriceCardCode() {
		return priceCardCode;
	}

	public void setPriceCardCode(String priceCardCode) {
		this.priceCardCode = priceCardCode;
	}
	
}

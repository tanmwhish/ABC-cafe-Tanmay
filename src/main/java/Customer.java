
public class Customer {
	
	
	private String no;
	private String name;
	private String phoneNo;
	private String accountStatusCode;
	private String lastModifiedDate;
	private String analysisCode;
	private String salespersonCode;
	
	
	public Customer(){
		this.no=null;
		this.name = null;
		this.phoneNo = null;
		this.accountStatusCode = null;
		this.lastModifiedDate = null;
		this.analysisCode = null;
		this.salespersonCode = null;
		
	}
	
	public Customer(String no, String name, String phoneNo, String accountStatusCode, String lastModifiedDate,
			String analysisCode, String salespersonCode) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNo = phoneNo;
		this.accountStatusCode = accountStatusCode;
		this.lastModifiedDate = lastModifiedDate;
		this.analysisCode = analysisCode;
		this.salespersonCode = salespersonCode;
	}




	public void setNo(String no) {
		this.no = no;
	}




	public void setName(String name) {
		this.name = name;
	}




	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}




	public void setAccountStatusCode(String accountStatusCode) {
		this.accountStatusCode = accountStatusCode;
	}




	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}




	public void setAnalysisCode(String analysisCode) {
		this.analysisCode = analysisCode;
	}




	public void setSalespersonCode(String salespersonCode) {
		this.salespersonCode = salespersonCode;
	}




	public String getNo() {
		return no;
	}




	public String getName() {
		return name;
	}




	public String getPhoneNo() {
		return phoneNo;
	}




	public String getAccountStatusCode() {
		return accountStatusCode;
	}




	public String getLastModifiedDate() {
		return lastModifiedDate;
	}




	public String getAnalysisCode() {
		return analysisCode;
	}




	public String getSalespersonCode() {
		return salespersonCode;
	}
	
	
	


}

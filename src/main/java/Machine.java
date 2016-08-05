
public class Machine {

	private String no;
	private String machineType;
	private String concessionUnitType;
	private String customerNo;
	private String locationServiceItem;
	private String installedDate;
	
	public Machine(){
		this.no = null;
		this.machineType = null;
		this.concessionUnitType = null;
		this.customerNo = null;
		this.locationServiceItem = null;
		this.installedDate = null;
	}
	
	public Machine(String no, String machineType, String concessionUnitType, String customerNo,
			String locationServiceItem, String installedDate) {
		super();
		this.no = no;
		this.machineType = machineType;
		this.concessionUnitType = concessionUnitType;
		this.customerNo = customerNo;
		this.locationServiceItem = locationServiceItem;
		this.installedDate = installedDate;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public void setConcessionUnitType(String concessionUnitType) {
		this.concessionUnitType = concessionUnitType;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public void setLocationServiceItem(String locationServiceItem) {
		this.locationServiceItem = locationServiceItem;
	}

	public void setInstalledDate(String installedDate) {
		this.installedDate = installedDate;
	}

	public String getNo() {
		return no;
	}

	public String getMachineType() {
		return machineType;
	}

	public String getConcessionUnitType() {
		return concessionUnitType;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public String getLocationServiceItem() {
		return locationServiceItem;
	}

	public String getInstalledDate() {
		return installedDate;
	}
	
	
}

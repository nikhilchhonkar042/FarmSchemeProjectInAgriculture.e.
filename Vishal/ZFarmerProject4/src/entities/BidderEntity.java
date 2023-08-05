package entities;


public class BidderEntity {
	// personal details
	private int BidderId;
	

	private String bidderName;
	private String phoneNumber;
	private String email;
	// Address details
	private String city;
	private String state;
	private String pinCode;
	// land details
	private String area;
	private String landAdd;
	private String landPinCode;
	// Bank Details
	private String accountNumber;
	private String ifscCode;
	// Document Upload
	private String aadharCard;
	private String panCard;

	private String password;
	private String confirmPassword;
	
	private String tradingCertificate;
	private int amount;

//

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getBidderId() {
		return BidderId;
	}

	public void setBidderId(int bidderId) {
		this.BidderId = bidderId;
	}
	public String getBidderName() {
		return bidderName;
	}

	public void setBidderName(String bidderName) {
		this.bidderName = bidderName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

//	public String getLandAdd() {
//		return landAdd;
//	}
//
//	public void setLandAdd(String landAdd) {
//		this.landAdd = landAdd;
//	}

//	public String getLandPinCode() {
//		return landPinCode;
//	}
//
//	public void setLandPinCode(String landPinCode) {
//		this.landPinCode = landPinCode;
//	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public String getConfirmPassword() {
//		return confirmPassword;
//	}
//
//	public void setConfirmPassword(String confirmPassword) {
//		this.confirmPassword = confirmPassword;
//	}
	public String getTradingCertificate() {
		return tradingCertificate;
	}

	public void setTradingCertificate(String tradingCertificate) {
		this.tradingCertificate = tradingCertificate;
	}

	@Override
	public String toString() {
		return "FarmerEntity [farmerName=" + bidderName + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ ", city=" + city + ", state=" + state + ", pinCode=" + pinCode + ", area=" + area +  ", accountNumber=" + accountNumber + ", ifscCode="
				+ ifscCode + ", aadharCard=" + aadharCard + ", panCard=" + panCard + ", password=" + password +"]";
				
	}

	

	
}
//POJO
package com.insuranceClaim.dao;

public class InsuranceClaimEntities {
	
	private int policyNo;
	private String companyName;
	private float sumInsured;
	private String nameOfInsured;
	
	private String causeOfLoss;
	private String dateOfLoss;
	
	
	public InsuranceClaimEntities(int policyNo, String companyName, float sumInsured, String nameOfInsured,
			String causeOfLoss, String dateOfLoss) {
		super();
		this.policyNo = policyNo;
		this.companyName = companyName;
		this.sumInsured = sumInsured;
		this.nameOfInsured = nameOfInsured;
		this.causeOfLoss = causeOfLoss;
		this.dateOfLoss = dateOfLoss;
	}


	public int getPolicyNo() {
		return policyNo;
	}


	public void setPolicyNo(int policyNo) {
		this.policyNo = policyNo;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public float getSumInsured() {
		return sumInsured;
	}


	public void setSumInsured(float sumInsured) {
		this.sumInsured = sumInsured;
	}


	public String getNameOfInsured() {
		return nameOfInsured;
	}


	public void setNameOfInsured(String nameOfInsured) {
		this.nameOfInsured = nameOfInsured;
	}


	public String getCauseOfLoss() {
		return causeOfLoss;
	}


	public void setCauseOfLoss(String causeOfLoss) {
		this.causeOfLoss = causeOfLoss;
	}


	public String getDateOfLoss() {
		return dateOfLoss;
	}


	public void setDateOfLoss(String dateOfLoss) {
		this.dateOfLoss = dateOfLoss;
	}
	
	
	
	
}

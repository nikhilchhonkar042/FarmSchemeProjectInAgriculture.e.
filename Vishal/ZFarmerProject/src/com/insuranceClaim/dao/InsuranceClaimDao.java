//POJI
package com.insuranceClaim.dao;

import java.util.List;

public interface InsuranceClaimDao {
	
	public void insertInsurance(InsuranceClaimEntities insurance); //C
	
	public InsuranceClaimEntities selectInsurance(int policyNo);//R
	public List<InsuranceClaimEntities> selectInsurance(); //RA
	
	public void updateInsurance(InsuranceClaimEntities insurance); //U
	public void deleteInsurance(int policyNo);  //D
}

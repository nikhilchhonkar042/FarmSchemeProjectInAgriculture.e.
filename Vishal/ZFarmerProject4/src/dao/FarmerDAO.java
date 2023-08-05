package dao;

import entities.FarmerEntity;

public interface FarmerDAO { //POJI as per POJO
	public void insertFarmer(FarmerEntity farmerEntity);
//	public void insertFarmer(FarmerEntity farmerEntity);
	public FarmerEntity selectFarmer(int id);
	public void updateFarmer(FarmerEntity farmerEntity);
	public void deletFarmer(String aadharCard);
	
}
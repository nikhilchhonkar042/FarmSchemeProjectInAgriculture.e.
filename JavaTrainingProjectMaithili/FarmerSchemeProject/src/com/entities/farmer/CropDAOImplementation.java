package com.entities.farmer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CropDAOImplementation extends BaseConnectionClass implements CropDAO {

	
	@Override
	public void insertCrop(CropDetailsEntity cropDetailsEntity) {
		
	   try {
		   PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO CROP_DETAILS(CROP_NAME,FERTILIZER_TYPE,QUANTITY,SOIL_PH_CERTIFICATE,FARMER_ID) VALUES (?,?,?,?,?,?)");
			
		   pst.setString(1, cropDetailsEntity.getCropName());
		   pst.setString(2, cropDetailsEntity.getFertilizerType());
		   pst.setString(3, cropDetailsEntity.getQuntity());
		pst.setString(4, cropDetailsEntity.getSoilpHCertificate());
//		pst.setString(5, );
//		pst.setInt(5, );
//		pst.setInt(5, farmerEntiy.);
		
		
		
		   
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	   pst.setString(5, cropDetailsEntity.);
//	   
//	   FarmerEntiy 
	  
	 
		
	}

	@Override
	public CropDetailsEntity selectCrop(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCrop(CropDetailsEntity cropDetailsEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCrop(int id) {
		// TODO Auto-generated method stub
		
	}

}

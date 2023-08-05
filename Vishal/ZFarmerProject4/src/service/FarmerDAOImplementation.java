package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.FarmerDAO;
import entities.FarmerEntity;

public class FarmerDAOImplementation extends BaseConnectionClass implements FarmerDAO {
    
//	Connection conn;
//	
//	public FarmerDAOImplementation() {
//		try {
//			//1. Load the Driver
////			System.out.println("Trying to load the driver...");
//				DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
////			System.out.println("Driver loaded....");
//			
//			//2. Acquire the connection
////			System.out.println("Trying to connect....");
//			conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
////			System.out.println("Connected : "+ conn);
//			
//						
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	
	@Override
	public void insertFarmer(FarmerEntity farmerEntity) {
		try {
			PreparedStatement pst = 
			conn.prepareStatement("INSERT INTO FARMERDETAILS3(FARMER_NAME,CONTACT_NO,EMAIL,ADDRESS,CITY,STATE,PINCODE,ACCOUNT_NO,IFSC,AADHAR_CARD,PAN_CARD,PASSWORD,FARMER_WALLET) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
		   pst.setString(1, farmerEntity.getFarmerName());
		   pst.setString(2, farmerEntity.getPhoneNumber());
		   pst.setString(3, farmerEntity.getEmail());
		   pst.setString(4, farmerEntity.getArea());
		   pst.setString(5, farmerEntity.getCity());
		   pst.setString(6, farmerEntity.getState());
		   pst.setString(7, farmerEntity.getPinCode());
		 
		  
		  
		   pst.setString(8, farmerEntity.getAccountNumber());
		   pst.setString(9, farmerEntity.getIfscCode());
		 
		   pst.setString(10, farmerEntity.getAadharCard());
		   pst.setString(11, farmerEntity.getPanCard());
		   pst.setString(12, farmerEntity.getPassword());
		   pst.setInt(13,farmerEntity.getAmount());
		   
		   
			
//			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
			System.out.println("added recoed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public FarmerEntity selectFarmer(int id) {
//		int n;
		FarmerEntity farmerEntity =new FarmerEntity() ;
		try {
			
			Statement statement=conn.createStatement();
			
			ResultSet result1=statement.executeQuery("Select  * from FARMERDETAILS3 WHERE FARMER_ID="+id);
			while(result1.next()) {
              farmerEntity.setFarmerName(result1.getString(2));
              farmerEntity.setPhoneNumber(result1.getString(3));
              farmerEntity.setEmail(result1.getString(4));
              farmerEntity.setArea(result1.getString(5));
              farmerEntity.setCity(result1.getString(6));
              farmerEntity.setState(result1.getString(7));
              farmerEntity.setPinCode(result1.getString(8));
              farmerEntity.setAccountNumber(result1.getString(9));
              farmerEntity.setIfscCode(result1.getString(10));
              farmerEntity.setIfscCode(result1.getString(10));
              farmerEntity.setIfscCode(result1.getString(10));
              farmerEntity.setAadharCard(result1.getString(11));
              farmerEntity.setPanCard(result1.getString(12));
              farmerEntity.setPassword(result1.getString(13));
              farmerEntity.setAmount(result1.getInt(14));
             
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 return farmerEntity;
		
	}

	@Override
	public void updateFarmer(FarmerEntity farmerEntity) {
		// TODO Auto-generated method stub
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement("UPDATE FARMERDETAILS3 SET (FARMER_NAME=?,CONTACT_NO=?,EMAIL=?,ADDRESS=?,CITY=?,STATE=?,PINCODE=?,ACCOUNT_NO=?,IFSC=?,AADHAR_CARD=?,PAN_CARD=?,PASSWORD=?,AFARMER_WALLET=? WHERE FARNER_ID=? ");
		    
			  pst.setString(1, farmerEntity.getFarmerName());
			   pst.setString(2, farmerEntity.getPhoneNumber());
			   pst.setString(3, farmerEntity.getEmail());
			   pst.setString(4, farmerEntity.getArea());
			   pst.setString(5, farmerEntity.getCity());
			   pst.setString(6, farmerEntity.getState());
			   pst.setString(7, farmerEntity.getPinCode());
			 
			  
			  
			   pst.setString(8, farmerEntity.getAccountNumber());
			   pst.setString(9, farmerEntity.getIfscCode());
			 
			   pst.setString(10, farmerEntity.getAadharCard());
			   pst.setString(11, farmerEntity.getPanCard());
			   pst.setString(12, farmerEntity.getPassword());
			   pst.setInt(13, farmerEntity.getAmount());
			   
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 
		
	}

	@Override
	public void deletFarmer(String aadharCard) {
		// TODO Auto-generated method stub
		
	}

}
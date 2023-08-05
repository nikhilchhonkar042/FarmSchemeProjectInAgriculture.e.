package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.BidderDAO;
import entities.BidderEntity;

public class BidderDAOImplementation extends BaseConnectionClass implements BidderDAO {
   Connection conn;
	public BidderDAOImplementation() {
		try {
			//1. Load the Driver
//			System.out.println("Trying to load the driver...");
				DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
//			System.out.println("Driver loaded....");
			
			//2. Acquire the connection
//			System.out.println("Trying to connect....");
			conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
//			System.out.println("Connected : "+ conn);
			
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	@Override
	public void insertBidder(BidderEntity bidderEntity) {
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO BIDDER_DETAILS(BIDDER_NAME,CONTACT_N0,EMAIL,ADDRESS,CITY,STATE,PINCODE,ACCOUNT_NO,IFSC,AADHAR_CARD,PAN_CARD,TRADING_CERTIFICATE,PASSWORD,BIDDER_WALLET) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
		   pst.setString(1, bidderEntity.getBidderName());
		   pst.setString(2, bidderEntity.getPhoneNumber());
		   pst.setString(3, bidderEntity.getEmail());
		   pst.setString(4, bidderEntity.getArea());
		   pst.setString(5, bidderEntity.getCity());
		   pst.setString(6, bidderEntity.getState());
		   pst.setString(7, bidderEntity.getPinCode());
		 
		  
		  
		   pst.setString(8, bidderEntity.getAccountNumber());
		   pst.setString(9, bidderEntity.getIfscCode());
		 
		   pst.setString(10, bidderEntity.getAadharCard());
		   pst.setString(11, bidderEntity.getPanCard());
		   pst.setString(12, bidderEntity.getTradingCertificate());
		   
		   pst.setString(13, bidderEntity.getPassword());
//		   pst.setInt(0, 0);
		   pst.setInt(14,50000);
		   
		   
		
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
			System.out.println("added recoed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

	@Override
	public BidderEntity selectBidder(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBidder(BidderEntity BidderEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBidder(int id) {
		// TODO Auto-generated method stub
		
	}

}

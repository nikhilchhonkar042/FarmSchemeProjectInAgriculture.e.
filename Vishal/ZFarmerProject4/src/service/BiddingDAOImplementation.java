package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.BiddingDAO;
import entities.BiddingEntity;

public class BiddingDAOImplementation extends BaseConnectionClass implements BiddingDAO {

	
	public BiddingDAOImplementation() {
		super();
	}

	
// 1] Method for inserting details 
	public void insertBiddingDetalis(BiddingEntity biddingEntity ) {
		
		
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO BiddingDetails VALUES (?,?,?)");
			
			pst.setInt(1, biddingEntity.getCrop_id());
			pst.setInt(2, biddingEntity.getBidder_id());
			pst.setInt(3,biddingEntity.getBidAmount());
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement 
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
// 2] Method for getting maxBidAmount for particular crop
	@Override
	public int getMaxBiddingAmountForCrop(int cropId) {
		
        int maxBidAmount = 0;
     
        try 
        {
        	PreparedStatement pst = conn.prepareStatement("SELECT MAX(bidAmount) AS maxBidAmount FROM BiddingDetails WHERE crop_id = ? GROUP BY crop_id");
        	
        	pst.setInt(1, cropId);
        	
            ResultSet result = pst.executeQuery();
            if (result.next()) {
                maxBidAmount = result.getInt("maxBidAmount");
        }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return maxBidAmount;
    }
	
	
	
	
//3]Method for getting the biddingDetails for particular crop
	
	public List<BiddingEntity> selectAllBiddingDetails(int cropId) {
        List<BiddingEntity> biddingList = new ArrayList<>();
     

        try {
        	PreparedStatement pst = conn.prepareStatement("SELECT * FROM BiddingDetails WHERE crop_id = ?");
        	
            ResultSet result = pst.executeQuery();
            
            pst.setInt(1, cropId);
            
            while (result.next()) 
            {
            	BiddingEntity biddingDetails = new BiddingEntity();
                biddingDetails.setCrop_id(result.getInt("crop_id"));
                biddingDetails.setBidder_id(result.getInt("bidder_id"));
                biddingDetails.setBidAmount(result.getInt("bidAmount"));
                
                biddingList.add(biddingDetails);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return biddingList;
    }
	
}

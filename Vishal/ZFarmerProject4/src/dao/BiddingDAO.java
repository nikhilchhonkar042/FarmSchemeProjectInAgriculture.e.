package dao;

import java.util.List;

import entities.BiddingEntity;

public interface BiddingDAO {
	
	public void insertBiddingDetalis(BiddingEntity biddingEntity);  // insertRecords
	public int getMaxBiddingAmountForCrop(int cropId); //Max bid
	public List<BiddingEntity> selectAllBiddingDetails(int cropId); //bidding Details
	
}
 
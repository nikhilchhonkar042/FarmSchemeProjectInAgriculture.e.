package dao;

import entities.BidderEntity;

public interface BidderDAO{
	public void insertBidder(BidderEntity bidderEntity);
//	public void insertFarmer(FarmerEntity farmerEntity);
	public BidderEntity selectBidder(int id);
	public void updateBidder(BidderEntity BidderEntity);
	public void deleteBidder(int id);
}

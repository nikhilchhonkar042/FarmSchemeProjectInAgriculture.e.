package entities;

public class BiddingEntity {
	
	private int crop_id;
	private int bidder_id;
	private int bidAmount;
	
	
	public int getCrop_id() {
		return crop_id;
	}


	public void setCrop_id(int crop_id) {
		this.crop_id = crop_id;
	}


	public int getBidder_id() {
		return bidder_id;
	}


	public void setBidder_id(int bidder_id) {
		this.bidder_id = bidder_id;
	}


	public int getBidAmount() {
		return bidAmount;
	}


	public void setBidAmount(int bidAmount) {
		this.bidAmount = bidAmount;
	}
	
	
	
	
	@Override
	public String toString() {
		return "BiddingEntity [crop_id=" + crop_id + ", bidder_id=" + bidder_id + ", bidAmount=" + bidAmount + "]";
	}
	
}

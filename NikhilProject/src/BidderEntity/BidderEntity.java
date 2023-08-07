package BidderEntity;

public class BidderEntity {
	  private String name;
	    private double bid;

	    public BidderEntity(String name, double bid) {
	        this.name = name;
	        this.bid = bid;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getBid() {
	        return bid;
	    }

	    public void updateBid(double newBid) {
	        this.bid = newBid;
	    }
}

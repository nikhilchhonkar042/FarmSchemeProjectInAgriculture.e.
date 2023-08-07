package Bid;
public class BidEntity {
    private int bidderId;
    private int cropId;
    private double bidAmount;

    public BidEntity(int bidderId, int cropId, double bidAmount) {
        this.bidderId = bidderId;
        this.cropId = cropId;
        this.bidAmount = bidAmount;
    }

    public int getBidderId() {
        return bidderId;
    }

    public int getCropId() {
        return cropId;
    }

    public double getBidAmount() {
        return bidAmount;
    }
}

public class Bid {
    private User bidder;
    private Crop crop;
    private double bidAmount;

    public Bid(User bidder, Crop crop, double bidAmount) {
        this.bidder = bidder;
        this.crop = crop;
        this.bidAmount = bidAmount;
    }

    // Getters and setters (if required)

    // toString method for debugging and printing bid details
    @Override
    public String toString() {
        return "Bid{" +
                "bidder=" + bidder +
                ", crop=" + crop +
                ", bidAmount=" + bidAmount +
                '}';
    }
}
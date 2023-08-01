public class Crop {
    private String cropName;
    private String cropType;
    private String variety;
    private double quantity;
    private double minBid;
    private double finalBid;

    public Crop(String cropName, String cropType, String variety, double quantity, double minBid) {
        this.cropName = cropName;
        this.cropType = cropType;
        this.variety = variety;
        this.quantity = quantity;
        this.minBid = minBid;
    }

    // Getters and setters (if required)

    // toString method for debugging and printing crop details
    @Override
    public String toString() {
        return "Crop{" +
                "cropName='" + cropName + '\'' +
                ", cropType='" + cropType + '\'' +
                ", variety='" + variety + '\'' +
                ", quantity=" + quantity +
                ", minBid=" + minBid +
                ", finalBid=" + finalBid +
                '}';
    }
}

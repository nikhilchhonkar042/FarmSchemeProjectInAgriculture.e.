package SoldCrop;


public class SoldCropEntity {
    private int cropId;
    private int bidderId;
    private double soldPrice;

    public SoldCropEntity(int cropId, int bidderId, double soldPrice) {
        this.cropId = cropId;
        this.bidderId = bidderId;
        this.soldPrice = soldPrice;
    }

    public int getCropId() {
        return cropId;
    }

    public int getBidderId() {
        return bidderId;
    }

    public double getSoldPrice() {
        return soldPrice;
    }
}

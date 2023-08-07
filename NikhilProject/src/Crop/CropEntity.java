package Crop;

public class CropEntity {
    private int cropId;
    private String cropName;
    private double cropPrice;

    public CropEntity(int cropId, String cropName, double cropPrice) {
        this.cropId = cropId;
        this.cropName = cropName;
        this.cropPrice = cropPrice;
    }

    public int getCropId() {
        return cropId;
    }

    public String getCropName() {
        return cropName;
    }

    public double getCropPrice() {
        return cropPrice;
    }
}

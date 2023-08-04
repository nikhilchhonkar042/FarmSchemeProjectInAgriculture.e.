package Admin;

import java.util.List;

class Crop {
    @Override
	public String toString() {
		return "Crop [cropId=" + cropId + ", cropName=" + cropName + ", cropPrice=" + cropPrice + "]";
	}



	private int cropId;
    private String cropName;
    private double cropPrice;
    
    
    public int getCropId() {
		return cropId;
	}

	public void setCropId(int cropId) {
		this.cropId = cropId;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public double getCropPrice() {
		return cropPrice;
	}

	public void setCropPrice(double cropPrice) {
		this.cropPrice = cropPrice;
	}

	

    public Crop(int cropId, String cropName, double cropPrice) {
        this.cropId = cropId;
        this.cropName = cropName;
        this.cropPrice = cropPrice;
    }
    // Add getters and setters as needed

	
}
class Bid {
    private int bidderId;
    private int cropId;
    private double bidAmount;

    public Bid(int bidderId, int cropId, double bidAmount) {
        this.bidderId = bidderId;
        this.cropId = cropId;
        this.bidAmount = bidAmount;
    }
    // Add getters and setters as needed

	public int getBidderId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getCropId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getBidAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class SoldCrop {
 

	

	private int cropId;
    private int bidderId;
    private double soldPrice;

    public SoldCrop(int cropId, int bidderId, double soldPrice) {
        this.cropId = cropId;
        this.bidderId = bidderId;
        this.soldPrice = soldPrice;
    }
    // Add getters and setters as needed
    public int getCropId() {
 		return cropId;
 	}

 	public void setCropId(int cropId) {
 		this.cropId = cropId;
 	}

 	public int getBidderId() {
 		return bidderId;
 	}

 	public void setBidderId(int bidderId) {
 		this.bidderId = bidderId;
 	}

 	public double getSoldPrice() {
 		return soldPrice;
 	}

 	public void setSoldPrice(double soldPrice) {
 		this.soldPrice = soldPrice;
 	}
 	
 	@Override
	public String toString() {
		return "SoldCrop [cropId=" + cropId + ", bidderId=" + bidderId + ", soldPrice=" + soldPrice + "]";
	}
}

interface AdminDAO {

    void addCrop(Crop crop);

    Crop getCropById(int cropId);

    List<Crop> getAllCrops();

    void addBid(Bid bid);

    List<Bid> getTopBidsForCrop(int cropId, int numberOfBids);

    void addSoldCrop(SoldCrop soldCrop);

    List<SoldCrop> getAllSoldCrops();

}


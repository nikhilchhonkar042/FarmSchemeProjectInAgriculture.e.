package entities;

public class CropDetailsEntity {
	

	private long cropId;
	private String cropType;
	private String cropName;
	private String fertilizerType;
	private String quntity;
    private int Farmer_ID;
	private String soilpHCertificate;
//	private int FarmerID;
//    private int 
    
	

	public int getFarmer_ID() {
		return Farmer_ID;
	}

	public void setFarmer_ID(int farmer_ID) {
		Farmer_ID = farmer_ID;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public String getFertilizerType() {
		return fertilizerType;
	}

	public void setFertilizerType(String fertilizerType) {
		this.fertilizerType = fertilizerType;
	}

	public String getQuntity() {
		return quntity;
	}

	public void setQuntity(String quntity) {
		this.quntity = quntity;
	}

	public String getSoilpHCertificate() {
		return soilpHCertificate;
	}

	public void setSoilpHCertificate(String soilpHCertificate) {
		this.soilpHCertificate = soilpHCertificate;
	}

	@Override
	public String toString() {
		return "ProductDetailsEntity [cropType=" + cropType + ", cropName=" + cropName + ", fertilizerType="
				+ fertilizerType + ", quntity=" + quntity + ", soilpHCertificate=" + soilpHCertificate + "]";
	}

}
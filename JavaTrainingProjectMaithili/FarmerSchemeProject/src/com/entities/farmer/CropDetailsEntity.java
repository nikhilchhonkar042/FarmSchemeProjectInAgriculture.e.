package com.entities.farmer;

public class CropDetailsEntity {
	

	private long cropId;
	private String cropType;
	private String cropName;
	private String fertilizerType;
	private String quntity;
    private String Farmer_ID;
	private String soilpHCertificate;
//    private int 
    
	public CropDetailsEntity(String cropType, String cropName, String fertilizerType, String quntity,
			String soilpHCertificate) {
		super();
		this.cropType = cropType;
		this.cropName = cropName;
		this.fertilizerType = fertilizerType;
		this.quntity = quntity;
		this.soilpHCertificate = soilpHCertificate;
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
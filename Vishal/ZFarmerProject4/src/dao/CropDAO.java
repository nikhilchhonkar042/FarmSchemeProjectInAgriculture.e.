package dao;

import entities.CropDetailsEntity;

public interface CropDAO {
	public void insertCrop(CropDetailsEntity cropDetailsEntity);

	public CropDetailsEntity selectCrop(int id);

	public void updateCrop(CropDetailsEntity cropDetailsEntity);

	public void deleteCrop(int id);

}

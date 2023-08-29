package com.manufacturer.manage.service;

import com.manufacturer.manage.entity.ManufacturerEntity;

public interface ManufacturerService {

	public void createManufacturer(ManufacturerEntity manufacturerEntity);

	public void updateManufacturer(ManufacturerEntity manufacturerEntity);

	public void deleteByManufacturerId(int ManufacturerId);

	public ManufacturerEntity findByManufacturerId(int ManufacturerId);

}

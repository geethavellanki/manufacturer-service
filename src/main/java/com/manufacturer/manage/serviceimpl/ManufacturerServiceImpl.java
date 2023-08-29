package com.manufacturer.manage.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manufacturer.manage.entity.ManufacturerEntity;
import com.manufacturer.manage.repository.ManufacturerDao;
import com.manufacturer.manage.service.ManufacturerService;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {

	@Autowired
	public ManufacturerDao manufacturerDao;

	@Override
	public void createManufacturer(ManufacturerEntity manufacturerEntity) {
		manufacturerDao.save(manufacturerEntity);
	}

	@Override
	public void updateManufacturer(ManufacturerEntity manufacturerEntity) {
		manufacturerDao.save(manufacturerEntity);
	}

	@Override
	public void deleteByManufacturerId(int ManufacturerId) {
		manufacturerDao.deleteById(ManufacturerId);
	}

	@Override
	public ManufacturerEntity findByManufacturerId(int ManufacturerId) {
		ManufacturerEntity manufacturerEntity;
		Optional<ManufacturerEntity> manufacturerEntityOptional = manufacturerDao.findById(ManufacturerId);
		if (manufacturerEntityOptional.isPresent()) {
			manufacturerEntity = manufacturerEntityOptional.get();
		} else {
			throw new RuntimeException("mnufacturer details re not found");
		}
		return manufacturerEntity;
	}

}

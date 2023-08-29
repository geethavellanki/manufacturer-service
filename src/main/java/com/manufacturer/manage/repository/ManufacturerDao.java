package com.manufacturer.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manufacturer.manage.entity.ManufacturerEntity;

public interface ManufacturerDao extends JpaRepository<ManufacturerEntity, Integer>{

}

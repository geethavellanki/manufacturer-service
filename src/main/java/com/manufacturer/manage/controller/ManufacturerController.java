package com.manufacturer.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manufacturer.manage.entity.ManufacturerEntity;
import com.manufacturer.manage.service.ManufacturerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/manufacturer")
public class ManufacturerController {

	@Autowired
	private ManufacturerService manufacturerService;

	@PostMapping("/create")
	public void createManufacturer(@Valid @RequestBody ManufacturerEntity manufacturerEntity) {
		manufacturerService.createManufacturer(manufacturerEntity);
	}

	@PutMapping("/update")
	public void updateManufacturer(@Valid @RequestBody ManufacturerEntity manufacturerEntity) {
		manufacturerService.updateManufacturer(manufacturerEntity);
	}

	@DeleteMapping("/deleteByManufacturerId/{ManufacturerId}")
	public void deleteByManufacturerId(@PathVariable int ManufacturerId) {
		manufacturerService.deleteByManufacturerId(ManufacturerId);
	}

	@GetMapping("/findByManufacturerId/{ManufacturerId}")
	public ManufacturerEntity findByManufacturerId(@PathVariable int ManufacturerId) {
		return manufacturerService.findByManufacturerId(ManufacturerId);
	}

}

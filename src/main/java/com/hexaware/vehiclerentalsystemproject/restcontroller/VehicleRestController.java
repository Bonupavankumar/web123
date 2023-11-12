package com.hexaware.vehiclerentalsystemproject.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.vehiclerentalsystemproject.dto.VehicleDTO;
import com.hexaware.vehiclerentalsystemproject.services.IVehicleService;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleRestController {
	@Autowired
	IVehicleService service;
	
	
	@PostMapping("/post")
	public VehicleDTO addVehicle(@RequestBody VehicleDTO vehicleDTO) {
		return service.addVehicle(vehicleDTO);
		
	}
	@PutMapping("/put/{id}")
	public VehicleDTO updateVehicle(@PathVariable Long id,@RequestBody VehicleDTO vehicle) {
		return service.updateVehicle(vehicle);
	}
	@GetMapping("/get/{id}")
	public VehicleDTO getById(@PathVariable Long id) throws Exception {
		return service.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}
	

}


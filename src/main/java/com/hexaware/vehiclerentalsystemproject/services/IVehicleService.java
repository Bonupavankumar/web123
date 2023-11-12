package com.hexaware.vehiclerentalsystemproject.services;

import com.hexaware.vehiclerentalsystemproject.dto.VehicleDTO;

public interface IVehicleService {
	public VehicleDTO addVehicle(VehicleDTO vehicle);
	public VehicleDTO updateVehicle(VehicleDTO vehicle);
	public VehicleDTO findById(Long id) throws Exception;
	public void deleteById(Long id);
	

}
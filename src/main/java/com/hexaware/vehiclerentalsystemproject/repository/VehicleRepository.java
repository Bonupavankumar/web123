package com.hexaware.vehiclerentalsystemproject.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.vehiclerentalsystemproject.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {

}


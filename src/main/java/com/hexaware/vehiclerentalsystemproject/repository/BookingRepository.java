package com.hexaware.vehiclerentalsystemproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.vehiclerentalsystemproject.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking,Long> {

}


package com.hexaware.vehiclerentalsystemproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.vehiclerentalsystemproject.entities.User;


public interface UserRepository  extends JpaRepository<User,Long>{

}

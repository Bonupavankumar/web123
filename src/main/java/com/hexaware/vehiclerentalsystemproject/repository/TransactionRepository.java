package com.hexaware.vehiclerentalsystemproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.vehiclerentalsystemproject.entities.Transaction;

public interface TransactionRepository  extends JpaRepository<Transaction,Long>{

}

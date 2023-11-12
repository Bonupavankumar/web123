package com.hexaware.vehiclerentalsystemproject.services;

import com.hexaware.vehiclerentalsystemproject.dto.TransactionDTO;

public interface ITransactionService {
	public TransactionDTO addTransaction(TransactionDTO transaction);
	public TransactionDTO updateTransaction(TransactionDTO transaction);
	public TransactionDTO getById();
	public void deleteById(Long id);
	

}
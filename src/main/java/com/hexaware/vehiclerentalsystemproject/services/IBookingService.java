package com.hexaware.vehiclerentalsystemproject.services;

import com.hexaware.vehiclerentalsystemproject.dto.BookingDTO;
import com.hexaware.vehiclerentalsystemproject.entities.Booking;


public interface IBookingService {
	public BookingDTO addBooking(BookingDTO booking);
	public BookingDTO updateBooking(BookingDTO booking);
	public BookingDTO findById(Long id)throws Exception;
	public void deleteById(Long id);
	

}


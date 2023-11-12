package com.hexaware.vehiclerentalsystemproject.services;

import com.hexaware.vehiclerentalsystemproject.dto.BookingDTO;
import com.hexaware.vehiclerentalsystemproject.entities.Booking;
import com.hexaware.vehiclerentalsystemproject.entities.User;
import com.hexaware.vehiclerentalsystemproject.entities.Vehicle;
import com.hexaware.vehiclerentalsystemproject.repository.BookingRepository;
import com.hexaware.vehiclerentalsystemproject.repository.UserRepository;
import com.hexaware.vehiclerentalsystemproject.repository.VehicleRepository;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements IBookingService {
	
	@Autowired
	BookingRepository repository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	VehicleRepository vehicleRepository;
	

	@Override
	public BookingDTO addBooking(BookingDTO bookingDto) {
		// Check if user exists by userId
		// Check if vehicle is available by vehicleId
		Optional<User> optionalUser = userRepository.findById(bookingDto.getUserId());
		if(optionalUser.isEmpty()) {
			throw new RuntimeException("User doesnot exist");
		}
		Optional<Vehicle>optionalVehicle = vehicleRepository.findById(bookingDto.getVehicleId());
		if(optionalVehicle.isEmpty()) {
			throw new RuntimeException("Vehicle doesnot exist");
		}
		
		Booking booking = new Booking();
		booking.setUser(optionalUser.get());
		booking.setVehicle(optionalVehicle.get());
		booking.setFromDate(bookingDto.getFromDate());
		booking.setToDate(bookingDto.getToDate());
		BeanUtils.copyProperties(bookingDto, booking);
		booking =  repository.save(booking);
		BeanUtils.copyProperties(booking,bookingDto);
		return bookingDto;
	}

	@Override
	public BookingDTO updateBooking(BookingDTO bookingDto) {

		Booking booking = new Booking();
		BeanUtils.copyProperties(bookingDto, booking);
		booking =  repository.save(booking);
		BeanUtils.copyProperties(booking,bookingDto);
		return bookingDto;
	}

	@Override
	public BookingDTO findById(Long id)throws Exception {
		Booking booking = new Booking();
		BookingDTO bookingDTO = new BookingDTO();
		booking =  repository.findById(id).orElseThrow(() -> new Exception("Booking  not found - " + id));
		BeanUtils.copyProperties(booking,bookingDTO);
		return bookingDTO;
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);

	}

}

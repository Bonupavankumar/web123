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

import com.hexaware.vehiclerentalsystemproject.dto.BookingDTO;
import com.hexaware.vehiclerentalsystemproject.services.IBookingService;



@RestController
@RequestMapping("/api/booking")
public class BookingRestController {
	
	@Autowired
	IBookingService service;
	
	@PostMapping("/add")
	public BookingDTO addBooking(@RequestBody BookingDTO booking) {
		return service.addBooking(booking);
	}

	  @PutMapping("/put/{id}")
	  public BookingDTO updateBooking(@PathVariable Long id,@RequestBody BookingDTO booking) {
		  return service.updateBooking(booking);
	  }
	  @GetMapping("/get/{id}")
	  public BookingDTO getBooking(@PathVariable Long id) throws Exception {
		  return service.findById(id);
	  }
	  @DeleteMapping("/delete/{id}")
	  public void deleteById(@PathVariable Long id) {
		  service.deleteById(id);
		  
	  }
}


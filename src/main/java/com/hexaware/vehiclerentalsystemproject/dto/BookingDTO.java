package com.hexaware.vehiclerentalsystemproject.dto;

import java.util.Date;


public class BookingDTO {

	private long id;
	private UserDTO user;
	private VehicleDTO vehicle;
	private Date fromDate;
	private Date toDate;
	
	public BookingDTO() {
		super();
	}
	public BookingDTO(long id,Date fromDate, Date toDate) {
		super();
		this.id = id;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	public long getId() {
		return id;
	}
	public void setBookingId(long id) {
		this.id = id;
	}
	
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public VehicleDTO getVehicle() {
		return vehicle;
	}
	public void setVehicle(VehicleDTO vehicle) {
		this.vehicle = vehicle;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	

}

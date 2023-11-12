package com.hexaware.vehiclerentalsystemproject.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@OneToOne
	@JoinColumn(name="userId", referencedColumnName = "userid")
	private User user;
	@OneToOne
	@JoinColumn(name="vehicleId", referencedColumnName = "id")
	private Vehicle vehicle;
	@NotNull
	private Date fromDate;
	@NotNull
	private Date toDate;
	
	public Booking() {
		super();
	}
	public Booking(long id,Date fromDate, Date toDate) {
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
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
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


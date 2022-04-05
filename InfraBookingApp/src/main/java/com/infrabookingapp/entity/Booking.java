package com.infrabookingapp.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bookings")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	
	@ElementCollection
	private List<Room> bookedRooms;
	
	@OneToOne
	private Employee stakeholder;
	
	private String purpose;
	private String dateOfBooking;
	private int participants;
	
	public List<Room> getBookedRooms() {
		return bookedRooms;
	}
	public void setBookedRooms(List<Room> bookedRooms) {
		this.bookedRooms = bookedRooms;
	}
	public Employee getStakeholder() {
		return stakeholder;
	}
	public void setStakeholder(Employee stakeholder) {
		this.stakeholder = stakeholder;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getDateOfBooking() {
		return dateOfBooking;
	}
	public void setDateOfBooking(String dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	public int getParticipants() {
		return participants;
	}
	public void setParticipants(int participants) {
		this.participants = participants;
	}
	
	
}

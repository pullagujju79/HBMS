package com.igate.hbms.bean;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
public class RoomDetailsBean {
	private String hotelId;
	private String roomId;
	 @NotEmpty(message="Room No should not be empty")
	 @Pattern(regexp="^[1-9][0-9]{2}",message="Invalid Room No")
	private String roomNo;
	 @NotEmpty(message="Room Type should not be empty")
	private String roomType;
	//@NotEmpty(message="Rate should not be empty")
	 // @Pattern(regexp="^[0-9]{3,4}",message="Invalid Room rate")
	private double perNightRate;
	private String availability;
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getPerNightRate() {
		return perNightRate;
	}
	public void setPerNightRate(double perNightRate) {
		this.perNightRate = perNightRate;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	
}

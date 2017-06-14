package com.igate.hbms.bean;

import org.springframework.format.annotation.DateTimeFormat;

public class RoomTypeBean {
	private String hotelId;
	private String roomId;
	private String roomNo;
	private String roomType;
	private double perNightRate;
	private String availability;
	@DateTimeFormat(pattern="^[0-9]{4}[-]{1}[0-9]{1,2}[-]{1}[0-9]{1,2}+$")
	//@NotEmpty(message="Please enter From date")
	private String fromDate;
	@DateTimeFormat(pattern="^[0-9]{4}[-]{1}[0-9]{1,2}[-]{1}[0-9]{1,2}+$")
	//@NotEmpty(message="Please enter To date")
	private String toDate;
	//@NotEmpty(message="Please enter number of adults")
	private int noOfAdults;
	//@NotEmpty(message="Please enter number of Children")
	private int noOfChildren;
	//@NotEmpty(message="Please enter number of Rooms")
	private int noOfRooms;
	//@NotEmpty(message="Please enter number of Nights")
	private int noOfNights;
	public int getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	public int getNoOfNights() {
		return noOfNights;
	}
	public void setNoOfNights(int noOfNights) {
		this.noOfNights = noOfNights;
	}
	public int getNoOfAdults() {
		return noOfAdults;
	}
	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}
	public int getNoOfChildren() {
		return noOfChildren;
	}
	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getAvailability() {
		return availability;
	}
	public void setPerNightRate(double perNightRate) {
		this.perNightRate = perNightRate;
	}
	public double getPerNightRate() {
		return perNightRate;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomNo() {
		return roomNo;
	}

}
/*HOTEL_ID       
ROOM_ID        
ROOM_NO        
ROOM_TYPE      
PER_NIGHT_RATE 
AVAILABILITY */  

/*VARCHAR2(4)
VARCHAR2(4)
VARCHAR2(3)
NOT NULL VARCHAR2(20)
NOT NULL NUMBER(6,2)
NOT NULL VARCHAR2(10)
*/
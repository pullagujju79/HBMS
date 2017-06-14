package com.igate.hbms.bean;

import org.springframework.stereotype.Component;

@Component
public class ReportBean {
	private String hotelId;
private String hotelName;
private String userFirstname;
private String bookedFrom;
private String bookedTo;
private String roomNo;
private String roomId;

public String getHotelId() {
	return hotelId;
}
public void setHotelId(String hotelId) {
	this.hotelId = hotelId;
}
public String getHotelName() {
	return hotelName;
}
public void setHotelName(String hotelName) {
	this.hotelName = hotelName;
}
public String getUserFirstname() {
	return userFirstname;
}
public void setUserFirstname(String userFirstname) {
	this.userFirstname = userFirstname;
}
public String getBookedFrom() {
	return bookedFrom;
}
public void setBookedFrom(String bookedFrom) {
	this.bookedFrom = bookedFrom;
}
public String getBookedTo() {
	return bookedTo;
}
public void setBookedTo(String bookedTo) {
	this.bookedTo = bookedTo;
}
public String getRoomNo() {
	return roomNo;
}
public void setRoomNo(String roomNo) {
	this.roomNo = roomNo;
}
public String getRoomId() {
	return roomId;
}
public void setRoomId(String roomId) {
	this.roomId = roomId;
}

}

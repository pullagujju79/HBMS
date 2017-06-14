package com.igate.hbms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.jsp.jstl.sql.Result;

import org.springframework.jdbc.core.RowMapper;

import com.igate.hbms.bean.RoomTypeBean;




public class DisplayRoomRowMapper implements RowMapper<RoomTypeBean>{
	
	public RoomTypeBean mapRow(ResultSet rs,int rowNum) throws SQLException
	{
		RoomTypeBean roomTypeBean=new RoomTypeBean();
		roomTypeBean.setHotelId(rs.getString(1));
		roomTypeBean.setRoomId(rs.getString(2));
		roomTypeBean.setRoomNo(rs.getString(3));
		roomTypeBean.setRoomType(rs.getString(4));
		roomTypeBean.setPerNightRate(rs.getDouble(5));
		roomTypeBean.setAvailability(rs.getString(6));
		/*roomTypeBean.setFromDate(rs.getString(7));
		roomTypeBean.setToDate(rs.getString(8));
		roomTypeBean.setNoOfAdults(rs.getInt(9));
		roomTypeBean.setNoOfChildren(rs.getInt(10));
		roomTypeBean.setNoOfRooms(rs.getInt(11));
		roomTypeBean.setNoOfNights(rs.getInt(12));*/
		
		return roomTypeBean;
		
	}
	/*HOTEL_ID,ROOM_ID,ROOM_NO,ROOM_TYPE,PER_NIGHT_RATE,AVAILABILITY */

	/*private String hotelId;
	private String roomId;
	private String roomNo;
	private String roomType;
	private double perNightRate;
	private String availability;
	private String fromDate;
	private String toDate;
	private int noOfAdults;
	private int noOfChildren;
	private int noOfRooms;
	private int noOfNights;
	*/

	

}

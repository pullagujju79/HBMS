package com.igate.hbms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.igate.hbms.bean.HotelBean;

public class HotelRowMapper implements RowMapper<HotelBean>{
	
public HotelBean mapRow(ResultSet rs, int rowNum) throws SQLException {
	
	HotelBean hotelBean=null;
	
	hotelBean=new HotelBean();
	hotelBean.setHotelID(rs.getString(1));
	hotelBean.setCity(rs.getString(2));
	hotelBean.setHotelName(rs.getString(3));
    hotelBean.setAddress(rs.getString(4));
	hotelBean.setDescription(rs.getString(5));
	hotelBean.setPhoneNo1(rs.getString(6));
	hotelBean.setPhoneNo2(rs.getString(7));
	hotelBean.setRating(rs.getString(8));
	hotelBean.setEmail(rs.getString(9));
	hotelBean.setFax(rs.getString(10));
	
	return hotelBean;
}


}

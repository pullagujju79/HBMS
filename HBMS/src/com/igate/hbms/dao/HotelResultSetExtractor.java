/**
 * 
 */
package com.igate.hbms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.ResultSetExtractor;

import com.igate.hbms.bean.HotelBean;



/**
 * @author Hbms_team4
 *
 */


/*********************************************************************************************************************************************
 *Class Name:HotelRowMapper
 *@author Hbms_team4
 *Description:hotel ResultSetextractor class which implements the ResultsetExtractor and perform the database access operations as per the user selected operation.
 *Date:12/3/2014
 **********************************************************************************************************************************************/
public class HotelResultSetExtractor implements ResultSetExtractor {
	
	@Override
	public HotelBean extractData(ResultSet rst) throws SQLException 
	{
	
		HotelBean hotelBean=new HotelBean();
	
		 hotelBean.setHotelID(rst.getString(1));
		 System.out.println(rst.getString(1));
		 hotelBean.setCity(rst.getString(2));
		 hotelBean.setHotelName(rst.getString(3));
		 hotelBean.setAddress(rst.getString(4));
		 hotelBean.setDescription(rst.getString(5));
		 hotelBean.setAvgRatePerNight(rst.getDouble(6));
		 hotelBean.setPhoneNo1(rst.getString(7));
		 hotelBean.setPhoneNo2(rst.getString(8));
		 hotelBean.setRating(rst.getString(9));
		 hotelBean.setEmail(rst.getString(10));
		 hotelBean.setFax(rst.getString(11));
	 
		return hotelBean;
		
	}

}

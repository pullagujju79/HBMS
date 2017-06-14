/**
 * 
 */
package com.igate.hbms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.igate.hbms.bean.HotelBean;





/**
 * @author Hbms_team4
 *
 */
/*********************************************************************************************************************************************
 *Class Name:HotelRowMapper
 *@author Hbms_team4
 *Description:hotel RowMapper  layer class which implements the RowMapper and perform the database access operations as per the user selected operation.
 *Date:12/3/2014
 **********************************************************************************************************************************************/
public class HotelRowMapper1 implements RowMapper<HotelBean> 
{
	
	public HotelBean mapRow(ResultSet rst,int rowNum) throws SQLException
	{
		HotelResultSetExtractor hotelResultSetExtractor=new HotelResultSetExtractor();
		HotelBean hotelBean=(HotelBean)hotelResultSetExtractor.extractData(rst);
		return hotelBean;
	}
}

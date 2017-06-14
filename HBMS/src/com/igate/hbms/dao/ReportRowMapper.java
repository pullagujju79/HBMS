package com.igate.hbms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.igate.hbms.bean.HotelBean;
import com.igate.hbms.bean.ReportBean;

public class ReportRowMapper implements RowMapper<ReportBean> {

	@Override
	public ReportBean mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		
		
		ReportBean reportBean=new ReportBean();
		reportBean.setHotelId(rs.getString(1));
		return reportBean;
	}

}

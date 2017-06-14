package com.igate.hbms.dao;

/*********************************************************************************************************************************************
 *Interface Name:IHbmsDAO
 *@author Hbms_team4
 *Description:Interface which contains abstract methods which needs to be implemented by the implementation class of DAO Layer
 *Date:12/03/2014
 **********************************************************************************************************************************************/

import java.util.List;

import com.igate.hbms.bean.HotelBean;
import com.igate.hbms.bean.RoomDetailsBean;
import com.igate.hbms.bean.RoomTypeBean;
import com.igate.hbms.bean.UserBean;

public interface IHbmsDAO {

	String checkRegisteredUser(UserBean userBean);
	boolean insertNewUser(UserBean userBean);
	public List<String> getLocations();
	public List<HotelBean> getHotels1(String city);
	
	public List<RoomTypeBean> roomDetails(String hotelId);
	public double bookRoom(RoomTypeBean roomTypeBean, String roomId,double perNightRate);
	public List<String> getHotels(String city);
	public String getHotelId(String location,String hotelName);
	public boolean addRoomDetails(RoomDetailsBean roomDetailsBean);
	public boolean deleteRoom(String delRoom);
	public List getReports();
	
	public List<HotelBean> fetchAllHotelsDAO();
	public int deleteRec(String hotelid);
	public HotelBean fetchModifyHotelDAO(HotelBean hotelBean);
	public boolean updateHotelDAO(HotelBean hotelDetails,String hotelID);
    public boolean addHotelDAO(HotelBean hotelBean);
	
}

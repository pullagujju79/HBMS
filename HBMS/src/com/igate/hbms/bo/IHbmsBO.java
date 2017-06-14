package com.igate.hbms.bo;

/*********************************************************************************************************************************************
 *Interface Name:IHotelBO
 *@author Hbms_team4
 *Description:Interface which contains abstract methods which needs to be implemented by the implementation class of Business Layer
 *Date:12/03/2014
 **********************************************************************************************************************************************/

import java.util.List;

import com.igate.hbms.bean.HotelBean;
import com.igate.hbms.bean.RoomDetailsBean;
import com.igate.hbms.bean.RoomTypeBean;
import com.igate.hbms.bean.UserBean;
import com.igate.hbms.exception.HbmsException;

public interface IHbmsBO {

	String checkRegisteredUser(UserBean userBean);
	boolean insertNewUser(UserBean userBean) throws HbmsException;
	
	public List<String> getLocations();
	public List<HotelBean> getHotels1(String city);
	public List<String> getHotels(String city);
	public String getHotelId(String location,String hotelName);
	public List<RoomTypeBean> roomDetails(String hotelId);
	public double bookRoom(RoomTypeBean roomTypeBean, String roomId,double perNightRate);
	
	public boolean addRoomDetails(RoomDetailsBean roomDetailsBean);
	public boolean deleteRoom(String delRoom);
	public List getReports();
	
	public List<HotelBean> fetchAllHotelsDAO();
	public int deleteRec(String hotelid);
	public HotelBean fetchModifyHotel(HotelBean hotelBean);
	public boolean updateHotelBO(HotelBean hotelDetails,String hotelID);
    public boolean addHotelBO(HotelBean hotelBean);
	
}

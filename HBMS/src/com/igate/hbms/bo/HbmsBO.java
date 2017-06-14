package com.igate.hbms.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igate.hbms.bean.HotelBean;
import com.igate.hbms.bean.RoomDetailsBean;
import com.igate.hbms.bean.RoomTypeBean;
import com.igate.hbms.dao.IHbmsDAO;
import com.igate.hbms.bean.UserBean;
@Service
public class HbmsBO implements IHbmsBO {

	@Autowired
	IHbmsDAO hbmsDAO;
	
	
	@Override
	public String checkRegisteredUser(UserBean userBean){
			
			String check;
			
			check=hbmsDAO.checkRegisteredUser(userBean);
			return check;
		}
		@Override
	public boolean insertNewUser(UserBean userBean){
			
			boolean check;
			
			check=hbmsDAO.insertNewUser(userBean);
			
			return check;
			
		}
	
	
	@Override
	public List<String> getLocations()
	{
		
		List<String> locationList=new ArrayList<String>();
		locationList=hbmsDAO.getLocations();
		return locationList;
	}
public List<HotelBean> getHotels1(String city)
	
	{
	   List<HotelBean> hotelList1=null;
		
		hotelList1=new ArrayList<HotelBean>();
		hotelList1=hbmsDAO.getHotels1(city);
		return hotelList1;
	}
@Override
	public List<RoomTypeBean> roomDetails(String hotelId)
	{
	List<RoomTypeBean> list=null;
	list=new ArrayList<RoomTypeBean>();
	list=hbmsDAO.roomDetails(hotelId);
	return list;
	}

@Override
	public double bookRoom(RoomTypeBean roomTypeBean, String roomId,double perNightRate)
	{
	double amount=hbmsDAO.bookRoom(roomTypeBean,roomId,perNightRate);
	return amount;
	}

	@Override
	public List<String> getHotels(String city)
	
	{
		
		List<String> hotelList1=new ArrayList<String>();
		hotelList1=hbmsDAO.getHotels(city);
		return hotelList1;
	}
	@Override
	public String getHotelId(String location,String hotelName)
	{
		String hotelId=hbmsDAO.getHotelId(location, hotelName);
		return hotelId;
	}
	@Override
	public boolean addRoomDetails(RoomDetailsBean roomDetailsBean)
	{
		boolean status=hbmsDAO.addRoomDetails(roomDetailsBean);
		return status;
	}
	@Override
	public boolean deleteRoom(String delRoom)
	{
		boolean status=hbmsDAO.deleteRoom(delRoom);
		return status;
		
	}
	@Override
	public List getReports()
	{
		List reportList=hbmsDAO.getReports();
		return reportList;
	}
	
	
	/*****************************************************************************************************
	 * Method Name:fetchAllHotelsDAO
	 * Description:Method gets the hotelList from the Database Access layer
	 * @param List (HotelBean)
	 * Return Type:Integer
	 *****************************************************************************************************/
	
	public List<HotelBean> fetchAllHotelsDAO() 
	{
		List<HotelBean> hotellist=null;
		hotellist=new ArrayList<HotelBean>();
		hotellist=hbmsDAO.fetchAllHotelsDAO();
		return hotellist;
	}
	
	/*****************************************************************************************************
	 * Method Name:Delete hotels
	 * Description:delet the hotelDetails from the Database layer
	 * @param List (HotelBean)
	 * Return Type:Integer
	 *****************************************************************************************************/
	
	public int deleteRec(String hotelid)
	{
		  int count=hbmsDAO.deleteRec(hotelid);
		  return count;
	}
	
	/*****************************************************************************************************
	 * Method Name:fetchModifyHotel
	 * Description:fetch the hotelDetails from the Database layer
	 * @param List (HotelBean)
	 * Return Type:hotelBean
	 *****************************************************************************************************/
	
	public HotelBean fetchModifyHotel(HotelBean hotelBean)
	{
		HotelBean bean=hbmsDAO.fetchModifyHotelDAO(hotelBean);
		return bean;
	}
	
	/*****************************************************************************************************
	 * Method Name:updateHotelBO
	 * Description:update the hotelDetails from the Database layer
	 * @param List (HotelBean)
	 * Return Type:boolean
	 *****************************************************************************************************/
	
	public boolean updateHotelBO(HotelBean hotelDetails,String hotelID)
	{
		boolean update=hbmsDAO.updateHotelDAO(hotelDetails,hotelID);
		return update;
	}
	
	/*****************************************************************************************************
	 * Method Name:addHotelBO
	 * Description:add the hotelDetails into the Database layer
	 * @param List (HotelBean)
	 * Return Type:boolean
	 *****************************************************************************************************/
	
	 public boolean addHotelBO(HotelBean hotelBean)
	 {
		 boolean add=hbmsDAO.addHotelDAO(hotelBean);
		 return add;
	 }
	
}

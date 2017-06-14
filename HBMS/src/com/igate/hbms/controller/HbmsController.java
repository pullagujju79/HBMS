package com.igate.hbms.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.igate.hbms.bean.HotelBean;
import com.igate.hbms.bean.ReportBean;
import com.igate.hbms.bean.RoomDetailsBean;
import com.igate.hbms.bean.RoomTypeBean;
import com.igate.hbms.bean.UserBean;
import com.igate.hbms.bo.IHbmsBO;
import com.igate.hbms.exception.HbmsException;

@Controller
@SessionAttributes({"cityList","locationList","hotellist"})
@RequestMapping(value="user")
public class HbmsController {

	@Autowired
	IHbmsBO hbmsBO;

	
	@RequestMapping(value="showLogin")
	public String prepareHomePage(Model model)
	{
		UserBean userBean=new UserBean();
		model.addAttribute("userBean",userBean);
		return "Login";
	}
	
	
	
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(@ModelAttribute @Valid UserBean userBean, BindingResult result,Model model){
		
		String check;
		String viewName=null;
		/*if(result.hasErrors())
		{
			return new ModelAndView("Login");
		}*/
		
	try{
	   check=hbmsBO.checkRegisteredUser(userBean);
		
		
		if(check.equals("admin")){
			viewName="adminHome";
		}
	   if(check.equals("user")){
			viewName="index2";
		}
		if(check.equals(null))
		{
			 
			  viewName="Login";
		}
	}
	catch(DataAccessException de){
		model.addAttribute("message","Not Registered User");
		viewName="Login";
		
	}
			
		return (viewName);
		
	}
		
		
	
	@RequestMapping(value="Register")
	public String showRegister(Model model){
		UserBean userBean=new UserBean();
		model.addAttribute("userBean",userBean);
		return "Registration";
	}
	
	
	
	
	@RequestMapping(value="register")
	public ModelAndView register(@ModelAttribute @Valid UserBean userBean, BindingResult result,Model model) throws HbmsException{
		boolean check;
		if(result.hasErrors())
		{
			return new ModelAndView("Registration");
		}
		else{
			check=hbmsBO.insertNewUser(userBean);
		}
		if(check==true){
			model.addAttribute("message","Registration Successful");
		return new ModelAndView("result1");
		}
		else
		{
			return new ModelAndView("Registration");
		}
	}
	
	@RequestMapping("showSearchHotel")
	public String showSearchHotel(Model model)
	{
		List locationList=new ArrayList();
		
		String viewname1=null;
		try
		{
		locationList=hbmsBO.getLocations();
		model.addAttribute("locationList",locationList);
		model.addAttribute("hotelBean",new HotelBean());
		viewname1="SearchHotel";
		}
		catch(DataAccessException datae)
		{
			model.addAttribute("msg",datae.getMessage());
			model.addAttribute("locationList",locationList);
			model.addAttribute("hotelBean",new HotelBean());
			return "error";
		}
		return viewname1;
    }
	
	@RequestMapping(value="showDisplayHotel")
	public String showDisplayHotel(@RequestParam String city,Model model)
	{
	
		String viewName1;
	
		
		List<HotelBean> hotelList=null;
		try
		{
		hotelList=new ArrayList<HotelBean>();
		hotelList=hbmsBO.getHotels1(city);
        model.addAttribute("hotelList",hotelList);
        model.addAttribute("hotelBean",new HotelBean());
        viewName1="DisplayHotel";
        }
		catch(DataAccessException datae)
		{
			model.addAttribute("msg",datae.getMessage());
			model.addAttribute("hotelList",hotelList);
			model.addAttribute("hotelBean",new HotelBean());
			return "error";
		}
		return viewName1;
	}
	
	
	
	@RequestMapping("showRoom")
	public String showRoomDetails(Model model,@RequestParam String hotelId)
	{
		
		List<RoomTypeBean> list=null;
		list=new ArrayList<RoomTypeBean>();
		list=hbmsBO.roomDetails(hotelId);
		model.addAttribute("roomDetails",list);
		return "RoomDetails";
		}
	
	@RequestMapping("registerRoom")
	public String registerRoom(@ModelAttribute @Valid RoomTypeBean roomTypeBean, Model model,@RequestParam String RoomID,@RequestParam double nightRate)
	{
		
		roomTypeBean.setRoomId(RoomID);
		roomTypeBean.setPerNightRate(nightRate);
		model.addAttribute("RoomTypeBean",roomTypeBean);
		return "ReservationForm";
		
	}
	
	@RequestMapping("bookRoom")
	public String boomRoom(@ModelAttribute RoomTypeBean roomTypeBean,@RequestParam String roomId,@RequestParam double perNightRate,Model model)
	{
		double amount=hbmsBO.bookRoom(roomTypeBean,roomId,perNightRate);
		String view=null;
		if(amount==100)
		{
			model.addAttribute("message","Please ensure that from date should be greater than or equal to today date");
			view="result1";
		}
		
		else if(amount>50)
		{
			model.addAttribute("RoomID",roomId);
			model.addAttribute("Amount",amount);
			view="Success";
		}
		
		else if(amount<0||amount>29)
		{
			model.addAttribute("message","Please ensure that from Date should be less than to Date and also not more than 30 days");
			view="result1";
		}
		return view;
		
	}
	
	
	@RequestMapping(value="getCities")
	public String getCities(Model model)
	{
		try{
		List<String> cityList=new ArrayList<String>();
		cityList=new ArrayList<String>();
		cityList=hbmsBO.getLocations();
		model.addAttribute("cityList",cityList);
		model.addAttribute("roomDetailsBean",new RoomDetailsBean());
		
		}
		catch(DataAccessException dae)
		{
			model.addAttribute("message","Try After some time");
			return "result1";
		}
		return "addRoom";
	}
	
	
	
	@RequestMapping(value="getHotelsByCity")
	public String getHotels(@ModelAttribute RoomDetailsBean roomDetailsBean,@RequestParam String location,@RequestParam String hotel,Model model)
	{
		//RoomDetailsBean roomDetailsBean=new RoomDetailsBean();
	
		try{
			
		List<String> roomType=new ArrayList<String>();
		roomType.add("Standard A/C room");
		roomType.add("Executive A/C room");
		roomType.add("Deluxe A/C room");
		roomType.add("Standard Non A/C room");
		model.addAttribute("roomType",roomType);
		if(!(location.isEmpty()))
		{
		List<String> hotelList=new ArrayList<String>();
		hotelList=new ArrayList<String>();
		hotelList=hbmsBO.getHotels(location);
		model.addAttribute("hotelList",hotelList);
		model.addAttribute("selectedCity",location);
		}
		
		
		
		if(!(hotel.isEmpty()))
		{
			
			String hotelId=hbmsBO.getHotelId(location,hotel);
			model.addAttribute("selectedHotel",hotel);
	        roomDetailsBean.setHotelId(hotelId);
		}
		model.addAttribute("roomDetailsBean",roomDetailsBean);	
		}
		catch(DataAccessException dae)
		{
			model.addAttribute("message","Try After some time");
			return "result1";
		}
		return "addRoom";
	}
	
	
	@RequestMapping(value="addRoomDetails")
	public String addRoomDetails(@ModelAttribute(value="roomDetailsBean") @Valid RoomDetailsBean roomDetailsBean,BindingResult result,Model model)
	{
		boolean status=false;
		status=hbmsBO.addRoomDetails(roomDetailsBean);
		if(status)
		{
			model.addAttribute("message","Room Added Successfully");
			roomDetailsBean.setHotelId(null);
			roomDetailsBean.setPerNightRate(0.0);
			roomDetailsBean.setRoomNo(null);
			roomDetailsBean.setRoomType(null);
			return "addRoom";
		}
		else
		{
			model.addAttribute("message","Invalid Room Details");
			return "result";
		}
	}
	
	
	@RequestMapping(value="deleteRoom")
	public String deleteRoom(@RequestParam String delRoom,Model model)
	{
		boolean status=false;
		status=hbmsBO.deleteRoom(delRoom);
		if(status){
			model.addAttribute("message","Room Deleted Successfully");
		return "result";
		}
		else
		{
			model.addAttribute("message","Invalid Room ID");
		return "result";
		}
	}
	
	@RequestMapping(value="prepareReportBean")
	public String prepareReportBean(Model model)
	{
		ReportBean reportBean=new ReportBean();
		List reportList=hbmsBO.getReports();
		model.addAttribute("reportList",reportList);
		return "viewReport";
		
	}
	
	
	
	/*****************************************************************************************************
	 * Method Name:prepareHomePage
	 * Description:Binds the HotelBean object with the model
	 * Return Type:hotellist
	 * @param:Model Object
	 *****************************************************************************************************/

	@RequestMapping(value="welcome")
	public String fetchAllHotelsDAO(@ModelAttribute HotelBean hotelBean, BindingResult result,Model model)
	{	
		String viewName=null;
		try
		{
			List<HotelBean> hotellist=hbmsBO.fetchAllHotelsDAO();
			model.addAttribute("hotellist",hotellist);
			viewName= "hotelDisplay";
		}
		catch (DataAccessException dae) 
		{
			model.addAttribute("message","Sorry for Inconvenience, try after sometime");
			viewName="result";
		}
		return viewName;
	}
	
	
	/*****************************************************************************************************
	 * Method Name:deleteHotel
	 * Description:Binds the HotelBean object with the model
	 * Return Type:int
	 *****************************************************************************************************/

	
	@RequestMapping(value="delete")
	public String deleteHotel(@RequestParam String hotelid,Model model)
		{
		String viewName=null;
		try{
		  	int status=hbmsBO.deleteRec(hotelid);
			if(status!=0)
			{
				model.addAttribute("message","Hotel Deleted Successfully");
				return "result";
			}
			 else
			{
				 model.addAttribute("message","Unable to Delete ");
					return "result";
			}
		}
		catch (DataAccessException dae) 
		 {
			 model.addAttribute("error","you cannot delete HotelId  it is refer to some booking details");
				viewName="hotelDisplay"; 
		 }
		return viewName;
		}
	
	
	/*****************************************************************************************************
	 * Method Name:showModifyHotel
	 * Description:Binds the HotelBean object with the model
	 * Return Type:String
	 * @param:Model Object
	 *****************************************************************************************************/
	
	@RequestMapping("showModifyHotel")
	public String showModifyHotel(Model model)
	{
		model.addAttribute("hotelBean",new HotelBean());
		return "ModifyHotel";
	}
	
	
	@RequestMapping(value="modifyHotel",method=RequestMethod.POST)
	
	public String modifyHotel(@ModelAttribute @Valid HotelBean hotelBean, BindingResult result,Model model,HotelBean hotelBean1)
	{
		 String viewName=null;
		 try
			{
				hotelBean1=hbmsBO.fetchModifyHotel(hotelBean);
				model.addAttribute("hotelDetails",hotelBean1);
				viewName="ModifyHotelDeatails";
			}
			catch(DataAccessException e)
			{
			model.addAttribute("error","Enter Correct HotelID ");
			viewName="ModifyHotel";
			
		    }
      
	     return viewName;
   }
	/*****************************************************************************************************
	 * Method Name:updateHotel
	 * Description:Binds the HotelBean object with the model
	 * Return Type:String
	 * @param:Model Object
	 *****************************************************************************************************/
	
	
	@RequestMapping(value="updateHotel",method=RequestMethod.POST)
	public String updateHotel(@ModelAttribute @Valid HotelBean hotelDetails, BindingResult result,Model model){
		
		String viewName=null;
	     
		if(result.hasErrors())
		{
			model.addAttribute("hotelDetails", hotelDetails);
			viewName="ModifyHotelDeatails";
		}
		else
		{
			try
				{
					String hotelID=hotelDetails.getHotelID();
					
					boolean update=hbmsBO.updateHotelBO(hotelDetails,hotelID);
					if(update==true)
					{
						
						 model.addAttribute("HotelID",hotelDetails.getHotelID());
						
						 model.addAttribute("message",hotelDetails.getHotelID()+"Hotel Modified Successfully");
						 viewName="result";
					}
				}
			
			catch(DataAccessException e)
				{
					model.addAttribute("message","Cannot update due to some input data error");
					viewName="result";
				}
	        }
		return viewName;
		}
	
	
	/*****************************************************************************************************
	 * Method Name:showAddHotel
	 * Description:Binds the HotelBean object with the model
	 * Return Type:String
	 * @param:Model Object
	 *****************************************************************************************************/
	
	
	@RequestMapping("showAddHotel")
	public String showAddHotel(Model model)
	{
		model.addAttribute("hotelBean",new HotelBean());
		return "AddHotel";
	}
	
	@RequestMapping(value="addHotel",method=RequestMethod.POST)
	public String addHotel(@ModelAttribute @Valid HotelBean hotelBean, BindingResult result,Model model){
		
		String viewName=null;
	    
		if(result.hasErrors())
		{
			 return "AddHotel";
		}
		else
		{
			try
			{
				boolean add=hbmsBO.addHotelBO(hotelBean);
				if(add==true)
				{
					 model.addAttribute("HotelID",hotelBean.getHotelID());
					 
					 model.addAttribute("message",hotelBean.getHotelID()+"Hotel Added Successfully"+"");
					 viewName="result";
				}
			}
			catch(DataAccessException e)
			{
			model.addAttribute("message","Insertion is not successful");
			viewName="result";
		   }
        }
		return viewName;
	}
	
	
}

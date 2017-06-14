package com.igate.hbms.dao;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.igate.hbms.bean.HotelBean;
import com.igate.hbms.bean.ReportBean;
import com.igate.hbms.bean.RoomDetailsBean;
import com.igate.hbms.bean.RoomTypeBean;
import com.igate.hbms.bean.UserBean;

@Repository
public class HbmsDAO implements IHbmsDAO {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	 public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

		public String checkRegisteredUser(UserBean userBean){
		String check = null;
		String query="select user_firstname,password,role from users where user_firstname=? and password=?";			
			RowMapper mapper = new RowMapper() 
			{
				public Object mapRow(ResultSet rs, int row)
				{
					UserBean userBean=new UserBean();
					try {
						userBean.setUserFirstName(rs.getString(1));
						userBean.setPassword(rs.getString(2));
						userBean.setRole(rs.getString(3));
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					System.out.println(userBean.getRole()+" hi");
					return userBean;
				}
			};
			UserBean userBean1=(UserBean)jdbcTemplate.queryForObject(query,mapper,userBean.getUserFirstName(),userBean.getPassword());
		   if(userBean1.getRole().equals(null))
		   {
			   check=null;
		   }
		   if(userBean1.getRole().equals("admin")){
			   
			   check="admin";
		   }
		   if(userBean1.getRole().equals("user"))
		   {
			   check="user";
		   }
		    
		    
		   return check; 
			
			
		}
		@Override
		public List<RoomTypeBean> roomDetails(String hotelId)
		{
			List<RoomTypeBean> list=null;
			list=new ArrayList<RoomTypeBean>();
			list=jdbcTemplate.query("SELECT HOTEL_ID,ROOM_ID,ROOM_NO,ROOM_TYPE,PER_NIGHT_RATE,AVAILABILITY FROM ROOM_DETAILS where hotel_id=?",new DisplayRoomRowMapper(),new Object[]{hotelId});
			return list;
		}
		
		@Override
		public double bookRoom(RoomTypeBean roomTypeBean, String roomId,double perNightRate)
		{
			double amount=0;
			String fromDate=roomTypeBean.getFromDate();
			String a[]=fromDate.split("-");
			String year=a[0];
			int year2=Integer.parseInt(year);
			String month=a[1];
			int month2=Integer.parseInt(month);
			String day=a[2];
			int day2=Integer.parseInt(day);
			String utilDate=day+"/"+month+"/"+year;
			java.util.Date purDate=new Date(utilDate);
			java.util.Date today=new java.util.Date();
			
			boolean checking=purDate.before(today);
			
			
			java.sql.Date sqlDate=new java.sql.Date(purDate.getTime());
			
			String toDate=roomTypeBean.getToDate();
			String b[]=toDate.split("-");
			String year1=b[0];
			int year3=Integer.parseInt(year1);
			String month1=b[1];
			int month3=Integer.parseInt(month1);
			String day1=b[2];
			int day3=Integer.parseInt(day1);
			String utilDate1=day1+"/"+month1+"/"+year1;
			java.util.Date purDate1=new Date(utilDate1);
			java.sql.Date sqlDate1=new java.sql.Date(purDate1.getTime());
			Date sysDate=new Date();
			
			String fromDate1=month+"-"+day+"-"+year;
			String toDate1=month1+"-"+day1+"-"+year1;

		       java.util.Calendar cal1 = new java.util.GregorianCalendar();
		       java.util.Calendar cal2 = new java.util.GregorianCalendar();

		       //split year, month and days from the date using StringBuffer.
		       StringBuffer sBuffer = new StringBuffer(fromDate1);
		       String yearFrom = sBuffer.substring(6,10);
		       String monFrom = sBuffer.substring(0,2);
		       String ddFrom = sBuffer.substring(3,5);
		       int intYearFrom = Integer.parseInt(yearFrom);
		       int intMonFrom = Integer.parseInt(monFrom);
		       int intDdFrom = Integer.parseInt(ddFrom);

		       // set the fromDate in java.util.Calendar
		       cal1.set(intYearFrom, intMonFrom, intDdFrom);

		       //split year, month and days from the date using StringBuffer.
		       StringBuffer sBuffer1 = new StringBuffer(toDate1);
		       String yearTo = sBuffer1.substring(6,10);
		       String monTo = sBuffer1.substring(0,2);
		       String ddTo = sBuffer1.substring(3,5);
		       int intYearTo = Integer.parseInt(yearTo);
		       int intMonTo = Integer.parseInt(monTo);
		       int intDdTo = Integer.parseInt(ddTo);

		       // set the toDate in java.util.Calendar
		       cal2.set(intYearTo, intMonTo, intDdTo);

		       Date d1=cal1.getTime();
		       Date d2=cal2.getTime();
		       //call method daysBetween to get the number of days between two dates
		       int days = (int)( (d1.getTime() - d2.getTime()) / (1000 * 60 * 60 * 24));
			
		       int days1=-(days);
		       amount=perNightRate*days1;
		      
		      /* if(checking)
		       {
		    	   double compare=100;
		    	   return compare;
		       }
		       */
		       if(days1<0||days1>29)
		       {
		    	   double days2=days1;
		    	   return days2;
		       }
		
		       
		       
		       else if((purDate.compareTo(sysDate)>=0) && (purDate1.compareTo(purDate)>0))
		       {
			//amount=perNightRate*days1;
			int count=jdbcTemplate.update("INSERT INTO BOOKING_DETAIL VALUES(booking_id.NEXTVAL,?,'1041',?,?,?,?,?)", new Object[]{roomId,sqlDate,sqlDate1,roomTypeBean.getNoOfAdults(),roomTypeBean.getNoOfChildren(),amount});
			int i=jdbcTemplate.update("update room_details set availability='UnAvailable' where room_id=?", new Object[]{roomId});
			
			//return amount;
			}
			return amount;
			
		}
		
		@Override
		public boolean insertNewUser(UserBean userBean) {
			boolean check;
			int rows=jdbcTemplate.update("INSERT INTO users VALUES( userid.nextval,?,?,?,?,?,?,?,?,?,'user',?)",
					new Object[]{userBean.getUserFirstName(),userBean.getUserLastName(),userBean.getGender(),userBean.getAddress(), 
					userBean.getCity(),userBean.getPincode(),
					userBean.getState(),userBean.getEmailID(),userBean.getPassword(),userBean.getMobile()});
			
			if(rows!=0){
	
				check=true;
			}
			else 
				{
				check=false;
				}
			return check;
		}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getLocations()
		{
			List  locationList=new ArrayList();
			String sql="select distinct(city) from hotel ORDER BY city";
			locationList=jdbcTemplate.queryForList(sql);
			return locationList;
		}
	@SuppressWarnings("unchecked")
	@Override
	public List<String> getHotels(String city)
	{
		List  hotelList=new ArrayList();
		String sql="select HOTEL_NAME from hotel where city=?";
		hotelList=jdbcTemplate.queryForList(sql, city);
		return hotelList;
	}
	
	public List<HotelBean> getHotels1(String city)
	{
		List<HotelBean> hotelList=new ArrayList<HotelBean>();
	    
		String sql="select HOTEL_ID,CITY,Hotel_NAME,ADDRESS,DESCRIPTION,PHONE_NO1,PHONE_NO2,RATING,EMAIL,FAX from hotel where CITY=? ORDER BY Hotel_NAME";
		hotelList=(List<HotelBean>)jdbcTemplate.query(sql,new HotelRowMapper(),city);
		return hotelList;
	}
	
	@Override
	public String getHotelId(String location,String hotelName)
	{
		
	String sql="select HOTEL_ID from hotel where HOTEL_NAME=? and CITY=?";
	String hotelId=jdbcTemplate.queryForObject(sql, new Object[]{hotelName,location}, String.class);
	return hotelId;
	}
	@Override
	public boolean addRoomDetails(RoomDetailsBean roomDetailsBean)
	{
		boolean status=false;
		String sql="insert into room_Details values(?,roomidseq.nextval,?,?,?,'Available')";
		int state=jdbcTemplate.update(sql, new Object[]{roomDetailsBean.getHotelId(),roomDetailsBean.getRoomNo(),roomDetailsBean.getRoomType(),roomDetailsBean.getPerNightRate()});
		if(state==1)
		{
			status=true;
		}
		
		return status;
	}
	@Override
	public boolean deleteRoom(String delRoom)
	{
		boolean status=false;
		String sql="delete from room_details where ROOM_ID=?";
		int state=jdbcTemplate.update(sql, new Object[]{delRoom});
		if(state==1)
		{
			
			status=true;
		}
		
		return status;
		
	}
	
	public List getReports()
	{
		System.out.println("dao");
		//ReportBean rBean=new ReportBean();
		List reportList=new ArrayList();
		List finalReportList=new ArrayList();
		
		
		String sql="select hotel_id from hotel";
		List<ReportBean> hotelIdList=jdbcTemplate.query(sql, new ReportRowMapper());
		for(ReportBean id:hotelIdList)
		{
			String sql1="select h.Hotel_NAME,u.USER_FIRSTNAME,b.BOOKED_FROM,b. BOOKED_TO,r.ROOM_ID,r. ROOM_NO from HOTEL h join ROOM_DETAILS r on r.HOTEL_ID=h.HOTEL_ID join booking_detail b on b. ROOM_ID=r. ROOM_ID join users u on u.USER_ID=b.USER_ID where h.HOTEL_ID=?";
			reportList =jdbcTemplate.queryForList(sql1, new Object[]{id.getHotelId()});
			for(int i=0;i<reportList.size();i++)
			{
			finalReportList.add(reportList.get(i));
			}
			//rBean=jdbcTemplate.queryForObject(sql, new Object[]{id.getHotelId()},new ViewReportRowMapper());
			//rBean=jdbcTemplate.query(sql, new Object[]{id.getHotelId()},new ViewReportRowMapper());
			//reportList.add(rBean);
		
		}
		return finalReportList;
	}
	
	
	/*****************************************************************************************************
	 * Method Name:fetchHotelList
	 * Description:ferching the hotel details from Databsae
	 * Return Type:list
	 * @param:HotelBean Object
	 *****************************************************************************************************/
		public List<HotelBean> fetchAllHotelsDAO()
		{	
			String sqlQuery="SELECT HOTEL_ID,CITY,HOTEL_NAME,ADDRESS,DESCRIPTION,AVG_RATE_PER_NIGHT,PHONE_NO1,PHONE_NO2,RATING,EMAIL,FAX FROM HOTEL";
			List<HotelBean> list=new ArrayList<HotelBean>();
			list=jdbcTemplate.query(sqlQuery,new HotelRowMapper1());
			return list;
		}
		
		
		/*****************************************************************************************************
		 * Method Name:Delete hotel
		 * Description:deleting the hotel details from databsae
		 * Return Type:list
		 * @param:HotelBean Object
		 *****************************************************************************************************/
	
		public int deleteRec(String hotelid)
		{
			String sqlQuery="delete from hotel where hotel_id=?";
			int count=0;
			count=jdbcTemplate.update(sqlQuery,hotelid);
			return count;
		}
		
		/*****************************************************************************************************
		 * Method Name:fetchmodifyHotelDAO
		 * Description:Modifying  the hotel details from into database
		 * Return Type:list
		 * @param:HotelBean Object
		 *****************************************************************************************************/
		
		
		@Override
		public HotelBean fetchModifyHotelDAO(HotelBean hotelBean)
		{
			
			//intializing the row mapper
			
			RowMapper<HotelBean> mapper=new RowMapper<HotelBean>()
			{
				public HotelBean mapRow(ResultSet rset, int rowNum) throws SQLException 
				{
					HotelBean hotelBean=new HotelBean();
					hotelBean.setHotelID(rset.getString(1));
					hotelBean.setCity(rset.getString(2));
					hotelBean.setHotelName(rset.getString(3));
					hotelBean.setAddress(rset.getString(4));
					hotelBean.setDescription(rset.getString(5));
					hotelBean.setAvgRatePerNight(rset.getDouble(6));
					hotelBean.setPhoneNo1(rset.getString(7));
					hotelBean.setPhoneNo2(rset.getString(8));
					hotelBean.setRating(rset.getString(9));
					hotelBean.setEmail(rset.getString(10));
					hotelBean.setFax(rset.getString(11));
					
					return hotelBean;	
				}	
			};
			
			String cmd="SELECT HOTEL_ID,CITY,HOTEL_NAME,ADDRESS,DESCRIPTION,AVG_RATE_PER_NIGHT,PHONE_NO1,PHONE_NO2,RATING,EMAIL,FAX FROM HOTEL WHERE HOTEL_ID=?";
			HotelBean bean=(HotelBean) getJdbcTemplate().queryForObject(cmd,new Object[]{hotelBean.getHotelID()},mapper);
			return bean;
		}
		
		
		/*****************************************************************************************************
		 * Method Name:updateHotelDAO
		 * Description:updating  the hotel details into database
		 * Return Type:boolean
		 * @param:HotelBean Object
		 *****************************************************************************************************/
		
		
		public boolean updateHotelDAO(HotelBean hotelDetails,String hotelID)
		{
			boolean update1=false;
			String sqlQuery="UPDATE HOTEL SET CITY=?,HOTEL_NAME=?,ADDRESS=?,DESCRIPTION=?,AVG_RATE_PER_NIGHT=?,PHONE_NO1=?,PHONE_NO2=?,RATING=?,EMAIL=?,FAX=? WHERE HOTEL_ID=?";
			int update=jdbcTemplate.update(sqlQuery,new Object[]{hotelDetails.getCity(),hotelDetails.getHotelName(),hotelDetails.getAddress(),hotelDetails.getDescription(),hotelDetails.getAvgRatePerNight(),hotelDetails.getPhoneNo1(),hotelDetails.getPhoneNo2(),hotelDetails.getRating(),hotelDetails.getEmail(),hotelDetails.getFax(),hotelID});
		    if(update==1)
		    {
		    	
		    	update1=true;
		    }
		    return update1; 
		}
		
		
		/*****************************************************************************************************
		 * Method Name:addHotelDAO
		 * Description:Adding the hotel details  into database
		 * Return Type:boolean
		 * @param:HotelBean
		 *****************************************************************************************************/
		
		
		  public boolean addHotelDAO(HotelBean hotelBean)
		  {
			  boolean add1=false;
			  String sqlQuery="INSERT INTO HOTEL VALUES(?,?,?,?,?,?,?,?,?,?,?)";
			  int add=jdbcTemplate.update(sqlQuery,new Object[]{hotelBean.getHotelID(),hotelBean.getCity(),hotelBean.getHotelName(),hotelBean.getAddress(),hotelBean.getDescription(),hotelBean.getAvgRatePerNight(),hotelBean.getPhoneNo1(),hotelBean.getPhoneNo2(),hotelBean.getRating(),hotelBean.getEmail(),hotelBean.getFax()});
		      if(add==1)
		      {
		    	 
		    	  add1=true;
		      }
		      return add1;
		  }
}

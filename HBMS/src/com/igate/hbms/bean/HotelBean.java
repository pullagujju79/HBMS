/**
 * 
 */
package com.igate.hbms.bean;


//import javax.validation.constraints.Size;

import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

/**
 * @author HBMS_team4
 *
 */

/************************************************************************************************
 *Class Name:HotelBean
 *@author HBMS_team4
 *Description:HotelBean Entity that holds the data members related to Hotel 
 *Date:12/03/2014
 *************************************************************************************************/
@Component
public class HotelBean {
	
	
	
	
	@NotEmpty(message="hotel Id is mandatory")//validating hotelId
	@Pattern(regexp = "^[a-zA-Z0-9]{4}", message = "Invalid Hotel ID, it should be of only 4 digits")
	private String hotelID;
	
	@NotEmpty(message="City is mandatory")//validating City
	@Pattern(regexp = "^[a-zA-Z ]+", message = "Invalid city, it should contain only alphabets")
	private String city;
	
	@NotEmpty(message="Hotel Name is mandatory")//validating Hotel Name
	@Pattern(regexp = "^[a-zA-Z ]+", message = "Invalid Hotel Name, it should contain only alphabets")
	private String hotelName;
	
	@NotEmpty(message="Address is mandatory")//validating Address
	@Pattern(regexp = "^[a-zA-Z0-9#@,. ]+", message = "Invalid Hotel Address, it can have alphabets with @#.,")
	private String address;
	
	@NotEmpty(message="Description is mandatory")//validating Address
	@Pattern(regexp = "^[a-zA-Z0-9#@-_ ]+", message = "Invalid Hotel Description, it can have alphabets with @#-_")
	private String description;
	
	
	private double avgRatePerNight;
	
	@NotEmpty(message="Phone number is mandatory")//validating Address
	@Pattern(regexp = "^[0-9]{10}", message = "Phone Number should be of max 10 characters and only numbers")
	private String phoneNo1;
	
	@NotEmpty(message="Phone number is mandatory")//validating Address
	@Pattern(regexp = "^[0-9]{10}", message = "Phone Number should be of max 10 characters and only numbers")
	private String phoneNo2;
	
	@NotEmpty(message="Rating is mandatory")//validating Address
	@Pattern(regexp = "^[*]{0,5}", message = "Rating should be of max 5 characters,and only charactor '*' ")
	private String rating;
	
	@NotEmpty(message="Email id is mandatory")//validating email-id with regular expression
	@Pattern(regexp = "[a-z A-Z 0-9]+[@][a-z]+[.][a-z]+", message ="Invalid Email id,Ex:navin@gmail.com")
	private String email;
	
	@NotEmpty(message="Fax is mandatory")//validating Hotel ID
	@Pattern(regexp = "^[0-9]+", message = "Invalid Fax, it can have only numbers")
	private String fax;
	
	public double getAvgRatePerNight() {
		return avgRatePerNight;
	}
	public void setAvgRatePerNight(double avgRatePerNight) {
		this.avgRatePerNight = avgRatePerNight;}
	
	public String getHotelID() {
		return hotelID;
	}
	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String getPhoneNo1() {
		return phoneNo1;
	}
	public void setPhoneNo1(String phoneNo1) {
		this.phoneNo1 = phoneNo1;
	}
	public String getPhoneNo2() {
		return phoneNo2;
	}
	public void setPhoneNo2(String phoneNo2) {
		this.phoneNo2 = phoneNo2;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}

}

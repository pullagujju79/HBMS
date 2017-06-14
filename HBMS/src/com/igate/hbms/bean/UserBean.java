package com.igate.hbms.bean;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class UserBean {
	
	
	
	
	
	@NotEmpty(message="FirstName is mandatory")
	@Pattern(regexp = "^[A-Za-z]{0,20}", message ="Invalid Name")
	private String userFirstName;
	
	@NotEmpty(message="LastName is mandatory")
	@Pattern(regexp = "^[A-Za-z]{0,20}", message ="Invalid Name")
	private String userLastName;
	
	@NotEmpty(message="Password is mandatory")
	@Pattern(regexp = "^[a-zA-Z0-9_.@$#%*]{6,25}", message ="Invalid Password")
	private String password;
	
	
	private String role;
	
	
	@NotEmpty(message="Address is mandatory")
	@Pattern(regexp = "^[A-Za-z]{1,25}", message ="Invalid Address")
	@Size(max=25,message="Address should be within 25 characters ")
	private String address;
	
	
	@NotEmpty(message="Email Id is mandatory")
	@Pattern(regexp = "[a-zA-Z][a-zA-Z0-9._]*@[a-zA-Z]+[.][a-z]{2,3}", message ="Invalid EmailID")
	private String emailID;
	
	
	@NotEmpty(message="Gender is mandatory")
	private String gender;
	
	
	@NotEmpty(message="City is mandatory")
	@Pattern(regexp = "[a-zA-Z]{1,15}", message ="Invalid City")
	private String city;
	
	
	@NotEmpty(message="Pincode is mandatory")
	@Pattern(regexp = "[0-9]{6}", message ="Invalid Pincode")
	private String pincode;
	
	
	@NotEmpty(message="State is mandatory")
	@Pattern(regexp = "[A-Za-z]{1,15}", message ="Invalid State")
	private String state;
	
	
	@NotEmpty(message="Mobile is mandatory")
	@Pattern(regexp = "[0-9]{10}", message ="Invalid Mobile")
	private String mobile;
	
	

	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	//Generating Getters and Setters
	
	
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
}

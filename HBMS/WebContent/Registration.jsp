<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CheapStays</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../resource/css/style.css" rel="stylesheet" type="text/css" />
<link href="../resource/css/layout.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../resource/js/Validate1.js"></script>
<script src="../resource/js/maxheight.js" type="text/javascript"></script>
<!--[if lt IE 7]>
<link href="ie_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="ie_png.js"></script>
<script type="text/javascript">ie_png.fix('.png, #header .row-2, #header .nav li a, #content, .gallery li');</script>
<![endif]-->
</head>
<body id="page1" onload="new ElementMaxHeight();">
<div id="main">
  <!-- header -->
  <div id="header">
    <div class="row-1">
      <div class="wrapper">
        <div class="logo">
          <h1><a href="#">PARADISE</a></h1>
          <em>Hotel</em> <strong>True Luxury</strong> </div>
      </div>
    </div>
    <div class="row-2">
      <div class="indent">
        <!-- header-box begin -->
        <div class="header-box">
          <div class="inner">
            <ul class="nav">
              <li><a href="index.jsp" class="current">Home page</a></li>
              <li><a href="../services.jsp">Services</a></li>
              <li><a href="../gallery.jsp">Gallery</a></li>
              <li><a href="../restaurant.jsp">Restaurant</a></li>
              <li><a href="showLogin.htm">Booking</a></li>
			  <li><a href="../contactUs.jsp">Contact Us</a></li>
            </ul>
          </div>
        </div>
        <!-- header-box end -->
      </div>
    </div>
  </div>
  <!-- content -->
  <div id="content">

<center>
<form:form action="register.htm" modelAttribute="userBean" method="post" onsubmit="return validate()">

<table  align="center" >
<tr><td>
FIRSTNAME<font color="red">*</font>:	</td><td>  
            <form:input path="userFirstName" id="123" onblur="validateFirstName()"/>
            <form:errors path="userFirstName" cssStyle="color:red"/>
            <span id="errorMsg4" style="color:red"></span></td></tr>
<tr><td>
LASTNAME<font color="red">*</font>: </td><td>    
            <form:input path="userLastName" id="000" onblur="validateLastName()"/>
            <form:errors path="userLastName" cssStyle="color:red"/>
            <span id="errorMsg11" style="color:red"></span></td></tr>
<tr><td>
PASSWORD<font color="red">*</font>: </td><td>
            <form:password path="password" id="234" onblur="validatePassword()"/>
            <form:errors path="password" cssStyle="color:red"/>
            <span id="errorMsg5" style="color:red"></span></td></tr>
<tr><td>
GENDER<font color="red">*</font>:  </td><td> 

      <form:radiobutton path="gender"  value="m" onblur="validateGender()"/>MALE
	  <form:radiobutton path="gender"  value="f"/>FEMALE
	  <form:errors path="gender" cssStyle="color:red"/>
	  <span id="errorMsg3" style="color:red"></span></td></tr>
<tr><td>
Address<font color="red">*</font>:  </td><td> 
           <form:textarea path="address" cols="15"rows="5" onblur="validateAddress()"/>
           <form:errors path="address" cssStyle="color:red"/>
           <span id="errorMsg2" style="color:red"></span></td></tr>
  <tr><td>	
CITY<font color="red">*</font>:    </td><td>    
            <form:input path="City" id="789" onblur="validateCity()"/>
            <form:errors path="City" cssStyle="color:red"/>
            <span id="errorMsg8" style="color:red"></span></td></tr>
          <tr><td>   
PINCODE<font color="red">*</font>:   </td><td> 
             <form:input path="pincode" id="890" onblur="validatePincode()"/>
             <form:errors path="pincode" cssStyle="color:red"/>
              <span id="errorMsg9" style="color:red"></span></td></tr>
  <tr><td>           
STATE<font color="red">*</font>:   </td><td>   
             <form:input path="state" id="901" onblur="validateState()"/>
             <form:errors path="state" cssStyle="color:red"/>
             <span id="errorMsg10" style="color:red"></span></td></tr>
  <tr><td>          
EMAILID<font color="red">*</font>: </td><td>  
            <form:input path="emailID" id="345" onblur="validateEmail()"/>
            <form:errors path="emailID" cssStyle="color:red"/>
            <span id="errorMsg6" style="color:red"></span></td></tr>
<tr><td>
MOBILE<font color="red">*</font>:   </td><td>  
            <form:input path="Mobile" id="456" onblur="validateMobile()"/>
	          <form:errors path="Mobile" cssStyle="color:red"/>
            <span id="errorMsg7" style="color:red"></span></td></tr>	  
<tr><td align="center" colspan="2">

   <input type="submit" name="module" value="Register"/> <input type="reset" value="Reset"/> </td></tr>
	
	</table>
</form:form>

</center>
 </div>
  <!-- footer -->
  <div id="footer">
    <div class="wrapper">
      <div class="fleft">Copyright &copy; 2014 All Rights Reserved</div>
      <div class="fright">Designed by Team4</div>
    </div>
  </div>
</div>
</body>
</html>
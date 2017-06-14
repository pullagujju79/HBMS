<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<head>
<title>CheapStays| Restaurant</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../resource/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../resource/js/Validate5.js"></script>
<link href="../resource/css/layout.css" rel="stylesheet" type="text/css" />
<script src="resource/js/maxheight.js" type="text/javascript"></script>
<!--[if lt IE 7]>
<link href="ie_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="ie_png.js"></script>
<script type="text/javascript">ie_png.fix('.png, #header .row-2, #header .nav li a, #content, .gallery li');</script>
<![endif]-->
</head>
<body id="page4" onload="new ElementMaxHeight();">
<div id="main">
  <!-- header -->
  <div id="header" class="small">
    <div class="row-1">
      <div class="wrapper">
        <div class="logo">
          <h1><a href="#">PARADISE</a></h1>
          <em>Hotel</em> <strong>True Luxury</strong> </div>
        
      </div>
    </div>
    <div class="row-2 alt">
      <div class="indent">
        <!-- header-box-small begin -->
        <div class="header-box-small">
          <div class="inner">
            <ul class="nav">
              <li><a ></a></li>
            
              <li><a ></a></li>
              <li><a href="HbmsController" class="current">Modify Hotels</a></li>
              <li><a href="modifyRoomsHome.jsp">Modify Rooms</a></li>
              <li><a href="user/prepareReportBean.htm">View Reports</a></li>
              <li><a href="../thanks.jsp">Logout</a></li>
            </ul>
          </div>
        </div>
        <!-- header-box-small end -->
      </div>
    </div>
  </div>
  <!-- content -->
  <div id="content">
  

<form:form action="updateHotel.htm" modelAttribute="hotelDetails" onsubmit="return validate()">
<table>

<tr>
<td>Hotel ID<font color="red">*</font>:</td><td><form:input path="hotelID" readonly="true"></form:input><form:errors path="hotelID" ></form:errors></td>
</tr>

<tr>
<td>City<font color="red">*</font>:</td><td><form:input path="city" id="city" onblur="validateCity()"></form:input><form:errors path="city" ></form:errors></td>
<td><span id="errorMsg2" style="color:red"></span></td>
</tr>

<tr>
<td>Hotel Name<font color="red">*</font>:</td><td><form:input path="hotelName"  id="hotelName" onblur="validateName()"></form:input><form:errors path="hotelName"></form:errors></td>
<td><span id="errorMsg3" style="color:red"></span></td>
</tr>

<tr>
<td>Address<font color="red">*</font>:</td><td><form:input path="address" id="address" onblur="validateAddress()"></form:input><form:errors path="address"></form:errors></td>
<td><span id="errorMsg4" style="color:red"></span></td>
</tr>

<tr>
<td>Description<font color="red">*</font>:</td><td><form:input path="description" id="description" onblur="validateDescription()"/><form:errors path="description"></form:errors></td>
<td><span id="errorMsg5" style="color:red"></span></td>
</tr>

<tr>
<td>Average Rate per Night(Rs.)<font color="red">*</font>:</td><td><form:input path="avgRatePerNight" id="avgrate" onblur="validateRate()"/><form:errors path="avgRatePerNight"></form:errors></td>
<td><span id="errorMsg6" style="color:red"></span></td>
</tr>

<tr>
<td>Phone Number1<font color="red">*</font>:</td><td><form:input path="phoneNo1" id="phnno1" onblur="validatephone1()"/><form:errors path="phoneNo1"></form:errors></td>
<td><span id="errorMsg7" style="color:red"></span></td>
</tr>

<tr>
<td>Phone Number2<font color="red">*</font>:</td><td><form:input path="phoneNo2" id="phnno2"  onblur="validatephone2()"/><form:errors path="phoneNo2"></form:errors></td>
<td><span id="errorMsg8" style="color:red"></span></td>
</tr>

<tr>
<td>Rating<font color="red">*</font>:</td><td><form:input path="rating" id="rating" onblur="validateRating()"/><form:errors path="rating"></form:errors></td>
<td><span id="errorMsg9" style="color:red"></span></td>
</tr>

<tr>
<td>Email Address<font color="red">*</font>:</td><td><form:input path="email" id="email" onblur="validateEmail()"/><form:errors path="email"></form:errors></td>
<td><span id="errorMsg10" style="color:red"></span></td>
</tr>

<tr>
<td>Fax<font color="red">*</font>:</td><td><form:input path="fax" id="fax" onblur="validateFax()"/><form:errors path="fax"></form:errors></td>
<td><span id="errorMsg11" style="color:red"></span></td>
</tr>


</table>

     <input type="submit" value="Update" /><a href=showModifyHotel.htm>Back</a>
     <font color="red">${message}</font>
      <font color="red">${error}</font>
     
</form:form>


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
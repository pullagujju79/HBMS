<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>
<title>CheapStays| Restaurant</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../resource/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../resource/js/Validate.js"></script>
<link href="../resource/css/layout.css" rel="stylesheet" type="text/css" />
<script src="../resource/js/maxheight.js" type="text/javascript"></script>
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
              <li><a href="../modifyHotelsHome.jsp">Modify Hotels</a></li>
              <li><a href="HbmsController?module=modifyRooms" class="current">Modify Rooms</a></li>
              <li><a href="prepareReportBean.htm">View Reports</a></li>
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


<c:set var="selectedCity" value="${selectedCity}" />
<c:set var="selectedHotel" value="${selectedHotel}"/>


<h2 align="center">Add your Room</h2>

<form action="getHotelsByCity.htm">
<table align="center">
<tr>
<td>Location*:</td>
<td>
<select name="location"  onblur="validateLocation()" onchange="this.form.submit()">
<option value="">Select Location</option>
<c:forEach items="${cityList}" var="city">
<c:choose>
<c:when test="${selectedCity!=null && selectedCity==city.city}">
<option value="${city.city}" selected>${city.city}</option>
</c:when>
<c:otherwise>
<option value="${city.city}">${city.city}</option>
</c:otherwise>
</c:choose>
</c:forEach>

</select>

</td>
<td>
<span id="errorMsg1" style="color:red"></span>
</td>
</tr>

<tr>
<td>Hotel Name*:</td>
<td>
<select name="hotel"  onblur="validateHotel()" onchange="this.form.submit()">
<option value="">Select Hotel</option>
<c:forEach items="${hotelList}" var="hotel">
<c:choose>
<c:when test="${selectedHotel!=null && selectedHotel==hotel.HOTEL_NAME}">
<option value="${hotel.HOTEL_NAME}" selected>${hotel.HOTEL_NAME}</option>
</c:when>
<c:otherwise>
<option value="${hotel.HOTEL_NAME}">${hotel.HOTEL_NAME}</option>
</c:otherwise>
</c:choose>
</c:forEach>

</select>
</td>
<td>
<span id="errorMsg1" style="color:red"></span>
</td>
</tr>
</table>
</form>


<c:url var="myAction" value="addRoomDetails.htm" />


<form:form method="post" modelAttribute="roomDetailsBean"
	action="${myAction}" >
	
	
<table align="center">

<tr><td>Hotel ID*</td>
<td><form:input path="hotelId" readonly="true" ></form:input></td>
</tr>
<tr>
<tr>
<td>Room Number*:</td>
<td><form:input path="roomNo" onblur="validateRoomNumber()"/>
<form:errors path="roomNo" cssStyle="color:red"></form:errors></td>
<td>
<span id="errorMsg3" style="color:red"></span>
</td>
</tr>

<tr>
<td>Room Type*:</td>
<td>
<form:select path="roomType" onblur="validateRoomType()">
				<form:option value="" label="Please Select" />
				<form:options items="${roomType}" />
			</form:select><form:errors path="roomType" cssStyle="color:red"></form:errors>
</td>
<td>
<span id="errorMsg4" style="color:red"></span>
</td>
</tr>


<tr>
<td>Average Rate*:</td>
<td><form:input path="perNightRate" onblur="validateRate()"/><form:errors path="perNightRate"
				cssStyle="color:red"></form:errors></td>
<td>
<span id="errorMsg5" style="color:red"></span>
</td>
</tr>
<tr><td align="center" colspan="2"><input type="submit" name="module" value="Add Room"></td></tr>

</table>

<h3 align="center"><span style="color:red" >${message}</span></h3>
<input type="hidden" value="Add" name="task"/>

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
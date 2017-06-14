<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<head>
<title>CheapStays| Restaurant</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../resource/css/style.css" rel="stylesheet" type="text/css" />
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
              <li><a href="showModifyHotel.htm" class="current">Modify Hotels</a></li>
             
              <li><a href="../modifyRoomsHome.jsp">Modify Rooms</a></li>
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
  

<center>
<h2>Welcome Admin</h2>
<h3>Displaying All Hotels</h3>
<table border="2" align="center">
<tr>
<th>Hotel ID</th>
<th>Hotel City</th>
<th>Hotel Name</th>
<th>Hotel Address</th>
<th>Hotel Description</th>
<th>Average Rate Per Night</th>
<th>Phone No1</th>
<th>Phone No2</th>
<th>Rating</th>
<th>Email ID</th>
<th>Fax NO</th>
</tr>

<c:forEach var="hotel" items="${hotellist}">




<tr>
<td align="center">${hotel.hotelID}</td>
<td align="center">${hotel.city}</td>
<td align="center">${hotel.hotelName}</td>
<td align="center">${hotel.address}</td>
<td align="center">${hotel.description}</td>
<td align="center">${hotel.avgRatePerNight}</td>
<td align="center">${hotel.phoneNo1}</td>
<td align="center">${hotel.phoneNo2}</td>
<td align="center">${hotel.rating}</td>
<td align="center">${hotel.email}</td>
<td align="center">${hotel.fax}</td>
<td>

<form action="delete.htm">
<input type="hidden" value="${hotel.hotelID}" name="hotelid"/>
<input type="submit" value="Delete" />
</form>
</td>
</tr>

</c:forEach>
</table>
<!-- 
<font color="red">${error }</font>
<form action="showModifyHotel.htm">
<input type="submit" value="Modify Hotel"/>
</form>
<form action="showAddHotel.htm">
<input type="submit" value="Add Hotel"/>
</form> -->


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
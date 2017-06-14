<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CheapStays</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../resource/css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../resource/js/validate3.js"></script>
<link href="../resource/css/layout.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../resource/js/validate3.js"></script>
<script src="../resource/css/maxheight.js" type="text/javascript"></script>
<!--[if lt IE 7]>
<link href="ie_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="ie_png.js"></script>
<script type="text/javascript">ie_png.fix('.png, #header .row-2, #header .nav li a, #content, .gallery li');</script>
<![endif]-->
<script type="text/javascript" src="resouce/js/Login.js"></script>
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
              <li><a ></a></li>
              <li><a ></a></li>
              <li><a ></a></li>
              <li><a ></a></li>
              
              <li><a ></a></li>
			  <li><a href="../thanks.jsp">Logout</a></li>
            </ul>
          </div>
        </div>
        <!-- header-box end -->
      </div>
    </div>
  </div>
  <!-- content -->
  <div id="content">


<h3 align="center" style="color='blue'"><b>Room Details</b></h3>
<c:set var="detailsList" value="${requestScope.roomDetails}"/>
<table border="1"  align="center" >
<tr>
<th>Hotel Id</th>
<th>Room ID</th>
<th>Room Number</th>
<th>Room Type</th>
<th>Per Night Rate</th>
<th>Availability</th>
</tr>
<c:forEach var="roomList" items="${detailsList}" varStatus="loopCount">
<tr><td>${roomList.hotelId }</td>
<td>${roomList.roomId }</td>
<td>${roomList.roomNo }</td>
<td>${roomList.roomType }</td>
<td>${roomList. perNightRate }</td>
<td>${roomList.availability }</td>
<td><c:if test="${roomList.availability=='Available'}">
<form action="registerRoom.htm">
<input type="hidden" value="${loopCount.count}" name="loop"></input>
<input type="hidden" value="${roomList.roomId }" name="RoomID"></input>
<input type="hidden" value="${roomList.perNightRate }" name="nightRate"/>
<input type="submit" value="Submit" name="module"></input>
</form></c:if><c:if test="${roomList.availability=='UnAvailable'}">Booked</c:if></td>

</c:forEach>
</table>
<a href="showSearchHotel.htm">Back</a>
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



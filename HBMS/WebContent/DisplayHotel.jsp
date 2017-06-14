<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CheapStays</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../resource/css/style.css" rel="stylesheet" type="text/css" />
<link href="../resource/css/layout.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="validateLocation.js"></script>
<script src="resource/css/maxheight.js" type="text/javascript"></script>
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

<br></br>
<br></br>
<center>
<form>
<table border="1" cellpadding="6" cellspacing="2">
<tr>
<th>City</th>
<th>HotelName</th><th>Address</th><th>DESCRIPTION</th>
<th>PHONE_NO1</th><th>PHONE_NO2</th><th>RATING </th><th>EMAIL</th><th>FAX</th>
</tr>
<c:forEach var="hotelList" items="${hotelList}" varStatus="count">
<tr>
<td align="center">${hotelList.city}</td>
<td align="center" ><a href="showRoom.htm?hotelId=${hotelList.hotelID}">${hotelList.hotelName}</a></td>
<td align="center">${hotelList.address}</td>
<td align="center">${hotelList.description}</td>
<td align="center">${hotelList.phoneNo1}</td>
<td align="center">${hotelList.phoneNo2}</td>
<td align="center">${hotelList.rating}</td>
<td align="center">${hotelList.email}</td>
<td align="center">${hotelList.fax}</td>
<td>

</td>
</tr>

</c:forEach>

</table> 
</form>

</center>
<br></br>
<br></br>
</div>
   
  <div id="footer">
    <div class="wrapper">
      <div class="fleft">Copyright &copy; 2014 All Rights Reserved</div>
      <div class="fright">Designed by Team4</div>
    </div>
  </div>
</div>
</body>
</html>
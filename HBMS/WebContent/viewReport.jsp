<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
	<%@taglib uri="http://displaytag.sf.net" prefix="display" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CheapStays</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="../resource/css/style.css" rel="stylesheet" type="text/css" />
<link href="../resource/css/layout.css" rel="stylesheet" type="text/css" />
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
              <li><a href="../modifyHotelsHome.jsp">Modify Hotels</a></li>
              <li><a href="../modifyRoomsHome.jsp">Modify Rooms</a></li>
              
              <li><a href="user/prepareReportBean.htm" class="current">View Reports</a></li>
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
  <center>
 <c:if test="${reportList!=null}">
<display:table cellpadding="6" requestURI="prepareReportBean.htm" id="reportList" export="false" defaultsort="3" name="reportList" pagesize="5">
<h2 align="center"><font color="green">DISPLAY ORDER DETAILS BY DATE</font></h2>
<th>HOTEL NAME</th>
<display:column property="HOTEL_NAME" sortable="false" />
<th>USER NAME</th>
<display:column property="USER_FIRSTNAME" sortable="false" />
<th>BOOKED FROM</th>
<display:column property="BOOKED_FROM" sortable="false" />
<th>BOOKED TO</th>
<display:column property="BOOKED_TO" sortable="false" />
<th>ROOM ID</th>
<display:column property="ROOM_ID" sortable="false" />
<th>ROOM NUM</th>
<display:column property="ROOM_NO" sortable="false" />
</display:table>
</c:if>
</center>
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
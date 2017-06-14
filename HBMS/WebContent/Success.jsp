<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CheapStays</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link href="../resource/css/tcal.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css"
	href="resource/css/contentslider.css" />
<script type="text/javascript" src="../resource/js/contentslider.js"></script>
<script type="text/javascript" src="../resource/js/tcal.js"></script>
<script type="text/javascript" src="../resource/js/validate3.js"></script>


<link href="../resource/css/style.css" rel="stylesheet" type="text/css" />
<link href="../resource/css/layout.css" rel="stylesheet" type="text/css" />
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
<br></br>
<h3 align="center">Booked successfully</h3>
<h2><c:set var="RoomId" value="${RoomID}"/></h2>
<h2><c:set var="amount" value="${Amount}"/></h2>
Your Room ID ${RoomId}
<br></br>
Amount in Rs ${amount}
<br></br>
<br></br>
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
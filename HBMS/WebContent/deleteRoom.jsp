<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<head>
<title>CheapStays| Restaurant</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="resource/css/style.css" rel="stylesheet" type="text/css" />
<link href="resource/css/layout.css" rel="stylesheet" type="text/css" />
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
              <li><a href="modifyHotelsHome.jsp">Modify Hotels</a></li>
              <li><a href="modifyRoomsHome.jsp" class="current">Modify Rooms</a></li>
              <li><a href="user/prepareReportBean.htm">View Reports</a></li>
              <li><a href="thanks.jsp">Logout</a></li>
            </ul>
          </div>
        </div>
        <!-- header-box-small end -->
      </div>
    </div>
  </div>
  <!-- content -->
  <div id="content">
  
  <CENTER>
<c:url var="myAction" value="user/deleteRoom.htm" />
<form action="${myAction}" >
<h3 align="center">Delete Room</h3>
<table>
<tr><td>Enter Room ID<font color="red">*</font>:</td>
<td><input type="text" name="delRoom"></input></td></tr>
<tr><td align="center" colspan="2"><input type="submit" name="module" value="delete"></td></tr>
</table>
 
</form>
</CENTER>
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
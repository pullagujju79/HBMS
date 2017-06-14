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
<script src="../resource/css/maxheight.js" type="text/javascript"></script>
<!--[if lt IE 7]>
<link href="ie_style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="ie_png.js"></script>
<script type="text/javascript">ie_png.fix('.png, #header .row-2, #header .nav li a, #content, .gallery li');</script>
<![endif]-->
<script type="text/javascript" src="../resource/js/Login.js"></script>
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
              <li><a href="../index.jsp">Home page</a></li>
              <li><a href="../services.jsp">Services</a></li>
              <li><a href="../gallery.jsp">Gallery</a></li>
              <li><a href="../restaurant.jsp">Restaurant</a></li>
              <li><a href="showLogin.htm" class="current">Booking</a></li>
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
 <br></br>
  <br></br>
<form:form action="login.htm" method="post" modelAttribute="userBean">
<table align="center"><tr><td>
Enter UserName<font color="red">*</font>:</td><td>
	
            <form:input path="userFirstName" id="345" onblur="validateName()"/>
            <form:errors path="userFirstName" cssStyle="color:red"/>
           <span id="errorMsg1" style="color:red"></span></td>
</tr>

<tr><td>
Enter Your password<font color="red">*</font>:</td><td>
 
           <form:password path="password" id="234" onblur="validatePassword()"/>
           <form:errors path="password" cssStyle="color:red"/>
           <span id="errorMsg2" style="color:red"></span>
</td>
</tr><tr><td colspan="2" align="center">

<input type="submit" value="Submit"/><input type="reset"value="Reset">

</td></tr>
</table>
</form:form>
<table align="center"><tr><td>
<form:form action="Register.htm" method="post">
<input type="submit" name="module" value="New Registration"></input>

</form:form>
</td></tr>
<tr><td colspan="2" align="center"><font>${requestScope.message }</font></td></tr>
</table>
 <br></br>
  <br></br>
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
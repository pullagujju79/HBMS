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



<h3 align="center"><font color="red">Hotel Reservation</font></h3>

		<c:url var="url" value="bookRoom.htm"></c:url>
<form:form action="${url}" modelAttribute="RoomTypeBean"  onsubmit="return validate()">

<table align="center" border="1" bgcolor="white">
<tr><td>Reserved By<font color="red">*</font>: </td><td><input type="text" id="reservedBy" onblur="validateReservedBy()"></input>
                         <span id="errorMsg1" style="color:red"></span></td></tr>
  
<tr>

			<td>Check-in Date<font color="red">*</font>:</td>
			<td><form:input path="fromDate"  cssClass="tcal" id="check-in" onblur="validateFromDate()"/></td>
			<td><span id="errorcheckin" style="color: red"></span><form:errors path="fromDate" cssStyle="color:red"/></td>
	</tr>
	<tr><!--<input type="date"></input>
		--><td>Check-Out Date<font color="red">*</font>:</td>
		<td><form:input path="toDate"  
			 readonly="true" cssClass="tcal" id="check-out"  onblur="validateToDate()"/></td>
		<td><span id="errorCheckout" style="color: red"></span><form:errors path="toDate" cssStyle="color:red"/></td>
	</tr>

<tr><td>Room ID<font color="red">*</font>:<td><form:input path="roomId" ></form:input></td></tr>
<tr><td>Per Night Rate<font color="red">*</font>:<td><form:input path="perNightRate" ></form:input></td></tr>
<tr><td>No of Adults<font color="red">*</font>: </td><td><form:input path="noOfAdults" id="adults" onblur="validateNoOfAdults()"/>
		<span id="errorMsg4" style="color:red"></span><form:errors path="noOfAdults" cssStyle="color:red"/></td></tr>
<tr><td>No of Children<font color="red">*</font>: </td><td> <form:input path="noOfChildren" id="children" onblur="validatNoOfChildern()"/>
	<span id="errorMsg5" style="color:red"></span><form:errors path="noOfChildren" cssStyle="color:red"/></td></tr>
<tr><td colspan="2" align="center"><input type="hidden" name="module" value="AddReservation"/>
				
                           <input type="submit" value="Add Reservation" name="module" ></input></td></tr>
                        
</table>
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

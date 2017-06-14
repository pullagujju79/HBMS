

function validate() {
	var result;
	result=false;
    //clearErrorMsgs();
	var status1;
	var status2;
	var status3;
	var status4;
	var status5;
	
    var result = false;
    status1=validateLocation();
    status2=validateHotelName();
    status3=validateRoomNumber();
    status4=validateRoomType();
    status5=validateRate();
    
    
    
    if(status1&&status2&&status3&&status5){result=true;}
    return result;
}



function validateRoomNumber()
{
	var str=document.getElementById("roomNo").value;
	var pat=/[1-9][0-9]{2}/;
	
	if(str.match(pat)== null)
	{
	
		document.getElementById("errorMsg3").innerHTML="Invalid Room Number";
	}
	else
	{
		document.getElementById("errorMsg3").innerHTML="";
		return true;
	}
}

function validateRate(){
	var str=document.getElementById("perNightRate").value;
	var pat=/[0-9]{3,4}/;
	
	if(str.match(pat)== null)
	{
	
		document.getElementById("errorMsg5").innerHTML="Invalid Room Rate";
	}
	else
	{
		document.getElementById("errorMsg5").innerHTML="";
		return true;
	}
}
function validateLocation(){
	var str=document.getElementById("location").value;
	
	
	if(str.length==0)
	{
	
		document.getElementById("errorMsg1").innerHTML="Please select location";
	}
	else
	{
		document.getElementById("errorMsg1").innerHTML="";
		return true;
	}
}
function validateHotel(){
	var str=document.getElementById("hotel").value;
	
	
	if(str.length==0)
	{
	
		document.getElementById("errorMsg2").innerHTML="please select hotel name";
	}
	else
	{
		document.getElementById("errorMsg2").innerHTML="";
		return true;
	}
}
function validateRoomType(){
	var str=document.getElementById("roomType").value;
	
	
	if(str.length==0)
	{
	
		document.getElementById("errorMsg4").innerHTML="Please select room type";
	}
	else
	{
		document.getElementById("errorMsg4").innerHTML="";
		return true;
	}
}







function validateLocation(){
	var str=document.getElementById("city").value;
	
	
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

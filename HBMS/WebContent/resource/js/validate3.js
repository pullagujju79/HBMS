

function validateReservedBy()
{
	var str=document.getElementById("reservedBy").value;
	var pat="^[A-Z,a-z]{1,20}$";
	
	if(!str.match(pat))
	{
	
		document.getElementById("errorMsg1").innerHTML="Enter Your Name";
	}
	else
	{
		document.getElementById("errorMsg1").innerHTML="";
		return true;
	}
}



function validatNoOfChildern()
{
	var str=document.getElementById("children").value;
	var pat="^[0-3]{1}$";
	
	if(!str.match(pat))
	{
	
		document.getElementById("errorMsg5").innerHTML="Please Specify No Of Childern";
	}
	else
	{
		document.getElementById("errorMsg5").innerHTML="";
		return true;
	}
	
}

function validateNoOfAdults()
{
	var str=document.getElementById("adults").value;
	var pat="^[1-3]{1}$";
	
	if(!str.match(pat))
	{
	
		document.getElementById("errorMsg4").innerHTML="Please Specify No Of Adults";
	}
	else
	{
		document.getElementById("errorMsg4").innerHTML="";
		return true;
	}
	
}


function fromDate()
{
	
	if (document.getElementById("check-in").value == "")
	{
		document.getElementById("errorcheckin").innerHTML="Please fill from date";	

	} 
	else
	{
		document.getElementById("errorcheckin").innerHTML="";
		return true;
	}
}


function toDate()
{
	
	if (document.getElementById("check-out").value == "")
	{
		document.getElementById("errorcheckout").innerHTML="Please fill to date";	

	} 
	else
	{
		document.getElementById("errorcheckout").innerHTML="";
		return true;
	}
}


function validate()
{
	
	var result;
	
	 if( validateReservedBy()&&validatNoOfChildern()&&fromDate()&&toDate()&&validateNoOfAdults())
	 {
		
		 result=true;
		
      	}
	 else{
		 result=false;
}
	
	 return result;
	
}

function validateForm() {
	var	flag = false;
	var flag2 = false;






	if(document.getElementById("city").value=="")
	{
		flag=false;
		document.getElementById("error").innerHTML="Please fill all the details";
	}
	else
	{
		flag=true;
		document.getElementById("error").innerHTML="";
	}
	if(flag==true)
	{
		if(document.getElementById("hotel").value=="")
		{
			flag=false;
			document.getElementById("error").innerHTML="Please fill all the details";
		}
		else
		{
			flag=true;
			document.getElementById("error").innerHTML="";
		}
	}
	if(flag==true)
	{

		var checkInYear = document.getElementById("check-in").value.split("-")[0];
		var checkInMonth = document.getElementById("check-in").value.split("-")[1];
		var checkInDate = document.getElementById("check-in").value.split("-")[2];

		var intDate = parseInt(checkInDate);
		var intMonth = parseInt(checkInMonth);
		var intYear = parseInt(checkInYear);

		var date = new Date();
		if (document.getElementById("check-in").value == "")
		{
			document.getElementById("error").innerHTML="Please fill all the details";	

		} 
		else if (intYear < date.getFullYear()
				|| intYear == date.getFullYear()
				&& intMonth < date.getMonth() + 1
				|| intYear == date.getFullYear()
				&& intMonth == date.getMonth() + 1 && intDate < date.getDate()) 
		{
			document.getElementById("error").innerHTML="";
			document.getElementById("errorcheckin").innerHTML = "Invalid checkIn date";
			flag=false;
		} 
		else 
		{
			flag=true;
			document.getElementById("error").innerHTML = "";
			document.getElementById("errorcheckin").innerHTML = "";
		}

	

	if(flag==true)
	{
		var checkInYear = document.getElementById("check-in").value.split("-")[0];
		var checkInMonth = document.getElementById("check-in").value.split("-")[1];
		var checkInDate = document.getElementById("check-in").value.split("-")[2];

		var intDate = parseInt(checkInDate);
		var intMonth = parseInt(checkInMonth);
		var intYear = parseInt(checkInYear);

		var checkOutYear = document.getElementById("check-out").value.split("-")[0];
		var checkOutMonth = document.getElementById("check-out").value.split("-")[1];
		var checkOutDate = document.getElementById("check-out").value.split("-")[2];

		if (document.getElementById("check-out").value == "")
		{
			document.getElementById("error").innerHTML="Please fill all the details";	
			flag = false;
		} 
		else if (checkOutYear < checkInYear || checkOutYear == checkInYear && checkOutMonth < checkInMonth ||checkOutYear == checkInYear && checkOutMonth ==checkInMonth && checkOutDate<checkInDate ) {
			document.getElementById("errorCheckout").innerHTML = "Invalid Check-Out date";
			document.getElementById("error").innerHTML="";	
			flag = false;
		} 

		else
		{
			flag=true;
			document.getElementById("error").innerHTML = "";
			document.getElementById("errorCheckout").innerHTML = "";
		}
	}
}
	if(flag==true)
	{
		if(document.getElementById("type").value=="")
		{
			flag=false;
			document.getElementById("error").innerHTML="Please fill all the details";
		}
		else
		{
			flag=true;
			document.getElementById("error").innerHTML="";
		}
	}
	if(flag==true)
	{
		var pat = /^[1-9]{1}$/;
		var str = document.getElementById("noOfAdults").value;

		if(str=="")
		{
			flag=false;
			document.getElementById("error").innerHTML="Please fill all the details";
		}

		else if(pat.test(str)==false)
		{
			flag=false;
			document.getElementById("errorAdult").innerHTML="Invalid No.Of Adults";
		}
		else
		{
			flag=true;
			document.getElementById("errorAdult").innerHTML="";
			document.getElementById("error").innerHTML="";
		}

	}
	if(flag==true)
	{
		var pat = /^[1-9]{1}$/;
		var str = document.getElementById("noOfChild").value;

		if(str=="")
		{
			document.getElementById("error").innerHTML="Please fill all the details";
		}
		else if(pat.test(str)==false)
		{
			flag=false;
			document.getElementById("errorChild").innerHTML="Invalid No.Of Children";

		}
		else
		{
			
			flag=true;
			document.getElementById("errorChild").innerHTML="";
			document.getElementById("error").innerHTML="";
		}

	}
	if(flag==true)
	{
		document.getElementById("frm").submit();

	}

}	
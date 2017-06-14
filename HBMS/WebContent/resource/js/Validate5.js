function validateHotelID()
{
	var str=document.getElementById("hotelID").value;
	
	
	if(!(str.match("^[a-zA-Z0-9]{4}$")))
	{
	
		document.getElementById("errorMsg").innerHTML="Invalid Hotel ID, it should be of only 4 digits";
		return false;
	}
	else
	{
		document.getElementById("errorMsg").innerHTML="";
		return true;
	}
}
	
	function validateCity(){
		
		var str=document.getElementById("city").value;
		
		
		if(!(str.match("^[a-zA-Z ]+$")))
		{
		
			document.getElementById("errorMsg2").innerHTML="Invalid city, it should contain only alphabets";
			return false;
		}
		else
		{
			document.getElementById("errorMsg2").innerHTML="";
			return true;
		}
		
	}
	
	function validateName(){
		
       var str=document.getElementById("hotelName").value;
		
		
		if(!(str.match("^[a-zA-Z ]+$")))
		{
		
			document.getElementById("errorMsg3").innerHTML="Invalid Hotel Name, it should contain only alphabets";
			return false;
		}
		else
		{
			document.getElementById("errorMsg3").innerHTML="";
			return true;
		}
		
		
	}
	
	function validateAddress(){
		
		  var str=document.getElementById("address").value;
			
			
			if(!(str.match("^[a-zA-Z0-9#@,. ]+$")))
			{
			
				document.getElementById("errorMsg4").innerHTML="Invalid Hotel Address, it can have alphabets with @#.,";
				return false;
			}
			else
			{
				document.getElementById("errorMsg4").innerHTML="";
				return true;
			}
		
	}
	
	function validateDescription(){
		

		  var str=document.getElementById("description").value;
			
			
			if(!(str.match("^[a-zA-Z0-9#@-_ ]+$")))
			{
			
				document.getElementById("errorMsg5").innerHTML="Invalid Hotel Description, it can have alphabets with @#-_";
				return false;
			}
			else
			{
				document.getElementById("errorMsg5").innerHTML="";
				return true;
			}
	}
	
	function validateRating(){
		
		var str=document.getElementById("rating").value;
		
		
		if(!(str.match("^[*]{0,4}$")))
		{
		
			document.getElementById("errorMsg9").innerHTML="Invalid Hotel Rating,can rate only with number of '*' max 5";
			return false;
		}
		else
		{
			document.getElementById("errorMsg9").innerHTML="";
			return true;
		}
		
	}
	
	function validateRate(){
		
		 var str=document.getElementById("avgrate").value;
			
			
			if(!(str.match("^[0-9.]+$")))
			{
			
				document.getElementById("errorMsg6").innerHTML="Invalid Rate, it can have only numbers";
				return false;
			}
			else
			{
				document.getElementById("errorMsg6").innerHTML="";
				return true;
			}
	}
	function validatephone1(){
		
		 var str=document.getElementById("phnno1").value;
			
			
			if(!(str.match("^[0-9]{10}$")))
			{
			
				document.getElementById("errorMsg7").innerHTML="Invalid phone number, it can have only 10 numbers";
				return false;
			}
			else
			{
				document.getElementById("errorMsg7").innerHTML="";
				return true;
			}
		
	}
	
	function validatephone2(){
		
		 var str=document.getElementById("phnno2").value;
			
			
			if(!(str.match("^[0-9]{10}$")))
			{
			
				document.getElementById("errorMsg8").innerHTML="Invalid phone number, it can have only 10 numbers";
				return false;
			}
			else
			{
				document.getElementById("errorMsg8").innerHTML="";
				return true;
			}
		
	}
	
	function validateEmail(){
		
		 var str=document.getElementById("email").value;
			
			
			if(!(str.match("^[a-z A-Z 0-9]+[@][a-z]+[.][a-z]+$")))
			{
			
				document.getElementById("errorMsg10").innerHTML="Invalid Email id,Ex:navin@gmail.com";
				return false;
			}
			else
			{
				document.getElementById("errorMsg10").innerHTML="";
				return true;
			}
		
	}
	
	function validateFax(){
		
		var str=document.getElementById("fax").value;
		
		
		if(!(str.match("^[0-9]+$")))
		{
		
			document.getElementById("errorMsg11").innerHTML="Invalid Fax, it can have only numbers";
			return false;
		}
		else
		{
			document.getElementById("errorMsg11").innerHTML="";
			return true;
		}
		
	}
	
	function validate()
	{
		
		var result;
		
		 if( validateCity()&&validateName()&&validateAddress()&&validateDescription()&&validateRating()&&validateRate()&&validatephone1()&&validatephone2()&&validateEmail()&& validateFax())
		 {
			
			 result=true;
			
          	}
		 else{
			 result=false;
	}
		
		 return result;
		
	}
	
	
	

function validateName()
{
	var str=document.getElementById("345").value;
	var pat1=/[a-z A-z]{1,20}/;
	
	if(str.match(pat1)== null)

	{
		
		document.getElementById("errorMsg1").innerHTML="Enter User Name";
	}
	else
	{	
		document.getElementById("errorMsg1").innerHTML="";
		return true;
	}
}
function validatePassword(){
	
	var str=document.getElementById("234").value;
	var pat1=/[a-z A-z 0-9_.$#%*@]{6,20}/;
	
	if(str.match(pat1)== null)

	{
		
		document.getElementById("errorMsg2").innerHTML="Enter Password";
	}
	else
	{	
		document.getElementById("errorMsg2").innerHTML="";
		return true;
	}	
	
}
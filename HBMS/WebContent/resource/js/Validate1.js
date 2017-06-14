

function validate() {
	var result;
	result=false;
    //clearErrorMsgs();
	var status1;
	var status2;
	var status3;
	var status4;
	var status5;
	var status6;
	var status7;
	var status8;
	var status9;
	var status10
    var result = false;
    status1=validateFirstName();
    status11=validateLastName();
    status6=validatePassword();
    status2=validateAddress();
    status3=validateGender();
    status5=validateCity();
    
    status7=validateEmail();
    status8=validateMobile();
    status9=validatePincode();
    status10=validateState();
    
    
    if(status1&&status2&&status3&&status5&&status6&&status7&&status8&&status9&&status10&&status11){result=true;}
    return result;
}


function validatePincode(){
	var str=document.getElementById("890").value;
	var pat=/[0-9]{6}/;
	
	if(str.match(pat)== null)
	{
	
		document.getElementById("errorMsg9").innerHTML="Enter Pincode";
	}
	else
	{
		document.getElementById("errorMsg9").innerHTML="";
		return true;
	}
}
function validateState(){
	var str=document.getElementById("901").value;
	var pat=/[A-Za-z]{1,15}/;
	
	if(str.match(pat)== null)
	{
	
		document.getElementById("errorMsg10").innerHTML="Enter valid state";
	}
	else
	{
		document.getElementById("errorMsg10").innerHTML="";
		return true;
	}
}


function validateAddress(){
	var address1;
	var status;
	address1=form1.address.value;
	if(address1.length==0){
		status=false;
		document.getElementById("errorMsg2").innerHTML="Enter address";
	}
	
	else{
		document.getElementById("errorMsg2").innerHTML="";
		status=true;
		
	}
	
	return status;
	
	
}


function validateGender(){
	var gender;
	var status;
	var i;
	var j=0;
	gender=document.getElementsByName("gender");
	
	for(i=0;i<gender.length;i++){
		if(gender[i].checked){j++;}
	if(j==0){status=false;
	document.getElementById("errorMsg3").innerHTML="Enter Gender";
	}
	else{status=true;
	document.getElementById("errorMsg3").innerHTML="";
	}
	}	
	return status;
	
}



function validateCity(){
	var str=document.getElementById("789").value;
	var pat=/[A-Za-z]{1,15}/;
	
	if(str.match(pat)== null)
	{
	
		document.getElementById("errorMsg8").innerHTML="Enter valid City";
	}
	else
	{
		document.getElementById("errorMsg8").innerHTML="";
		return true;
	}
	
	
}

function validateEmail()
{
	var str=document.getElementById("345").value;
	var pat=/[a-z A-z_.$#%\d]+[@][a-z A-z]+.[com co.in in]/;
	
	if(str.match(pat)== null)
	{
		
		document.getElementById("errorMsg6").innerHTML="Enter email";
	}
	else
	{
		document.getElementById("errorMsg6").innerHTML="";
		return true;
	}
}


function validateMobile()
{
	var str=document.getElementById("456").value;
	var pat=/[0-9]{10}/;
	
	if(str.match(pat)== null)
	{
	
		document.getElementById("errorMsg7").innerHTML="Enter mobile no";
	}
	else
	{
		document.getElementById("errorMsg7").innerHTML="";
		return true;
	}
	
}


function validateFirstName()
{
	var str=document.getElementById("123").value;
	var pat1=/[a-z A-z]{1,20}/;
	
	if(str.match(pat1)== null)

	{
		
		document.getElementById("errorMsg4").innerHTML="Enter first Name";
	}
	else
	{	
		document.getElementById("errorMsg4").innerHTML="";
		return true;
	}
}

function validateLastName()
{
	var str=document.getElementById("000").value;
	var pat1=/[a-z A-z]{1,20}/;
	
	if(str.match(pat1)== null)

	{
		
		document.getElementById("errorMsg11").innerHTML="Enter Last name";
	}
	else
	{	
		document.getElementById("errorMsg11").innerHTML="";
		return true;
	}
}
function validatePassword(){
	
	var str=document.getElementById("234").value;
	var pat1=/[a-z A-z 0-9_.$#%*@]{6,20}/;
	
	if(str.match(pat1)== null)

	{
		
		document.getElementById("errorMsg5").innerHTML="Enter Password";
	}
	else
	{	
		document.getElementById("errorMsg5").innerHTML="";
		return true;
	}	
	
}







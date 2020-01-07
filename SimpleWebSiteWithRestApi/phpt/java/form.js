function validate(){
        var firstname=document.getElementById("fn").value;
        var lastname=document.getElementById("ln").value;
		var email=document.getElementById("el").value;
        var mobil=document.getElementById("ml").value;
		var pass=document.getElementById("pp").value;
	    var atpos = email.indexOf("@");
		var dotpos = email.lastIndexOf(".");
    
    
        

		
		if(firstname==""){
			alert("enter your first name");
		} else if(lastname==""){
			alert("enter your last name");
		} else if(email==""){
			alert("enter your Email");
		}
		else if (atpos<1 || dotpos<atpos+2 || dotpos+2>=email.length) {
			alert("Not a valid e-mail address");
		} else if (mobil==""){
            alert("enter your mobil number");
        }else if (isNaN(mobil)){
            alert("not a valid mobil number");
        }else if (mobil==""){
            alert("enter your mobil number");
        }else if (mobil.length!==11){
            alert("The wrong mobil numer");
        }else if (pass==""){
            alert("enter your Password");
        }else if (pass.length<10){
            alert("The Password is too short");
        }else {
            alert("successful registration");
        }
	}
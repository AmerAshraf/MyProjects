<!DOCTYPE html>
<html lang="en">
<head>
  <title>Drink Tea and Eat Cheese</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="shortcut icon" type="image/png" href="img/tea-logo.jpg">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

   <style>
body, html {height: 100%}
       body,h1,h2,h3,h4,h5,h6 {font-family: "Amatic SC", sans-serif}
body{background-repeat: no-repeat;
    background-size: cover;
    background-image: url("img/bg3.png");
        min-height: 90%;
       }

label{           
       color: white;
       } 
input,select{
       opacity: 0.6
       }
       
</style>
    
</head>
<body>

    <?php
    
    
    $host = "localhost";
    $user = "root";
    $pass = "";
    $db = "TEA_CHEESE";

    $conn = mysqli_connect($host , $user ,$pass ,$db);
    
    $username="";
    $password="";
    
    if(isset($_POST['login'])){
        
    $username=$_POST['username'];
    $password=$_POST['password'];
    
    
    
    $query="select * from users where username='$username' and password='$password'";
    $result=mysqli_query($conn, $query);
    $row= mysqli_fetch_assoc($result);
    
    if(mysqli_num_rows($result)>0){
        //var_dump($row);
        if($row["userrole"] == "Admin"){header('Location:2m.php');}
        else{header('Location:1.php');}
        
    }
    else{
        
        
        header("Location:2.php?Error=1");        

    }
    }
    ?>
    
    
    
     <?php
        
            $pass = "";
            $name = "";
            $mobile = "";
            $email = "";
            $gender = "";
            $sqls = "";

            if( isset($_POST['Name']) ){
                $name = $_POST['Name'];
            }
            if( isset($_POST['pass']) ){
                $pass = $_POST['pass'];
            }
            if( isset($_POST['email']) ){
                $email = $_POST['email'];
            }
            if( isset($_POST['mobile']) ){
                $mobile = $_POST['mobile'];
            }
            if( isset($_POST['gender']) ){
                $gender = $_POST['gender'];
            }
            if ( isset($_POST['signup']) ){
                $sqls = "INSERT INTO `users`( `username`, `password`, `userrole`, `phone`, `email`, `gender`) VALUES ('$name' , '$pass' , 'customer' , '$mobile' , '$email' , '$gender')";
                mysqli_query($conn , $sqls);
                header("location: 1.php");
            }
      ?>
    
    
    
    
    
    
    
    
    
    
    
    
<center>
<div class="container">
  
  
  <form class="form-inline" method="post">
    <div class="form-group">
      <label >Name:</label>
      <input type="text" class="form-control" id="usr" name="username">    
      <label >Password:</label>
      <input type="password" class="form-control" id="pwd" name="password">
      <button type="submit" name="login" class="btn btn-default" onclick="validatel()">Sign in</button>
    
      </div>
    </form>
    
    
  <form class="form-inline" method="post">
    <h1 style="color:white">Sign up</h1>
    
    
    
      <p><input class="form-control" id="fn" type="text" placeholder=" Name" required name="Name"></p>
      <p><input class="form-control" id="ln" type="pass" placeholder="pass" required name="pass"></p>
      <p><input class="form-control" id="el" type="Email" placeholder="Email" required name="email" ></p>
      <p><input class="form-control" id="ml" type="text" placeholder="Mobile" required name="mobile"></p>
      
        <script src="java/form.js"></script>
        
       <select class="form-control" name="gender">
            <option value="" disabled selected>Choose your option</option>
           
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            
        </select>
      <p><button class="btn btn-default" name="signup" type="submit" onclick="validate()" >SIGN UP</button></p>
    
    
    
    </form>
      </div>
 
    </center>

    
    <script>
        
    // login validat
function validatel(){
		var email=document.getElementById("usr").value;
		var pass=document.getElementById("pwd").value;

		if(email==""||pass==""){
			alert("enter your username or password");
		}
		
	}
        
    </script>
    
</body>
</html>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Drink Tea and Eat Cheese</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="shortcut icon" type="image/png" href="img/tea-logo.jpg">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="jquery-3.2.1.min.js"></script>
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
       opacity: 0.6;
        
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

            $u = mysqli_query($conn , "select * from users");
            
            $userno = 0;
            $username = "";
            $password = "";
            $userrole = "";
            $phone = "";
            $email = "";
            $gender = "";

            if( isset($_POST['no']) ){
                $userno = $_POST['no'];
            }
            if( isset($_POST['name']) ){
                $username = strip_tags ($_POST['name']);
            }
            if( isset($_POST['pwd']) ){
                $password = strip_tags ($_POST['pwd']);
            }
            if( isset($_POST['ur']) ){
                $userrole = strip_tags ($_POST['ur']);
            }
            if( isset($_POST['mobile']) ){
                $phone = strip_tags ($_POST['mobile']);
            }
            if( isset($_POST['email']) ){
                $email = strip_tags ($_POST['email']);
            }
            if( isset($_POST['gender']) ){
                $gender = $_POST['gender'];
            }
            

            $sqls = "";

            if ( isset($_POST['add']) ){
                $sqls = "INSERT INTO `users`( `username`, `password`, `userrole`, `phone`, `email`, `gender`) VALUES ('$username' , '$password' , '$userrole' , '$phone' , '$email' , '$gender')";
                mysqli_query($conn , $sqls);
                header("location: 3.php");
            }
            if ( isset($_POST['update']) ){
                $sqls = "UPDATE `users` SET `username`='$username',`password`='$password',`userrole`='$userrole',`phone`='$phone',`email`='$email',`gender`='$gender' WHERE userno=$userno";
                mysqli_query($conn , $sqls);
                header("location: 3.php");
            }
            if ( isset($_POST['delete']) ){
                $sqls = "delete from users where userno=$userno";
                mysqli_query($conn , $sqls);
                header("location: 3.php");
            }


        ?>

        <form class="form-inline" method="POST" >
            <center>
                <h1 style="color:white">User PAGE</h1>
      <p><input class="form-control" id="no" type="text" placeholder="user number"  name="no" readonly></p>     <p><input class="form-control" id="name" type="text" placeholder="user name" required name="name"></p>
      <p><input class="form-control" id="pwd" type="password" placeholder="password" required name="pwd"></p>
      <p><input class="form-control" id="ur" type="txt" placeholder="user role" required name="ur" ></p>
      <p><input class="form-control" id="mobile" type="text" placeholder="phone" required name="mobile"></p>
      <p><input class="form-control" id="email" type="email" placeholder="email" required name="email"></p>
        <script src="java/form.js"></script>
        
       <select class="form-control" id="gender" name="gender">
            <option value="" disabled selected>Choose your option</option>
           
            <option value="Male">Male</option>
            <option value="Female">Female</option>
            
        </select>
                <br>
        <p><button class="btn btn-default" name="add" type="submit" onclick="validate()" >ADD</button>
        <button class="btn btn-default" name="update" type="submit" onclick="validate()" >UPDATE</button>
        <button class="btn btn-default" name="delete" type="submit" onclick="validate()" >DELETE</button>
                </p>
                <br> <br>
        <input class="form-control" id="search" type="txt" placeholder="Search" name="search">
                
      

            <table id="emp" class="table">
                <tr>
                    <th class="danger">User Number</th>
                    <th class="danger">User Name</th>
                    <th class="danger">User Password</th>
                    <th class="danger">User Role</th>
                    <th class="danger">User Phone</th>
                    <th class="danger">User Email</th>
                    <th class="danger">User Gender</th>
                </tr>
                <?php
                    while ( $row = mysqli_fetch_array($u) ){
                        echo "<tr class='active'>";
                        echo "<td>" . $row['userno'] . "</td>";
                        echo "<td>" . $row['username'] . "</td>";
                        echo "<td>" . $row['password'] . "</td>";
                        echo "<td>" . $row['userrole'] . "</td>";
                        echo "<td>" . $row['phone'] . "</td>";
                        echo "<td>" . $row['email'] . "</td>";
                        echo "<td>" . $row['gender'] . "</td>";
                        echo "</tr>";
                    }
                    
                ?>
            </table>
            </center>
        </form>
        <script>
        
        $(document).ready(function(){
        $("#search").on("keyup", function() {
        var value = $(this).val().toLowerCase();
        $("#emp tr").filter(function() {
        $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1) //توجل يعني تبديل والتبديل عشان يتم ليه شرط ان القيمه الي تم البحث عنها كانت اكبر من -1
        });
        $("#emp tr:first").show(); //عشان يفضل الهيدر بتاع الجدول ظاهر
        });
        });

            var tbl = document.getElementById("emp");

            for(var x=1 ; x<tbl.rows.length ; x++){
                tbl.rows[x].onclick = function(){
                    document.getElementById("no").value = this.cells[0].innerHTML;
                    document.getElementById("name").value = this.cells[1].innerHTML;
                    document.getElementById("pwd").value = this.cells[2].innerHTML;
                    document.getElementById("ur").value = this.cells[3].innerHTML;
                    document.getElementById("mobile").value = this.cells[4].innerHTML;
                    document.getElementById("email").value = this.cells[5].innerHTML;
                    document.getElementById("gender").value = this.cells[6].innerHTML;
                }
            }

        </script>
    
</body>
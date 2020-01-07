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

            $c = mysqli_query($conn , "select * from cheese");
            
            $cheeseno = 0;
            $cheesepic = "";
            $cheesename = "";
            $cheeseprice = "";
            

            if( isset($_POST['cheeseno']) ){
                $cheeseno = $_POST['cheeseno'];
            }
            if( isset($_POST['cheesepic']) ){
                $cheesepic = strip_tags ($_POST['cheesepic']);
            }
            if( isset($_POST['cheesename']) ){
                $cheesename = strip_tags ($_POST['cheesename']);
            }
            if( isset($_POST['cheeseprice']) ){
                $cheeseprice = strip_tags ($_POST['cheeseprice']);
            }
            

            $sqls = "";

            if ( isset($_POST['add']) ){
                $sqls = "INSERT INTO `cheese`( `cheesepic`, `cheesename`, `cheeseprice`) VALUES ('$cheesepic','$cheesename','$cheeseprice')";
                mysqli_query($conn , $sqls);
                header("location: 5.php");
            }
            if ( isset($_POST['update']) ){
                $sqls = "UPDATE `cheese` SET `cheesepic`='$cheesepic',`cheesename`='$cheesename',`cheeseprice`='$cheeseprice' WHERE `cheeseno`=$cheeseno";
                mysqli_query($conn , $sqls);
                header("location: 5.php");
            }
            if ( isset($_POST['delete']) ){
                $sqls = "delete from cheese where cheeseno=$cheeseno";
                mysqli_query($conn , $sqls);
                header("location: 5.php");
            }


        ?>

        <form class="form-inline" method="POST" enctype="multipart/form-data">
            <center>
                <h1 style="color:white">Cheese PAGE</h1>
      <p><input class="form-control" id="cheeseno" type="text" placeholder="cheese number"  name="cheeseno" readonly></p>
      <p><input class="form-control" id="cheesepic" type="text" placeholder="cheese pic" required name="cheesepic"></p>
      <p><input class="form-control" id="cheesename" type="text" placeholder="cheese name" required name="cheesename"></p>
      <p><input class="form-control" id="cheeseprice" type="txt" placeholder="cheese price" required name="cheeseprice" ></p>
      
        <script src="java/form.js"></script>
     
                <br>
        <p><button class="btn btn-default" name="add" type="submit" onclick="validate()" >ADD</button>
        <button class="btn btn-default" name="update" type="submit" onclick="validate()" >UPDATE</button>
        <button class="btn btn-default" name="delete" type="submit" onclick="validate()" >DELETE</button>
                </p>
                <br> <br>
        <input class="form-control" id="search" type="txt" placeholder="Search" name="search">
                
      

            <table id="emp" class="table">
                <tr>
                    <th class="danger">cheese No</th>
                    <th class="danger">cheese Pic</th>
                    <th class="danger">cheese Name</th>
                    <th class="danger">cheese Price</th>
                    
                </tr>
                <?php
                    while ( $row = mysqli_fetch_array($c) ){
                        echo "<tr class='active'>";
                        echo "<td>" . $row['cheeseno'] . "</td>";
                        echo "<td><img src='".$row['cheesepic']."' style width='50' height='50' ></td>";
                        echo "<td>" . $row['cheesename'] . "</td>";
                        echo "<td>" . $row['cheeseprice'] . "</td>";
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
                    document.getElementById("cheeseno").value = this.cells[0].innerHTML;
                    document.getElementById("cheesepic").value = this.cells[1].innerHTML;
                    document.getElementById("cheesename").value = this.cells[2].innerHTML;
                    document.getElementById("cheeseprice").value = this.cells[3].innerHTML;
                    
                }
            }

        </script>
    
</body>
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

            $t = mysqli_query($conn , "select * from tea");
            
            $teano = 0;
            $teapic = "";
            $teaname = "";
            $teaprice = "";
            

            if( isset($_POST['teano']) ){
                $teano = $_POST['teano'];
            }
            if( isset($_POST['teapic']) ){
                $teapic = strip_tags ($_POST['teapic']);
            }
            if( isset($_POST['teaname']) ){
                $teaname = strip_tags ($_POST['teaname']);
            }
            if( isset($_POST['teaprice']) ){
                $teaprice = strip_tags ($_POST['teaprice']);
            }
            

            $sqls = "";

            if ( isset($_POST['add']) ){
                $sqls = "INSERT INTO `tea`( `teapic`, `teaname`, `teaprice`) VALUES ('$teapic','$teaname','$teaprice')";
                mysqli_query($conn , $sqls);
                header("location: 4.php");
            }
            if ( isset($_POST['update']) ){
                $sqls = "UPDATE `tea` SET `teapic`='$teapic',`teaname`='$teaname',`teaprice`='$teaprice' WHERE `teano`=$teano";
                mysqli_query($conn , $sqls);
                header("location: 4.php");
            }
            if ( isset($_POST['delete']) ){
                $sqls = "delete from tea where teano=$teano";
                mysqli_query($conn , $sqls);
                header("location: 4.php");
            }


        ?>

        <form class="form-inline" method="POST" enctype="multipart/form-data">
            <center>
                <h1 style="color:white">Tea PAGE</h1>
      <p><input class="form-control" id="teano" type="text" placeholder="Tea number"  name="teano" readonly></p>
      <p><input class="form-control" id="teapic" type="text" placeholder="Tea pic" required name="teapic"></p>
      <p><input class="form-control" id="teaname" type="text" placeholder="Tea name" required name="teaname"></p>
      <p><input class="form-control" id="teaprice" type="txt" placeholder="Tea price" required name="teaprice" ></p>
      
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
                    <th class="danger">Tea No</th>
                    <th class="danger">Tea Pic</th>
                    <th class="danger">Tea Name</th>
                    <th class="danger">Tea Price</th>
                    
                </tr>
                <?php
                    while ( $row = mysqli_fetch_array($t) ){
                        echo "<tr class='active'>";
                        echo "<td>" . $row['teano'] . "</td>";
                        echo "<td><img src='".$row['teapic']."' style width='50' height='50' ></td>";
                        echo "<td>" . $row['teaname'] . "</td>";
                        echo "<td>" . $row['teaprice'] . "</td>";
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
                    document.getElementById("teano").value = this.cells[0].innerHTML;
                    document.getElementById("teapic").value = this.cells[1].innerHTML;
                    document.getElementById("teaname").value = this.cells[2].innerHTML;
                    document.getElementById("teaprice").value = this.cells[3].innerHTML;
                    
                }
            }

        </script>
    
</body>
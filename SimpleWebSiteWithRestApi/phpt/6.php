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

            $b = mysqli_query($conn , "select * from bread");
            
            $breadno = 0;
            $breadpic = "";
            $breadname = "";
            $breadprice = "";
            

            if( isset($_POST['breadno']) ){
                $breadno = $_POST['breadno'];
            }
            if( isset($_POST['breadpic']) ){
                $breadpic = strip_tags ($_POST['breadpic']);
            }
            if( isset($_POST['breadname']) ){
                $breadname = strip_tags ($_POST['breadname']);
            }
            if( isset($_POST['breadprice']) ){
                $breadprice = strip_tags ($_POST['breadprice']);
            }
            

            $sqls = "";

            if ( isset($_POST['add']) ){
                $sqls = "INSERT INTO `bread`( `breadpic`, `breadname`, `breadprice`) VALUES ('$breadpic','$breadname','$breadprice')";
                mysqli_query($conn , $sqls);
                header("location: 6.php");
            }
            if ( isset($_POST['update']) ){
                $sqls = "UPDATE `bread` SET `breadpic`='$breadpic',`breadname`='$breadname',`breadprice`='$breadprice' WHERE `breadno`=$breadno";
                mysqli_query($conn , $sqls);
                header("location: 6.php");
            }
            if ( isset($_POST['delete']) ){
                $sqls = "delete from bread where breadno=$breadno";
                mysqli_query($conn , $sqls);
                header("location: 6.php");
            }


        ?>

        <form class="form-inline" method="POST" enctype="multipart/form-data">
            <center>
                <h1 style="color:white">Bread PAGE</h1>
      <p><input class="form-control" id="breadno" type="text" placeholder="bread number"  name="breadno" readonly></p>
      <p><input class="form-control" id="breadpic" type="text" placeholder="bread pic" required name="breadpic"></p>
      <p><input class="form-control" id="breadname" type="text" placeholder="bread name" required name="breadname"></p>
      <p><input class="form-control" id="breadprice" type="txt" placeholder="bread price" required name="breadprice" ></p>
      
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
                    <th class="danger">bread No</th>
                    <th class="danger">bread Pic</th>
                    <th class="danger">bread Name</th>
                    <th class="danger">bread Price</th>
                    
                </tr>
                <?php
                    while ( $row = mysqli_fetch_array($b) ){
                        echo "<tr class='active'>";
                        echo "<td>" . $row['breadno'] . "</td>";
                        echo "<td><img src='".$row['breadpic']."' style width='50' height='50' ></td>";
                        echo "<td>" . $row['breadname'] . "</td>";
                        echo "<td>" . $row['breadprice'] . "</td>";
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
                    document.getElementById("breadno").value = this.cells[0].innerHTML;
                    document.getElementById("breadpic").value = this.cells[1].innerHTML;
                    document.getElementById("breadname").value = this.cells[2].innerHTML;
                    document.getElementById("breadprice").value = this.cells[3].innerHTML;
                    
                }
            }

        </script>
    
</body>
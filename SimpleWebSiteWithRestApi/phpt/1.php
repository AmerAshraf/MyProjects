<!DOCTYPE html>
<html>
<title>Drink Tea and Eat Cheese</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="image/png" href="img/tea-logo.jpg">
<script src="java/jquery-2.1.1.min.js"></script>
<link rel="stylesheet" href="css/2.css">
<link rel="stylesheet" href="css/3.css">
<link rel="stylesheet" href="css/4.css">
<link rel="stylesheet" href="css/rs.css">
<style>
body, html {height: 100%}
body,h1,h2,h3,h4,h5,h6 {font-family: "Amatic SC", sans-serif}
.menu {display: none}
.bgimg {
    background-repeat: no-repeat;
    background-size: cover;
    background-image: url("img/1.webp");
    min-height: 90%;
}
</style>
<body>
    
      <?php

            $host = "localhost";
            $user = "root";
            $pass = "";
            $db = "TEA_CHEESE";

            $conn = mysqli_connect($host , $user ,$pass ,$db);

            $t = mysqli_query($conn , "select * from tea");
            $c = mysqli_query($conn , "select * from cheese");
            $b = mysqli_query($conn , "select * from bread");

    ?>

<!-- Navbar (sit on top) -->
<div class="w3-top w3-hide-small">
  <div class="w3-bar w3-xlarge w3-black w3-opacity w3-hover-opacity-off" id="myNavbar">
    <a href="#" class="w3-bar-item w3-button">HOME</a>
    <a href="#menu" class="w3-bar-item w3-button">PRODUCTS</a>
    <a href="#about" class="w3-bar-item w3-button">ABOUT</a>
    <a href="#googleMap" class="w3-bar-item w3-button">CONTACT</a>
    
   

      
  </div>
</div>
  
<!-- Header with image -->
<header class="bgimg w3-display-container w3-grayscale-min" id="home">
  <div class="w3-display-bottomleft w3-padding">    
  </div>
  <div class="w3-display-middle w3-center">
    <span class="w3-text-white w3-hide-small" style="font-size:100px">Drink Tea<br>Eat Cheese</span>
    <span class="w3-text-white w3-hide-large w3-hide-medium" style="font-size:60px"><b>Drink Tea<br>Eat Cheese</b></span>
    <p><a href="#menu" class="w3-button w3-xxlarge w3-black">Let me see the products</a></p>
  </div>
</header>

<!-- Menu Container -->
<div class="w3-container w3-black w3-padding-64 w3-xxlarge" id="menu">
  <div class="w3-content">
  
    <h1 class="w3-center w3-jumbo" style="margin-bottom:64px">THE PRODUCTS</h1>
    <div class="w3-row w3-center w3-border w3-border-dark-grey">
      <a href="javascript:void(0)" onclick="openMenu(event, 'Pizza');" id="myLink">
        <div class="w3-col s4 tablink w3-padding-large w3-hover-red">TEA</div>
      </a>
      <a href="javascript:void(0)" onclick="openMenu(event, 'Pasta');">
        <div class="w3-col s4 tablink w3-padding-large w3-hover-red">CHEESE</div>
      </a>
      <a href="javascript:void(0)" onclick="openMenu(event, 'Starter');">
        <div class="w3-col s4 tablink w3-padding-large w3-hover-red">BREAD</div>
      </a>
    </div>

    <div id="Pizza" class="w3-container menu w3-padding-32 w3-white">
     
        <?php
            $i='1';
            while ( $row = mysqli_fetch_array($t) ){

                echo "<img src=' " . $row['teapic'] . "' width='200' height='200'>";
                
                echo "<span class='w3-right w3-tag w3-white w3-round'><p class='w3-text-grey'id='".$i."tt' >" .$row['teaprice']. "</p><input class='w3-right w3-tag w3-dark-grey w3-round' type='number' name='quantity' min='1' max='10' value='0' style='color: gray; border: none; '  id='".$i."t'></span>"  ;
                
                echo "<p style='font-size: 15px; color: gray'>" . $row['teaname'] . "</p>";
                        
                echo "<hr>";
                $i++;
                    }
                    
                ?>
       
     
   
     
<button class="w3-button w3-light-grey w3-block" onclick="Total()" >Buy</button>
      
    </div>

    <div id="Pasta" class="w3-container menu w3-padding-32 w3-white">
        
      <?php
        
            $i='1';
            while ( $row = mysqli_fetch_array($c) ){

                echo "<img src=' " . $row['cheesepic'] . "' width='200' height='200'>";
                
                echo "<span class='w3-right w3-tag w3-white w3-round'><p class='w3-text-grey' id='".$i."cc'>" .$row['cheeseprice']. "</p><input class='w3-right w3-tag w3-dark-grey w3-round' type='number' name='quantity' min='1' max='10' value='0' style='color: gray; border: none; '  id='".$i."c'></span>"  ;
                
                echo "<p style='font-size: 15px; color: gray'>" . $row['cheesename'] . "</p>";
                        
                echo "<hr>";
                $i++;
                    }
                    
                ?>
        
        <button class="w3-button w3-light-grey w3-block" onclick="Total()" >Buy</button>
    </div>


    <div id="Starter" class="w3-container menu w3-padding-32 w3-white">
      
        <?php
            $i='1';
            while ( $row = mysqli_fetch_array($b) ){

                echo "<img src=' " . $row['breadpic'] . "' width='200' height='200'>";
                
                echo "<span class='w3-right w3-tag w3-white w3-round'><p class='w3-text-grey' id='".$i."bb'>" .$row['breadprice']. "</p><input class='w3-right w3-tag w3-dark-grey w3-round' type='number' name='quantity' min='1' max='10' value='0' style='color: gray; border: none; '  id='".$i."b'></span>"  ;
                
                echo "<p style='font-size: 15px; color: gray'>" . $row['breadname'] . "</p>";
                        
                echo "<hr>";
                $i++;
                    }
                    
                ?>
      
        <button class="w3-button w3-light-grey w3-block" onclick="Total()">Buy</button>
    </div><br>

  </div>
</div>

<!-- About Container -->
<div class="w3-container w3-padding-64 w3-red w3-grayscale w3-xlarge" id="about">
  <div class="w3-content">
    <h1 class="w3-center w3-jumbo" style="margin-bottom:64px">About</h1>
    <p>We are a company that was founded last week. Our only goal is to send a message to everyone. "When you learn anything or do anything, you need concentration and calm. You have to bring a glass of tea and sandwiches from the cheese." This message was written by Dr. Haitham and with research and experience we found it effective and good.</p>
    <p><strong>The Designers</strong> Mr. A'mer & mr . Ahmed</p>
    <p>We are proud of our interiors.</p>
    
      <img src="img/bg2.jpg" style="width:100%" class="w3-margin-top w3-margin-bottom" >
      
    
    
    
    
  </div>
</div>


<!-- Contact (with google maps) -->
<div id="googleMap" class="w3-grayscale-max" style="width:100%;height:400px;"></div>
    
    
<div class="w3-container w3-padding-64 w3-blue-grey w3-grayscale-min w3-xlarge">
  <div class="w3-content">
    <h1 class="w3-center w3-jumbo" style="margin-bottom:64px">Contact</h1>
    <p>Find us at some address at some place or call us at 01010102376</p>
    <p>We offer full-service catering for any event, large or small. We understand your needs and we will cater the food to satisfy the biggerst criteria of them all, both look and taste.</p>
    <p class="w3-xxlarge"><strong>just send us a message:</strong> </p>
    <form action="" target="_blank">
      <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Name" required name="Name"></p>
      <p><input class="w3-input w3-padding-16 w3-border" type="number" placeholder="How many people" required name="People"></p>
      <p><input class="w3-input w3-padding-16 w3-border" type="datetime-local" placeholder="Date and time" required name="date" value="2017-11-16T20:00"></p>
      <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Message \ Special requirements" required name="Message"></p>
      <p><button class="w3-button w3-light-grey w3-block" type="submit">SEND MESSAGE</button></p>
    </form>
  </div>
</div>

<!-- Footer -->
<footer class="w3-center w3-black w3-padding-48 w3-xxlarge">
  <p>Drink Tea and Eat Cheese</p>
</footer>


<script>
  
    
    // sum price
function Total(){
    var x = document.getElementById("1t").value;
    x = x*5;
    var y = document.getElementById("2t").value;
    y = y*7;
    var z = document.getElementById("3t").value;
    z = z*9;
    var x1 = document.getElementById("1c").value;
    x1 = x1*7;
    var y1 = document.getElementById("2c").value;
    y1 = y1*9;
    var z1 = document.getElementById("3c").value;
    z1 = z1*13;
     var x2 = document.getElementById("1b").value;
    x2 = x2*2;
    var y2 = document.getElementById("2b").value;
    y2 = y2*4;
    var z2 = document.getElementById("3b").value;
    z2 = z2*3;
    var tt = (x+y+z+x1+y1+z1+x2+y2+z2);
    alert("The Total Price is:  " + tt + "$");
}

    //map
function myMap()
{
  myCenter=new google.maps.LatLng(41.878114, -87.629798);
  var mapOptions= {
    center:myCenter,
    zoom:12, scrollwheel: false, draggable: false,
    mapTypeId:google.maps.MapTypeId.ROADMAP
  };
  var map=new google.maps.Map(document.getElementById("googleMap"),mapOptions);

  var marker = new google.maps.Marker({
    position: myCenter,
  });
  marker.setMap(map);
}

// Tabbed Menu
function openMenu(evt, menuName) {
  var i, x, tablinks;
  x = document.getElementsByClassName("menu");
  for (i = 0; i < x.length; i++) {
     x[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablink");
  for (i = 0; i < x.length; i++) {
     tablinks[i].className = tablinks[i].className.replace(" w3-red", "");
  }
  document.getElementById(menuName).style.display = "block";
  evt.currentTarget.firstElementChild.className += " w3-red";
}
document.getElementById("myLink").click();
</script>
<script src="https://maps.googleapis.com/maps/api/js?-916DdpKAjTmJNIgngS6HL_kDIKU0aU&callback=myMap"></script>

<script src="java/jquery-2.1.1.min.js"></script>
    <div class="connect">
        <a href="https://www.facebook.com/"><img src="img/s6.png" class="img-connect"></a>
        <a href="https://www.twitter.com/"><img src="img/s5.png" class="img-connect"></a>
        <a href="https://www.instagram.com/"><img src="img/s4.png" class="img-connect"></a>
        <a href="https://www.youtube.com/"><img src="img/s3.png" class="img-connect"></a>
        <a href="https://plus.google.com/"><img src="img/s2.png" class="img-connect"></a>
        <a href="https://www.pinterest.com/"><img src="img/s1.png" class="img-connect"></a>
        <div class="img-connect" id="hide" style="width:100%;text-align: center;"><a onclick="$('.img-connect').hide(1000);$('.show_button').show(1000);" href="javascript:void(0)">Hide &#8595;</a></div>
        <div class="show_button" style="width:100%;text-align: center;display:none;"><a onclick="$('.img-connect').show(1000);$('.show_button').hide(1000);" href="javascript:void(0)">Show &#8595;</a></div>
    </div>
    
</body>
</html>

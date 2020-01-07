<!DOCTYPE html>
<html>
    <head>

    </head>

    <body>
        <?php
        
        
        
           $host = "localhost";
            $user = "root";
            $pass = "";
            $db = "TEA_CHEESE";

            $conn = mysqli_connect($host , $user ,$pass ,$db);

            
                //----------(Upload file)----------
                if( isset($_POST['s']) ){
                    $myfile = $_FILES['myup'];//عشان اقرا الفايل الي حيترفع مش حقراه ب بوست او جيت زي اي حاجه فاتت
                    // اول ما بيقرا الفايل بالميثود الي فوق بيرجع مصفوفه في 5 حاجات مكتوبين تحت اهم
                    //echo $myfile['name'];
                    //echo $myfile['type'];
                    //echo $myfile['tmp_name'];//مصدره بمعني بياناته الي بحتاجها عشان انسخه في اي حته انا عاوزها
                    //echo $myfile['error'];
                    //echo $myfile['size'];
                    
                    copy( $myfile['tmp_name'] , $myfile['name'] );
                    $u = mysqli_query($conn , "INSERT INTO `tea`( `teapic`, `teaname`, `teaprice`) VALUES ('$myfile ['name']' , '33' , '33')");
                    
                    //$myfile = $_FILES['myup']['name'];
                   // $filename=$_FILES['nameofyourfileinput']['name'];
                    //echo $myfile;
                    
                }

        //enctype عشان اخلي الموقع يقرا الابلود للفايل
        ?>        
        <form method="POST" enctype="multipart/form-data">
            <input type="file" name="myup"><br><br>
            <input type="submit" value="Submit" name="s"><br>
            

        </form>
        
    </body>

</html>
<!DOCTYPE html>
<html lang="en">
<body>
    <?php
    echo" My first PHP script!";
    echo "welcome to php";
    $dbh=mysqli_connect('localhost','root','')or die(mysqli_error($dbh));
    mysqli_select_db($dbh,'event management')or die(mysqli_error($dbh));
    $name=$_REQUEST['name'];
    $email=$_REQUEST['email'];
    $contact=$_REQUEST['contact'];
    $profilpic=$_REQUEST['profilepic'];
    $query="insert into Student values('$name','$email','$contact','$profilepic')";
    $result=mysqli_quert($dbh,$query)or die(mysqli_error($dbh));
    echo "Data inserted successfully!!";
    ?>
/body>
</html>
    ?>
</body>
</html>
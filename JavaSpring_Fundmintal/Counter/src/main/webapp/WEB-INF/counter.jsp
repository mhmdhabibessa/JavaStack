<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css">
    
    <title>counter</title>
</head>
<body>
   	
   You have to visited  <a href="">http//your_server</a> : <c:out value="${count}"/> times 
   <br>
    <a  href="/your_server" > Test another Visit ? </a>
   			
   
</body>
</html>
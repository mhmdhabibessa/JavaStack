<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="css/style.css">

<title>Insert title here</title>
</head>
<body>
		
		
<div class="codeing">		
<form method="POST" action="/login">
	<h1>  <c:out value="${error}"/> </h1>
	<h3> What is the code ?  </h3>
     <input type="text" name="text"><br>
     <button>Try the Code ?</button>
</form>
</div>

</body>
</html>
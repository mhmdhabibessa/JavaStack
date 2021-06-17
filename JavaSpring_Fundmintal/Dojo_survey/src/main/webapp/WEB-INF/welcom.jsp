<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
<h1> Submited info  </h1>

NAME:   <c:out value="${fname}"/>
<br>
Dojo Location:   <c:out value="${select_name}"/>
<br>
Fav language :   <c:out value="${lang}"/>
<br>
comment :   <c:out value="${text_area}"/>
<br><br><br>
<a href="/">Go back </a>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<script src ="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js%22%3E"></script>

<link rel="stylesheet" href="css/style.css">
<script src="js/app2.js"></script>
<meta charset="ISO-8859-1">
<title>Time Page</title>
</head>
<body>
			<h2> the time : </h2>
          <h3><c:out value="${date}"/></h3>
</body>
</html>
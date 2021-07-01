<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>products</h1>

 <form:select path="category">
	 <c:forEach items="${allNotProductCategories}" var="item">
	 <form:option value="${item.id}">${item.getName()}</form:option>
	 </c:forEach>
 </form:select> 
<h2>
all products
</h2>

<form:select path="category" action="">
	<c:forEach items="${allProductCategories}" var="item">
		 <p><c:out value="${item.getName()}"/></p>
	</c:forEach>
	
	<input type="submit" value="submit"/>
</form:select> 
</body>
</html>
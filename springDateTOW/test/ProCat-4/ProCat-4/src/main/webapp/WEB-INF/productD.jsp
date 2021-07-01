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
<form action="/product/${thisProductId}">
 <select name="cid" path="category">
	 <c:forEach items="${allNotProductCategories}" var="item">
	 <option value="${item.id}">${item.getName()}</option>
	 </c:forEach>
	 <input type="submit" value="submit"/>
 </select> 
 </form>
<h2>
all products
</h2>


	<c:forEach items="${allProductCategories}" var="item">
		 <p><c:out value="${item.getName()}"/></p>
	</c:forEach>
	
</body>
</html>
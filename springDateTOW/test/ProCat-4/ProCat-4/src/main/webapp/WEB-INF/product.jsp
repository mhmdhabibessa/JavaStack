<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach items="${allProducts}" var="item" >
 <p> Item <c:out value = "${item.name}"/></p>
</c:forEach>

<form:form action="/add" method="post" modelAttribute="product">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:errors path="description"/>
        <form:textarea path="description"/>
    </p>
    <p>
        <form:label path="price">Price</form:label>
        <form:errors path="price"/>     
        <form:input type="number" path="price"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>  



</body>
</html>
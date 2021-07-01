<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
         
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="conter" > 
	<h1> new ninja</h1><hr/>
		<form:form action="/ninja" method="post" modelAttribute="ninja">
	
	<div> 
	  	<form:label path="dojo">Dojo Name</form:label>
        <form:errors path="dojo"/>
        <form:select path="dojo"> 
        <c:forEach items="${dojo}" var ="doj" > 
        <option value="${doj.id}"> ${doj.name} </option>
        </c:forEach> 
        </form:select>
        
        
</div>

<div class="group">
		<form:label path="firstName">firstName</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
	 </div>
	 <div class="group">
		<form:label path="lastName">lastName</form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
	 </div><div class="group">
		<form:label path="age">age</form:label>
        <form:errors path="age"/>
        <form:input path="age"/>
	 </div>
	 <button>Add ninja</button>
	 </form:form>
</body>
</html>
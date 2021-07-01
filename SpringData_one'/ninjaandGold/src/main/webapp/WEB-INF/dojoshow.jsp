<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div> 
	  	<form:label path="dojo">Dojo Name</form:label>
        <form:errors path="dojo"/>
        <form:select path="dojo"> 
        <c:forEach items="${dojo}" var ="doj" > 
        <option value="${doj.id}"> ${doj.name} </option>
        </c:forEach> 
        </form:select>>
        
        
</div>
</body>
</html>
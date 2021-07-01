<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="conter" > 
	<h1> new Category</h1><hr/>
	<form:form action="/creatnew_category" method="post" modelAttribute="category">
	<div> 
	  	<form:label path="name"> Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>		
	 </div>
	 <button>create</button>

</form:form>
</div>

</body>
</html>
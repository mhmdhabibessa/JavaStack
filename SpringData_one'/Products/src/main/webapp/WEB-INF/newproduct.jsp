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
	<h1> new product</h1>
	<form:form action="/creatnew_product" method="post" modelAttribute="product">
	<div> 
	  	<form:label path="name"> Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>		
	 </div>
	 <div> 
	  	<form:label path="description"> Discriptions</form:label>
        <form:errors path="description"/>
        <form:input path="description"/>		
	 </div><div> 
	  	<form:label path="price"> Price</form:label>
        <form:errors path="price"/>
        <form:input path="price"/>		
	 </div>
	 <button>Add Product</button>

</form:form>
</div>

</body>
</html>
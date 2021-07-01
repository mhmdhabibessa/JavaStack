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
<style>
.conter {
  display:flex;
   justify-content: space-around;
   margin: 100px;
   background: whitesmoke;
}


</style>
<body>
<div class="conter" > 
	<div>
	<h1>  ${product.name}</h1>
	<h3> Category </h3> 
	<c:forEach items="${listCat}" var ="cat" >
	<ul><li>${cat.getId()}${cat.getName()} </li> </ul>
	        </c:forEach> 
	
	</div>
	<form:form action="/add/${product.id}" method="post" modelAttribute="category">
	<div> 
	  	<form:label path="name">Add category</form:label>
        <form:errors path="name"/>
        <form:select path="name"> 
        <c:forEach items="${catogery}" var ="cat" > 
        <option value="${cat.id}"> ${cat.id }_${cat.name} </option>
        </c:forEach> 
        </form:select>
	 </div>
	<input type="submit" value="Create">

</form:form>
</div>

</body>
</html>
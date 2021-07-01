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
	<h1>  ${category.name}</h1>
	<h3> Product </h3> 
	<c:forEach items="${listCat}" var ="pro" >
	<ul><li>${pro.getId()}${pro.getName()} </li> </ul>
	        </c:forEach> 
	
	</div>
	<form:form action="/add/${category.id}" method="post" modelAttribute="product">
	<div> 
	  	<form:label path="name">Add product</form:label>
        <form:errors path="name"/>
        <form:select path="name"> 
        <c:forEach items="${product}" var ="pro" > 
        <option value="${pro.id}"> ${pro.id }_${cat.name} </option>
        </c:forEach> 
        </form:select>
	 </div>
	<input type="submit" value="Create">

</form:form>
</div>

</body>
</html>
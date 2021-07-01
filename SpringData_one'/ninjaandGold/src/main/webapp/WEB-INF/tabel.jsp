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
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
h2 {
text-align:center;
}
</style>
<body>
 <h2> ${dojo.name}  Location Ninja</h2>

<table>
  <tr>
    <th>FirstName</th>
    <th>LasttName</th>
    <th>Age</th>
  </tr>
  <tr>
   <c:forEach items="${ninja}" var ="ninj" > 
    <td>${ninj.firstName}</td>
    <td>${ninj.lastName}</td>
    <td>${ninj.age}</td>
  </tr>
     </c:forEach> 
 
  	
</table>
</body>
</html>
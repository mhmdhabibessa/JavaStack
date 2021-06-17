<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="/login" >
  <fieldset>
    <legend>Dojo survy:</legend>
    <label>Your name:</label>
    <input type="text"  name="fname"><br>
    <label >Dojo location:</label>
	<select name="select_name">
  	<option >san jose </option>
 	<option>bat man</option>
 	 <option >Harry bot</option>
 	
 	</select> <br>
 	<label>Favaouret langauge :</label>
	<select name="lang">
  	<option >Python </option>
 	<option >Java</option>
 	<option >c++ </option>
 	
 	</select>    <br>
    <label >Comment:</label><br>
   <input type="text_area"  name="text_area" ><br>
 	

 <input type="submit" value="Submit">
  </fieldset>
</form>
</body>
</html>
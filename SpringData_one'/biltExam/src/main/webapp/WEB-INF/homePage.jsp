<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.1/css/bulma.min.css">

</head>
<body>

	<div class="container">
		<div class="notification">
			<h1 class="title">
				Welcome,
				<c:out value="${user.name}" />
			</h1>
		</div>
		<div>
			Courses <a href="/lowhigh">Low Sign Up</a> | <a href="/highlow">High
				Sign Up</a> | 
		</div>
		
		
		<table class="table is-fullwidth is-bordered">
			<thead class="dashtable">
				<tr>
					<td>Course</td>
					<td>Instructor</td>
					<td>Signups</td>
					<td>Action</td>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${courses}" var="course">
				<tr>
					<td><a href="/courses/${course.id}">${course.name}</a></td>
					<td>${course.instructor}</td>
					<td>${course.getUsers().size()} / ${course.capacity}</td>
					<td>
					
				<a href="/courses/add/${course.id}">Add</a>
								
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>

		<div class="buttons has-addons">
			<a href="/courses/new" class="button is-dark">Add Course</a>
		</div>

	</div>
</body>
</html>
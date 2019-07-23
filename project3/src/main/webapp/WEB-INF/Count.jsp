<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Two Counters!</title>
</head>
<body>
	<h1>Session- and Application-Scope Counters</h1>
	<div class="card w-75">
		<div class="card-body">
			<h5 class="card-title">Session-Scope Counter</h5>
			<p class="card-text">Here is the number of times that the page
				has been loaded in the one and only session:</p>
			<c:out value="${sessCount}"></c:out>
		</div>
	</div>

	<div class="card w-50">
		<div class="card-body">
			<h5 class="card-title">Application-Scope Counter</h5>
			<p class="card-text">And here is the number of times that the
				page has been loaded in the overall application:</p>
			<c:out value="${appCount}"></c:out>
		</div>
	</div>
	<p>
		<a href="/project3/restartSession">Click here to restart the
			session</a>
	</p>
</body>
</html>
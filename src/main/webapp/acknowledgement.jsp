<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Action ack</title>
<c:url var="cssUrl" value="/Design.css" />
<link rel="stylesheet" type="text/css" href="${cssUrl}" />
<link rel="shortcut icon" href="/icon1.jpg" type="image/x-icon">
</head>
<body>
<div style="border:2px solid black;width:25%;padding:20px;text-align:center;margin-left:35%;background-color:#ffdab3;margin-top:10%">
<form action="/adminVerify" method="get" >
<h2 style="color:#003300">ACTION COMPLETED!!</h2>
<button class="klr">Click to return</button>
</form>
</div><br>
<div style="margin-left:55%">
<a href="<c:url value='/logout' />">Click here to logout</a>  
</div>
</body>
</html>
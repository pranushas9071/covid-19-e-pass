<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>status</title>
<link rel="stylesheet"  href="Design.css">
<link rel="shortcut icon" href="/icon1.jpg" type="image/x-icon">
</head>
<body>
<div style="border:2px solid black;width:30%;padding:20px;text-align:center;margin-left:30%;background-color:#ffdab3;margin-top:10%">
<form  action="status" method="post">
<label><b>Select the status</b></label><br><br>
  <select class="crt" name="status" required>
  <option value="OnProcess">OnProcess</option>
  <option value="Granted">Granted</option>
  <option value="Denied">Denied</option>
  </select><br>
    <input class="klr" type="submit" value="view details" style="background_color:#ffffe6">
</form>
</div><br>
<div style="margin-left:55%">
<a href="<c:url value='/logout' />">Click here to logout</a>  
</div>
</body>
</html>
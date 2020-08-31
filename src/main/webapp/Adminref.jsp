<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>check by...</title>
<link rel="stylesheet" href="Design.css">
<link rel="shortcut icon" href="/icon1.jpg" type="image/x-icon">
<script type="text/javascript">
</script>
</head>
<div style="border:2px solid black;width:30%;padding:20px;text-align:center;margin-left:30%;background-color:#ffdab3;margin-top:10%">
<h3><b>Select to sort the users</b></h3>
<!-- <button onclick="document.location='nextform.jsp'">Select By Id</button> -->
<button class="klr"  onclick="document.location='aadhar.jsp'">Select By AadharNo</button>
<button class="klr" onclick="document.location='status.jsp'">Select By status</button>
</div>
<br>
<div style="margin-left:55%">
<a href="<c:url value='/logout' />">Click here to logout</a>  
</div>
</body>
</html>
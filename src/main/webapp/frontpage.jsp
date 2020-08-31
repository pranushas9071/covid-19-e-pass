<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="shortcut icon" href="/icon1.jpg" type="image/x-icon">
<style>
img{
width:50%;
height:50%;
}
</style>
<title>covid 19 e-pass</title>
</head>
<body style="background-color:#e6f2ff">
<h1 style="background-color:#000066;color:white">e-pass for movement during lockdown
</h1>
<ul  style="background-color:#ccd9ff ;border:2px solid black;padding:10px 10px;font-size:18px" >
<li>Any individual/group can apply for the movement pass using this framework.</li>
<li>Fill in all the mandatory details carefully and submit.</li>
<li>Please use an active e-mail ID to receive verification OTP.</li>
<li>To track the application status,provide your aadhar number.</li>
<li>The movement e-pass will contain your name, address, validity.</li>
<li>Keep a soft/hard copy of the e-pass while traveling and show it to the security personnel if asked.</li>
<li>The provided e-pass will be valid only inside Tamil Nadu.</li>
</ul>
<form action="/adminVerify" style="display:inline">
<button style="background-color:#4CAF50;color:white;padding:3px">admin</button></form>
<button style="background-color:#4CAF50;color:white;padding:3px" onclick="document.location='UserVerification.jsp'">apply for e-pass</button>
<button style="background-color:#4CAF50;color:white;padding:3px" onclick="document.location='nextform.jsp'">track your application</button>
</body> 
</html>
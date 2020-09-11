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
height:100%;
}
button{
background-color:#4CAF50;
color:white;
padding:3px;
cursor: pointer;
border-radius: 20px;
height:40px;
width:150px;
outline: none;
font-size:15px;
border: 1px solid rgb(0, 51, 0);
}
button:hover{
background-color:#00cc00;

}
</style>
<title>covid 19 e-pass</title>
</head>
<body style="background-color:#ffffe6">
<h1 style="background-color:#000066;color:white;padding:5px">e-pass for movement during lockdown
</h1>
<div style="border:2px solid black;background-color:#e6ffe6;padding-top:25px;padding-bottom:25px;font-size:20px;height:500px" >
<img src="migration.jpg" align="left" hspace="40" border="1px solid black">
<ul>
<li>Any individual/group can apply for the movement pass using this framework.</li>
<li>Fill in all the mandatory details carefully and submit.</li>
<li>Please use an active e-mail ID to receive verification OTP.</li>
<li>To track the application status,provide your aadhar number.</li>
<li>The movement e-pass will contain your name, address, validity.</li>
<li>Keep a soft/hard copy of the e-pass while traveling and show it to the security personnel if asked.</li>
<li>The provided e-pass will be valid only inside Tamil Nadu.</li>
</ul>
<form action="/adminVerify" style="display:inline">
<button >admin</button></form>
<button onclick="document.location='UserVerification.jsp'">apply for e-pass</button>
<button onclick="document.location='nextform.jsp'">track application</button>
</div>
</body> 
</html>

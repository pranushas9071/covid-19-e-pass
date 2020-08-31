<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>covid 19 e-pass</title>
<link rel="stylesheet" href="Design.css">
<link rel="shortcut icon" href="/icon1.jpg" type="image/x-icon">
<style>
</style>
</head>
<body>
<div style="margin-top:5%">
<form  action="/login" class="admin" method="post" >
    <img src="man.jpg" alt="Avatar" class="avatar">
    <br>
  <label><b>Username</b></label>
    <input id="text1" class="crt" type="text" placeholder="Enter Username" name="username" required >
<br>
    <label><b>Password</b></label>
    <input id="text2" class="crt" type="password" placeholder="Enter Password" name="password" required>
<br>
    <input class="klr" type="submit" value="Login" >
    <button  type="button" class="cancelbtn" onclick="document.location='frotpage.jsp'">Cancel</button>
</form>
</div>
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
<c:url var="cssUrl" value="/Design.css" />
<link rel="stylesheet" type="text/css" href="${cssUrl}" />
<link rel="shortcut icon" href="/icon1.jpg" type="image/x-icon">
<style>
* {
  box-sizing: border-box;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body >
<header>
  <h2>APPLICANT'S DETAILS</h2>
</header>
<section>
<nav>
<h3>PERSONAL DETAILS</h3>
<table>
<tbody>
<tr><td class="titleC">Name</td><td class="tbodyC">${alien.uname}</td></tr>
<tr><td class="titleC">Address</td><td class="tbodyC">${alien.address}</td></tr>
<tr><td class="titleC">Aadhar No</td><td class="tbodyC"> ${alien.proofno}</td></tr>
<tr><td class="titleC">email</td><td class="tbodyC"> ${alien.email}</td></tr>
<tr><td class="titleC">Purpose of travel</td><td class="tbodyC">${alien.upurpose}</td></tr>
<tr><td class="titleC">Vehicle No</td><td class="tbodyC">${alien.vNo}</td></tr>
<tr><td class="titleC">No.Of.Person</td><td class="tbodyC">${alien.noOfperson}</td></tr>
<tr><td class="titleC">Valid till</td><td class="tbodyC">${alien.endDate}</td></tr>
</tbody>
</table>
</nav>
<article>
    <table style="width:100%;table-layout:fixed;">
    <h3>COVID COUNTS</h3>
    <thead>
    <tr class="titleC"><td>SPOT</td><td>LOCATION</td><td>CONFIRMED</td><td>ACTIVE</td><td>DECEASED</td><td>RECOVERD</td></tr>
    </thead>
    <tbody>
    <tr><td class="titleC">SOURCE</td><td class="tbodyC">${alien.district}</td><td class="tbodyC">${List.get(5)}</td><td class="tbodyC">${List.get(4)}</td><td class="tbodyC">${List.get(6)}</td><td class="tbodyC">${List.get(7)}</td></tr>
    <tr><td class="titleC">DESTINATION</td><td class="tbodyC">${alien.destination}</td><td class="tbodyC">${List.get(1)}</td><td class="tbodyC">${List.get(0)}</td><td class="tbodyC">${List.get(2)}</td><td class="tbodyC">${List.get(3)}</td></tr>
    </tbody>
    </table>
    <h3>Risk percentage:${List.get(8)}%</h3>
</article>
</section>
<footer>
<h3 style="color:white"><b>Generate e-pass pdf and send to the applicant</b></h3>
<a class="spl" href="/generate-pdf-and-provide-e-pass/${alien.aid}">Click to Accept</a>
<h3 style="color:white"><b>Reject e-pass application</b></h3>
<a class="spl"  href="/reject/${alien.aid}">Click to reject</a>
<br><br>
</footer>
</body>
</html>
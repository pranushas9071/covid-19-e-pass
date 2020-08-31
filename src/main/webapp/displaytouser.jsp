<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>History</title>
<link rel="stylesheet" href="Design.css">
<link rel="shortcut icon" href="/icon1.jpg" type="image/x-icon">
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
<table >
            <caption><b>Your details:</b></caption>
            <thead>
                <tr class="heading" style="height:40px;width:100%;font-size:18px;background-color:001a00;color:white;text-align:center">
                    <td>Name</td>
                    <td>District</td>
                    <td>Gender</td>
                    <td>AadharNo</td>
                    <td>e-mail Id</td>
                    <td>Mobile number</td>
                    <td>Destination</td>
                    <td>Purpose</td>
                    <td>No of persons</td>
                    <td>Start date</td>
                    <td>End date</td>
                    <td>Vehicle type</td>
                    <td>Vehicle no</td>
                    <td>Status</td>
                </tr>   
            </thead>
            <tbody>
                <c:forEach items="${lists}" var="temp">
                    <tr style="background-color:#ccffcc;height:35px;text-align:center">
                        <td>${temp.uname}</td>
                        <td>${temp.district}</td>
                        <td>${temp.gender}</td>
                        <td>${temp.proofno}</td>
                        <td>${temp.email}</td>
                        <td>${temp.mobileno}</td>
                        <td>${temp.destination}</td>
                        <td>${temp.upurpose}</td>
                        <td>${temp.noOfperson}</td>
                        <td>${temp.startDate}</td>
                        <td>${temp.endDate}</td>
                        <td>${temp.vtype}</td>
                        <td>${temp.vNo}</td>
                        <td>${temp.status}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

</body>
</html>
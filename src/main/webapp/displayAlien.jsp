    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Applicant's details</title>
<c:url var="cssUrl" value="/Design.css" />
<link rel="stylesheet" type="text/css" href="${cssUrl}" />
<link rel="shortcut icon" href="/icon1.jpg" type="image/x-icon">
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
<div style="margin-left:90%">
<a href="<c:url value='/logout' />">Click here to logout</a>  
</div><br>
<table >
            <caption><b>Applicant's details:</b></caption>
            <thead>
                <tr class="heading" style="height:40px;width:100%;font-size:18px;background-color:001a00;color:white;text-align:center">
                    <td>Id</td>
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
                    <td>Decision   </td>
                </tr>   
            </thead>
            <tbody>
                <c:forEach items="${lists}" var="temp">
                    <tr style="background-color:#ccffcc;height:35px;text-align:center">
                        <td>${temp.aid}</td>
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

                       <td><a href="/go/${temp.aid}">Go On</a></td>

                    </tr>
                </c:forEach>
            </tbody>
        </table>
</body>
</html>
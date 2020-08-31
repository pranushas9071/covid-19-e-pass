<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>application for e-pass</title>
<link rel="stylesheet" href="Design.css">
<link rel="shortcut icon" href="/icon1.jpg" type="image/x-icon">
</head>
<body>
<h3 style="padding:20px;margin-left:40%">Fill to apply for e-pass:</h3>
<div style="text-align:center">
<form action="addUser" class="admin" method="post">
  <label for="uname">Applicant name:</label>
    <input class="crt" type="text" placeholder="Enter name as per aadhar" name="uname" required >
<br>
    <label for="district">District:</label>
  <select class="crt" id="district" name="district" required>
    <option value="Ariyalur">Ariyalur</option>
    <option value="Chengalpattu">Chengalpattu</option>
    <option value="Chennai">Chennai</option>
    <option value="Coimbatore">Coimbatore</option>
    <option value="Cuddalore">Cuddalore</option>
    <option value="Dharmapuri">Dharmapuri</option>
    <option value="Dindigul">Dindigul</option>
    <option value="Erode">Erode</option>
    <option value="Kallakurichi">Kallakurichi</option>
    <option value="Kancheepuram">Kanchipuram</option>
    <option value="Kanyakumari">Kanyakumari</option>
    <option value="Karur">Karur</option>
    <option value="Krishnagiri">Krishnagiri</option>
    <option value="Madurai">Madurai</option>
    <option value="Nagapattinam">Nagapattinam</option>
    <option value="Namakkal">Namakkal</option>
    <option value="Nilgiris">Nilgiris</option>
    <option value="Perambalur">Perambalur</option>
    <option value="Pudukkottai">Pudukkottai</option>
    <option value="Ramanathapuram">Ramanathapuram</option>
    <option value="Ranipet">Ranipet</option>
    <option value="Salem">Salem</option>
    <option value="Sivaganga">Sivaganga</option>
    <option value="Tenkasi">Tenkasi</option>
    <option value="Thanjavur">Thanjavur</option>
    <option value="Theni">Theni</option>
    <option value="Thiruvallur">Tiruvallur</option>
    <option value="Thiruvarur">Tiruvarur</option>
    <option value="Thoothukudi ">Thoothukudi </option>
    <option value="Tiruchirappalli">Tiruchirappalli</option>
    <option value="Tirunelveli">Tirunelveli</option>
    <option value="Tirupathur">Tirupathur</option>
    <option value="Tiruppur">Tiruppur</option>
    <option value="Tiruvannamalai">Tiruvannamalai</option>
    <option value="Vellore">Vellore</option>
    <option value="Viluppuram">Viluppuram</option>
    <option value="Virudhunagar">Virudhunagar</option>
  </select><br>
  <label for="gender">Gender:</label>
  <select class="crt" id="gender" name="gender" required>
  <option value="male">Male</option>
  <option value="female">Female</option>
  <option value="others">Others</option>
  </select><br>
  <label for="email">email ID:</label>
    <input class="crt" type="email" placeholder="Enter e-mail ID" name="email" required >
<br>
<label for="proofno">Aadhar Number:</label>
    <input class="crt" type="text" placeholder="Enter Aadhar number" name="proofno" required >
<br>
<label for="mobileno">Mobile Number:</label>
    <input class="crt" type="text" placeholder="Enter mobile number" name="mobileno" required >
<br>
<label for="Raddress">Residential Address:</label>
<textarea rows="10" cols="50"  name="address" required></textarea>
<br>
<p style="text-align:left;"><b>Visit Address:</b></p><br>
<label for="upurpose">Purpose:</label>
    <input class="crt" type="text" placeholder="Enter the pupose of travel" name="upurpose" required >
<br>
<label for="noOfperson">No.of.persons:</label>
    <input class="crt" type="number" placeholder="Enter no.of.persons" name="noOfperson" required >
<br>
<label for="destination">Place to visit:</label>
<select class="crt" id="district" name="destination" required>
    <option value="Ariyalur">Ariyalur</option>
    <option value="Chengalpattu">Chengalpattu</option>
    <option value="Chennai">Chennai</option>
    <option value="Coimbatore">Coimbatore</option>
    <option value="Cuddalore">Cuddalore</option>
    <option value="Dharmapuri">Dharmapuri</option>
    <option value="Dindigul">Dindigul</option>
    <option value="Erode">Erode</option>
    <option value="Kallakurichi">Kallakurichi</option>
    <option value="Kanchipuram">Kanchipuram</option>
    <option value="Kanyakumari">Kanyakumari</option>
    <option value="Karur">Karur</option>
    <option value="Krishnagiri">Krishnagiri</option>
    <option value="Madurai">Madurai</option>
    <option value="Nagapattinam">Nagapattinam</option>
    <option value="Namakkal">Namakkal</option>
    <option value="Nilgiris">Nilgiris</option>
    <option value="Perambalur">Perambalur</option>
    <option value="Pudukkottai">Pudukkottai</option>
    <option value="Ramanathapuram">Ramanathapuram</option>
    <option value="Ranipet">Ranipet</option>
    <option value="Salem">Salem</option>
    <option value="Sivaganga">Sivaganga</option>
    <option value="Tenkasi">Tenkasi</option>
    <option value="Thanjavur">Thanjavur</option>
    <option value="Theni">Theni</option>
    <option value="Thoothukudi ">Thoothukudi </option>
    <option value="Tiruchirappalli">Tiruchirappalli</option>
    <option value="Tirunelveli">Tirunelveli</option>
    <option value="Tirupathur">Tirupathur</option>
    <option value="Tiruppur">Tiruppur</option>
    <option value="Tiruvallur">Tiruvallur</option>
    <option value="Tiruvannamalai">Tiruvannamalai</option>
    <option value="Tiruvarur">Tiruvarur</option>
    <option value="Vellore">Vellore</option>
    <option value="Viluppuram">Viluppuram</option>
    <option value="Virudhunagar">Virudhunagar</option>
  </select><br>

<label for="startDate">Pass start date:</label>
    <input class="crt" type="date" placeholder="dd-mm-yy" name="startDate" required >
<br>
<label for="endDate">Pass end date:</label>
    <input class="crt" type="date" placeholder="dd-mm-yy" name="endDate" required >
<br>
<p><b>Vehicle Details:</b></p><br>
<label for="vtype">Type of vehicle:</label>
    <input class="crt" type="text" placeholder="Enter the type of vehicle" name="vtype" required >
<br>
<label for="vNo">Vehicle registration number:</label>
    <input class="crt" type="text" placeholder="Enter the vehicle reg.no" name="vNo" required >
<br>
<button class="klr" type="submit">Submit and Save</button>
<button  type="button" class="cancelbtn" onclick="document.location='frotpage.jsp'">Cancel</button>
</form>
</div>
</body>
</html>
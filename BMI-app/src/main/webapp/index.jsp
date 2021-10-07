<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BMI Calculator</title>
</head>
<body>
<form action="bmi" method="post">
    Name:<input type="text" name="name"/>
    Weight:<input type="number" name="weight"/>
    Height:<input type="number" name="height"/>
    <input type="submit" value="display"/>
</form>
</body>
</html>
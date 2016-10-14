<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<h2>Calculator</h2>
	<form action="CalculatorServlet" method="post">
	<input name="num1" type="text"/>
	<span>+</span>
	<input name="num2" type="text"/>
	<span>=</span>
	<input name="sum" type="text"/><br/>
	<input name="num3" type="text"/>
	<span>*</span>
	<input name="num4" type="text"/>
	<span>=</span>
	<input name="product" type="text"/><br/>
	<input type="submit" value="Submit"/>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CalculatorResult</title>
</head>
<body>
<h2>Calculator</h2>
	<form action="CalculatorServlet" method="get">
	<input value="${result.add1}" type="text"/>
	<span>+</span>
	<input value="${result.add2}" type="text"/>
	<span>=</span>
	<input value="${result.sum}" type="text"/><br/>
	<input value="${result.mult1}" type="text"/>
	<span>*</span>
	<input value="${result.mult2}" type="text"/>
	<span>=</span>
	<input value="${result.product}" type="text"/><br/>
	<input type="submit" value="Clear"/>
	</form>
</body>
</html>
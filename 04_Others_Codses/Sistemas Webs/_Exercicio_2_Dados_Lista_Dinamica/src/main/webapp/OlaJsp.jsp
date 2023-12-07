<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	
	
	<%
	for (int i=0; i<10; i++){
		out.print("<tr>");
		for (int d=0; d<10; d++){
			int r = i * d;
			out.print("<td>");
		out.print(d + " x " + i + " = " + r);
		out.print("</td>");
		}
		out.print("</tr>");
	}
	
	%>

	</table>
</body>
</html>
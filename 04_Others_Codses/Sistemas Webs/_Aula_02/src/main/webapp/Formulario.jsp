<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="resposta.jsp">
	Nome:
	<input type="text" name="nome"/>
	<br/>
	Idade:
	<input type="text" name="idade"/>
	<br/>
	<input type="submit"/>
	</form>
	<%
		for (int i=0; i<10; i++){
			out.print(i+"<br>");
		}
	%>
</body>
</html>
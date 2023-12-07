<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Resposta</h1>
	
	<%
	String nome = request.getParameter("nome");
	int idade = Integer.parseInt(
			request.getParameter("idade"));
	
	out.print(nome + " tem " + idade + " anos");
	
	%>
</body>
</html>
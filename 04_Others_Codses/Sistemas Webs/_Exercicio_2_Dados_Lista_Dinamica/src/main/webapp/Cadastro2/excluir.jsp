<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 	Confirma a exclus�o o animal?
 	<a href="excluirsim.jsp?id=<%= request.getParameter("id") %>">Sim</a>
 	<a href="index.jsp">N�o</a>

</body>
</html>

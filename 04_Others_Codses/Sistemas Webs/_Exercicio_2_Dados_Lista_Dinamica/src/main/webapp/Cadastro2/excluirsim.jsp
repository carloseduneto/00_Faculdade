<%@page import="org.libertas.Animal"%>
<%@page import="org.libertas.AnimalDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	int id = Integer.parseInt(request.getParameter("id"));
	Animal a = new Animal();
	a.setIdanimal(id);
	
	
	//faz exclusão
	AnimalDAO adao = new AnimalDAO();
	adao.excluir(a);
	
	//redireciona para a página index
	response.sendRedirect("index.jsp");
	

%>

</body>
</html>

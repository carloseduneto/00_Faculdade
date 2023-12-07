<%@page import="projeto.LojaRoupaDAO"%>
<%@page import="projeto.LojaRoupa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Carlos' Roupas - Moda Diversa</title>
    <link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet'>
	<link rel='stylesheet' href='/Projeto/css/estillo.css' type="text/css"/>
	<link rel="icon" href="/Projeto/img/logo.png" type="image/x-icon">
</head>
<body >
<% 
	int id = Integer.parseInt(request.getParameter("id"));
	LojaRoupa ljr = new LojaRoupa();
	ljr.setId(id);
	
	
	//faz exclusão
	LojaRoupaDAO Ljrdao = new LojaRoupaDAO();
	Ljrdao.excluir(ljr);
	
	//redireciona para a página index
	response.sendRedirect("index.jsp");
	

%>
</body>
</html>

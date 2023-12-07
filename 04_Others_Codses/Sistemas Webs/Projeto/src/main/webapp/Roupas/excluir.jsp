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
<body class="excluir-bg">
    <div class="container container-excluir">
        <div class="header header-excluir">
            <h1>Carlos' Roupas</h1>
            <p class="subtitulo">Excluir</p>
        </div>
        <div class="nav-excluir">
        
        <h3>Deseja excluir o item: <%
        LojaRoupa lj = new LojaRoupa();
        LojaRoupaDAO LjrDao = new LojaRoupaDAO();
        
        lj = LjrDao.consultar(Integer.parseInt(request.getParameter("id")));
        out.print(lj.getDescricao());
        %></h3>
        	
        	<br><br>
            <a  href="excluirsim.jsp?id=<%= request.getParameter("id")%> "class="sim">Sim</a>
            
            <a href="index.jsp" class="nao">Não</a>
        </div>
    </div>
</body>
</html>

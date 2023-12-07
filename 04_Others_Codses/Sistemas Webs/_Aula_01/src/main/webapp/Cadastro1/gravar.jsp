<%@page import="org.libertas.objetos2.ListaPessoas"%>
<%@page import="org.libertas.objetos2.Pessoa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
*{
font-family: Arial;
}
.centro {
  display: flex;
  align-items: center;
  justify-content: center;
  height: 100vh; 
  width: 100%; 
  flex-direction: column;
  border: 1px solid black; 
}
</style>
</head>
<body>
	<%
	Pessoa p = new Pessoa();
			p.setNome(request.getParameter("nome"));
			p.setTelefone(request.getParameter("fone"));
			p.setEmail(request.getParameter("email"));
			
			ListaPessoas lp = new ListaPessoas();
			lp.adicionar(p);
	%>
	
	<div class="centro">
	<p>Pessoa adicionada com sucesso!</p>
	<a href="index.jsp">Voltar ao início</a>
	</div>
</body>
</html>
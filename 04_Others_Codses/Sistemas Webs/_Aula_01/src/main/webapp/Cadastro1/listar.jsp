<%@page import="org.libertas.objetos.Pessoa"%>
<%@page import="org.libertas.objetos.ListaPessoas"%>
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
	<div class="centro">
	<table border="1" width="100%">
		<th>Nome</th>
		<th>Telefone</th>
		<th>E-mail</th>
		
		<%
		
			ListaPessoas lp = new ListaPessoas();
			for(Pessoa p: lp.listar()){
				out.print("<tr>");
				out.print("<td>"+ p.getNome()+"</td>");
				out.print("<td>"+ p.getTelefone()+"</td>");
				out.print("<td>"+ p.getEmail()+"</td>");
				out.print("</tr>");
			}
		%>
		
	</table>
	<a href="index.jsp">Voltar</a>
	</div>
</body>
</html>
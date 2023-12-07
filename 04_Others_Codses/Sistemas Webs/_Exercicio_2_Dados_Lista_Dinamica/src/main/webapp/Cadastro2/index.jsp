<%@page import="org.libertas.Animal"%>
<%@page import="org.libertas.AnimalDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
*{
font-family: Arial;
background-color: yellow;
color:brown;
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
 	<h1>Cadastro Animais</h1>
 	<a href="formulario.jsp">Novo</a>
 	<table border="1" width='100%'>
 	<th>ID</th>
 	<th>Nome</th>
 	<th>Raça</th>
 	<th>Especie</th>
 	
 	<%
	AnimalDAO adao = new AnimalDAO();
	for (Animal a: adao.Listar()){
		System.out.println(a.getIdanimal());
		out.print("<tr>");
		out.print("<td>"+ a.getIdanimal()+"</td>");
		out.print("<td>"+ a.getNome()+"</td>");
		out.print("<td>"+ a.getRaca()+"</td>");
		out.print("<td>"+ a.getEspecie()+"</td>");
		out.print("<td>");
		out.print("<a href='formulario.jsp?id="+a.getIdanimal()+"'>Alterar</a>");
		out.print("<a href='excluir.jsp?id="+a.getIdanimal()+"'>Excluir</a>");
		out.print("</td>");
		out.print("</tr>");
	}
 	
 	
 		
 	%>
 	
 	</table>
 
 </div>
</body>
</html>
<%@page import="org.libertas.AnimalDAO"%>
<%@page import="org.libertas.Animal"%>
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
	<h1>Cadastro de Animal</h1>
	
	<%
		Animal a = new Animal();
		AnimalDAO adao = new AnimalDAO();
		if(request.getParameter("id")!=null){
			int id = Integer.parseInt(request.getParameter("id"));
			a = adao.consultar(id);
		} else {
			//novo (zera os valores)
			a.setIdanimal(0);
			a.setNome("");
			a.setEspecie("");
			a.setRaca("");
			
			
		}
	
	
	
	
	%>
	
	
	
	<form action="gravar.jsp">
	<input type="hidden" name="idanimal" value="<%= a.getIdanimal()%>">
	<br>	
	
	Nome: <input type="text" name="nome" value="<%= a.getNome() %>"/>
	<br>
	Raca: <input type="text" name="raca" value="<%= a.getRaca()%>"/>
	<br>
	Especie: <input type="text" name="especie" value="<%= a.getEspecie() %>"/>
	<br>
	<input type="submit" value="gravar" />
	</form>
	
	</div>
	
	
</body>
</html>
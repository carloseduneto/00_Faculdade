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
	<h1> Cadastro de Animal</h1>
	<%
	Animal a = new Animal();
	a.setNome(request.getParameter("nome"));
	a.setRaca(request.getParameter("raca"));
	a.setEspecie(request.getParameter("especie"));
	a.setIdanimal(Integer.parseInt(request.getParameter("idanimal")));
	
	
	AnimalDAO adao = new AnimalDAO();
	if(a.getIdanimal()>0){
	adao.alterar(a);
	}else{
		adao.inserir(a);
	}
	
	%>
	
</div>
</body>
</html>
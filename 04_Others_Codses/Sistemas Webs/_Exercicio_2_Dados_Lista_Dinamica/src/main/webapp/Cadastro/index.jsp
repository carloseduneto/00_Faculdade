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
	<h1>Cadastro de produtos</h1>
	<a href='formulario.jsp'>Novo</a>
	<br/>
	<a href="listar.jsp">Listar</a>
	</div>
</body>
</html>
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
	<form action="gravar.jsp">
	Nome: <input type="text" name="nome"/>
	<br>
	Telefone: <input type="text" name="fone"/>
	<br>
	E-mail: <input type="text" name="email"/>
	<br>
	<input type='submit' value="salvar"/>
	</form>
	</div>
</body>
</html>
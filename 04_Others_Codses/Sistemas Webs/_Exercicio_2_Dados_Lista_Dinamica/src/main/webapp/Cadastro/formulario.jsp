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
	<form action="gravar.jsp">
	Descrição: <input type="text" name="descricao" required="required"/>
	<br>
	
	Marca: <input type="text" name="marca" required="required"/>
	<br>
	
	Preço: <input type="text" name="preco" required="required"/>
	<br>
	
	Quantidade: <input type="text" name="quantidade" required="required"/>
	<br>
	
	<input type='submit' value="salvar"/>
	</form>
	</div>
</body>
</html>
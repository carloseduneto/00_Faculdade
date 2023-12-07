<%@page import="org.libertas.objetos2.ListaProdutos"%>
<%@page import="org.libertas.objetos2.Produtos"%>
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
	<%
	
	String valorStr = request.getParameter("preco").replace(",", ".");
	Produtos p = new Produtos();
			p.setDescricao(request.getParameter("descricao"));
			p.setMarca(request.getParameter("marca"));
			double valorDolar = Double.parseDouble(valorStr);
			p.setPrecoEmDolar(valorDolar);
			int quantidade = Integer.parseInt(request.getParameter("quantidade"));
			p.setQuantidade(quantidade);
			
			
			ListaProdutos lp = new ListaProdutos();
			lp.adicionar(p);
	%>
	
	<div class="centro">
	<p>Produto adicionada com sucesso!</p>
	<br>
	<a href='formulario.jsp'>Novo</a>
	<br>
	<a href="index.jsp">Voltar ao início</a>
	</div>
</body>
</html>
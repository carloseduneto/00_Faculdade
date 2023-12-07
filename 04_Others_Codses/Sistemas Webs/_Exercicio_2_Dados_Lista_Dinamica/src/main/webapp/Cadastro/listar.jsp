<%@page import="java.text.DecimalFormat"%>
<%@page import="org.libertas.objetos2.Produtos"%>
<%@page import="org.libertas.objetos2.ListaProdutos"%>
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
	<table border="1" width="100%">
		<th>Descrição</th>
		<th>Marca</th>
		<th>Valor em dolar</th>
		<th>Quantidade</th>
		<th>Preço em real</th>
		<th>Valor total</th>
		
		<%
				ListaProdutos lp = new ListaProdutos();
					for(Produtos p: lp.listar()){
						out.print("<tr>");
						out.print("<td>"+ p.getDescricao()+"</td>");
						out.print("<td>"+ p.getMarca()+"</td>");
						out.print("<td>"+ p.getPrecoEmDolar()+"</td>");
						out.print("<td>"+ p.getQuantidade()+"</td>");
						
						double valorReais = p.getPrecoEmDolar()*4.98;
						
						DecimalFormat df = new DecimalFormat("#.00");
						
						String valorReaisFormatado = df.format(valorReais);
						
						out.print("<td>"+ valorReaisFormatado +"</td>");
						
						
						double total = p.getQuantidade() * valorReais;

						String totalFormatado = df.format(total);
						
						out.print("<td>"+ totalFormatado +"</td>");
						out.print("</tr>");
					}
				%>
		
	</table>
	<a href="index.jsp">Voltar</a>
	</div>
</body>
</html>
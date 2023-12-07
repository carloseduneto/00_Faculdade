<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

	
	<%
	
	int quantidade = Integer.parseInt(
			request.getParameter("quantidade"));
	double preco = Double.parseDouble(
			request.getParameter("preco"));
	String descricao = request.getParameter("descricao");
	
	double valorDolar = 4.89;
	double unitario = preco * valorDolar;
	double total = preco * quantidade * valorDolar;
	
	out.print("<h1>"+descricao+"</h1>");
	
	out.print("Preço unitário: R$"+ unitario);
	out.print("<br/>Valor total: R$"+ total);
	
	%>
</body>
</html>
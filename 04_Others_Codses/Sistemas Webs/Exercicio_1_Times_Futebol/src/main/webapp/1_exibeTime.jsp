<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Resposta</h1>
	
	<%
	String time1 = request.getParameter("time1");
	int gol1 = Integer.parseInt(
			request.getParameter("gol1"));
	
	String time2 = request.getParameter("time2");
	int gol2 = Integer.parseInt(
			request.getParameter("gol2"));
	
	String nomeTime;
	int quantidadeGols;
	
	if (gol1 > gol2){
		quantidadeGols = gol1;
		nomeTime = time1;
	}else{
		quantidadeGols = gol2;
		nomeTime = time2;
	}
	
	out.print("<h1>" + nomeTime + " foi campeão, "+ quantidadeGols +" gols</h1>");
	
	%>
</body>
</html>
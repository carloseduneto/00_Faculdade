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
	
	int homens = Integer.parseInt(
			request.getParameter("homens"));
	int mulheres = Integer.parseInt(
			request.getParameter("mulheres"));
	int crianca = Integer.parseInt(
			request.getParameter("criancas"));
	
	
	out.print("<table border='1'>");
	out.print("<tr>");
	out.print("<td></td>");
	out.print("<td>Carne</td>");
	out.print("<td>Cerveja</td>");
	out.print("<td>Refrigerante</td>");	
	out.print("</tr>");
	
	out.print("<tr>");
	out.print("<td>Homens</td>");
	out.print("<td>"+homens*300+"g</td>");
	out.print("<td>"+homens*2+"L</td>");
	out.print("<td>"+homens*0.3+"L</td>");
	out.print("</tr>");
	
	out.print("<tr>");
	out.print("<td>Mulheres</td>");
	out.print("<td>"+mulheres*270+"g</td>");
	out.print("<td>"+mulheres*1.5+"L</td>");
	out.print("<td>"+mulheres*0.6+"L</td>");
	out.print("</tr>");
	
	out.print("<tr>");
	out.print("<td>Crianças</td>");
	out.print("<td>"+crianca*250+"g</td>");
	out.print("<td>"+crianca*0+"L</td>");
	out.print("<td>"+crianca*1+"L</td>");
	out.print("</tr>");
	
	out.print("<tr>");
	out.print("<td>Total</td>");
	out.print("<td>"+homens*300+mulheres*270+crianca*250+"g</td>");
	out.print("<td>"+mulheres*1.5+homens*2+crianca*0+"L</td>");
	out.print("<td>"+mulheres*1.5+homens*0.3+crianca*1+"L</td>");
	out.print("</tr>");
	
	
	out.print("</table>");
	
	
	%>
</body>
</html>
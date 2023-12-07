<%@page import="java.util.List"%>
<%@page import="projeto.LojaRoupa"%>
<%@page import="projeto.LojaRoupaDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Carlos' Roupas - Moda Diversa</title>
    <link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet'>
	<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,1,0" />
    <link rel="icon" href="/Projeto/img/logo.png" type="image/x-icon">
    <style>
          *{
           font-family: 'Montserrat';
          } 
        body {
            background-color: #f0f0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background: url(https://images.unsplash.com/photo-1611403570720-162d8829689a?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1974&q=80);
        	background-position: center;
        	background-size: cover;
        	background-attachment: fixed;
        	
        }



.container {
    text-align: center;
    background-color: #f0f0f0;
  
    height: 74vh;
    overflow-y: scroll;
}




        .header {
            background-color: #ff6b6b;
            color: #ffffff;
            padding-top: 20px;
            margin: 5px;
             
        }
        
        .subtitulo-e{
        	background-color: #ffb36b;
        	padding: 20px;
        	margin-top: 25px;
        	color: brown;
        	font-weight: bold;
        	
        	padding-right: 100px;
        	padding-left:100px;
        }

        h1 {
            font-size: 36px;
            margin: 0;
        }

        .nav {
            margin-top: 20px;
        }

        .nav a {
            text-decoration: none;
            //margin: 10px;
            //padding: 10px 10px;
            //transition: background-color 0.3s;
            
        }

        .nav a:hover, .icones-e:hover{
        color:#ff6b6b;
        }
        
        input{
        margin-top: 10px;
        font-size: 16px;
        height: 18px;
        
        }
        
 table{
 border-collapse:collapse;
 table-layout: auto;
 width: 100%; 
 
 }
 
 td, th {
  border: 1px solid;
  padding: 5px;
}
 th {
  border-color: #f0f0f0;
  font-weight: bold;
  background-color: #ffcc29;
  color: #333333;
}
 td{
  border-color: #ccc;
}

.acoes{
	border-color:#f0f0f0;
	background-color: #f0f0f0; 
}

.tabela{
padding-left: 50px;
padding-right: 50px;
}


    
    .seta-e{
    	position:relative;
    	left: -250px;
    	cursor: pointer;
    	color: black;
    	}
    
    .icones-e{
    color: #787878;
    //background-color: green;
    position: relative;
    top: 2px;
    }
    
    
    
/* Define a animação 'moveRight' */
@keyframes moveRight {
  0% {
    transform: translateX(0); /* Começa na posição inicial (0px) */
  }
  50% {
    transform: translateX(10px); /* Termina 10px à direita */
  }100%{
  transform: translateX(0px);
  }
}

/* Aplica a animação ao elemento com a classe .voltar */
.voltar {
  text-decoration: none;
  display: inline-block; /* Certifique-se de que o elemento tenha um layout em bloco ou em linha */
  transition: transform 1s ease-out; /* Adiciona uma transição suave para a transformação */
  /* Inicia a animação em loop */
}

/* Define o comportamento da animação quando o mouse está sobre o elemento */
.voltar:hover {
  animation: none; /* Remove a animação ao passar o mouse */
  transform: translateX(10px);
  animation: moveRight 1s forwards infinite;  /* Mantém o elemento na posição final após a animação */
}



.direcao{
display: flex;
flex-direction: column;
}
    </style>
</head>
<body>
<div class="direcao">

    <div class="container">
        <div class="header">
            <h1>Carlos' Roupas</h1>
            <p class="subtitulo-e">Catálogo</p>
        </div>
        
        <a href="index.jsp" class="voltar">
        <span class="material-symbols-outlined seta-e" title="Voltar">arrow_back </span>
		</a>


        <div class="nav">
        <div class="tabela">
        	<table border="-1" width='100%'>
 	<th>ID</th>
 	<th>Descrição</th>
 	<th>Categoria</th>
 	<th>Preço</th>
 	<th>Quantidade</th>
 	<th>Tamanho</th>
 	<th class="acoes"></th>
 	
 	
 	
 	<%
 	
 	
 	LojaRoupaDAO Lrdao = new LojaRoupaDAO();
 	List<LojaRoupa> listaLojaRoupas = Lrdao.Listar();
	
 	System.out.println(listaLojaRoupas);

 	for (LojaRoupa Lr : listaLojaRoupas) {
 	    out.print("<tr>");
 	    out.print("<td>" + Lr.getId() + "</td>");
 	    out.print("<td>" + Lr.getDescricao() + "</td>");
 	    out.print("<td>" + Lr.getCategoria() + "</td>");
 	   out.print("<td>R$ " + String.format("%.2f", Lr.getPreco()).replace(".", ",") + "</td>");
 	    out.print("<td>" + Lr.getQuantidade() + "</td>");
 	    out.print("<td>" + Lr.getTamanho() + "</td>");
 	    
 	    out.print("<td class='acoes'>");
 	    out.print("<a href='formulario.jsp?id=" + Lr.getId() + "'><span class='material-symbols-outlined icones-e' title='Editar'>edit</span></a> ");
 	    out.print("<a href='excluir.jsp?id=" + Lr.getId() + "'><span class='material-symbols-outlined icones-e' title='Apagar'>delete</span></a> </a>");
 	    out.print("</td>");
 	    
 	    out.print("</tr>");
 	}
 		
 	%>
 	
 	</table>
        	
        	
        	<br><br>
         </div> 
        </div>
    </div>
<div class="base"></div>

</div>    
</body>
</html>

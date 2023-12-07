<%@page import="projeto.LojaRoupaDAO"%>
<%@page import="projeto.LojaRoupa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Carlos' Roupas - Moda Diversa</title>
    <link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet'>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />
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
            background: url(https://images.unsplash.com/photo-1567958451986-2de427a4a0be?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1770&q=80);
        	background-position: center;
        	background-size: cover;
        }

        .container {
            text-align: center;
            background-color: #f0f0f0;
            height: 74vh;
        }

        .header {
            background-color: #ff6b6b;
            color: #ffffff;
            padding-top: 20px;
            margin: 5px;
             
        }
        
        .subtitulo{
        	background-color: #ffb36b;
        	padding: 20px;
        	margin-top: 25px;
        	color: brown;
        	font-weight: bold;
        	
        	padding-right: 120px;
        	padding-left:120px;
        }

        h1 {
            font-size: 36px;
            margin: 0;
        }

        .nav {
            margin-top: 40px;
        }

        .nav a {
            text-decoration: none;
            margin: 10px;
            padding: 10px 20px;
            background-color: #ffcc29;
            color: #333333;
            border-radius: 5px;
            transition: background-color 0.3s;
            
        }

        .nav a:hover {
            background-color: #ff9900;
        }
        
        input{
        margin-top: 10px;
        font-size: 16px;
        height: 18px;
        
        }
        
 
        
        .material-symbols-outlined {
        vertical-align: baseline;
        position: relative;
        top: 5px; /* Ajuste isso conforme necessário */
        left:-10px;
        
    }
    
    .icones{
    color: #787878;
    }
    
    	.seta{
    	left: -150px;
    	cursor: pointer;
    	color: black;
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
  transition: transform 1s; /* Adiciona uma transição suave para a transformação */
  /* Inicia a animação em loop */
}

/* Define o comportamento da animação quando o mouse está sobre o elemento */
.voltar:hover {
  animation: none; /* Remove a animação ao passar o mouse */
  transform: translateX(10px);
  animation: moveRight 1s forwards infinite;  /* Mantém o elemento na posição final após a animação */
}

.erro{
 color: red;
}

    </style>
</head>
<body>
    <div class="container">
        <div class="header">
            <h1>Carlos' Roupas</h1>
            <p class="subtitulo">Cadastrar peças</p>
        </div>
        
        <%
        int conferencia = 0;
		String frase = "";        
        
        LojaRoupa ljr = new LojaRoupa();
        ljr.setDescricao(request.getParameter("descricao"));
        ljr.setCategoria(request.getParameter("categoria"));

        String precoStr = request.getParameter("preco");

        if (precoStr != null && !precoStr.isEmpty() && precoStr.matches("^\\d+(\\.\\d+)?$")) {
            ljr.setPreco(Double.parseDouble(precoStr));
            conferencia += 1;
        } else {
            // Exibir mensagem de erro para o usuário, pois "preco" não é válido.
            frase = "Preço inválido!!! ";
        }


        
        String quantidadeStr = request.getParameter("quantidade");

        if (quantidadeStr != null && !quantidadeStr.isEmpty() && quantidadeStr.matches("\\d+")) {
            ljr.setQuantidade(Integer.parseInt(quantidadeStr));
            conferencia += 1;
            
        } else {
            // Exibir mensagem de erro para o usuário, pois "quantidade" não é válida.
            if(conferencia == 0){
            	frase = "Preço e quantidade inválidos!!!  ";
            }else{
            frase = "Quantidade inválida!!! ";
            }
    	}

        ljr.setTamanho(request.getParameter("tamanho"));
        ljr.setId((Integer.parseInt(request.getParameter("id"))));
    	
    	LojaRoupaDAO ljrdao = new LojaRoupaDAO();
    	if(conferencia == 2){
    		System.out.println("O id da roupa: "+ljr.getId());
    	if(ljr.getId()>0){
    	ljrdao.alterar(ljr);
    		out.print("<div class='nav'>");
    		out.print("<br><h2>Atualizado com <br>sucesso!!!</h2>");
    	}else{
    		ljrdao.inserir(ljr);
    		out.print("<div class='nav'>");
    		out.print("<br><h2>Cadastrado com <br>sucesso!!!</h2>");
    		out.print("<br><a href='formulario.jsp'>Cadastrar Novamente</a>");
    	}
    	}else{
    		out.print("<div class='nav'>");
    		out.print("<h2 class='erro'>"+frase+"<br>Insira valores válidos!!!</h2>");
    		out.print("<br><a href='formulario.jsp'>Cadastrar Novamente</a>");
    		
    	}
        %>
        

	<br><br>
        
        	
        	<br>
            <a href="index.jsp" ><span class="material-symbols-outlined">home</span>Inicio</a>
        </div>
    </div>
</body>
</html>

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
    <link rel='stylesheet' href='/Projeto/css/estillo.css' type="text/css"/>
    <link rel="icon" href="/Projeto/img/logo.png" type="image/x-icon">
    <style>
          
        body {
          
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
        


        h1 {
            font-size: 36px;
            margin: 0;
        }


        
 
        
        
    

    	



    </style>
</head>
<body class="formulario-bg">
<%
		LojaRoupa lr = new LojaRoupa();
		LojaRoupaDAO Lrdao = new LojaRoupaDAO();
		if(request.getParameter("id")!=null){
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println(id);
			lr = Lrdao.consultar(id);
			System.out.println(lr.getId());
			System.out.println(lr.getDescricao());
			
			
		} else {
			// Limpando os valores
			lr.setId(0);
			lr.setCategoria("");
			lr.setDescricao("");
			lr.setTamanho("");
			lr.setPreco(-1);
			lr.setQuantidade(-1);
			
			
		}
		
	
	
	
	
	%>



    <div class="container">
        <div class="header">
            <h1>Carlos' Roupas</h1>
            <p class="subtitulo-f">Cadastrar peças</p>
        </div>
        <a href="index.jsp" class="voltar">
        <span class="material-symbols-outlined seta" title="Voltar">arrow_back </span>
		</a>


        <div class="nav">
        	<form action="gravar.jsp" method="GET">
        	<div class="centroicone">     
        	
        	<input type="hidden" name="id" value="<%= lr.getId()%>">   	
        	<span class="material-symbols-outlined icones">description</span><input type="text" name="descricao" placeholder="Descrição" value = "<%= lr.getDescricao()%>" required> <br>
        	</div>
        	<span class="material-symbols-outlined icones">category</span><input type="text" name="categoria" placeholder="Categoria" value = "<%= lr.getCategoria()%>" required> <br>
        	<span class="material-symbols-outlined icones">paid</span><input type="text" name="preco" placeholder="Preço (R$)" value = "<%
        
        	if(lr.getPreco()==-1){
        	out.print("");
        	}else{
        		out.print(lr.getPreco());
        	}
        	%>" required> <br>
        	<span class="material-symbols-outlined icones">grain</span><input type="text" name="quantidade" placeholder="Quantidade" value = "<%
        	if(lr.getQuantidade()==-1){
        		out.print("");
        	}else{
        		out.print(lr.getQuantidade());
        	}
        	
        	
        	%>" required> <br>
        	<span class="material-symbols-outlined icones">straighten</span><input type="text" name="tamanho" placeholder="Tamanho" value = "<%= lr.getTamanho()%>" required> <br>
        	
        	
        	
        	
        	<br>
        	<%
        	if(request.getParameter("id")!=null){
        		out.print("<input type='submit' value='Atualizar!' class='cadastrar'>");
        	}else{
        		out.print("<input type='submit' value='Cadastrar!' class='cadastrar'>");	
        	}
        	
        	%>
            
            
        	</form>
        </div>
    </div>
</body>
</html>

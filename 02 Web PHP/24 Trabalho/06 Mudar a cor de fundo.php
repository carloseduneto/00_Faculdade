<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>EXERCÍCIO 6</title>
</head>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<style>
.material-symbols-outlined {
  font-variation-settings:
  'FILL' 0,
  'wght' 400,
  'GRAD' 0,
  'opsz' 48
}
.deLadinho{
	position:relative;
	left: 15px;
	top: 10 px;
	font-weight: 400;
}
h1, p{
	text-align: center;
}
.positivo{
	color: #2dc64f;
}
.negativo{
	color: #f5060a;
}
.zero{
	color:#24b1ff;
}
body{
font-family:'Roboto', sans-serif;
background: url(https://images.unsplash.com/photo-1502691876148-a84978e59af8?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80);
background-size: cover;
margin: 0px;
}

.container {
width: 100vw;
height: 100vh;
display: flex;
flex-direction: row;
justify-content: center;
align-items: center;
}

.box {
width: 400px;
height: 400px;
background: #fff;
    backdrop-filter: blur(16px) saturate(180%);
    -webkit-backdrop-filter: blur(16px) saturate(180%);
    background-color: rgba(255, 255, 255, 0.65);
    border-radius: 12px;
    border: 1px solid rgba(209, 213, 219, 0.3);
}
.texto{
	color:grey;
}
a:link{
text-decoration: none;
}
a:visited{
	color: black;
}
a:hover {text-decoration: none;}
</style>
<body>
<div class="container">
<div class="box">
<a href="index.html">
<span class="material-symbols-outlined">
<div class="deLadinho">
</br>
arrow_back 
</div>
</span>
</a>
	<h1 align="center">EXERCÍCIO 6</h1>
	<p>Escolha uma cor de fundo, digite um texto e escolha a cor dele</p>
	</br>
	<form method="GET" action="06 Mudar a cor destino.php" align="center">
	<input type="text" name="texto" placeholder="Texto" required /></br></br>
	
	
	<label for="corDeFundo">Cor de fundo:</label>
	<select name="corDeFundo">
    <option value="laranjaf">Laranja</option>
    <option value="amarelof">Amarelo</option>
    <option value="vermelhof">Vermelho</option>
    <option value="roxof">Roxo</option>
	</select>
	</br></br>
	
	<label for="corDoTexto">Cor do texto:</label>
	<select name="corDoTexto">
    <option value="laranjat">Laranja</option>
    <option value="amarelot">Amarelo</option>
    <option value="vermelhot">Vermelho</option>
    <option value="roxot">Roxo</option>
	</select>
	</br></br>
	<input type="submit" value="Enviar"/>
	<input type="reset" value="Limpar"/>
	</form>


	</div>
	</div>
</body>
</html>
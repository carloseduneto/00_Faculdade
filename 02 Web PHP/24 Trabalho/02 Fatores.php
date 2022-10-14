<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>EXERCÍCIO 2</title>
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
background: url(https://images.unsplash.com/photo-1634128221889-82ed6efebfc3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80);
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
height: 300px;
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
	<h1 align="center">EXERCÍCIO 2</h1>
	<p>Calcula fatorial de um número qualquer</p>
	</br>
	<form method="GET" action="02 Fatores.php" align="center">
	<input type="text" name="numero" placeholder="Digite um número inteiro"/></br></br>
	<input type="submit" value="Enviar"/>
	<input type="reset" value="Limpar"/>
	</form>

<?php 
	if (isset($_GET["numero"])) {//isset - VERIFICA SE O PARAMETRO CHEGOU
		
		$numero = $_GET["numero"];//RECUPARA VALOR DO PARÂMETRO E ATRIBUI ESTE A UMA VARIÁVEL
		
		if (is_numeric($numero)) {//VERIFICA SE ESTA VARIÁVEL TEM UM VALOR NUMÉRICO
		
		$resultado=1;
		for ($i=1; $i <=$numero; $i++){
			$resultado=$resultado*(($numero+1)-$i);
			//echo ($numero+1)-$i;
		}
		echo '</br>'.'<div align="center"><b>'.$numero."! = ".$resultado.'</b></div>';
?>

<?php
		} else {
?>
	<h4 align="center">Deve ser inteiro</h4>
<?php		
		}
	} else {
?>
	<!--<h1 align="center">Valor inválido!</h1>-->
<?php
	}
?>	

	</div>
	</div>
</body>
</html>
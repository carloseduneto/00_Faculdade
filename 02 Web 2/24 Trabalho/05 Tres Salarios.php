<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>EXERCÍCIO 5</title>
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
background: url(https://images.unsplash.com/photo-1580519542036-c47de6196ba5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=871&q=80);
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
height: 600px;
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
</br></br>
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
	<h1 align="center">EXERCÍCIO 5</h1>
	<p>Calcular 3 nomes, salários e respectivas funções</p>
	</br>
	<form method="GET" action="05 Tres Salarios.php" align="center">
	<div class=dividir>
	<span>1º Funcionário</span></br>
	<input type="text" name="nome1" placeholder="Nome" required /></br>
	<input type="text" name="funcao1" placeholder="Função" required /></br>
	<input type="text" name="salario1" placeholder="Salário" required /></br>
	</div>
	</br>
	<div class=dividir>
	<span>2º Funcionário</span></br>
	<input type="text" name="nome2" placeholder="Nome" required /></br>
	<input type="text" name="funcao2" placeholder="Função" required /></br>
	<input type="text" name="salario2" placeholder="Salário" required /></br>
	</div>
	</br>
	<div class=dividir>
	<span>3º Funcionário</span></br>
	<input type="text" name="nome3" placeholder="Nome" required /></br>
	<input type="text" name="funcao3" placeholder="Função" required /></br>
	<input type="text" name="salario3" placeholder="Salário" required /></br>
	</div>
	</br></br>
	<input type="submit" value="Enviar"/>
	<input type="reset" value="Limpar"/>
	</form>
	</br>
	<div align="center">
<?php 
	if (isset($_GET["nome1"])) {
		$nome1 = $_GET["nome1"];
		if (isset($_GET["funcao1"])) {
			$funcao1 = $_GET["funcao1"];
				if (isset($_GET["salario1"])) {
					$salario1 = $_GET["salario1"];
	if (isset($_GET["nome2"])) {
		$nome2 = $_GET["nome2"];
		if (isset($_GET["funcao2"])) {
			$funcao2 = $_GET["funcao2"];
				if (isset($_GET["salario2"])) {
					$salario2 = $_GET["salario2"];
	if (isset($_GET["nome3"])) {
		$nome3 = $_GET["nome3"];
		if (isset($_GET["funcao3"])) {
			$funcao3 = $_GET["funcao3"];
				if (isset($_GET["salario3"])) {
					$salario3 = $_GET["salario3"];
		if (is_numeric($salario1)) {
		if (is_numeric($salario2)) {		
		if (is_numeric($salario3)) {
			
			if ($salario1>$salario2 && $salario1>$salario3){
				echo "O salário de <b>{$nome1}</b>, que é <b>{$funcao1}</b>, é o maior";
				$salvaMaior=$salario1;
			}else if ($salario2>$salario3){
				echo "O salário de <b>{$nome2}</b>, que é <b>{$funcao2}</b>, é o maior";
				$salvaMaior=$salario2;
			}else{
				echo "O salário de <b>{$nome3}</b>, que é <b>{$funcao3}</b>, é o maior";
				$salvaMaior=$salario3;
			}
			
			if ($salario1<$salario2 && $salario1<$salario3){
				$salvaMenor=$salario1;
			}else if ($salario2<$salario3){
				$salvaMenor=$salario2;
			}else{
				$salvaMenor=$salario3;
			}
			
			$conta=($salvaMaior/$salvaMenor);
			$conta=$conta-1;
			$conta=$conta*100;
			echo " e recebe <b>".number_format($conta,0)."%</b> a mais que o menor salário";
?>

<?php
				}}} else {
?>
	<h4 align="center">Digite um valor inteiro</h4>
<?php		
		}
		}
		}
		}}}
	}}}
	} else {
?>
	<!--<h1 align="center">Valor inválido!</h1>-->
<?php
	}
?>	
</div>
	</div>
	</div>
</body>
</html>
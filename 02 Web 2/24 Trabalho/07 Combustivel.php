<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>EXERCÍCIO 7</title>
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
background: url(https://images.unsplash.com/photo-1498887960847-2a5e46312788?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=869&q=80);
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
	<h1 align="center">EXERCÍCIO 7 </h1>
	<p>Insira os valores da viagem, para saber quantos litros gasta:</p>
	<form method="GET" action="07 Combustivel.php" align="center">
	
	<label for="Horas">Horas:</label>
	<input type="text" name="Horas" placeholder="(h)" size="5" required /></br>
	
	<label for="VelocidadeMedia">Velocidade média:</label>
	<input type="text" name="VelocidadeMedia" placeholder="(Km/h)" size="5" required /></br></br>
	
	<input type="submit" value="Enviar"/>
	<input type="reset" value="Limpar"/>
	</form>

<?php 
	if (isset($_GET["VelocidadeMedia"])) {
		if (isset($_GET["Horas"])) {
		$VelocidadeMedia = $_GET["VelocidadeMedia"];
		$Horas= $_GET["Horas"];
		
		if (is_numeric($VelocidadeMedia)) {
			if (is_numeric($Horas)){
		$Quilometros=$VelocidadeMedia*$Horas;
		$LitrosDeCombustivel=$Quilometros*12;
		echo '<ul type="square">';
		echo '<li>Velocidade média: '.$VelocidadeMedia.'km/h </li>';
		echo '<li>Tempo: '.$Horas.'h</li>';
		echo '<li>Distância: '.$Quilometros.'km</li>';
		echo '<li>Litros de combustível gastos: <b>'.$LitrosDeCombustivel.'L</b></li>';
		echo '</ul>';
		}} else {
?>
	<h4 align="center">Deve ser inteiro</h4>
<?php		
		}
	}} else {
?>
	<!--<h1 align="center">Valor inválido!</h1>-->
<?php
	}
?>	

	</div>
	</div>
</body>
</html>
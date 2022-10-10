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
background: url();
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
left: 10px;
rigth: 10px;
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
<?php 
	if (isset($_GET["texto"])) {
		$texto = $_GET["texto"];

	}else{
			echo "Volte e insira algo";
	}		
	if (isset($_GET["corDeFundo"])) {
		$corDeFundo = $_GET ["corDeFundo"];		
	}
	
	if ($corDeFundo == "laranjaf" ){
	$fundo='#f77a0c';
	}else if ($corDeFundo == "vermelhof" ){
	$fundo='#d4100d';
	}else if ($corDeFundo == "amarelof" ){
	$fundo='#ffd000';
	}else if ($corDeFundo == "roxof" ){
	$fundo='#820ad1';
	}
	
	
	
	
	if (isset($_GET["corDoTexto"])) {
	$corDoTexto = $_GET ["corDoTexto"];		
	}
	
	if ($corDoTexto == "laranjat" ){
	$corTexto='#f77a0c';
	}else if ($corDoTexto == "vermelhot" ){
	$corTexto='#d4100d';
	}else if ($corDoTexto == "amarelot" ){
	$corTexto='#ffd000';
	}else if ($corDoTexto == "roxot" ){
	$corTexto='#820ad1';
	}
?>

<body style="background-color:  <?php echo $fundo; ?>">
<div class="container">
<div class="box">
<a href="06 Mudar a cor de fundo.php">
<span class="material-symbols-outlined">
<div class="deLadinho">
</br>
arrow_back 
</div>
</span>
</a>
	<p><font color= <?php echo $corTexto; ?>><b><?php echo $texto; ?></b></font></p>

	</div>
	</div>
</body>
</html>
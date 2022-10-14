<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>EXERCÍCIO 8</title>
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

<?php 
	if (isset($_GET["Usuario"])) {
		if (isset($_GET["Senha"])) {
			$Usuario=$_GET["Usuario"];
			$Senha=$_GET["Senha"];
			if ($Usuario=="aluno.top" && $Senha=="SI_22"){
				$Fundo="https://images.unsplash.com/photo-1514525253161-7a46d19cd819?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=774&q=80";
			}else{
				$Fundo="https://cdn.pixabay.com/photo/2020/04/14/18/25/no-access-5043758_1280.jpg";
							}
	}} else {
	}
?>	

<body background="<?php echo $Fundo; ?>")>
<div class="container">
<div class="box">
<a href="08 Tela de Login.php">
<span class="material-symbols-outlined">
<div class="deLadinho">
</br>
arrow_back 
</div>
</span>
</a>
	</br>
	</br>
<?php 
	if (isset($_GET["Usuario"])) {
		if (isset($_GET["Senha"])) {
			$Usuario=$_GET["Usuario"];
			$Senha=$_GET["Senha"];
			if ($Usuario=="aluno.top" && $Senha=="SI_22"){
				echo '<h1 align="center">LOGADO	COM SUCESSO!!!</h1>';
				echo '<p><font size="2">Quase morri fazendo esse trabalho, mas deu tudo certo</font></p>';
			}else{
				echo '</br></br><h1 align="center">ACESSO NEGADO!!!</h1>';
							}
	}} else {
	}
?>	
	</div>
	</div>
</body>
</html>
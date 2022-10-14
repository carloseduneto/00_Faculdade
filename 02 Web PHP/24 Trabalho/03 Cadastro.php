<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>EXERCÍCIO 3</title>
</head>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<style>
table, th, td{
	width: 28%;
	border: 1px solid;
	border-collapse: collapse;
	text-align: center;
}
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
p{
	text-align: center;
}

body{
font-family:'Roboto', sans-serif;
background: url(https://images.unsplash.com/photo-1512758017271-d7b84c2113f1?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80);
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
	color:white;
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
</br></br></br>
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
	<h1 align="center">EXERCÍCIO 3</h1>
	<p>Insira os dados a seguir</p>
	<form method="GET" action="03 Cadastro.php" align="center">
	<input type="text" name="nome" placeholder="Nome" /></br></br>
	<input type="text" name="endereco" placeholder="Endereço"  /></br></br>
	<input type="text" name="bairro" placeholder="Bairro" /></br></br>
	<input type="text" name="cidade" placeholder=" Cidade"  /></br></br>
	<input type="text" name="email" placeholder=" Email"  /></br></br>
	<input type="text" name="cep" placeholder=" CEP"  /></br></br>
	<input type="submit" value="Enviar"/>
	<input type="reset" value="Limpar"/>
	</form>
<div>
<?php 
	if (isset($_GET["nome"])) {
		if (isset($_GET["endereco"])) {
			if (isset($_GET["bairro"])) {
				if (isset($_GET["cidade"])) {
					if (isset($_GET["email"])) {
						if (isset($_GET["cep"])) {
			
		
		$nome = $_GET["nome"];
		$endereco= $_GET["endereco"];
		$bairro= $_GET["bairro"];
		$cidade= $_GET["cidade"];
		$email= $_GET["email"];
		$cep= $_GET["cep"];
		echo '<ul type="square">';
	echo '<li>'. "Nome: ". $nome .'</li>';
	echo '<li>'. "Endereço: ". $endereco .'</li>';
	echo '<li>'. "Bairro: ". $bairro .'</li>';
	echo '<li>'. "Cidade: ". $cidade .'</li>';
	echo '<li>'. "E-mail: ". $email .'</li>';
	echo '<li>'. "CEP: ". $cep .'</li>';	
	echo '</ul>';
	
	
	}else{
		$cep=" ";
	}
	}else{
		$email=" ";
	}
				}else{
					$cidade=" ";
				}
			}else{
			$bairro=" ";	
			}
		}else{
		$endereco= " ";
		}
	}else{
	$nome = " ";
	}
	
	
?>
</div>

	</div>
	</div>
</body>
</html>
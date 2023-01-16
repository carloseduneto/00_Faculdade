<!DOCTYPE thml>
<html lang="pt-br">
<head>
	<title>Formulários HTML com PHP</title>
</head>
<body>
	<h1>Exemplo do Formulário com PHP</h1>
	<a href="Formularios.php">Clique aqui para voltar</a>
	
	<?php 
	if(isset ($_POST["txtNome"])){
		$nome= $_POST["txtNome"];
		
		echo("<h2>Olá ".$nome."</h2>");
	}
	?>

</body>
</html>
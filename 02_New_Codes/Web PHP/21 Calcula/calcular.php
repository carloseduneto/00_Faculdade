<!DOCTYPE thml>
<html lang="pt-br">
<head>
	<title>Formulários HTML com PHP</title>
</head>
<body>
	<h1>Exemplo do Formulário com PHP</h1>
	<a href="index.php">Clique aqui para voltar</a>
	
	<?php 
	if(isset ($_GET["Valor1"])){
		$Valor1= $_GET["Valor1"];
		
	}else if(isset ($_GET["Valor2"])){
		$Valor2= $_GET["Valor2"];

	}
	
	if(isset ($_GET["botao"])){
		$botao= $_GET["botao"];
	}
	
	$botaoFinal=$_GET["botao"];
	$Valor3=$_GET["Valor1"];
	$Valor4=$_GET["Valor2"];
	
	if ($Valor3 || $Valor4 == "a" || "b" || "c"){
		echo "Errão da por**";
	
	
	
	if ($botaoFinal=="Soma"){
		echo $Valor3."+".$Valor4."=".($Valor3+$Valor4);
	}else if ($botaoFinal=="Multiplica"){
		echo $Valor3."x".$Valor4."=".($Valor3*$Valor4);
	}else if ($botaoFinal=="Subtrai"){
		echo $Valor3."/".$Valor4."=".($Valor3/$Valor4);
	}
	}
	
	?>

</body>
</html>
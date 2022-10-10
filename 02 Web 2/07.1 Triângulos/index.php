<html>
	<head>
		<title> CATEGORIA DO ATLETA </title>
	</head>
		<body>
		<h1 align="center"> Atividade 4!<h1>
		
		<?php
		$lado1=5;
		$lado2=4;
		$lado3=2;
		$soma1=$lado1+$lado2;
		$soma2=$lado2+$lado3;
		$soma3=$lado1+$lado3;
		if ($soma1>$lado3&&$soma2>$lado1&&$soma3>$lado2) {
			echo "é triangulo";
			
		} else{
			echo "Não é um triangulo";
		}
		?>
	</body>
			
</html>
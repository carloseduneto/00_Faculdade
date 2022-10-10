<html>
	<head>
		<title> CATEGORIA DO ATLETA </title>
	</head>
		<body>
		<h1 align="center"> Atividade 4.2!<h1>
		
		<?php
		$lado1=4;
		$lado2=4;
		$lado3=2;
		
		if ($lado1==$lado2&&$lado1==$lado3&&$lado2==$lado3){
			echo "é equilatero";
		}else if($lado1==$lado2||$lado1==$lado3||$lado2==$lado3){
			echo "é isóceles";
		}else if($lado1!=$lado2&&$lado1!=$lado3&&$lado2!=$lado3){
			echo "é escaleno";
		}else{
			echo "Não é um triangulo";
		}
		?>
	</body>
			
</html>
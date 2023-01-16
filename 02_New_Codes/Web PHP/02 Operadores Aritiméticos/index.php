<html lang="pt-br">
	<head>
	<title>Primeira página</title>
	<meta charset="UTF-8"/>
	</head>
    <body>
		<p align="center"> Um outro exemplo de HTML!<p>
		<?php
			echo  " <p align='center'> Um exemplo de PHP!</p>";
		?>
	
	
		<p align="center"> 
			<?php
				echo  " Um exemplo de PHP!</br>";
			?>
			
		<?php
			$num1 = 10;
			$num2 = 12.5;
			$soma = $num1 + $num2;
			echo $soma;
			
			$num1 = 10;
			$num2 = 12.5;
			$subtracao = $num1 - $num2;
			echo "</br> {$subtracao}";
			
			$num1 = 10;
			$num2 = 12.5;
			$multiplicacao = $num1 * $num2;
			echo "</br> {$multiplicacao}";
			
			$num1 = 10;
			$num2 = 2;
			$divisao = $num1 / $num2;
			echo "</br> {$divisao}";
		?>
		
		
		
		<p>
	
    </body>
</html>
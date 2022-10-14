<html lang="pt-br">
	<head>
	<title>Primeira página</title>
	<meta charset="UTF-8"/>
	</head>
    <body>
		<h1 align="center"> Um outro exemplo de HTML!<h1>
		
		<?php
		$k1=7;
		$b1=7;
		
		if($k1>$b1){
			echo "O número {$k1} é maior que {$b1}";
		}
		
		else if ($b1>$k1){
			echo "O número {$b1} é maior que {$k1}";
		}
		
		else{
			echo "Fak-ya";
		}
		?>
    </body>
</html>
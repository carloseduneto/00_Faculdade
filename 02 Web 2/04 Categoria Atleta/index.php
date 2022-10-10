<html lang="pt-br">
	<head>
	<title>Primeira página</title>
	<meta charset="UTF-8"/>
	</head>
    <body>
		<h1 align="center"> Atividade 1 !<h1>
		<?php
		$nome="Carlos";
		
		$idade2=2000;
		
		$idade=2022-2000;
		
		if($idade<14){
			echo "{$nome} é Mirim";
			
		}else if ($idade==14 || $idade==15){
			echo "{$nome} é Infantil";
		
		}else if ($idade==16 || $idade==17){
			echo "{$nome} é Juvenil";
		
		}else if ($idade>=18 && $idade<=20){
			echo "{$nome} é Juniors";
			
		}else if ($idade>20){
			echo "{$nome} é Profissional";
		}
		?>
    </body>
</html>
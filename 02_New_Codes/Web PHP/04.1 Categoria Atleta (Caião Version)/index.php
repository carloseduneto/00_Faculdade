<html>
	<head>
		<title> CATEGORIA DO ATLETA </title>
	</head>
	<body>
		<h1 align="center">CATEGORIA DO ATLETA</h1>
		
			<?php
				$nome="Carlos";
				$ano=2000;
				$ano_atual=2022;
			
				$idade = $ano_atual-$ano;
				echo $idade;
			
				$categoria = "Oopss!";
			
				if ( $idade < 14) {
					$categoria="MIRIM";
			
				}else if ($idade == 14 || $idade == 15){
					$categoria="INFANTIL";
				
				}else if ($idade ==16  || $idade == 17){
					$categoria="JUVENIL";
			
				}else if ($idade >=18  || $idade <= 20){
					$categoria="JUNIORS";
				
				}else{
					$categoria="PROFISSIONAL";
				}
				?>
			
				<p> O atleta se encaixa na categoria <b>
			
				<?php 
					echo $categoria;
				?>
				</b></p>
	</body>
			
</html>
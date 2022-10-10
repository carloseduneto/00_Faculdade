<html>
	<head>
		<title> Aula 10 </title>
	</head>
		<body>
		<h1 align="center">  <h1>
		
		<?php
			function foo(){
				function bar(){
					echo "Eu não existo até foo() ser chamada. <br>";
				}
			}
			//Nós não podemos chamar bar() ainda porque ela não foi definida
			foo();
			
			//Agora nós podemos chamar bar(), porque o processamento de foo() tornou a primeira acessível 
			bar();
			?>
	</body>
			
</html>
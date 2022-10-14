<html>
	<head>
		<title> Aula 10 </title>
	</head>
		<body>
		<h1 align="center">  <h1>
		
		<?php
			$makefoo = true;
			//Nós não podemos chamar foo() daqui porque ela ainda não existge mas podemos chamar de bar()
			bar();
			
			if ($makefoo){
				function foo() {
					echo "Eu não existo até que o programa passe por aqui<br>";
					
				}
			}
			
			//Agora nós podemos chamar foo() porque $makefoo foi avaliado como true
			if ($makefoo) foo();
			
			function bar(){
				echo "Eu existo imediatamente desde o programa começar. <br>";
			}
			?>
	</body>
			
</html>
<html>
	<head>
		<title> Aula 10 </title>
	</head>
		<body>
		<h1 align="center">  <h1>
		
		<?php
				function rec ($a) {
					if ($a < 20){
						echo $a. "</br>";echo rec($a+1);
					
				}
			}
			rec(1);
			?>
	</body>
			
</html>
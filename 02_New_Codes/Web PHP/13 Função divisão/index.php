<body>
<?php
	function verificarDivisao ($divisor, $dividendo){
	//verificação
	if ($divisor == 0 ) {
		echo "Dividor inválido";
		
	}else {
		echo "Resultado: " . ($dividendo/$divisor);
	}
	}
	
	verificarDivisao(9,8);
?>
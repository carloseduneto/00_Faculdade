<head>
<title>01 IMC</title>
</head>

	<?php 
	function imc ($altura, $massa){
		$resultado=$massa/($altura*$altura);
		echo number_format($resultado,4);
	}	
		
	$altura=1.65;
	$massa=70;
	
	imc($altura, $massa);
	?>
<head>
<title>07 Duas funções com três argumentos</title>
</head>
<?php
function TresArgumentos ($PrimeiroArgumento, $SegundoArgumento, $TerceiroArgumento){
		$Total=$PrimeiroArgumento+$SegundoArgumento+$TerceiroArgumento;
		echo "=".$Total;
		
	function Media ($Soma){
	$Resultado=$Soma/3;
	echo "<br>A média da soma é: ".$Resultado;
	}
	
	
		Media($Total);
}
echo $Item1=100,"+</br>";
echo $Item2=22,"+</br>";
echo $Item3=1,"+</br>";
TresArgumentos($Item1,$Item2,$Item3);
?>
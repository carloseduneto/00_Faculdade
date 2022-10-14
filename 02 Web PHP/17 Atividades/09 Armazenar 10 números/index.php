<head>
<title>09 Armazena 10 números</title>
</head>
<?php 
$listaDeDezNumeros=array (-47, 11, 44,-77,-1 , -134 , 22 , -9 ,0.934 ,-5.34);
echo '<pre>';print_r($listaDeDezNumeros);echo '</pre>';

$positivos=0;
$listaPositivos=array();

$negativos=0;
$listaNegativos=array();

$pares=0;
$listaPares=array();

$impares=0;
$listaImpares=array();

for ($i=0; $i<10; $i++) {
if ($listaDeDezNumeros[$i]>0){
	$positivos+=1;
	array_push($listaPositivos, $listaDeDezNumeros[$i] );
}else{
	$negativos+=1;
	array_push($listaNegativos, $listaDeDezNumeros[$i] );
}

if ($listaDeDezNumeros[$i]%2==0){
	$pares+=1;
	array_push($listaPares, $listaDeDezNumeros[$i] );
} else {
	$impares=$impares+1;
	array_push($listaImpares, $listaDeDezNumeros[$i] );
}
}

echo str_repeat ("◼",10);
echo "</br>Negativos: {$negativos} ";
echo '<pre>';print_r($listaNegativos);echo '</pre>';

echo str_repeat ("◼",10);
echo "</br>Positivos: {$positivos} ";
echo '<pre>';print_r($listaPositivos);echo '</pre>';

echo str_repeat ("◼",10);
echo "</br>Pares: {$pares} ";
echo '<pre>';print_r($listaPares);echo '</pre>';

echo str_repeat ("◼",10);
echo "</br>Ímpares: {$impares} ";
echo '<pre>';print_r($listaImpares);echo '</pre>';
?>
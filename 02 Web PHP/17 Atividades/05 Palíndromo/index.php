<head>
<title>05 Palíndromo</title>
</head>
<?php 
echo "<h1 align='center'> É um palíndromo?</h1>";

$frase1="A dama admirou o rim da amada";
$frase2="A sacada da casa";
$frase3="O rato otario";
$frase4="Subi no onibus";
$frase5="Anulou a aluna";

$frase1SemEspaco= str_replace(" ", "", $frase1);
$frase1Maiuscula=strtoupper($frase1SemEspaco);
$frase1Invertida=strrev($frase1Maiuscula);

if ($frase1Maiuscula == $frase1Invertida){
	echo "{$frase1} <b>é um palíndromo!</b></br>";
}else{
	echo "{$frase1} <b>não é um palíndromo!<b></br>";
}

$frase2SemEspaco= str_replace(" ", "", $frase2);
$frase2Maiuscula=strtoupper($frase2SemEspaco);
$frase2Invertida=strrev($frase2Maiuscula);

if ($frase2Maiuscula == $frase2Invertida){
	echo "{$frase2} <b>é um palíndromo!</b></br>";
}else{
	echo "{$frase2} <b>não é um palíndromo!</b></br>";
}

$frase3SemEspaco= str_replace(" ", "", $frase3);
$frase3Maiuscula=strtoupper($frase3SemEspaco);
$frase3Invertida=strrev($frase3Maiuscula);

if ($frase3Maiuscula == $frase3Invertida){
	echo "{$frase3} <b>é um palíndromo!</b></br>";
}else{
	echo "{$frase3} <b>não é um palíndromo!</b></br>";
}

$frase4SemEspaco= str_replace(" ", "", $frase4);
$frase4Maiuscula=strtoupper($frase4SemEspaco);
$frase4Invertida=strrev($frase4Maiuscula);

if ($frase4Maiuscula == $frase4Invertida){
	echo "{$frase4} <b>é um palíndromo!</b></br>";
}else{
	echo "{$frase4} <b>não é um palíndromo!</b></br>";
}

$frase5SemEspaco= str_replace(" ", "", $frase5);
$frase5Maiuscula=strtoupper($frase5SemEspaco);
$frase5Invertida=strrev($frase5Maiuscula);

if ($frase5Maiuscula == $frase5Invertida){
	echo "{$frase5} <b>é um palíndromo!</b></br>";
}else{
	echo "{$frase5} <b>não é um palíndromo!</b></br>";
}

?>
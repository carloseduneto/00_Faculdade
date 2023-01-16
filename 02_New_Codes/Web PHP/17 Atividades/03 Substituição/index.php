<head>
<title>03 Substituição</title>
</head>
<?php
$frase="Acentuação é algo que não se usa na língua inglesa.";

$acentuacao="Acentuação";
$acentuacaoTroca= "Acentuacao";

$e="é";
$eTroca= "e";

$nao="não";
$naoTroca= "nao";

$lingua="língua";
$linguaTroca= "lingua";

$novaFraseAcentuacao= str_replace ( $acentuacao, $acentuacaoTroca, $frase);
$novaFraseE= str_replace ( $e, $eTroca, $novaFraseAcentuacao);
$novaFraseNao= str_replace ( $nao, $naoTroca, $novaFraseE);
$novaFraseLingua= str_replace ( $lingua, $linguaTroca, $novaFraseNao);

$a="a";
$aMaiusculo="A";
$quatro="4";

$e2="e";
$tres="3";

$i="i";
$um="1";

$o="o";
$zero="0";

$u="u";
$sete="7";


$trocaA= str_replace ( $a, $quatro, $novaFraseLingua);
$trocaAMaiusculo= str_replace ( $aMaiusculo, $quatro, $trocaA);
$trocaE= str_replace ( $e2, $tres, $trocaAMaiusculo);
$trocaI= str_replace ( $i, $um, $trocaE);
$trocaO= str_replace ( $o, $zero, $trocaI);
$trocaU= str_replace ( $u, $sete, $trocaO);

echo $trocaU;
?>
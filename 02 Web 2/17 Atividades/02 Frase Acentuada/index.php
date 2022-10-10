<head>
<title>02 Frase acentuada</title>
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





echo $novaFraseLingua;
?>
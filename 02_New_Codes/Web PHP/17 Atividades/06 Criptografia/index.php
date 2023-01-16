<head>
<title>06 Criptografia</title>
</head>
<?php 
$TextoCriptografado="^1*125$( +%35 3%$(57_9_ @5*";

$Criptografia1A=str_replace("1", "a", $TextoCriptografado);
$Criptografia2B=str_replace("2", "b", $Criptografia1A);
$Criptografia3C=str_replace("3", "c", $Criptografia2B);
$Criptografia4D=str_replace("4", "d", $Criptografia3C);
$Criptografia5E=str_replace("5", "e", $Criptografia4D);
$Criptografia6F=str_replace("6", "f", $Criptografia5E);
$Criptografia7G=str_replace("7", "g", $Criptografia6F);
$Criptografia8H=str_replace("8", "h", $Criptografia7G);
$Criptografia9I=str_replace("9", "i", $Criptografia8H);
$Criptografia0J=str_replace("0", "j", $Criptografia9I);
$CriptografiaExclamacaoK=str_replace("!", "k", $Criptografia0J);
$CriptografiaArrobaL=str_replace("@", "l", $CriptografiaExclamacaoK);
$CriptografiaHashtagM=str_replace("#", "m", $CriptografiaArrobaL);
$CriptografiaCifraoN=str_replace("$", "n", $CriptografiaHashtagM);
$CriptografiaPorcentagemO=str_replace("%", "o", $CriptografiaCifraoN);
$CriptografiaCirncunflexoP=str_replace("^", "p", $CriptografiaPorcentagemO);
$CriptografiaEComercialQ=str_replace("&", "q", $CriptografiaCirncunflexoP);
$CriptografiaAsteriscoR=str_replace("*", "r", $CriptografiaEComercialQ);
$CriptografiaParentesesEsquerdaS=str_replace("(", "s", $CriptografiaAsteriscoR);
$CriptografiaParentesesDireitaT=str_replace(")", "t", $CriptografiaParentesesEsquerdaS);
$CriptografiaSublinhadoU=str_replace("_", "u", $CriptografiaParentesesDireitaT);
$CriptografiaMaisV=str_replace("+", "v", $CriptografiaSublinhadoU);
$CriptografiaIgualW=str_replace("=", "w", $CriptografiaMaisV);
$CriptografiaChaveEsquerdaX=str_replace("{", "x", $CriptografiaIgualW);
$CriptografiaChaveDireitaY=str_replace("}", "y", $CriptografiaChaveEsquerdaX);
$CriptografiaPontoEVigulaZ=str_replace(";", "z", $CriptografiaChaveDireitaY);

echo $CriptografiaPontoEVigulaZ
?>
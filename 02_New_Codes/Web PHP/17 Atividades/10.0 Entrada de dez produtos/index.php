<head>
<title>10.0 Entrada de dez produtos </title>
</head>
<?php 
$ListaDeFrutasEValores= array (
"Banana" => 3.25,
"Pêssego" => 5.99,
"Maçã" => 10.99,
"Laranja" => 2.99,
"Limão" => 2.49,
"Kiwi" => 6.99,
"Melancia" => 2.29,
"Mamão" => 6.89,
"Pera" => 5.79,
"Melão" => 4.79);

echo "Lista com 10 itens e seus respectivos valores";
echo "<pre>";print_r ($ListaDeFrutasEValores); echo "</pre>";

$frase="^1*125$( +%35 3%$(57_9_ @5*";
$alpha= array ('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
$alphascript=array('1','2','3','4','5','6','7','8','9','0','!','@','#','$','%','^','&', '*', '(',')','_','+','=','{','}',';');

for ($i=1; $i<count($alpha); $i++) {
	$frase=str_replace($alphascript[$i], $alpha[$i], $frase);
}
echo $frase;

$Produto1 = array (
"Descrição" => "Computador 1", "Valor" => 1235.89);
$Produto2 = array (
"Descrição" => "Computador 2", "Valor" => 1655.89);
$Produto3 = array (
"Descrição" => "Computador 3", "Valor" => 7788.89);


$Produtos = array ($Produto1, $Produto2, $Produto3);

for ($i=0; $i< count ($Produtos); $i++){
echo "</br>Descrição: ". $Produtos[$i]["Descrição"]."/ Valor: ". $Produtos[$i]["Valor"];
}
?>
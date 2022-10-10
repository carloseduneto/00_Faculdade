<html>
<head>
<title>10.1 Tabela descontos e parcelas </title>
</head>
<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>

<style> table, th, td {
  border: 2px solid #19004d;
  border-collapse: collapse;
  text-align: center;
  font-family: 'Roboto', sans-serif;
  font-size: 30px;
}
th{
	color: #e9e1fa;
	background-color: #19004d;
}
td{
	color:#19004d;
	background-color: #e9e1fa;
</style>

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
"Melão" => 2.5);

$ListaDeFrutas= array(
"Banana", "Pêssego", "Maçã", "Laranja", "Limão", "Kiwi", "Melancia", "Mamão", "Pera", "Melão");
?>


<table style="width:100%">
  <tr>
    <th>Produto</th>
    <th>Valor</th>
    <th>Valor à vista</th>
	<th>Valor parcelado em 6X</th>
  </tr>
 
	<?php 
	for ($i=0; $i<10; $i++){
	echo '<tr>';
	echo '<td>'. $ListaDeFrutas[$i] .'</td>';
	echo '<td>'."R$ ".$ListaDeFrutasEValores[$ListaDeFrutas[$i]].'</td>'; 
	echo '<td>'."R$ ". number_format ($ListaDeFrutasEValores[$ListaDeFrutas[$i]]*0.9,2).'</td>'; 
	echo '<td>'."R$ ". number_format ($ListaDeFrutasEValores[$ListaDeFrutas[$i]]/6,2).'</td>'; 
	echo '</tr>';
	}
	?>
</table>
</html>
<!DOCTYPE thml>
<html lang="pt-br">
<head>
	<title>Tabela Preços</title>
</head>
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

$Itens=array();
if (isset($_POST["txtItem"])){
	$Item1=$_POST["txtItem"];
	array_push($Itens,$Item1);
}
$Valores=array();
if (isset($_POST["nmbValor"])){
	$Valor1=$_POST["nmbValor"];

	array_push($Valores,$Valor1);
}
?>

<table style="width:100%">
</br>
  <tr align="center">
    <th>Produto</th>
    <th>Valor</th>
    <th>Valor à vista</th>
	<th>Valor parcelado em 6X</th>
  </tr>
 <?php 
	for ($i=0; $i<1; $i++){
	echo '<tr>';
	echo '<td>'. $Itens[$i] .'</td>';
	echo '<td>'."R$ ".$Valores[$i].'</td>'; 
	echo '<td>'."R$ ". number_format ($Valores[$i]*0.9,2).'</td>'; 
	echo '<td>'."R$ ". number_format ($Valores[$i]/6,2).'</td>'; 
	echo '</tr>';
	}
	?>
	

</table>
	</br>
	<form method="POST" action="PaginaInicial.php" align="right">
	<input type="submit" value="Voltar" title="Voltar"/>
	</form>
</html>
<!DOCTYPE thml>
<html lang="pt-br">
<head>
	<title>Tabela Preços</title>
</head>

<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>

<style>
body {
    background-color: #4c1cb2;
    background-image: 
        radial-gradient(at 47% 33%, hsl(259.20, 71%, 93%) 0, transparent 59%), 
        radial-gradient(at 82% 65%, hsl(259.48, 100%, 15%) 0, transparent 59%);
	font-family: "Roboto", sans-serif
}

 table, th, td {
  border: 2px solid #19004d;
  border-collapse: collapse;
  text-align: center;
  font-family: 'Roboto', sans-serif;
  font-size: 16px;
}

#submit {
  display: inline-block;
  padding: 0.5em 1.7em;
  margin: 0 0.1em 0.1em 0;
  border: transparent;
  border-radius: 2em;
  box-sizing: border-box;
  text-decoration: none;
  font-family: "Roboto", sans-serif;
  font-weight: 300;
  color: #19004d;
  text-shadow: 0 0.04em 0.04em rgba(199, 142, 248, 0.8);
  text-align: center;
  transition: all 0.2s;
}
.negrito{
	font-weight:bold;
}
#submit:hover {
  color: #e9e1fa;
  background-color: #19004d;
}

.container {
width: 100vw;
height: 100vh;
display: flex;
flex-direction: row;
justify-content: center;
align-items: center;
}

.caixa {
width: 400px;
height: 300px;
background: #fff;
backdrop-filter: blur(16px) saturate(136%);
-webkit-backdrop-filter: blur(16px) saturate(136%);
background-color: rgba(255, 255, 255, 0.82);
border-radius: 12px;
border: 1px solid rgba(209, 213, 219, 0.3);
}
.border-none {
  border-collapse: collapse;
  border: none;
}

.border-none td {
  border: 1px solid black;
}

.border-none tr:first-child td {
  border-top: none;
}

.border-none tr:last-child td {
  border-bottom: none;
}

.border-none tr td:first-child {
  border-left: none;
}

.border-none tr td:last-child {
  border-right: none;
}
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

<div class="container">
<div class="caixa">
<table style="width:100%" class="border-none">
</br>
  <tr class="negrito">
    <td>Produto</td>
    <td>Valor</td>
    <td>Valor à vista</td>
	<td>Valor parcelado em 6X</td>
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
	<input type="submit" value="Voltar" id="submit" title="Voltar"/>
	</form>
</div>
</div>	
</html>
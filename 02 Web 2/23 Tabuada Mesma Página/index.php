<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>TABUADA</title>
</head>
<style>
table, th, td{
	width: 28%;
	border: 1px solid;
	border-collapse: collapse;
	text-align: center;
}
</style>
<body>
<div align="center">
</br></br></br></br></br></br></br></br>
	<h1 align="center">Olá Index</h1>
	<form method="GET" action="index.php">
	<input type="text" name="numero" placeholder="Digite um número inteiro"/>
	<input type="submit" value="Enviar"/>
	<input type="reset" value="Limpar"/>
	</form>
	
	</div>
	<?php 
	if (isset($_GET["numero"])) {//isset - VERIFICA SE O PARAMETRO CHEGOU
		
		$numero = $_GET["numero"];//RECUPARA VALOR DO PARÂMETRO E ATRIBUI ESTE A UMA VARIÁVEL
		
		if (is_numeric($numero)) {//VERIFICA SE ESTA VARIÁVEL TEM UM VALOR NUMÉRICO
		
		
?>
<table align="center">
<tr align="center">
	<td colspan="2">Tabuada do <?php echo $numero; ?></td>
</tr>
<tr>
	<td>Operação</td>
	<td>Resultado</td>
</tr>

<?php
			for ($i=0; $i <= 100; $i++) {//SABEMOS O LIMITE QUE VAMOS PERCORRER, UTILIZA-SE O FOR DE 0 ATÉ 9
				//echo $_GET["numero"]." * ".$i."=".($_GET["numero"]*$i);
				//echo "</br>";
?>
<tr align="center">
	<td><?php echo $i. " x ". $numero;?></td>
	<td><?php echo $i*$numero;?></td>
</tr>

<?php
			}
?>
</table>
	<h1 align="center">Deve ser inteiro</h1>
<?php		
		}
	} else {
?>
	<h1 align="center">Valor inválido!</h1>
<?php
	}
?>
</body>
</html>
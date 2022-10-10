<style>
table, th, td{
	width: 28%;
	border: 1px solid;
	border-collapse: collapse;
	text-align: center;
}
</style>

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
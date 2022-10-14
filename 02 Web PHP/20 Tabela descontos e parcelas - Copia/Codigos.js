var ControleCampo=1;
function AdicionarCampo(){
	ControleCampo++;
	document.getElementById("formulario").insertAdjacentHTML('beforeend','<form method="POST" action="TabelaPrecos.php" align="center"><input type="text" name="txtItem'+ControleCampo+'" placeholder="Produto"/><input type="value" name="nmbValor'+ControleCampo+'" placeholder="Valor"/><button type="button" onclick="AdicionarCampo()"> + </button></br></br><input type="submit" value="Ver"/><input type="reset" value="Limpar"/></form>')
}
<--!
//Get tem limite de 2000 Caracteres
//Post sem limite
//Recuperar $_GET["NomeDoObjeto"]  informação vai ficar visível na URL
//Recuperar $_POST["NomeDoObjeto"]
//input pode inserir vários obejtos -->

<form method='GET' action="RecebeDados.php">
	<label for "cNome'>Nome"</label></br>
	<input type='text' name='txtNome' id='cNome' placeholder="Nome"/>
	</br>
	<input type='password' name="txtSenha" size="20"/> </br>
	<input type="number" name="txtIdade" min="0" max="150"/> </br>
	<textarea name="txtMsg" rows="4" cols="20"> msgs</textarea> </br>
	<select name="cbEstado">
		<option value="MG">Minas Gerais</option>
		<option value="SP">São Paulo</option>
	</select></br>
	<input type="checkbox" name="ckbConcordo" id="cCOncord"/>
	<label for="cConcordo"> Li e concordo com todos os termos... </label></br>
	
<fildset>
	<legend> Sexo</legend>
	<input type="radio" name="sexo" value="Maculino" id="cMasc"/>
	</br>
	<label for="cMasc">Masculino</label></br>
	<input type="radio" name="sexo" value="Feminino" id="cFemi"/>
	</br>
	<label for="cFemi">Feminino</label></br>
	</fieldset> </br> </br>
	<input type="submit" value="Enviar"/> </br>
	<input type="reset" value="Limpar Geral"/> </br>
</form>
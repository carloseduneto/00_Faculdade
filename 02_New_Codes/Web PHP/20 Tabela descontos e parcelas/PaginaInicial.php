<!DOCTYPE thml>
<html lang="pt-br">
<head>
	<title>Formulários HTML com PHP</title>
	<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
	<style>
body {
    background-color: #5dd3b8;
    background-image: 
        radial-gradient(at 47% 33%, hsl(162.42, 72%, 35%) 0, transparent 59%), 
        radial-gradient(at 82% 65%, hsl(197.59, 79%, 57.99999999999999%) 0, transparent 55%);
	margin: 0px;
	font-family: 'Roboto', sans-serif;
}
form{
	font-family:'Roboto', sans-serif;
}
/* Glassmorphism card effect */
.card {
    backdrop-filter: blur(16px) saturate(136%);
    -webkit-backdrop-filter: blur(16px) saturate(136%);
    background-color: rgba(255, 255, 255, 0.82);
    border-radius: 12px;
    border: 1px solid rgba(209, 213, 219, 0.3);
}

.container {
width: 100vw;
height: 100vh;
display: flex;
flex-direction: row;
justify-content: center;
align-items: center;
}

.box {
width: 400px;
height: 300px;
background: #fff;
backdrop-filter: blur(16px) saturate(136%);
-webkit-backdrop-filter: blur(16px) saturate(136%);
background-color: rgba(255, 255, 255, 0.82);
border-radius: 12px;
border: 1px solid rgba(209, 213, 219, 0.3);
}
	</style>
</head>
<body>

</br></br>
<div class='container'>
<div class="box">
<h2 align="center">CADASTRO DE PRODUTOS</h2>
<form method="POST" action="TabelaPrecos.php" align="center">
	<input type="text" name="txtItem" placeholder="Produto"/>
	<input type="value" name="nmbValor" placeholder="Valor"/>
	<!--<button type="button" onclick="AdicionarCampo()"> + </button>-->
	</br></br>
	<input type="submit" value="Ver"/>
	<input type="reset" value="Limpar"/>
</div>
</div>
</div>
</form>

</body>
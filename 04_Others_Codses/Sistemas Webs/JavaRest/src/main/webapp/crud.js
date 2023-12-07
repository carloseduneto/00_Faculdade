var valores = [];
var idpessoa = 0;

function novo(){
    var form = document.getElementById("formulario");
    var lista = document.getElementById("lista");

    //mostra o formulário 
    form.style.display = "block";
    //esconde lista 
    lista.style.display = "none";

    //lista os inputs
    idpessoa = 0;
    var nome = document.getElementById("nome");
    var telefone = document.getElementById("telefone");
    var idade = document.getElementById("idade");
    nome.value = "";
    telefone.value = "";
    idade.value = "";
    
    //joga o foco no 1º campo:
    nome.focus();
}

function alterar(i){
    var form = document.getElementById("formulario");
    var lista = document.getElementById("lista");

    //mostra o formulário 
    form.style.display = "block";
    //esconde lista 
    lista.style.display = "none";

    //lista os inputs
    idpessoa = valores[i].idpessoa;
    var nome = document.getElementById("nome");
    var telefone = document.getElementById("telefone");
    var idade = document.getElementById("idade");
    nome.value = valores[i].nome;
    telefone.value = valores[i].telefone;
    idade.value = valores[i].idade;
    
    //joga o foco no 1º campo:
    nome.focus();
}

function salvar(){
	//valida campos obrigarotios
	if(document.getElementById("nome").value  == ""){
		alert("campo Nome é obrigaratório!");
		return;
	}
	
    //pega os dados digitados pelo usuário e monta um objeto
    var p = {
		idpessoa: idpessoa,
		nome:  document.getElementById("nome").value,
		telefone: document.getElementById("telefone").value,
		idade: document.getElementById("idade").value
	};
   
   	//define se o método sera para inserir ou alterar
   	if (idpessoa == 0) {
		   metodo = "POST";
	   } else {
		   metodo = "PUT";
	   }
   
	//envia os dados para o servidor
	mostraLoading("aguarde, salvando dados...")
	fetch("http://localhost:8080/JavaRest/Pessoa",
		{method: metodo,
	    body: JSON.stringify(p)
		}
	).then(resp => resp.json())
	.then(function (Retorno){
		escondeLoading();
		alert(Retorno.mensagem);
		
		var form = document.getElementById("formulario");
    	var lista = document.getElementById("lista");

    	//escondeo o formulário 
    	form.style.display = "none";
    	//mostra a lista 
    	lista.style.display = "block";
    	
    	// recarrega lista
    	listar();
    	
	});
    
}
function excluir(i){
 	idpessoa = valores[i].idpessoa; 
 
	//envia os dados para o servidor
	mostraLoading("aguarde, excluindo...");
	fetch("http://localhost:8080/JavaRest/Pessoa/" + idpessoa,
		{method: "DELETE",
		}
	).then(resp => resp.json())
	.then(function (retorno){
		escondeLoading();
		alert(retorno.mensagem);
		
		var form = document.getElementById("formulario");
    	var lista = document.getElementById("lista");

    	//escondeo o formulário 
    	form.style.display = "none";
    	//mostra a lista 
    	lista.style.display = "block";
    	
    	// recarrega lista
    	listar();
    	
	});
    
}

function cancelar(){
    var form = document.getElementById("formulario");
    var lista = document.getElementById("lista");

    //escondeo o formulário 
    form.style.display = "none";
    //mostra a lista 
    lista.style.display = "block";
}

function listar(){
	var lista = document.getElementById("dados");
    //limpa a lista
    lista.innerHTML = "<tr><td colspan>aguarde, carregando...</td></tr>";
	
    fetch ("http://localhost:8080/JavaRest/Pessoa")
    .then(resp => resp.json())
    .then(dados => mostrar(dados));
}

function mostrar(dados){
	valores = dados;
    var lista = document.getElementById("dados");
    //limpa a lista
    lista.innerHTML ="";
    //percoorre a lista 
    for (var i in dados){
        lista.innerHTML += "<tr>"
                        + "<td>" + dados[i].idpessoa + "</td>"
                        + "<td>" + dados[i].nome + "</td>"
                        + "<td>" + dados[i].telefone + "</td>"
                        + "<td>" + dados[i].idade + "</td>"
                        + "<td>"
                        + "<input type='button' value='A' onclick='alterar("+i+")'/>"
                        + "<input type='button' value='X' onclick='excluir("+i+")'/>"
                        +"</td>"
                        + "</tr>";
                        
    }
}

function mostraLoading(msg){
	var loa = document.getElementById("loading");
    var con = document.getElementById("conteudo");
    loa.style.display = "block";
	con.style.display = "none";
	loa.innerHTML = msg;
}

function escondeLoading(){
	var loa = document.getElementById("loading");
    var con = document.getElementById("conteudo");
    loa.style.display = "none";
	con.style.display = "block";
	
}
listar();
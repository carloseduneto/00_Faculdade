//PARTE VISUAL
function clicar(tecla){
let teclaPressionada = false;

document.addEventListener('keydown', function(event) {
  teclaPressionada = true;
  tecla.style.boxShadow="1px 1px black";
  tecla.style.position= "relative";
  tecla.style.left='4px';
  tecla.style.top="4px";
  clicou()
});
  
document.addEventListener('keyup', function(event) {
  teclaPressionada = false;
  tecla.style.boxShadow="5px 5px black";
  tecla.style.position= "relative";
  tecla.style.left='0px';
  tecla.style.top="0px";
  saiu()
});}
      
function clicou(){
  numero1.style.boxShadow="1px 1px black";
  numero1.style.position= "relative";
  numero1.style.left='4px';
  numero1.style.top="4px";  
}

function saiu(){
  numero1.style.boxShadow="5px 5px black";
  numero1.style.position= "relative";
  numero1.style.left='0px';
  numero1.style.top="0px";  
}



//PARTE LÓGICA
document.addEventListener('click', interecaoCliqueTeclado);

document.addEventListener('keydown', interecaoCliqueTeclado);


let lista = []
let valorDaVariavel="inicio";
let exibicao = document.getElementById("exibicao");
let exibicaoSuperior = document.getElementById("superior");
let temporario = 0
let primeiraVez = 0
let backup;
let operador = "";
function interecaoCliqueTeclado(event) {
  if (valorDaVariavel != "inicio"){
    lista = tranformaEmLista(valorDaVariavel)
    // pontoEVirgula(lista, ",", ".")
  }
  // código a ser executado quando ocorre um clique
  if (event.type === 'click') {

    // seleciona todos os botões com a classe "numeros"
    if (event.target.classList.contains('numeros')) {
      var valor = event.target.value;
      console.log('Valor do botão clicado: ' + valor);
      lista.push(valor)

      // imprimirMaior(lista)
            
      }
        
    
  // código a ser executado quando uma tecla é pressionada
  } else if (event.type === 'keydown') {

    switch (event.key) {
      case "1":
        let numero1 = document.getElementById("numero1")
        clicar(numero1)
        lista.push('1');
        break;
    
      case "2":
        let numero2 = document.getElementById("numero2");
        clicar(numero2);
        lista.push('2');
        break

      default:
        break;
    }      
    
        
  }



  if (valor == "+") {
    if (lista[-2] == "+" || lista[-2] =="-") {
      lista.splice(-2, 1)
    }
    // pontoEVirgula(valorDaVariavel, ",", ".")
    console.log(valorDaVariavel)
    temporario = Number(valorDaVariavel) + temporario
    temporario = String(temporario)
    lista.pop()
    operador = "+"
    console.log(temporario)
    imprimirSuperior(String(temporario)+ " +")
    limparLista(lista)
  }
  
  else if (valor=="-") {
    if (lista[-2] == "+" || lista[-1] =="-") {
      lista.splice(-2, 1)
    }
    console.log(lista)
    temporario = Number(valorDaVariavel ) - temporario
    lista.pop()
    operador = "-"
    imprimirSuperior(temporario + " -")
    limparLista(lista)
  }
    
  else if (valor == ",") {
    lista.pop();
    lista.push('.');
    // lista.splice(-1, 1, ".")
    console.log("aaa",lista[-1])
  }

  else if (valor == "=") {
    switch (operador) {
      case "+":
        imprimirSuperior(temporario + " + " + valorDaVariavel + " = ")
        valorDaVariavel = Number(temporario) + Number(valorDaVariavel);
        console.log(valorDaVariavel)
        limparLista(lista)
        lista=tranformaEmLista(String(valorDaVariavel))
        console.log(lista)
        break;
    
      default:
        break;
    }
  }


  else if (valor == "⌫") {
    if (lista.length > 0) {
      lista.pop()
      lista.pop()
    }
    else {
      lista.push("0")
    }
  }

  console.log(typeof (valorDaVariavel));
  console.log(lista)
  // pontoEVirgula(lista, ".", ",")
  console.log("a", lista)
  

  valorDaVariavel = (transformaEmVariavel(lista))
  limparLista(lista)
  console.log(lista)

  // valorDaVariavel=Number(valorDaVariavel)
  imprimirMaior(valorDaVariavel)
  valorDaVariavel=String(valorDaVariavel)
}
console.log("Fora da variável: ", valorDaVariavel)

//PARTE MATEMÁTICA
function reverso() {
  valorDaVariavel = valorDaVariavel * (-1);
  valorDaVariavel = String(valorDaVariavel);
  imprimirMaior(valorDaVariavel)
  console.log("Fora da variável: ", valorDaVariavel)
}

//PARTE FUNCIONAL
function imprimirMaior(aSerExibido){      
  // let impressao = "";
  exibicao.innerHTML = aSerExibido;
}

function imprimirSuperior(aSerExibido) {
  exibicaoSuperior.innerHTML = aSerExibido;
}
    

function transformaEmVariavel(lista){      
  let variavel = ""    
  for (let indice = 0; indice <= lista.length - 1; indice++){
      variavel += lista[indice];
  }
    return variavel
}


function tranformaEmLista(variavel) {
  for (let indice = 0; indice <= variavel.length - 1; indice++){
    lista.push(variavel[indice])
  }
  return lista;
}

console.log(lista)

function limparLista(lista) {
  if (lista.length > 0) {
    lista.pop()
    limparLista(lista)
  }
}

 function limpar() {
    document.getElementById("exercicio").reset()
   imprimirMaior("0")
   imprimirSuperior("⠀")
   valorDaVariavel = "0"
   temporario = 0
}

function pontoEVirgula(lista, virgulaPonto, oposto) {
  for (let indice = 0; indice < lista.length; indice++){
    console.log("entrou")
    if (lista[indice] === virgulaPonto) {
      lista[indice] = oposto;
      console.log("trocou")
    }
  }

}


 
// function apagar() {
//   console.log(valorDaVariavel.length)
//   if (valorDaVariavel.length > 0) {
//     let remocao = []
//     remocao = tranformaEmLista(valorDaVariavel)
//     console.log("r", remocao)
//     remocao.pop()
//     console.log("r", remocao)
//     valorDaVariavel = transformaEmVariavel(remocao)
//     // lista = remocao
//     console.log(valorDaVariavel)

//   } else {
//     valorDaVariavel == "0";
//   }
// }
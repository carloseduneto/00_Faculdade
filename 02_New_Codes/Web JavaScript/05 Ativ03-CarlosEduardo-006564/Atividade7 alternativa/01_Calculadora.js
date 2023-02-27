{// //PARTE VISUAL
  // function clicar(tecla){
  // let teclaPressionada = false;

  // document.addEventListener('keydown', function(event) {
  //   teclaPressionada = true;
  //   tecla.style.boxShadow="1px 1px black";
  //   tecla.style.position= "relative";
  //   tecla.style.left='4px';
  //   tecla.style.top="4px";
  //   clicou()
  // });
  
  // document.addEventListener('keyup', function(event) {
  //   teclaPressionada = false;
  //   tecla.style.boxShadow="5px 5px black";
  //   tecla.style.position= "relative";
  //   tecla.style.left='0px';
  //   tecla.style.top="0px";
  //   saiu()
  // });}
      
  // function clicou(){
  //   numero1.style.boxShadow="1px 1px black";
  //   numero1.style.position= "relative";
  //   numero1.style.left='4px';
  //   numero1.style.top="4px";
  // }
  
  // function saiu(){
    //   numero1.style.boxShadow="5px 5px black";
    //   numero1.style.position= "relative";
    //   numero1.style.left='0px';
    //   numero1.style.top="0px";  
    // }
  }
    


//PARTE LÓGICA
document.addEventListener('click', interecaoCliqueTeclado);

document.addEventListener('keydown', interecaoCliqueTeclado);


let lista = []
let valorDaVariavel="0";
let exibicao = document.getElementById("exibicao");
let exibicaoSuperior = document.getElementById("superior");
let temporario = 0
let operador = "";
let registroCalculo = false
function interecaoCliqueTeclado(event) {
  valorDaVariavel = String(valorDaVariavel)  
  lista = tranformaEmLista(valorDaVariavel)

  // código a ser executado quando ocorre um clique
  if (event.type === 'click') {

    // 🔢 seleciona todos os botões com a classe "numeros"
    if (event.target.classList.contains('numeros')) {
      var valor = event.target.value;
      console.log('Valor do botão clicado: ' + valor);
      lista.push(valor)
      
    }
    
    
    // 🔣 seleciona todos os simbolos
    if (event.target.classList.contains("simbolos")) {
      var simbolo = event.target.value;
      console.log("Simbolo clicado: " + simbolo)
      registroCalculo = false
    }
        
    if (event.target.classList.contains("vazio")) {
      var vazio = event.target.value;
      console.log("Clicou no vazio: " + vazio)
      registroCalculo = false
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

  // 👋👋👋
  if (registroCalculo == true) {
    limpar()
    limparLista(lista)
    lista.push(valor)
    registroCalculo = false
  }

  
  

  // ➕➗➖🟰
  if (simbolo == "+") {

    console.log(valorDaVariavel)
    temporario = Number(valorDaVariavel) + Number(temporario)
    operador = "+"
    imprimirSuperior(Number(temporario) + " +")
    limparLista(lista)
    lista.unshift("0")
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
    console.log("menos um", lista[lista.length-1])
    if ("." == lista[lista.length-1] && "." == lista[lista.length-2]) {
      lista.pop()
    }
  }

  else if (simbolo == "=") {
    switch (operador) {
      case "+":
        imprimirSuperior(temporario + " + " + valorDaVariavel + " = ")
        valorDaVariavel = Number(temporario) + Number(valorDaVariavel);

        valorDaVariavel = Number(valorDaVariavel)
        console.log("tipo", typeof (valorDaVariavel))
        console.log("valor da variável",valorDaVariavel)
        console.log("temporário", temporario)
        console.log("lista ", lista)
        limparLista(lista)
        lista=tranformaEmLista(String(valorDaVariavel))
        registroCalculo = true
        break;
    
      default:
        break;
    }
  }

  
  else if (simbolo == "⌫") {
    if (lista.length > 0) {
      lista.pop()
      if (lista.length == 0) {
        lista.push("0")
      }
    }
  }
  
  
  if (lista[0] == "0" && lista.length>1 && lista[1]!=".") {
    lista.shift()
  }
  
  
  console.log(typeof (valorDaVariavel));
  console.log(lista)
  // pontoEVirgula(lista, ",", ".")
  console.log("a", lista)

  valorDaVariavel = (transformaEmVariavel(lista))
  limparLista(lista)
  console.log(lista)


  // if (valorDaVariavel == "undefined") {
  //   valorDaVariavel = "0"
  // }

  imprimirMaior(valorDaVariavel)
  
  valorDaVariavel = String(valorDaVariavel)
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

//  function limpar() {
//     // document.getElementById("exercicio").reset()
//   //  limparLista(lista)
//   //  lista.unshift("0")
//    valorDaVariavel = "0"
//    valorDaVariavel = Number(valorDaVariavel)
//     temporario = "0"
//    imprimirMaior("0")
//    imprimirSuperior("⠀")
//    console.log("Ué?")
//    console.log(lista)
// }

 function limpar() {
    // document.getElementById("exercicio").reset()
   imprimirMaior("0")
   imprimirSuperior("⠀")

   limparLista(lista)
  //  lista.unshift("0")
   console.log("Lista limpar ", lista)
   valorDaVariavel = "0"
   console.log("Valor da variável limpar ", valorDaVariavel)
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

function nada() {
  console.log("Clique vazio")
  registroCalculo=false
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
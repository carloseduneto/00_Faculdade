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
let temporario = "comeco";
let operador = "";
let registroCalculo = false
function interecaoCliqueTeclado(event) {
  valorDaVariavel = String(valorDaVariavel)  
  lista = tranformaEmLista(valorDaVariavel)
    pontoEVirgula(lista, ",", ".")


  // código a ser executado quando ocorre um clique
  if (event.type === 'click') {

    // 🔢 seleciona todos os botões com a classe "numeros"
    if (event.target.classList.contains('numeros')) {
      var valor = event.target.value;
      lista.push(valor)
      
    }
    
    
    // 🔣 seleciona todos os simbolos
    if (event.target.classList.contains("simbolos")) {
      var simbolo = event.target.value;
      registroCalculo = false
    }
        
    if (event.target.classList.contains("vazio")) {
      var vazio = event.target.value;
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
        
  valorDaVariavel = valorDaVariavel.replace(/,/g, ".")
  // 👋👋👋
  if (registroCalculo == true) {
    
    limpar()
    limparLista(lista)
    console.log("Aqui")
    if (valor == ",") {
      lista.unshift("0");
      console.log("Passou")
    }
    lista.push(valor)
    console.log(valor)
    registroCalculo = false

  }

  
  

  // ➕➗➖🟰
  if (simbolo == "+") {
    operador = "+"
    calcular("+")
    
  }
  
  else if (simbolo=="-") {
    operador = "-";
    calcular("-")
  }
  else if (simbolo=="x") {
    operador = "x";
    calcular("x")
  }
  else if (simbolo=="÷") {
    operador = "÷";
    calcular("÷")
  }
  
  else if (valor == ",") {
    lista.pop();
    lista.push('.');
    pontos=verificaPonto(lista)
    if ("." == lista[lista.length-1] && "." == lista[lista.length-2]) {
      lista.pop()
      // if (pontos > 1) {
        //   lista.pop()
        // }
      }
      
      if (pontos > 1) {
        lista.pop()
    }
    



  }
  else if (simbolo == "%") {
    var temporario3;
    temporario3 = (valorDaVariavel * (temporario / 100))
    console.log(contarCasasDecimais(temporario3))
    if (contarCasasDecimais(temporario3)>9) {
      temporario3=temporario3.toFixed(8)
    }
    console.log(temporario3)
    valorDaVariavel = String(temporario3)
    console.log(valorDaVariavel)
    limparLista(lista)
    lista=tranformaEmLista(valorDaVariavel)
    }

    
    else if (simbolo == "=") {
      switch (operador) {
        case "+":
          registroCalculo = true
          if (contarCasasDecimais(temporario) > 10) {
            temporario = temporario.toFixed(8);
          }
          


          temporario = temporario.replace(".", ",")
          valorDaVariavel = valorDaVariavel.replace(".", ",")
          
          
          
          imprimirSuperior(temporario + " + " + valorDaVariavel + " = ")
          
          
          
          temporario = temporario.replace(/,/g, ".")
          valorDaVariavel = valorDaVariavel.replace(/,/g, ".")
          
          
          valorDaVariavel = Number(temporario) + Number(valorDaVariavel);
          
          valorDaVariavel = Number(valorDaVariavel)
          limparLista(lista)
          lista=tranformaEmLista(String(valorDaVariavel))
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
  
  
  
  // pontoEVirgula(lista, ".", ",")
  if (lista.length > 9) {
    lista.pop()
  }
  consultaZeros(lista)

  valorDaVariavel = (transformaEmVariavel(lista))
  // if (contarCasasDecimais(valorDaVariavel)>10) {
  //   valorDaVariavel=valorDaVariavel.toFixed(8)
  // }


  valorDaVariavel = valorDaVariavel.replace(".", ",")

  limparLista(lista)


  // if (valorDaVariavel == "undefined") {
  //   valorDaVariavel = "0"
  // }

  imprimirMaior(valorDaVariavel)
  
  valorDaVariavel = String(valorDaVariavel)
}




//PARTE MATEMÁTICA
function reverso() {
  valorDaVariavel = valorDaVariavel * (-1);
  valorDaVariavel = String(valorDaVariavel);
  imprimirMaior(valorDaVariavel)
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
// }

 function limpar() {
    // document.getElementById("exercicio").reset()
   imprimirMaior("0")
   imprimirSuperior("⠀")

   limparLista(lista)
  //  lista.unshift("0")
   valorDaVariavel = "0"
   temporario = 0
}

function pontoEVirgula(lista, virgulaPonto, oposto) {
  for (let indice = 0; indice < lista.length; indice++){
    if (lista[indice] === virgulaPonto) {
      lista[indice] = oposto;
    }
  }

}

function verificaPonto(lista) {
  let contador=0;
  for (let indice = 0; indice < lista.length; indice++){
    if (lista[indice] == ".") {
      contador = contador + 1
    }
  }
  return contador
}

function nada() {
  // registroCalculo=false
} 


// function apagar() {
//   if (valorDaVariavel.length > 0) {
//     let remocao = []
//     remocao = tranformaEmLista(valorDaVariavel)
//     remocao.pop()
//     valorDaVariavel = transformaEmVariavel(remocao)
//     // lista = remocao

//   } else {
//     valorDaVariavel == "0";
//   }
// }

function contarCasasDecimais(numero) {
  let numeroString = numero.toString();

  let casasDecimais = 0;
  if (numeroString.includes(".")) {
    casasDecimais = numeroString.split(".")[1].length;
  }

  return casasDecimais
}

function consultaZeros(lista) {

  // while (lista[lista.length - 1] == "0" && lista.length>1) {
  //   lista.pop()
  // }

  while (lista.length > 9) {
    lista.pop()
  }
}

function calcular(operador) {
  if (operador == "+") {
    mais();

  } else if (operador == "-") {
    menos();

  } else if (operador == "x") {
    vezes()

  } else if (operador == "÷") {
    dividido()
  }


  if (contarCasasDecimais(temporario)>10) {
    temporario=temporario.toFixed(8)
  }
  temporario = String(temporario)
  temporario = temporario.replace(".", ",")
  imprimirSuperior((temporario) + " " + operador)
  temporario = temporario.replace(/,/g, ".")
  limparLista(lista)
  lista.unshift("0")
}

function mais() {
  if (temporario == "comeco") {
    temporario = Number(valorDaVariavel)
  } else {
    temporario = Number(valorDaVariavel) + Number(temporario)
  }
  return temporario;
}
function menos() {
  if (temporario == "comeco") {
    temporario = Number(valorDaVariavel)
  } else {
    temporario = Number(temporario) - Number(valorDaVariavel)
  }
  return temporario;
}
function vezes() {
  if (temporario == "comeco") {
    temporario = Number(valorDaVariavel)
  } else {
    temporario = Number(valorDaVariavel) * Number(temporario)
  }
  return temporario;
}
function dividido() {
  if (temporario == "comeco") {
    temporario = Number(valorDaVariavel)
  }
  else if(valorDaVariavel == "0"){
    temporario = "∞";
    limparLista(lista)
    valorDaVariavel = "∞";
  }
  else {
    temporario =  Number(temporario) /Number(valorDaVariavel)
  }
  

  return temporario;
}
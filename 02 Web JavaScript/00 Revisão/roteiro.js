// window.alert('Ola mundo')
// window.confirm('Deseja sair?')
// var resposta = window.prompt('Digite seu nome')

// let nro1 = Number.parseInt("6.5"); // =6 passa para inteiro
// let nro= Number.parseFloat('6'); //6.0 passa para real

//e (and) é &&
// ou é ||
// não é !


//.toFixed(2) --> casas decimais
//= Definir algo
// == Comparar valores
// === Compara o tipo (palavra, número ou objeto)
// "7" == 7  : verdadeiro
// "7" === 7 : falso
function Calcular(){
    let valorHtml=document.getElementById("dinheiroConta")
    let valorJs=Number(valorHtml.value)
    dinheiroDolar=5.21
    dinheiroCarteira=dinheiroDolar*valorJs
    let resposta=document.getElementById("resposta")
    resposta.innerHTML='O dinheiro na carteira é '+ dinheiroCarteira;
   
}

function limpar() {
    document.getElementById("exercicio").reset()
    resposta.innerHTML=""
    
}
function Exibir(){
    let diaSemana=document.getElementById("diaDaSemana")
    let diadaSemana=Number(diaSemana.value)
    let Resposta1=document.getElementById("Resposta1")
    switch (diadaSemana) {
        case 0:
        Resposta1.innerHTML="Domingo"
            
            break;
            case 1:
                Resposta1.innerHTML="Segunda"
                    
                break;
            case 2:
                Resposta1.innerHTML="Terça"
                            
                break;
            case 3:
                Resposta1.innerHTML="quarta"
                                    
                break;
    
        default:
            Resposta1.innerHTML="Dia da Semana inexistente"
            break;
    }
}



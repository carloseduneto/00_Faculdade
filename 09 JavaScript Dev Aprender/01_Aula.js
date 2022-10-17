// console.log("Carlos")
// console.log("Bem vindo a todos")
// console.log("🗡️Shovel Knight🛡️")
// //Pela nonagésima vez o que é uma variável?
// // Receber um valor em algum luagr do meu programa

// let idade=5;
// //let é o tipo
// //var é a versão mais antiga
// console.log(idade);
// let OutroValor=9e+5;
// console.log(OutroValor)

//Não dar o nome de variáveis com números, espaços

//Usar camelCase (minúsculo 1º e o resto a 1º maiúscula)

let nome= "Carlos Eduardo";
let idade= 21;
let comoEstaSeSentido= "Empolgado";

console.log(nome, idade, comoEstaSeSentido)

let pensamento= "I'm unstoppable today";
pensamento="I'm porche without no breaks";
console.log(pensamento)

//o let pode redefinir sempre o valor

//const sempre é constante, não pode mudar valores


//Tipos primitivos 
let nomeA = "Fernando <3"; //String literal, juntando várias letras

let idadeA = 18; //number literal

let estaAprovado = true; //boolean

let sobrenome = undefined;  //Undefined

let corSelecionada = null; //Resetar o valor toda vez


//Tipagem dinânimica ele descobre em tempo de execução :)

//O que é um objeto? Ele junmta as informações em um lugar só

let pessoa ={
    nome: "Fernado <3",
    idade: 18,
    estaAprovado: true,
    sobrenome: "???",
    educacao: "Ensino Médio",
    endereco: "Rua Almeida, 55",
    bairro: "Jardim das Flores"

}; //Chave e valor, estilo dicionário e arrays associativos

console.log(pessoa);


//Arreios (Arrays): conjunto de dados que pode ser acessado com um índice

let familia = [22,222,"Saudades",true]
console.log(familia.length)
console.log(familia[3])

let nomeDoAmigo=["Rafael", "34", "São Sebastião do Paraíso"]
console.log(nomeDoAmigo)


//Funções: Verbo + Substantivo
let corSite = "azul";
function resetaCor (cor, tonalidade){
corSite= cor + " " + tonalidade;

}; //+ concatena valores


console.log(corSite);
resetaCor("cinza", "claro");
console.log(corSite)


produtoSelecionado= "Camiseta"
function mudarProduto (produto){
    produtoSelecionado = produto;
};

console.log(produtoSelecionado);
mudarProduto("Calça")
console.log(produtoSelecionado)


//Tipos de funções: realiza uma tarefa e não devolve nada, não usa o retorno

function mostrarNaTela(){
    console.log("Diego")
}
mostrarNaTela();

function raizQuadrada(valor){
    return valor ** (1/2)
};
console.log(raizQuadrada(81))


let resultado = raizQuadrada(16)
console.log (resultado)


//Operadores Aritiméticos (Matemáticos)
let salario = 100;

// + - * / ** 
console.log(salario+salario)
console.log(salario-salario)
console.log(salario*salario)
console.log(salario/salario)
console.log(salario**salario)

// ++ --
let idadeB = 18;
console.log(++idadeB)
console.log(idadeB)

console.log(--idadeB)
console.log(--idadeB)

//Operadores de atribuição
let valorDaCasa= 100;
//valorDaCasa = valorDaCasa + valorDaCasa
valorDaCasa +=valorDaCasa
//valorDaCasa = valorDaCasa - valorDaCasa
valorDaCasa -=valorDaCasa
console.log(valorDaCasa);




//Operadores de comparação
//Igualdade Estrita 

console.log (1 === 1 ) //compara valores e tipos
console.log ("1" === 1 )

//Igualdade solta
console.log (1 == 1)
console.log ("1" ==1) //compara apenas valores, apenas converte

//Operadores lógicos ternal
//Tem um cliente, 100 premium, comum
let pontos = 100;
let tipo = pontos > 100 ? "premium" : "comum"; //primeiro é vdd e o segundo falso
console.log(tipo); 

//Operadores Bitwise (lógico)
//Operador lógivco e (&&)
//Retorna TRUE se os dois operando forem 

// console.log(true&&false);

let maiorDeIdade=true;
let possuiCarteiraDeTrabalho= true;

let podeAplicarAVaga= maiorDeIdade && possuiCarteiraDeTrabalho;
console.log(podeAplicarAVaga)

//Operador lógico ou (||)
//Retorna true se pelo menos um dos dois for true
let podeAplicarAVagaOu= maiorDeIdade || possuiCarteiraDeTrabalho;
console.log(podeAplicarAVagaOu)

//Operador NOT (!) : inverte de ture para false e vice-versa
let candidatoRecusado = !podeAplicarAVagaOu;

console.log(candidatoRecusado)

//Comparação com operadores não boleanos
//Falsy
//undefined
//null
// 0
// false
// ' '
// NaN - not a number

//Truthy -> não é nada que está acima

let corPersonalizada = "cinza";
let corPadrao = "azul";
 let corPerfil = corPersonalizada || corPadrao;

 console.log (corPerfil);

 
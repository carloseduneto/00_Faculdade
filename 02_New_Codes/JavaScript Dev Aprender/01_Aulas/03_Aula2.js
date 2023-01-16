//Condicionais
//If... Else
//Se a hora estiver entre 06h e 12h : Bom dia!
//Se estiver entre 12h e 18h: Boa tarde
//Caso contrario: Boa noite
let hora = 13;

if(hora>6 && hora<12){
    console.log("Bom dia!")//código a ser executado
}
else if (hora>12 && hora<18){
    console.log("Boa tarde!")//código a ser executado
}
else{
    console.log("Boa noite!")// código a ser executado
}

//Switch... case
let permissao="Mário"; //usuário: comum, gerente, diretor

switch (permissao) {
    case "comum":
    console.log("Usuário Comum");
        break;

    case "gerente":
    console.log("Usuário Gerente");
        break;

    case "diretor":
    console.log("Usuário Diretor");
        break;

    default: //caso não caia em nenhuma condição
    console.log('Usuário Indefinido')
        break;
}


//Repetir uma ação várias vezes
// console.log("Estou aprenedendo!")
// console.log("Estou aprenedendo!")
// console.log("Estou aprenedendo!")
// console.log("Estou aprenedendo!")
// console.log("Estou aprenedendo!")

//1. For

for (let i =5; i >= 1; i--){ //i é de índice (index)
    if (i % 2 !== 0){ //Operador módulo
        console.log(i)
    }
}

//2. While
let indice=5;
while (indice >= 1){
    if (indice % 2 !== 0){
        console.log(indice)
    }indice--;
}

//3. Do. . While
let indiceDoWhile= 0;
do{
    console.log("Digitando!", indiceDoWhile);
    indiceDoWhile++;
}while(indiceDoWhile < 10 )


//4. For. .in melhor para trabalhar nos arrrays
const pessoa = {
    nome: "Steven Universo",
    idade:16
}
//key-value: chave
for (let chave in pessoa){
    console.log(chave,pessoa['nome']);
    console.log(chave,pessoa.nome); 

}

const cores=["Cinza", "Preto", "Amarelo"]

for (let indice in cores){
    console.log(indice, cores [indice])
}


//5. For. .of Interação sobre arrays, é mais simples
for (let cor of cores){
    console.log(cor);
}




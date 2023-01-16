//Criar uma função somar que retorna a soma de todos os multiplos de 3 e 5

//Multiplos de 3: 3, 6, 9
//Multiplos de 5: 5 e 10

//Somando os multiplos 
//Armazenar os multiplos de 3, depos de 5 e somar os dois

somar(10);
function somar(limite) {
    multiplosDeTres=0;
    multiplosDeCinco=0;
    for (let indice=0; indice<=limite; indice++){
        if (indice%3===0){
            console.log(indice)
        multiplosDeTres+=indice
        }else if(indice%5===0){
            console.log(indice)
        multiplosDeCinco=multiplosDeCinco+indice
        }
    }
    console.log(multiplosDeTres+multiplosDeCinco)
}


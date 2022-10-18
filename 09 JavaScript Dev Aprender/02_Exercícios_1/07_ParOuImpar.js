//Receber uma quantidade de valores para avaliar
//Função exibe se cada valor é par pu ímpar

exibirTipo();
function exibirTipo(limite) {
    for (let i=0; i<=limite; i++){
        console.log(i%2 !== 0 ? `${i} "Ímpar"`: `${i} "Par"`)
    }
}
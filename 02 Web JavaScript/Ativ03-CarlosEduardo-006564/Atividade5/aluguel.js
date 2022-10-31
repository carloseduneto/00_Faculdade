function totalASerPago() {
    let kmHtml = document.getElementById("km");
    let km= Number(kmHtml.value);

    let diasHtml= document.getElementById("dias");
    let dias=Number(diasHtml.value);

    let resultados= document.getElementById("resultados");

    //Cálculos de movimentação
    let aluguelDiario=dias*50;
    let aluguelQuilometro=km*0.20;
    let soma=aluguelDiario+aluguelQuilometro;
    soma.toFixed(2);

    if(km<=0 || dias<=0){
        resultados.innerHTML="❌Insira valores acima de zero";
    }else{
        resultados.innerHTML=`💵Você pagará R$${soma} pelo consumo`;
    }
}

function limpar() {
    document.getElementById("exercicio").reset();
    resultados.innerHTML="";    
}
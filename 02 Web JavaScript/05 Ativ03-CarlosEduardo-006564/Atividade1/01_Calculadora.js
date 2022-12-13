function operacao(){
    let numero1=document.getElementById("numero1");
    let numero2=document.getElementById("numero2");
    let resultados=document.getElementById("resultados");

    let numero1Convertido=Number(numero1.value);
    let numero2Convertido=Number(numero2.value)
    

    resultados.innerHTML=`⟐ ${numero1Convertido} + ${numero2Convertido} = ${numero1Convertido+numero2Convertido}<br>
                                            ⟐ ${numero1Convertido} - ${numero2Convertido} = ${numero1Convertido-numero2Convertido}<br>
                                            ⟐ ${numero1Convertido} x ${numero2Convertido} = ${numero1Convertido*numero2Convertido}<br>
                                            ⟐ ${numero1Convertido} ÷ ${numero2Convertido} = ${numero1Convertido/numero2Convertido}<br>
                                            ⟐ ${numero1Convertido} ^ ${numero2Convertido} = ${numero1Convertido**numero2Convertido}<br>
                                            ⟐ ${numero1Convertido} % ${numero2Convertido} = ${numero1Convertido%numero2Convertido}(resto)<br>`


}

function limpar(){
    document.getElementById("exercicio").reset();
    resultados.innerHTML="";
}
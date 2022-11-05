function resultadoC() {
    let gasolinaHtml = document.getElementById("gasolina")
    let etanolHtml = document.getElementById("etanol")
    let resultadoGasolina = document.getElementById("resultadoGasolina")

    let gasolina=Number(gasolinaHtml.value)
    let etanol=Number(etanolHtml.value)

    let porcetagem=gasolina*0.7

    if (etanol<=porcetagem){
        resultadoGasolina.innerHTML="É mais vantajoso abastecer com Etanol!"
    }else{
        resultadoGasolina.innerHTML="É desvantagem abastecer com Etanol!"
    }
}

function Limpar() {
    document.getElementById("exercicio").reset()
    resultadoGasolina.innerHTML="";
}
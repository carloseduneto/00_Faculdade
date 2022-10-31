function valorPago(){
    let totalHtml=document.getElementById("total");
    let pagasHtml=document.getElementById("pagas");
    let valorHtml=document.getElementById("valor");
    let valorFinal=document.getElementById("valorFinal");

    let total=Number(totalHtml.value);
    let pagas=Number(pagasHtml.value);
    let valor=Number(valorHtml.value);
    let aSerPago=(valor*total-(valor*pagas))
        aSerPago=aSerPago.toFixed(2)
        
    if (total<=0 || pagas<=0 || valor<=0){
        valorFinal.innerHTML="❌Insira valores acima de zero"
    }else{
    valorFinal.innerHTML=`✅Valor já pago: R$${valor*pagas} <br> 🕒Valor a ser pago: R$${aSerPago}`;
    }
}
 function limpar() {
    document.getElementById("exercicio").reset()
    valorFinal.innerHTML="";
 }

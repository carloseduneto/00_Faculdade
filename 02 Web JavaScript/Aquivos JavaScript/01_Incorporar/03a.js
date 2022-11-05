function calculo() {

    var anoHtml=document.getElementById("nascimento")
    var result=document.getElementById("result")
    var atualHtml=document.getElementById("anoAtual")

    var anoNasc=Number(anoHtml.value)
    var ano_atual=Number(atualHtml.value)
    idade=ano_atual - anoNasc

    if  (idade<14) {
        result.innerHTML="Categotia : Mirim"
    } else if (idade===14 && idade===15){
        result.innerHTML="Categoria : Infantil"
    } else if (idade===16 && idade===17){
        result.innerHTML="Categoria : Juvenil"
    } else if (idade==18&& idade<=20){
        result.innerHTML="Categoria : Juniores"
    }else {
        result.innerHTML="Categoria : Profissional"
}
}
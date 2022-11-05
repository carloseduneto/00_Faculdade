function calculo() {
    let nomeHtml=document.getElementById("nome")
    let anoHtml=document.getElementById("nascimento")
    let categoria=document.getElementById("categoria")
    let atualHtml=document.getElementById("anoAtual")

    let nome=String(nomeHtml.value)
    let anoNasc=Number(anoHtml.value)
    let ano_atual=Number(atualHtml.value)
    idade=ano_atual - anoNasc

    console.log(idade)

    if  (idade<14) {
        categoria.innerHTML=nome+" é da categoria Mirim"
    } else if (idade===14 || idade===15){
        categoria.innerHTML=nome+" é da categoria Infantil"
    } else if (idade===16 || idade===17){
        categoria.innerHTML=nome+" é da categoria Juvenil"
    } else if (idade==18 || idade<=20){
        categoria.innerHTML=nome+" é da categoria Juniores"
    }else {
        categoria.innerHTML=nome+" é da categoria Profissional"
}
}

function limpar(){
    document.getElementById("exercicio").reset()
    categoria.innerHTML=""
}
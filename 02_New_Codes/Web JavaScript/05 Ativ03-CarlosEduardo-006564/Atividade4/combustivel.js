function combustivel() {
    let litrosHtml=document.getElementById("litros");
    let quilometrosHtml=document.getElementById("quilometros");

    let litros=Number(litrosHtml.value)
    let quilometros=Number(quilometrosHtml.value);

    console.log(litros)
    let valor=document.getElementById("valor");
    let kmPorLitro=quilometros/litros
    kmPorLitro=kmPorLitro.toFixed(2)

    if (quilometros<=0 || litros<=0){
        valor.innerHTML="❌ Insira valores acima de zero"
    }else{
    valor.innerHTML=`✅O carro percorre ${kmPorLitro} Km por litro de combustível `;
    }
}

function limpar() {
    document.getElementById("exer").reset()
    valor.innerHTML=""
}
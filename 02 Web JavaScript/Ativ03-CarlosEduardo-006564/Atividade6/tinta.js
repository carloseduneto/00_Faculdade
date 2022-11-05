function tinta() {
    let alturaHtml=document.getElementById("altura");
    let larguraHtml=document.getElementById("largura");
    let tintaTotal=document.getElementById("tintaTotal");

    let altura=Number(alturaHtml.value);
    let largura=Number(larguraHtml.value);
    
    //Área da parede
    let area= altura*largura
    area=area.toFixed(2)

    //Quantidade de tinta necessária, cada litro pinta 5 m²
    let tintaNecessaria=area/5
    tintaNecessaria=Math.trunc(tintaNecessaria)

    if(altura<=0 || largura<=0){
        tintaTotal.innerHTML="❌ Insira valores acima de zero"
    }else if (tintaNecessaria===0){
        tintaTotal.innerHTML=`🧱 Será gasto 1 lata de tinta para pintar ${area}m²`;
    }else if (tintaNecessaria===1){
        tintaTotal.innerHTML=`🧱 Será gasto 1 lata de tinta para pintar ${area}m²`
    }else{
        tintaTotal.innerHTML=`🧱 Serão gastos ${tintaNecessaria} latas de tinta para pintar ${area}m²` 
    }
}

function limpar() {
    document.getElementById("exercicio").reset()
    tintaTotal.innerHTML="";
    
}
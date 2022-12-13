function calcular(){
    let velocidadeHtml=document.getElementById("txtvel");
    let velocidade=Number(velocidadeHtml.value);
    let resposta=document.querySelector("div#resp")
        resposta.innerHTML=`<p>Velocidade atual: ${velocidade} km/h</p>`;
    if(velocidade>60){
        resposta.innerHTML+="<p>Velocidade acima do permitido!</p>"
    }else{
        resposta.innerHTML+="<p>Velocidade permitida</p>"
    }
}

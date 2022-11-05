function converter() {
        let metrosA=document.getElementById("metros");
        let convertido = document.getElementById("convertido");
        let movimenta=document.getElementById("movimenta");
        let metros=Number(metrosA.value);

        
        if(metros<=0){
                convertido.innerHTML="❌Insira valores acima de zero"
        }else{
                convertido.innerHTML=`➜ ${metros} metros em centímetros: ${metros*100}cm<br>
                ➜ ${metros} metros em milimetros: ${metros*1000}mm`
        }
}
function limpar() {
        document.getElementById("exercicio").reset();
        convertido.innerHTML="";
}
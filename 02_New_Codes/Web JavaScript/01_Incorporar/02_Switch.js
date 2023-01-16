



function mostrar() {
    let data=new Date()
    let dia = data.getDay()
    let resultado=document.getElementById("resultado");

    console.log(dia)
    switch (dia) {
        case 0:
            resultado.innerHTML="domingo"
            break;
        
        case 1:
            resultado.innerHTML="segunda-feira"
            break
            
        case 2:
            resultado.innerHTML="terça-feira"
            break

        case 3:
            resultado.innerHTML="quarta-feira"
            break

        case 4:
            resultado.innerHTML="quinta-feira"
            break

        case 5:
            resultado.innerHTML="sexta-feira"
            break

        case 6:
            resultado.innerHTML="sábado"
            break

        default:
            resultado.innerHTML="nenhum dia"
            break;
    }
}

function triangulo() {
    let n1Html = document.getElementById ("n1")
    let n2Html = document.getElementById("n2")
    let n3Html = document.getElementById("n3")
    let resultadoT=document.getElementById("resultadoT")

    let n1=Number(n1Html.value)
    let n2=Number(n2Html.value)
    let n3=Number(n3Html.value)

    let somaA=n1+n2
    let somaB=n1+n3
    let somaC=n2+n3

    if (somaA>n3 && somaB>n2 && somaC>n1){
        resultadoT.innerHTML="É um triângulo"
    }else{
        resultadoT.innerHTML="Não é um triângulo"
    }
}

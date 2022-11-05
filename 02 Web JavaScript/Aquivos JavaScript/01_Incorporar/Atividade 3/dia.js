function mostrar() {
    let data=new Date()
    let dia = data.getDay()
    let resultado=document.getElementById("resultado");

    console.log(dia)
    switch (dia) {
        case 0:
            resultado.innerHTML="Hoje é domingo"
            break;
        
        case 1:
            resultado.innerHTML="Hoje é segunda-feira"
            break
            
        case 2:
            resultado.innerHTML="Hoje é terça-feira"
            break

        case 3:
            resultado.innerHTML="Hoje é quarta-feira"
            break

        case 4:
            resultado.innerHTML="Hoje é quinta-feira"
            break

        case 5:
            resultado.innerHTML="Hoje é sexta-feira"
            break

        case 6:
            resultado.innerHTML="Hoje é sábado"
            break

        default:
            resultado.innerHTML="Nenhum dia válido"
            break;
    }
}
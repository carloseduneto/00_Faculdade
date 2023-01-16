//Velocidade máxima até 70 km
//A cada 5km acima da velocidade ganha-se um ponto
//Math.Floor()
//Caso pontos maior que 12 -> Carteira suspensa
verificaVelocidade(71);

function verificaVelocidade(velocidade) {
    
    if (velocidade<=70){
            console.log("✅Velocidade Normal")
    }else if(velocidade>70){
        console.log("⚠️Velocidade acima da permitida!!!")
        pontos=(velocidade-70)/5
            
        console.log(`❕Foram registrados ${Math.floor(pontos)} pontos na sua carteira`)
        if (pontos>12){
            console.log("❌Limite do pontos alcançados, carteira suspensa")
        }
    }
}
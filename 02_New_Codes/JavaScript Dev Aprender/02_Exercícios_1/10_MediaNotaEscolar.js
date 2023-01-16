//Exercício nota escolar
//Obter a média a partir de um array

//0-59=F
//60-69= D
//70-79= C
//80-89= B
//90-99=A
//100= A+
const array = [70, 71, 85];
//75
console.log(mediaDoAluno(array));

function mediaDoAluno(notas){
    const total = calculaMedia(notas)

        // if(total<=59){
        //     return " F";
        // }else if(total>=60 && total<=69){
        //     return "D";
        // }else if (total>=70 && total<=79){
        //     return "C"
        // }else if (total>=80 && total<=89){
        //     return "B"
        // }else if (total>=90 && total<=99){
        //     return "A"
        // }else if (total===100){
        //     return "A+"
        // }else{
        //     return("Valores inválidos")
        // }
        if (total < 59) return "F";
        if (total < 69) return "D";
        if (total < 79) return "C";
        if (total < 89) return "B";
        return "A"
}

function calculaMedia(array) {
    total=0;
    for (nota in array){
        total+=array[nota]
    }
    return total/(array.length);    
}
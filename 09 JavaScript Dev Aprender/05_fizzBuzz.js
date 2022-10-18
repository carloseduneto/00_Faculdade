//Divisivel pore 3 => Fizz
//Divisível por 5 => Buzz
//Divi´sivel por 3 e 5 => FizzBuzz
//Não é divisível por 3 ou 5 => entrada
//Não é um número => "Não é um número"
const resultado = fizzBuzz (66);
console.log(resultado)

function fizzBuzz (entrada){
    if (entrada%3===0 && entrada%5===0){
        console.log("FizzBuzz")
    }else if(entrada%3===0){
        console.log("Fizz")
    }else if(entrada%5===0){
        console.log("Buzz")
    }else if(entrada%3!=0 && entrada%5==0){
        console.log(entrada)
    }else{
        console.log("Não é um número!")
    }
    
}
//Divisivel pore 3 => Fizz
//Divisível por 5 => Buzz
//Divi´sivel por 3 e 5 => FizzBuzz
//Não é divisível por 3 ou 5 => entrada
//Não é um número => "Não é um número"
const resultado = fizzBuzz (15);
console.log(resultado)

function fizzBuzz (entrada){
    if( typeof entrada !== 'number'){
        // console.log("Não é um número!")
        return "Não é um número";
    }else if(entrada%3===0 && entrada%5===0){
        // console.log("Fizz")
        return "FizzBuzz";
    }else if(entrada%5===0){
        // console.log("Buzz")
        return "Buzz";
    }else if(entrada%3===0){
        // console.log("FizzBuzz")
        return "Fizz"
    }else{
        // console.log(entrada)
        return entrada;
    }
    
}
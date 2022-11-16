function conta(){
    let internetHtml=document.getElementById("internet");
    let energiaHtml=document.getElementById("energia");
    let aguaHtml=document.getElementById("agua");
    let pessoaHtml=document.getElementById("pessoa");
    let resultadosContas=document.getElementById("resultadosContas")

    let internet=Number(internetHtml.value)
    let energia=Number(energiaHtml.value)
    let agua=Number(aguaHtml.value)
    let pessoas=Number(pessoaHtml.value);

    let soma=internet+energia+agua;
    let divisao=soma/pessoas

    if (pessoas>0){
        resultadosContas.innerHTML=`Valor total: ${soma} <br> Valor para cada pessoa: ${divisao}`;
    }else{
        resultadosContas.innerHTML=`Insira um valor maior que zero`;
    }
}

function limparConta() {
    document.getElementById("exercicio").reset()
    resultadosContas.innerHTML="";
}


function imc(){
    let pesoHtml=document.getElementById("peso");
    let alturaHtml=document.getElementById("altura");
    
    let resultadoImc=document.getElementById("resultadosImc")

    let peso=Number(pesoHtml.value);
    let altura=Number(alturaHtml.value);

    let calculoImc=peso/(altura*altura);
    let calculoImcDuasCasas=calculoImc.toFixed(2);
    
    if (peso>0 && altura>0){
        if(calculoImcDuasCasas<18.5){
        resultadoImc.innerHTML=`IMC: ${calculoImcDuasCasas}, você está abaixo do peso!`;
        }else if(calculoImcDuasCasas>=18.5 && calculoImcDuasCasas<=25){
            resultadoImc.innerHTML=`IMC: ${calculoImcDuasCasas}, peso ideal!`;  
        }else if( calculoImcDuasCasas>25 && calculoImcDuasCasas<=30){
            resultadoImc.innerHTML=`IMC: ${calculoImcDuasCasas}, você está com sobrepeso!`; 
        }else if (calculoImcDuasCasas>30 && calculoImcDuasCasas<=40){
            resultadoImc.innerHTML=`IMC: ${calculoImcDuasCasas}, você está com obesidade!`;
        }else if (calculoImcDuasCasas>40){
            resultadoImc.innerHTML=`IMC: ${calculoImcDuasCasas}, você está com obesidade mórbida!`;
        }
    }else{
        resultadoImc.innerHTML=`Insira um valor maior que zero`;
    }
}

function limparImc() {
    let resultadoImc=document.getElementById("resultadosImc")
    document.getElementById("exercicio").reset()
    resultadoImc.innerHTML="";
}

function normal(){
    let anoNascHtml=document.getElementById("anoNasc");
    
    let resultadoIdade=document.getElementById("resultadoIdade")

    let anoNasc=Number(anoNascHtml.value)
    
    let anoAtual = new Date().getFullYear()
    let idade = anoAtual - anoNasc
    
    if(idade>0){
        if(idade<120){
            if (idade>=16){
                if(idade>=16 && idade<18){
                resultadoIdade.innerHTML=`Sua idade: ${idade} anos, voto é opcional !`;
            
                }else if(idade>=18 && idade<=70){
                    resultadoIdade.innerHTML=`Sua idade: ${idade} anos, voto obrigatório!`;  
                }else if(idade>70){
                    resultadoIdade.innerHTML=`Sua idade: ${idade} anos, voto opcional!`; 
                }
            }else{
                resultadoIdade.innerHTML=`Sua idade: ${idade} anos, não permitido!`;
                }
        }else{
            resultadoIdade.innerHTML=`Sua idade: ${idade} anos, inválida!`;
        }
    }else{
        resultadoIdade.innerHTML=`Digite um ano inferior à ${anoAtual}`
    }

}

function especial(){
    let anoNascHtml=document.getElementById("anoNasc");
    
    let resultadoIdade=document.getElementById("resultadoIdade")

    let anoNasc=Number(anoNascHtml.value)
    
    let anoAtual = new Date().getFullYear()
    let idade = anoAtual - anoNasc
    if(idade>0){   
        if(idade<120){
            if (idade>=16 ){
                if(idade>=16 && idade<18){
                    resultadoIdade.innerHTML=`Sua idade: ${idade} anos, voto opcional!`;
            
                }else if(idade>=18 && idade<=60){
                    resultadoIdade.innerHTML=`Sua idade: ${idade} anos, voto obrigatório!`;  
                }else if(idade>60){
                    resultadoIdade.innerHTML=`Sua idade: ${idade} anos, voto opcional!`; 
                }
            }else{
                resultadoIdade.innerHTML=`Sua idade: ${idade} anos, não permitido!`;
            }
        }else{
            resultadoIdade.innerHTML=`Sua idade: ${idade} anos, inválida!`;
        }
    }else{
        resultadoIdade.innerHTML=`Digite um ano inferior à ${anoAtual}`;
    }
} 

function limparIdade() {
    let resultadoIdade=document.getElementById("resultadoIdade")
    document.getElementById("exercicio").reset()
    resultadoIdade.innerHTML="";
}

function calculaPagamento(){
    let valorProdutoHtml=document.getElementById("valorProduto");
    let pagamento=document.getElementById("pagamento").selectedOptions[0].value;
    
    let resultadoPagamento=document.getElementById("resultadoPagamento")

    let valorProduto=Number(valorProdutoHtml.value);
    let valorPrdutoDuasCasas=valorProduto.toFixed(2);
    let pagAVista=(valorPrdutoDuasCasas*0.9).toFixed(2);
    let pagDebto=(valorPrdutoDuasCasas*0.95).toFixed(2);
    let pag3x=(valorPrdutoDuasCasas*1.2).toFixed(2);
    
    if(valorPrdutoDuasCasas>0){ 
        if(pagamento == "aVista"){
            resultadoPagamento.innerHTML=`Desconto de 10%, valor R$ ${pagAVista}`;
        }if(pagamento == "debito"){
            resultadoPagamento.innerHTML=`Desconto de 5%, valor R$ ${pagDebto}`;
        }if(pagamento == "duasVezes"){
            resultadoPagamento.innerHTML=`Valor sem desconto, valor R$ ${valorPrdutoDuasCasas}`;
        }if(pagamento == "tresVezes"){
            resultadoPagamento.innerHTML=`Acréscimo de 20%, valor R$ ${pag3x}`;
        }
    }else{
        resultadoPagamento.innerHTML="Insira um valor maior que zero"
    }
}

function limparProdutos() {
    let resultadoPagamento=document.getElementById("resultadoPagamento")
    document.getElementById("exercicio").reset()
    resultadoPagamento.innerHTML="";
}

function calculaVolume() {
    let comprimentoHtml = document.getElementById(`comprimento`);
    let profundidadeHtml = document.getElementById(`profundidade`);
    let larguraHtml = document.getElementById(`largura`);
    let resultadosVolume = document.getElementById(`resultadosVolume`);

    let comprimento = Number(comprimentoHtml.value);
    let profundidade = Number(profundidadeHtml.value);
    let largura = Number(larguraHtml.value);

    let volume = comprimento * profundidade * largura;
    if(volume>0){
        resultadosVolume.innerHTML = `Volume total da piscina é ${volume} m³.`;
    }else{
        resultadosVolume.innerHTML="Insira valores maior que zero"
    }
    
}

function limparPiscina() {
    let resultadosVolume=document.getElementById("resultadosVolume")
    document.getElementById("exercicio").reset()
    resultadosVolume.innerHTML="";
}
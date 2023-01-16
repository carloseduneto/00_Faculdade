function consoleK() {
    let Um=document.getElementById('um').checked
    let Dois=document.getElementById('dois').checked
    let Tres=document.getElementById('tres').checked
    let Quatro=document.getElementById('quatro').checked
    let Cinco=document.getElementById('cinco').checked
    let Seis=document.getElementById('seis').checked
    let Sete=document.getElementById('sete').checked
    let Oito=document.getElementById('oito').checked
    let Nove=document.getElementById('nove').checked
    
    
    lista=[2, 3, 4, 5, 6, 7, 8, 9 , 10, 1]

    if (Um==true){
        console.log("Tabuada do 1")
        for (let indice in lista){
            
            console.log(`1 x ${indice} = ${indice * 1}` )
        }
    }
    if (Dois==true){
        console.log("Tabuada do 2")
        for (let indice in lista){
            
            console.log(`2 x ${indice} = ${indice * 2}` )
        }
    }
    if (Tres==true){
        console.log("Tabuada do 3")
        for (let indice in lista){
            
            console.log(`3 x ${indice} = ${indice * 3}` )
        }
    }
    if (Quatro==true){
        console.log("Tabuada do 4")
        for (let indice in lista){
            
            console.log(`4 x ${indice} = ${indice * 4}` )
        }
    }
    if (Cinco==true){
        console.log("Tabuada do 5")
        for (let indice in lista){
            
            console.log(`5 x ${indice} = ${indice * 5}` )
        }
    }
    if (Seis==true){
        console.log("Tabuada do 6")
        for (let indice in lista){
            
            console.log(`6 x ${indice} = ${indice * 6}` )
        }
    }
    if (Sete==true){
        console.log("Tabuada do 7")
        for (let indice in lista){
            
            console.log(`7 x ${indice} = ${indice * 7}` )
        }
    }
    if (Oito==true){
        console.log("Tabuada do 8")
        for (let indice in lista){
            
            console.log(`8 x ${indice} = ${indice * 8}` )
        }
    }
    if (Nove==true){
        console.log("Tabuada do 9")
        for (let indice in lista){
            
            console.log(`9 x ${indice} = ${indice * 9}` )
        }
    }
    
}

function tabelaG() {
    let Um=document.getElementById('um').checked
    let Dois=document.getElementById('dois').checked
    let Tres=document.getElementById('tres').checked
    let Quatro=document.getElementById('quatro').checked
    let Cinco=document.getElementById('cinco').checked
    let Seis=document.getElementById('seis').checked
    let Sete=document.getElementById('sete').checked
    let Oito=document.getElementById('oito').checked
    let Nove=document.getElementById('nove').checked
    resultado=document.getElementById("resultado")
    titulo=document.getElementById("titulo")

    // resultado.innerHTML="<table align=center><tr><th  colspan=100 align=center>Tabuada do 1</th></tr>"
    lista=[2, 3, 4, 5, 6, 7, 8, 9 , 10, 1]
   variavelf=" "
    if (Um==true){
        variavelf+="<br><table align=center><tr><th  colspan=100 align=center>Tabuada do 1</th></tr>"
        for (let indice=1; indice<=10; indice++){
 
            // variavelf += "3 x "+indice+" = " +  + "<br />";
            variavelf += `<table align="center"><tr><td>1</td><td>x</td><td>${indice}</td><td>=</td><td>${(1*indice)}</td></tr></table>`
            resultado.innerHTML=(variavelf)
        }
    }
    if (Dois==true){
        variavelf+="<br><table align=center><tr><th  colspan=100 align=center>Tabuada do 2</th></tr>"
        for (let indice=1; indice<=10; indice++){
 
            // variavelf += "3 x "+indice+" = " +  + "<br />";
            variavelf += `<table align="center"><tr><td>2</td><td>x</td><td>${indice}</td><td>=</td><td>${(2*indice)}</td></tr></table>`
            resultado.innerHTML=(variavelf)
        }
    }
    if (Tres==true){
        variavelf+="<br><table align=center><tr><th  colspan=100 align=center>Tabuada do 3</th></tr>"
        for (let indice=1; indice<=10; indice++){
 
            // variavelf += "3 x "+indice+" = " +  + "<br />";
            variavelf += `<table align="center"><tr><td>3</td><td>x</td><td>${indice}</td><td>=</td><td>${(3*indice)}</td></tr></table>`
            resultado.innerHTML=(variavelf)
        }
    }
    if (Quatro==true){
        variavelf+="<br><table align=center><tr><th  colspan=100 align=center>Tabuada do 4</th></tr>"
        for (let indice=1; indice<=10; indice++){
 
            // variavelf += "3 x "+indice+" = " +  + "<br />";
            variavelf += `<table align="center"><tr><td>4</td><td>x</td><td>${indice}</td><td>=</td><td>${(4*indice)}</td></tr></table>`
            resultado.innerHTML=(variavelf)
        }
    }
    if (Cinco==true){
        variavelf+="<br><table align=center><tr><th  colspan=100 align=center>Tabuada do 5</th></tr>"
        for (let indice=1; indice<=10; indice++){
 
            // variavelf += "3 x "+indice+" = " +  + "<br />";
            variavelf += `<table align="center"><tr><td>5</td><td>x</td><td>${indice}</td><td>=</td><td>${(5*indice)}</td></tr></table>`
            resultado.innerHTML=(variavelf)
        }
    }
    if (Seis==true){
        variavelf+="<br><table align=center><tr><th  colspan=100 align=center>Tabuada do 6</th></tr>"
        for (let indice=1; indice<=10; indice++){
 
            // variavelf += "3 x "+indice+" = " +  + "<br />";
            variavelf += `<table align="center"><tr><td>6</td><td>x</td><td>${indice}</td><td>=</td><td>${(6*indice)}</td></tr></table>`
            resultado.innerHTML=(variavelf)
        }
    }
    if (Sete==true){
        variavelf+="<br><table align=center><tr><th  colspan=100 align=center>Tabuada do 7</th></tr>"
        for (let indice=1; indice<=10; indice++){
 
            // variavelf += "3 x "+indice+" = " +  + "<br />";
            variavelf += `<table align="center"><tr><td>7</td><td>x</td><td>${indice}</td><td>=</td><td>${(7*indice)}</td></tr></table>`
            resultado.innerHTML=(variavelf)
        }
    }
    if (Oito==true){
        variavelf+="<br><table align=center><tr><th  colspan=100 align=center>Tabuada do 8</th></tr>"
        for (let indice=1; indice<=10; indice++){
 
            // variavelf += "3 x "+indice+" = " +  + "<br />";
            variavelf += `<table align="center"><tr><td>8</td><td>x</td><td>${indice}</td><td>=</td><td>${(8*indice)}</td></tr></table>`
            resultado.innerHTML=(variavelf)
        }
    }
    if (Nove==true){
        variavelf+="<br><table align=center><tr><th  colspan=100 align=center>Tabuada do 9</th></tr>"
        for (let indice=1; indice<=10; indice++){
 
            // variavelf += "3 x "+indice+" = " +  + "<br />";
            variavelf += `<table align="center"><tr><td>9</td><td>x</td><td>${indice}</td><td>=</td><td>${(9*indice)}</td></tr></table>`
            resultado.innerHTML=(variavelf)
        }
    }
}


function limpar() {
    document.getElementById("exercicio").reset()
    resultado.innerHTML=""
}
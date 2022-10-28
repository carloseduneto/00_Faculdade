function somar() {
    let txtn1= document.getElementById(`txtn1`);
    let txtn2=document.querySelector(`input#txtn2`);//Vai pegar o id do input (o querySelector)
    let resp = document.getElementById(`resp`);

    let n1= Number(txtn1.value);
    let n2= Number(txtn2.value)

    let soma= n1+n2;
    resp.innerHTML= `Soma entre ${n1} e ${n2} é igual a ${soma}`;
}
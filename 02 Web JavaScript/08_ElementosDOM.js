//Recupera o valor da TAG, e muda o estilo dele
let paragrafo1= document.getElementsByTagName(`p`)[0];
let paragrafo2 = document.getElementsByTagName(`p`)[1];

paragrafo1.style.color=`red`;
document.write(paragrafo2.innerHTML);
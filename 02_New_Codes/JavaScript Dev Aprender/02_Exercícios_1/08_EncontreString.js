//Criar um método para ler as propiedades de um objeto e exibir somente as propiedades do tipo string que estão nesse objeto
const musicas = {
    Nome: "Llama In My Living Room",
    Ano: 2017,
    Compositor:"AronChupa & Little Sis Nora",
    Album: "Llama In My Living Room"
}
exibirPropiedades(musicas);

function exibirPropiedades(objeto){
for (let caracteristicas in objeto){
    if (typeof objeto[caracteristicas] === "string")
    console.log(caracteristicas, ":", objeto[caracteristicas])
}
}
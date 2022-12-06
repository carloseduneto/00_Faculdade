function aumentarOdontologia() {
    let caixaOdontologia=document.getElementById("caixaOdontologia");
    caixaOdontologia.style.height="440px";
    
    let textoOdontologia=document.getElementById("textoOdontologia");
    textoOdontologia.style.color="white";
    textoOdontologia.innerHTML="O curso de Odontologia da Libertas – Faculdades Integradas tem como objetivo a formação integral do Cirurgião-Dentista em harmonia com as características local e regional da cidade de São Sebastião do Paraíso, desenvolvendo suas capacidades para uma prática promocional de saúde, amparado em um correto diagnóstico, tratamento e prevenção das doenças bucais prevalentes."

    let estrelaOdontologia=document.getElementById("estrelaOdontologia");
    estrelaOdontologia.innerHTML="<div class=embaixo><span class=material-symbols-rounded estrela>star</span> <span class=estrela>4,0</span></div>"
    estrelaOdontologia.style.color="gold"

    let tempoOdontologia=document.getElementById("tempoOdontologia");
    tempoOdontologia.innerHTML="         <div class=embaixo><span class=material-symbols-outlined tempo align=center>schedule</span><span class=tempo>5 anos</span></div>"
    tempoOdontologia.style.color="white";

    let voltarOdontologia=document.getElementById("voltarOdontologia");
    voltarOdontologia.innerHTML="<button onclick=reduzirOdontologia()><span class=material-symbols-outlined>expand_less</span></button>"
    reduzirAdm()
    reduzirCC()
    reduzirDireito()
    reduzirEnfermagem()
    reduzirEngenhariaCivil()
    reduzirEngenhariaProducao()
    // reduzirOdontologia()
    reduzirPedagogia()
    reduzirPsicologia()
    reduzirSistemas()
}

function reduzirOdontologia(){
    let caixaOdontologia=document.getElementById("caixaOdontologia");
    caixaOdontologia.style.height="100px";

    let textoOdontologia=document.getElementById("textoOdontologia");
    textoOdontologia.innerHTML=""

    let voltarOdontologia=document.getElementById("voltarOdontologia");
    voltarOdontologia.innerHTML="<button onclick=aumentarOdontologia()><span class=material-symbols-outlined>navigate_next</span></button>"

    let estrelaOdontologia=document.getElementById("estrelaOdontologia");
    estrelaOdontologia.innerHTML="";

    let tempoOdontologia=document.getElementById("tempoOdontologia");
    tempoOdontologia.innerHTML="";
}

function aumentarEnfermagem() {
    let caixaEnfermagem=document.getElementById("caixaEnfermagem");
    caixaEnfermagem.style.height="520px";
    
    let textoEnfermagem=document.getElementById("textoEnfermagem");
    textoEnfermagem.style.color="white";
    textoEnfermagem.innerHTML="O profissional enfermeiro egresso da Libertas – Faculdades Integradas deverá ser capaz de desenvolver suas habilidades e competências nas áreas de assistência, administração, ensino, pesquisa e extensão, com base no perfil epidemiológico regional e nacional e nas mudanças no campo científico e tecnológico da saúde. Também o profissional poderá prestar assistência sistematizada individual e coletiva, por meio de ações integradas de promoção, proteção, recuperação e reabilitação da saúde em todas as fases do ciclo vital e do processo saúde-doença, na rede pública e/ou privada de saúde."

    let estrelaEnfermagem=document.getElementById("estrelaEnfermagem");
    estrelaEnfermagem.style.background="white";

    let tempoEnfermagem=document.getElementById("tempoEnfermagem");
    tempoEnfermagem.style.border="solid grey";

    let voltarEnfermagem=document.getElementById("voltarEnfermagem");
    voltarEnfermagem.innerHTML="<button onclick=reduzirEnfermagem()><span class=material-symbols-outlined>expand_less</span></button>"
    reduzirAdm()
    reduzirCC()
    reduzirDireito()
    // reduzirEnfermagem()
    reduzirEngenhariaCivil()
    reduzirEngenhariaProducao()
    reduzirOdontologia()
    reduzirPedagogia()
    reduzirPsicologia()
    reduzirSistemas()
}

function reduzirEnfermagem(){
    let caixaEnfermagem=document.getElementById("caixaEnfermagem");
    caixaEnfermagem.style.height="100px";

    let textoEnfermagem=document.getElementById("textoEnfermagem");
    textoEnfermagem.innerHTML=""

    let voltarEnfermagem=document.getElementById("voltarEnfermagem");
    voltarEnfermagem.innerHTML="<button onclick=aumentarEnfermagem()><span class=material-symbols-outlined>navigate_next</span></button>"

    let estrelaEnfermagem=document.getElementById("estrelaEnfermagem");
    estrelaEnfermagem.style.background="";

    let tempoEnfermagem=document.getElementById("tempoEnfermagem");
    tempoEnfermagem.style.border="";
}

function aumentarPsicologia() {
    let caixaPsicologia=document.getElementById("caixaPsicologia");
    caixaPsicologia.style.height="480px";
    
    let textoPsicologia=document.getElementById("textoPsicologia");
    textoPsicologia.style.color="white";
    textoPsicologia.innerHTML="Na Licenciatura, o Psicólogo egresso da Libertas – Faculdades Integradas será capaz de atuar em diferentes espaços como: na construção de políticas públicas de educação; na educação básica, no nível médio (caso retornem com a disciplina de psicologia), no curso Normal; em cursos profissionalizantes e em cursos técnicos; na educação continuada; assim como em contextos de educação informal como abrigos, centros socioeducativos, instituições comunitárias e outros. (DIRETRIZES, 2011, art.13, § 1º, a)."

    let estrelaPsicologia=document.getElementById("estrelaPsicologia");
    estrelaPsicologia.style.background="white";

    let tempoPsicologia=document.getElementById("tempoPsicologia");
    tempoPsicologia.style.border="solid grey";

    let voltarPsicologia=document.getElementById("voltarPsicologia");
    voltarPsicologia.innerHTML="<button onclick=reduzirPsicologia()><span class=material-symbols-outlined>expand_less</span></button>"
    reduzirAdm()
    reduzirCC()
    reduzirDireito()
    reduzirEnfermagem()
    reduzirEngenhariaCivil()
    reduzirEngenhariaProducao()
    reduzirOdontologia()
    reduzirPedagogia()
    // reduzirPsicologia()
    reduzirSistemas()
}

function reduzirPsicologia(){
    let caixaPsicologia=document.getElementById("caixaPsicologia");
    caixaPsicologia.style.height="100px";

    let textoPsicologia=document.getElementById("textoPsicologia");
    textoPsicologia.innerHTML=""

    let voltarPsicologia=document.getElementById("voltarPsicologia");
    voltarPsicologia.innerHTML="<button onclick=aumentarPsicologia()><span class=material-symbols-outlined>navigate_next</span></button>"

    let estrelaPsicologia=document.getElementById("estrelaPsicologia");
    estrelaPsicologia.style.background="";

    let tempoPsicologia=document.getElementById("tempoPsicologia");
    tempoPsicologia.style.border="";
}


function aumentarEngenhariaCivil() {
    let caixaEngenhariaCivil=document.getElementById("caixaEngenhariaCivil");
    caixaEngenhariaCivil.style.height="480px";
    
    let textoEngenhariaCivil=document.getElementById("textoEngenhariaCivil");
    textoEngenhariaCivil.style.color="white";
    textoEngenhariaCivil.innerHTML="O curso de Bacharel em Engenharia Civil tem como objetivo atender à demanda por profissionais com perfil de projetar, liderar e inovar em projetos e obras. Conforme resolução do Confea (Conselho Federal de Engenharia e Agronomia), constituem áreaa de atuação do engenheiro civil: edificações, estradas, pistas de rolamentos e aeroportos, sistema de transportes, de abastecimento de água e de saneamento, portos, rios, canais, barragens e diques, drenagem e irrigação, pontes e grandes estruturas, serviços afins e correlatos.."

    let estrelaEngenhariaCivil=document.getElementById("estrelaEngenhariaCivil");
    estrelaEngenhariaCivil.style.background="white";

    let tempoEngenhariaCivil=document.getElementById("tempoEngenhariaCivil");
    tempoEngenhariaCivil.style.border="solid grey";

    let voltarEngenhariaCivil=document.getElementById("voltarEngenhariaCivil");
    voltarEngenhariaCivil.innerHTML="<button onclick=reduzirEngenhariaCivil()><span class=material-symbols-outlined>expand_less</span></button>"
    reduzirAdm()
    reduzirCC()
    reduzirDireito()
    reduzirEnfermagem()
    // reduzirEngenhariaCivil()
    reduzirEngenhariaProducao()
    reduzirOdontologia()
    reduzirPedagogia()
    reduzirPsicologia()
    reduzirSistemas()
}

function reduzirEngenhariaCivil(){
    let caixaEngenhariaCivil=document.getElementById("caixaEngenhariaCivil");
    caixaEngenhariaCivil.style.height="100px";

    let textoEngenhariaCivil=document.getElementById("textoEngenhariaCivil");
    textoEngenhariaCivil.innerHTML=""

    let voltarEngenhariaCivil=document.getElementById("voltarEngenhariaCivil");
    voltarEngenhariaCivil.innerHTML="<button onclick=aumentarEngenhariaCivil()><span class=material-symbols-outlined>navigate_next</span></button>"

    let estrelaEngenhariaCivil=document.getElementById("estrelaEngenhariaCivil");
    estrelaEngenhariaCivil.style.background="";

    let tempoEngenhariaCivil=document.getElementById("tempoEngenhariaCivil");
    tempoEngenhariaCivil.style.border="";

}


function aumentarSistemas() {
    let caixaSistemas=document.getElementById("caixaSistemas");
    caixaSistemas.style.height="550px";
    
    let textoSistemas=document.getElementById("textoSistemas");
    textoSistemas.style.color="white";
    textoSistemas.innerHTML="O profissional na área de Sistemas de Informação é capaz de aplicar e gerenciar a computação em diversos meios de conhecimento, permitindo a criação de sistemas que visem melhorar as condições de trabalho do usuário, profissional ou leigo. A expertise do profissional de Sistemas de Informação, portanto, vai muito além de programação.O curso oferece conhecimento na criação de sistemas com a utilização de diversas linguagens, entre outras tecnologias emergentes, marketing voltado para o mercado de software, aplicabilidade da informática em novos meios, como desenvolvimento de jogos, web e redes, e design aplicado à interface e à acessibilidade."

    let estrelaSistemas=document.getElementById("estrelaSistemas");
    estrelaSistemas.style.background="white";

    let tempoSistemas=document.getElementById("tempoSistemas");
    tempoSistemas.style.border="solid grey";

    let voltarSistemas=document.getElementById("voltarSistemas");
    voltarSistemas.innerHTML="<button onclick=reduzirSistemas()><span class=material-symbols-outlined>expand_less</span></button>"
    reduzirAdm()
    reduzirCC()
    reduzirDireito()
    reduzirEnfermagem()
    reduzirEngenhariaCivil()
    reduzirEngenhariaProducao()
    reduzirOdontologia()
    reduzirPedagogia()
    reduzirPsicologia()
    // reduzirSistemas()
}

function reduzirSistemas(){
    let caixaSistemas=document.getElementById("caixaSistemas");
    caixaSistemas.style.height="100px";

    let textoSistemas=document.getElementById("textoSistemas");
    textoSistemas.innerHTML=""

    let voltarSistemas=document.getElementById("voltarSistemas");
    voltarSistemas.innerHTML="<button onclick=aumentarSistemas()><span class=material-symbols-outlined>navigate_next</span></button>"

    let estrelaSistemas=document.getElementById("estrelaSistemas");
    estrelaSistemas.style.background="";

    let tempoSistemas=document.getElementById("tempoSistemas");
    tempoSistemas.style.border="";
}


// function aumentarEngenhariaProducao() {
//     let caixaEngenhariaProducao=document.getElementById("caixaEngenhariaProducao");
//     caixaEngenhariaProducao.style.height="550px";
    
//     let textoEngenhariaProducao=document.getElementById("textoEngenhariaProducao");
//     textoEngenhariaProducao.style.color="white";
//     textoEngenhariaProducao.innerHTML="O curso de graduação em Engenharia deve proporcionar aos seus egressos a capacidade de formular e conceber soluções desejáveis de engenharia, analisando e compreendendo os usuários dessas soluções e seu contexto; analisar e compreender os fenômenos físicos e químicos por meio de modelos simbólicos, físicos e outros, verificados e validados por experimentação; conceber, projetar e analisar sistemas, produtos (bens e serviços), componentes ou processos; implantar, supervisionar e controlar as soluções de Engenharia; comunicar-se eficazmente nas formas escrita, oral e gráfica; trabalhar e liderar equipes multidisciplinares; conhecer e aplicar com ética a legislação e os atos normativos no âmbito do exercício da profissão; aprender de forma autônoma e lidar com situações e contextos complexos, atualizando-se em relação aos avanços da ciência, da tecnologia e aos desafios da inovação."

//     let estrelaEngenhariaProducao=document.getElementById("estrelaEngenhariaProducao");
//     estrelaEngenhariaProducao.style.background="white";

//     let tempoEngenhariaProducao=document.getElementById("tempoEngenhariaProducao");
//     tempoEngenhariaProducao.style.border="solid grey";

//     let voltarEngenhariaProducao=document.getElementById("voltarEngenhariaProducao");
//     voltarEngenhariaProducao.innerHTML="<button onclick=reduzirEngenhariaProducao()><span class=material-symbols-outlined>expand_less</span></button>"
//     reduzirAdm()
//     reduzirCC()
//     reduzirDireito()
//     reduzirEnfermagem()
//     reduzirEngenhariaCivil()
//     reduzirEngenhariaProducao()
//     reduzirOdontologia()
//     reduzirPedagogia()
//     reduzirPsicologia()
//     reduzirSistemas()
// }

// function reduzirEngenhariaProducao(){
//     let caixaEngenhariaProducao=document.getElementById("caixaEngenhariaProducao");
//     caixaEngenhariaProducao.style.height="100px";

//     let textoEngenhariaProducao=document.getElementById("textoEngenhariaProducao");
//     textoEngenhariaProducao.innerHTML=""

//     let voltarEngenhariaProducao=document.getElementById("voltarEngenhariaProducao");
//     voltarEngenhariaProducao.innerHTML="<button onclick=aumentarEngenhariaProducao()><span class=material-symbols-outlined>navigate_next</span></button>"

//     let estrelaEngenhariaProducao=document.getElementById("estrelaEngenhariaProducao");
//     estrelaEngenhariaProducao.style.background="";

//     let tempoEngenhariaProducao=document.getElementById("tempoEngenhariaProducao");
//     tempoEngenhariaProducao.style.border="";
// }

function aumentarEngenhariaProducao() {
    let caixaEngenhariaProducao=document.getElementById("caixaEngenhariaProducao");
    caixaEngenhariaProducao.style.height="610px";
    
    let textoEngenhariaProducao=document.getElementById("textoEngenhariaProducao");
    textoEngenhariaProducao.style.color="white";
    textoEngenhariaProducao.innerHTML="O perfil do Pedagogo no contexto educacional é extenso e pode se dividir entre a Educação Infantil, os anos iniciais do Ensino Fundamental e em disciplinas pedagógicas dos cursos de nível médio, na modalidade normal e de educação profissional na área de Serviços e Apoio Escolar, e em outras áreas em que disciplinas pedagógicas estejam previstas. Onde houver uma prática educativa, existe aí uma ação pedagógica.O curso oferece quanto ao exercício da docência das disciplinas pedagógicas, a organização de um conteúdo programático voltado ao conhecimento das modernas teorias sobre ensino/aprendizagem, aliada às disciplinas das práticas pedagógicas que visam instrumentalizá-lo, conferem-lhe um cabedal de conhecimentos que o induzem à construção de um conjunto de saberes necessários à docência. "

    let estrelaEngenhariaProducao=document.getElementById("estrelaEngenhariaProducao");
    estrelaEngenhariaProducao.style.background="white";

    let tempoEngenhariaProducao=document.getElementById("tempoEngenhariaProducao");
    tempoEngenhariaProducao.style.border="solid grey";

    let voltarEngenhariaProducao=document.getElementById("voltarEngenhariaProducao");
    voltarEngenhariaProducao.innerHTML="<button onclick=reduzirEngenhariaProducao()><span class=material-symbols-outlined>expand_less</span></button>"
    reduzirAdm()
    reduzirCC()
    reduzirDireito()
    reduzirEnfermagem()
    reduzirEngenhariaCivil()
    // reduzirEngenhariaProducao()
    reduzirOdontologia()
    reduzirPedagogia()
    reduzirPsicologia()
    reduzirPedagogia()
}

function reduzirEngenhariaProducao(){
    let caixaEngenhariaProducao=document.getElementById("caixaEngenhariaProducao");
    caixaEngenhariaProducao.style.height="100px";

    let textoEngenhariaProducao=document.getElementById("textoEngenhariaProducao");
    textoEngenhariaProducao.innerHTML=""

    let voltarEngenhariaProducao=document.getElementById("voltarEngenhariaProducao");
    voltarEngenhariaProducao.innerHTML="<button onclick=aumentarEngenhariaProducao()><span class=material-symbols-outlined>navigate_next</span></button>"

    let estrelaEngenhariaProducao=document.getElementById("estrelaEngenhariaProducao");
    estrelaEngenhariaProducao.style.background="";

    let tempoEngenhariaProducao=document.getElementById("tempoEngenhariaProducao");
    tempoEngenhariaProducao.style.border="";
}

function aumentarCC() {
    let caixaCC=document.getElementById("caixaCC");
    caixaCC.style.height="550px";
    
    let textoCC=document.getElementById("textoCC");
    textoCC.style.color="white";
    textoCC.innerHTML="O Contador é o profissional que cuida do patrimônio das entidades e exerce suas responsabilidades com foco na quantificação das informações financeiras, patrimoniais e governamentais. Ele viabiliza aos agentes econômicos e aos administradores de qualquer segmento produtivo ou institucional o pleno cumprimento de seus encargos quanto ao gerenciamento, aos controles e à prestação de contas de sua gestão. Além disso, garante informações para as tomadas de decisão, organização de atitudes e construção de valores orientados para a cidadania."

    let estrelaCC=document.getElementById("estrelaCC");
    estrelaCC.style.background="white";

    let tempoCC=document.getElementById("tempoCC");
    tempoCC.style.border="solid grey";

    let voltarCC=document.getElementById("voltarCC");
    voltarCC.innerHTML="<button onclick=reduzirCC()><span class=material-symbols-outlined>expand_less</span></button>"
    reduzirAdm()
    // reduzirCC()
    reduzirDireito()
    reduzirEnfermagem()
    reduzirEngenhariaCivil()
    reduzirEngenhariaProducao()
    reduzirOdontologia()
    reduzirPedagogia()
    reduzirPsicologia()
    reduzirSistemas()
}

function reduzirCC(){
    let caixaCC=document.getElementById("caixaCC");
    caixaCC.style.height="100px";

    let textoCC=document.getElementById("textoCC");
    textoCC.innerHTML=""

    let voltarCC=document.getElementById("voltarCC");
    voltarCC.innerHTML="<button onclick=aumentarCC()><span class=material-symbols-outlined>navigate_next</span></button>"

    let estrelaCC=document.getElementById("estrelaCC");
    estrelaCC.style.background="";

    let tempoCC=document.getElementById("tempoCC");
    tempoCC.style.border="";
}

// function aumentarAdm() {
//     let caixaAdm=document.getElementById("caixaAdm");
//     caixaAdm.style.height="550px";
    
//     let textoAdm=document.getElementById("textoAdm");
//     textoAdm.style.color="white";
//     textoAdm.innerHTML="A administração é uma ciência social aplicada, fundamentada em um conjunto de normas, conceitos e funções teórico-práticas construídas para controlar elementos de produção. Essa mesma ciência estuda os empreendimentos humanos com o objetivo de alcançar um resultado eficaz com retorno financeiro baseado em princípios sociais, econômico e ambientais.Assim, considerando a importância do Administrador no contexto sociopolítico e econômico do País, enquanto profissional comprometido com os interesses e desafios que emanam da sociedade, e tendo como pressuposto básico a ideia de que, embora considerando as peculiaridades regionais e locais, a formação do administrador deve ter um caráter abrangente e eclético. "

//     let estrelaAdm=document.getElementById("estrelaAdm");
//     estrelaAdm.style.background="white";

//     let tempoAdm=document.getElementById("tempoAdm");
//     tempoAdm.style.border="solid grey";

//     let voltarAdm=document.getElementById("voltarAdm");
//     voltarAdm.innerHTML="<button onclick=reduzirAdm()><span class=material-symbols-outlined>expand_less</span></button>"
//     reduzirAdm()
//     reduzirCC()
//     reduzirDireito()
//     reduzirEnfermagem()
//     reduzirEngenhariaCivil()
//     reduzirEngenhariaProducao()
//     reduzirOdontologia()
//     reduzirPedagogia()
//     reduzirPsicologia()
//     reduzirSistemas()
// }

// function reduzirAdm(){
//     let caixaAdm=document.getElementById("caixaAdm");
//     caixaAdm.style.height="100px";

//     let textoAdm=document.getElementById("textoAdm");
//     textoAdm.innerHTML=""

//     let voltarAdm=document.getElementById("voltarAdm");
//     voltarAdm.innerHTML="<button onclick=aumentarAdm()><span class=material-symbols-outlined>navigate_next</span></button>"

//     let estrelaAdm=document.getElementById("estrelaAdm");
//     estrelaAdm.style.background="";

//     let tempoAdm=document.getElementById("tempoAdm");
//     tempoAdm.style.border="";
// }



function aumentarDireito() {
    let caixaDireito=document.getElementById("caixaDireito");
    caixaDireito.style.height="560px";
    
    let textoDireito=document.getElementById("textoDireito");
    textoDireito.style.color="white";
    textoDireito.innerHTML="O curso de Direito da Libertas – Faculdades Integradas representa para nossa região um marco em ensino jurídico. Junto ao excelente corpo docente formado por mestres e doutores existe toda a preocupação em permitir ao aluno uma vasta visão do conhecimento jurídico. Dentro de sua estrutura, temos o Núcleo de Prática Jurídica, que possibilita a junção da teoria à prática. Existe um perfil diferenciado que leva o seu caráter empresarial para toda comunidade acadêmica.A opção pelo curso de Direito é valorizada pelas carreiras públicas jurídicas, renovando o espírito competitivo e formando no seu corpo a convicção de que com uma boa faculdade e com um excelente ensino é possível atingir êxito profissional."

    let estrelaDireito=document.getElementById("estrelaDireito");
    estrelaDireito.style.background="white";

    let tempoDireito=document.getElementById("tempoDireito");
    tempoDireito.style.border="solid grey";

    let voltarDireito=document.getElementById("voltarDireito");
    voltarDireito.innerHTML="<button onclick=reduzirDireito()><span class=material-symbols-outlined>expand_less</span></button>"
    reduzirAdm()
    reduzirCC()
    // reduzirDireito()
    reduzirEnfermagem()
    reduzirEngenhariaCivil()
    reduzirEngenhariaProducao()
    reduzirOdontologia()
    reduzirPedagogia()
    reduzirPsicologia()
    reduzirSistemas()
}

function reduzirDireito(){
    let caixaDireito=document.getElementById("caixaDireito");
    caixaDireito.style.height="100px";

    let textoDireito=document.getElementById("textoDireito");
    textoDireito.innerHTML=""

    let voltarDireito=document.getElementById("voltarDireito");
    voltarDireito.innerHTML="<button onclick=aumentarDireito()><span class=material-symbols-outlined>navigate_next</span></button>"

    let estrelaDireito=document.getElementById("estrelaDireito");
    estrelaDireito.style.background="";

    let tempoDireito=document.getElementById("tempoDireito");
    tempoDireito.style.border="";
}



function aumentarPedagogia() {
    let caixaPedagogia=document.getElementById("caixaPedagogia");
    caixaPedagogia.style.height="620px";
    
    let textoPedagogia=document.getElementById("textoPedagogia");
    textoPedagogia.style.color="white";
    textoPedagogia.innerHTML="O perfil do Pedagogo no contexto educacional é extenso e pode se dividir entre a Educação Infantil, os anos iniciais do Ensino Fundamental e em disciplinas pedagógicas dos cursos de nível médio, na modalidade normal e de educação profissional na área de Serviços e Apoio Escolar, e em outras áreas em que disciplinas pedagógicas estejam previstas. Onde houver uma prática educativa, existe aí uma ação pedagógica.O curso oferece quanto ao exercício da docência das disciplinas pedagógicas, a organização de um conteúdo programático voltado ao conhecimento das modernas teorias sobre ensino/aprendizagem, aliada às disciplinas das práticas pedagógicas que visam instrumentalizá-lo, conferem-lhe um cabedal de conhecimentos que o induzem à construção de um conjunto de saberes necessários à docência. "

    let estrelaPedagogia=document.getElementById("estrelaPedagogia");
    estrelaPedagogia.style.background="white";

    let tempoPedagogia=document.getElementById("tempoPedagogia");
    tempoPedagogia.style.border="solid grey";

    let voltarPedagogia=document.getElementById("voltarPedagogia");
    voltarPedagogia.innerHTML="<button onclick=reduzirPedagogia()><span class=material-symbols-outlined>expand_less</span></button>"
    reduzirAdm()
    reduzirCC()
    reduzirDireito()
    reduzirEnfermagem()
    reduzirEngenhariaCivil()
    reduzirEngenhariaProducao()
    reduzirOdontologia()
    // reduzirPedagogia()
    reduzirPsicologia()
    // reduzirPedagogia()
}

function reduzirPedagogia(){
    let caixaPedagogia=document.getElementById("caixaPedagogia");
    caixaPedagogia.style.height="100px";

    let textoPedagogia=document.getElementById("textoPedagogia");
    textoPedagogia.innerHTML=""

    let voltarPedagogia=document.getElementById("voltarPedagogia");
    voltarPedagogia.innerHTML="<button onclick=aumentarPedagogia()><span class=material-symbols-outlined>navigate_next</span></button>"

    let estrelaPedagogia=document.getElementById("estrelaPedagogia");
    estrelaPedagogia.style.background="";

    let tempoPedagogia=document.getElementById("tempoPedagogia");
    tempoPedagogia.style.border="";
}

function aumentarAdm() {
    let caixaAdm=document.getElementById("caixaAdm");
    caixaAdm.style.height="580px";
    
    let textoAdm=document.getElementById("textoAdm");
    textoAdm.style.color="white";
    textoAdm.innerHTML="O curso de Administração da Libertas – Faculdades Integradas representa para nossa região um marco em ensino jurídico. Junto ao excelente corpo docente formado por mestres e doutores existe toda a preocupação em permitir ao aluno uma vasta visão do conhecimento jurídico. Dentro de sua estrutura, temos o Núcleo de Prática Jurídica, que possibilita a junção da teoria à prática. Existe um perfil diferenciado que leva o seu caráter empresarial para toda comunidade acadêmica.A opção pelo curso de Adminstracao é valorizada pelas carreiras públicas jurídicas, renovando o espírito competitivo e formando no seu corpo a convicção de que com uma boa faculdade e com um excelente ensino é possível atingir êxito profissional."

    let estrelaAdm=document.getElementById("estrelaAdm");
    estrelaAdm.style.background="white";

    let tempoAdm=document.getElementById("tempoAdm");
    tempoAdm.style.border="solid grey";

    let voltarAdm=document.getElementById("voltarAdm");
    voltarAdm.innerHTML="<button onclick=reduzirAdm()><span class=material-symbols-outlined>expand_less</span></button>"
    // reduzirAdm()
    reduzirCC()
    reduzirDireito()
    reduzirEnfermagem()
    reduzirEngenhariaCivil()
    reduzirEngenhariaProducao()
    reduzirOdontologia()
    reduzirPedagogia()
    reduzirPsicologia()
    reduzirSistemas()
}

function reduzirAdm(){
    let caixaAdm=document.getElementById("caixaAdm");
    caixaAdm.style.height="100px";

    let textoAdm=document.getElementById("textoAdm");
    textoAdm.innerHTML=""

    let voltarAdm=document.getElementById("voltarAdm");
    voltarAdm.innerHTML="<button onclick=aumentarAdm()><span class=material-symbols-outlined>navigate_next</span></button>"

    let estrelaAdm=document.getElementById("estrelaAdm");
    estrelaAdm.style.background="";

    let tempoAdm=document.getElementById("tempoAdm");
    tempoAdm.style.border="";
}
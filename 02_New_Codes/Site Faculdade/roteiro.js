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
    tempoOdontologia.innerHTML="<div class=embaixo><span class=material-symbols-outlined tempo align=center>schedule</span><span class=tempo>5 anos</span></div>"
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
    estrelaEnfermagem.innerHTML="<div class=embaixo><span class=material-symbols-rounded estrela>star</span> <span class=estrela>2,0</span></div>"
    estrelaEnfermagem.style.color="gold";

    let tempoEnfermagem=document.getElementById("tempoEnfermagem");
    tempoEnfermagem.innerHTML="<div class=embaixo><span class=material-symbols-outlined tempo align=center>schedule</span><span class=tempo>5 anos</span></div>"
    tempoEnfermagem.style.color="white";

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
    estrelaEnfermagem.innerHTML="";

    let tempoEnfermagem=document.getElementById("tempoEnfermagem");
    tempoEnfermagem.innerHTML="";
}

function aumentarPsicologia() {
    let caixaPsicologia=document.getElementById("caixaPsicologia");
    caixaPsicologia.style.height="480px";
    
    let textoPsicologia=document.getElementById("textoPsicologia");
    textoPsicologia.style.color="white";
    textoPsicologia.innerHTML="Na Licenciatura, o Psicólogo egresso da Libertas – Faculdades Integradas será capaz de atuar em diferentes espaços como: na construção de políticas públicas de educação; na educação básica, no nível médio (caso retornem com a disciplina de psicologia), no curso Normal; em cursos profissionalizantes e em cursos técnicos; na educação continuada; assim como em contextos de educação informal como abrigos, centros socioeducativos, instituições comunitárias e outros. (DIRETRIZES, 2011, art.13, § 1º, a)."

    let estrelaPsicologia=document.getElementById("estrelaPsicologia");
    estrelaPsicologia.innerHTML="<div class=embaixo><span class=material-symbols-rounded estrela>star</span> <span class=estrela>4,0</span></div>"
    estrelaPsicologia.style.color="gold";

    let tempoPsicologia=document.getElementById("tempoPsicologia");
    tempoPsicologia.innerHTML="<div class=embaixo><span class=material-symbols-outlined tempo align=center>schedule</span><span class=tempo>5 anos</span></div>"
    tempoPsicologia.style.color="white";

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
    estrelaPsicologia.innerHTML="";

    let tempoPsicologia=document.getElementById("tempoPsicologia");
    tempoPsicologia.innerHTML="";
}


function aumentarEngenhariaCivil() {
    let caixaEngenhariaCivil=document.getElementById("caixaEngenhariaCivil");
    caixaEngenhariaCivil.style.height="480px";
    
    let textoEngenhariaCivil=document.getElementById("textoEngenhariaCivil");
    textoEngenhariaCivil.style.color="white";
    textoEngenhariaCivil.innerHTML="O curso de Bacharel em Engenharia Civil tem como objetivo atender à demanda por profissionais com perfil de projetar, liderar e inovar em projetos e obras. Conforme resolução do Confea (Conselho Federal de Engenharia e Agronomia), constituem áreaa de atuação do engenheiro civil: edificações, estradas, pistas de rolamentos e aeroportos, sistema de transportes, de abastecimento de água e de saneamento, portos, rios, canais, barragens e diques, drenagem e irrigação, pontes e grandes estruturas, serviços afins e correlatos.."

    let estrelaEngenhariaCivil=document.getElementById("estrelaEngenhariaCivil");
    estrelaEngenhariaCivil.innerHTML="<div class=embaixo><span class=material-symbols-rounded estrela>star</span> <span class=estrela>3,0</span></div>"
    estrelaEngenhariaCivil.style.color="gold";

    let tempoEngenhariaCivil=document.getElementById("tempoEngenhariaCivil");
    tempoEngenhariaCivil.innerHTML="<div class=embaixo><span class=material-symbols-outlined tempo align=center>schedule</span><span class=tempo>5 anos</span></div>"
    tempoEngenhariaCivil.style.color="white";

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
    estrelaEngenhariaCivil.innerHTML="";

    let tempoEngenhariaCivil=document.getElementById("tempoEngenhariaCivil");
    tempoEngenhariaCivil.innerHTML="";

}


function aumentarSistemas() {
    let caixaSistemas=document.getElementById("caixaSistemas");
    caixaSistemas.style.height="550px";
    
    let textoSistemas=document.getElementById("textoSistemas");
    textoSistemas.style.color="white";
    textoSistemas.innerHTML="O profissional na área de Sistemas de Informação é capaz de aplicar e gerenciar a computação em diversos meios de conhecimento, permitindo a criação de sistemas que visem melhorar as condições de trabalho do usuário, profissional ou leigo. A expertise do profissional de Sistemas de Informação, portanto, vai muito além de programação.O curso oferece conhecimento na criação de sistemas com a utilização de diversas linguagens, entre outras tecnologias emergentes, marketing voltado para o mercado de software, aplicabilidade da informática em novos meios, como desenvolvimento de jogos, web e redes, e design aplicado à interface e à acessibilidade."

    let estrelaSistemas=document.getElementById("estrelaSistemas");
    estrelaSistemas.innerHTML="<div class=embaixo><span class=material-symbols-rounded estrela>star</span> <span class=estrela>3,0</span></div>"
    estrelaSistemas.style.color="gold";

    let tempoSistemas=document.getElementById("tempoSistemas");
    tempoSistemas.innerHTML="<div class=embaixo><span class=material-symbols-outlined tempo align=center>schedule</span><span class=tempo>4 anos</span></div>"
    tempoSistemas.style.color="white";

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
    estrelaSistemas.innerHTML="";

    let tempoSistemas=document.getElementById("tempoSistemas");
    tempoSistemas.innerHTML="";
}


function aumentarEngenhariaProducao() {
    let caixaEngenhariaProducao=document.getElementById("caixaEngenhariaProducao");
    caixaEngenhariaProducao.style.height="610px";
    
    let textoEngenhariaProducao=document.getElementById("textoEngenhariaProducao");
    textoEngenhariaProducao.style.color="white";
    textoEngenhariaProducao.innerHTML="O perfil do Pedagogo no contexto educacional é extenso e pode se dividir entre a Educação Infantil, os anos iniciais do Ensino Fundamental e em disciplinas pedagógicas dos cursos de nível médio, na modalidade normal e de educação profissional na área de Serviços e Apoio Escolar, e em outras áreas em que disciplinas pedagógicas estejam previstas. Onde houver uma prática educativa, existe aí uma ação pedagógica.O curso oferece quanto ao exercício da docência das disciplinas pedagógicas, a organização de um conteúdo programático voltado ao conhecimento das modernas teorias sobre ensino/aprendizagem, aliada às disciplinas das práticas pedagógicas que visam instrumentalizá-lo, conferem-lhe um cabedal de conhecimentos que o induzem à construção de um conjunto de saberes necessários à docência. "

    let estrelaEngenhariaProducao=document.getElementById("estrelaEngenhariaProducao");
    estrelaEngenhariaProducao.innerHTML="<div class=embaixo><span class=material-symbols-rounded estrela>star</span> <span class=estrela>4,0</span></div>"
    estrelaEngenhariaProducao.style.color="gold"

    let tempoEngenhariaProducao=document.getElementById("tempoEngenhariaProducao");
    tempoEngenhariaProducao.innerHTML="<div class=embaixo><span class=material-symbols-outlined tempo align=center>schedule</span><span class=tempo>5 anos</span></div>"
    tempoEngenhariaProducao.style.color="white";

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
    estrelaEngenhariaProducao.innerHTML="";

    let tempoEngenhariaProducao=document.getElementById("tempoEngenhariaProducao");
    tempoEngenhariaProducao.innerHTML="";
}

function aumentarCC() {
    let caixaCC=document.getElementById("caixaCC");
    caixaCC.style.height="500px";
    
    let textoCC=document.getElementById("textoCC");
    textoCC.style.color="white";
    textoCC.innerHTML="O Contador é o profissional que cuida do patrimônio das entidades e exerce suas responsabilidades com foco na quantificação das informações financeiras, patrimoniais e governamentais. Ele viabiliza aos agentes econômicos e aos administradores de qualquer segmento produtivo ou institucional o pleno cumprimento de seus encargos quanto ao gerenciamento, aos controles e à prestação de contas de sua gestão. Além disso, garante informações para as tomadas de decisão, organização de atitudes e construção de valores orientados para a cidadania."

    let estrelaCC=document.getElementById("estrelaCC");
    estrelaCC.innerHTML="<div class=embaixo><span class=material-symbols-rounded estrela>star</span> <span class=estrela>3,0</span></div>"
    estrelaCC.style.color="gold"

    let tempoCC=document.getElementById("tempoCC");
    tempoCC.innerHTML="<div class=embaixo><span class=material-symbols-outlined tempo align=center>schedule</span><span class=tempo>4 anos</span></div>"
    tempoCC.style.color="white";

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
    estrelaCC.innerHTML="";

    let tempoCC=document.getElementById("tempoCC");
    tempoCC.innerHTML="";
}



function aumentarDireito() {
    let caixaDireito=document.getElementById("caixaDireito");
    caixaDireito.style.height="560px";
    
    let textoDireito=document.getElementById("textoDireito");
    textoDireito.style.color="white";
    textoDireito.innerHTML="O curso de Direito da Libertas – Faculdades Integradas representa para nossa região um marco em ensino jurídico. Junto ao excelente corpo docente formado por mestres e doutores existe toda a preocupação em permitir ao aluno uma vasta visão do conhecimento jurídico. Dentro de sua estrutura, temos o Núcleo de Prática Jurídica, que possibilita a junção da teoria à prática. Existe um perfil diferenciado que leva o seu caráter empresarial para toda comunidade acadêmica.A opção pelo curso de Direito é valorizada pelas carreiras públicas jurídicas, renovando o espírito competitivo e formando no seu corpo a convicção de que com uma boa faculdade e com um excelente ensino é possível atingir êxito profissional."

    let estrelaDireito=document.getElementById("estrelaDireito");
    estrelaDireito.innerHTML="<div class=embaixo><span class=material-symbols-rounded estrela>star</span> <span class=estrela>3,0</span></div>"
    estrelaDireito.style.color="gold"

    let tempoDireito=document.getElementById("tempoDireito");
    tempoDireito.innerHTML="<div class=embaixo><span class=material-symbols-outlined tempo align=center>schedule</span><span class=tempo>5 anos</span></div>"
    tempoDireito.style.color="white";

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
    estrelaDireito.innerHTML="";

    let tempoDireito=document.getElementById("tempoDireito");
    tempoDireito.innerHTML="";
}



function aumentarPedagogia() {
    let caixaPedagogia=document.getElementById("caixaPedagogia");
    caixaPedagogia.style.height="620px";
    
    let textoPedagogia=document.getElementById("textoPedagogia");
    textoPedagogia.style.color="white";
    textoPedagogia.innerHTML="O perfil do Pedagogo no contexto educacional é extenso e pode se dividir entre a Educação Infantil, os anos iniciais do Ensino Fundamental e em disciplinas pedagógicas dos cursos de nível médio, na modalidade normal e de educação profissional na área de Serviços e Apoio Escolar, e em outras áreas em que disciplinas pedagógicas estejam previstas. Onde houver uma prática educativa, existe aí uma ação pedagógica.O curso oferece quanto ao exercício da docência das disciplinas pedagógicas, a organização de um conteúdo programático voltado ao conhecimento das modernas teorias sobre ensino/aprendizagem, aliada às disciplinas das práticas pedagógicas que visam instrumentalizá-lo, conferem-lhe um cabedal de conhecimentos que o induzem à construção de um conjunto de saberes necessários à docência. "

    let estrelaPedagogia=document.getElementById("estrelaPedagogia");
    estrelaPedagogia.innerHTML="<div class=embaixo><span class=material-symbols-rounded estrela>star</span> <span class=estrela>4,0</span></div>"
    estrelaPedagogia.style.color="gold"

    let tempoPedagogia=document.getElementById("tempoPedagogia");
    tempoPedagogia.innerHTML="<div class=embaixo><span class=material-symbols-outlined tempo align=center>schedule</span><span class=tempo>4 anos</span></div>"
    tempoPedagogia.style.color="white";

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
    estrelaPedagogia.innerHTML="";

    let tempoPedagogia=document.getElementById("tempoPedagogia");
    tempoPedagogia.innerHTML="";
}

function aumentarAdm() {
    let caixaAdm=document.getElementById("caixaAdm");
    caixaAdm.style.height="580px";
    
    let textoAdm=document.getElementById("textoAdm");
    textoAdm.style.color="white";
    textoAdm.innerHTML="O curso de Administração da Libertas – Faculdades Integradas representa para nossa região um marco em ensino jurídico. Junto ao excelente corpo docente formado por mestres e doutores existe toda a preocupação em permitir ao aluno uma vasta visão do conhecimento jurídico. Dentro de sua estrutura, temos o Núcleo de Prática Jurídica, que possibilita a junção da teoria à prática. Existe um perfil diferenciado que leva o seu caráter empresarial para toda comunidade acadêmica.A opção pelo curso de Adminstracao é valorizada pelas carreiras públicas jurídicas, renovando o espírito competitivo e formando no seu corpo a convicção de que com uma boa faculdade e com um excelente ensino é possível atingir êxito profissional."

    let estrelaAdm=document.getElementById("estrelaAdm");
    estrelaAdm.innerHTML="<div class=embaixo><span class=material-symbols-rounded estrela>star</span> <span class=estrela>3,0</span></div>"
    estrelaAdm.style.color="gold"

    let tempoAdm=document.getElementById("tempoAdm");
    tempoAdm.innerHTML="<div class=embaixo><span class=material-symbols-outlined tempo align=center>schedule</span><span class=tempo>4 anos</span></div>"
    tempoAdm.style.color="white";

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
    estrelaAdm.innerHTML="";

    let tempoAdm=document.getElementById("tempoAdm");
    tempoAdm.innerHTML="";
}
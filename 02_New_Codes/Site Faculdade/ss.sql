CREATE DATABASE consultorio;

\c consultorio;

CREATE TABLE tratamento( id SERIAL PRIMARY KEY,
nomeTratamento VARCHAR(50), descricao TEXT,
preco NUMERIC(10,2)
);

CREATE TABLE dentista(
id SERIAL PRIMARY KEY, nome VARCHAR(100),
especialidade VARCHAR(25), contato VARCHAR(20)
);

CREATE TABLE paciente(
id SERIAL PRIMARY KEY,
nome VARCHAR(100),
dataConsulta DATE,
contato VARCHAR(20), 
endereco VARCHAR(100)
);

CREATE TABLE fatura(
id SERIAL PRIMARY KEY,
idPaciente INTEGER, idTratamento INTEGER, dataFatura date, valorFatura float,
FOREIGN KEY (idPaciente) REFERENCES paciente(id) ON UPDATE NO ACTION ON DELETE NO ACTION,
FOREIGN KEY (idTratamento) REFERENCES tratamento(id)
ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE TABLE pagamento( id SERIAL PRIMARY KEY,
idFatura INTEGER, dataPagamento DATE, valorPago FLOAT,
FOREIGN KEY (idFatura) REFERENCES fatura(id) ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE TABLE consulta(
id SERIAL PRIMARY KEY,
dataHora TIMESTAMP WITHOUT TIME ZONE,
idPaciente INTEGER, idDentista INTEGER,
FOREIGN KEY (idPaciente) REFERENCES paciente(id) ON UPDATE NO ACTION ON DELETE NO ACTION,
FOREIGN KEY (idDentista) REFERENCES dentista(id) ON UPDATE NO ACTION ON DELETE NO ACTION
);

// Paciente

ALTER TABLE paciente ADD COLUMN cpf CHARACTER VARYING(11);

ALTER TABLE paciente DROP COLUMN endereco;

CREATE TYPE type_endereco AS(
	cep VARCHAR(10),
	cidade VARCHAR(200),
	bairro VARCHAR(100),
	logradouro VARCHAR(200),
	numero INTEGER,
	complemento VARCHAR(50)
);

ALTER TABLE paciente ADD COLUMN endereco type_endereco;

ALTER TABLE paciente ADD COLUMN dataNascimento date;

ALTER TABLE paciente RENAME COLUMN contato TO celular;

ALTER TABLE paciente DROP dataConsulta;

ALTER TABLE paciente ADD COLUMN observacao text;

CREATE TYPE type_sexo_enum AS ENUM('Masculino', 'Feminino', 'Outro');

ALTER TABLE paciente ADD COLUMN sexo type_enum_sexo;

ALTER TABLE paciente ADD COLUMN email CHARACTER VARYING(100);


///Dentista
ALTER TABLE dentista ADD COLUMN cpf CHARACTER VARYING(11);

ALTER TABLE dentista ADD COLUMN endereco type_endereco;

ALTER TABLE dentista ADD COLUMN dataNascimento date;

ALTER TABLE dentista RENAME COLUMN contato TO celular;

ALTER TABLE dentista ADD COLUMN observacao text;

ALTER TABLE dentista ADD COLUMN sexo type_enum_sexo;

ALTER TABLE dentista ADD COLUMN email CHARACTER VARYING(100);

ALTER TABLE dentista DROP especialidade;

CREATE TYPE tipo_especialidade AS (
    nome VARCHAR(100)
);

ALTER TABLE dentista ADD COLUMN especialidade tipo_especialidade;

ALTER TABLE dentista ADD COLUMN cro CHARACTER VARYING (50);


/// Consulta

ALTER TABLE consulta rename column datahora to data;

ALTER TABLE consulta add column tratamento json;

ALTER TABLE consulta add column observacao text;

ALTER TABLE consulta rename column id to idconsulta;



///Pagamento

ALTER TABLE fatura drop column id_tratamento;

ALTER TABLE fatura drop column id_paciente;

ALTER TABLE fatura add column id_consulta integer;

ALTER TABLE fatura ADD CONSTRAINT id_consulta FOREIGN KEY consulta (id_consulta) REFERENCES consulta(id_consulta);

ALTER TABLE fatura rename column datafatura to data;

ALTER table fatura alter column data type timestamp without time zone;

ALTER TABLE fatura add column data_vencimento timestamp without time zone;

ALTER TABLE fatura rename column valorfatura to valor;

CREATE TYPE enum_tipopagamento AS ENUM ('Cartão de Crédito','Cartão de Débito','Dinheiro','Transferência Bancária','PIX');

ALTER TABLE fatura ADD COLUMN forma_pagamento enum_tipopagamento;

ALTER TABLE fatura ADD COLUMN statuspago BOOLEAN DEFAULT false;

ALTER TABLE fatura
ADD CONSTRAINT fk_idconsulta
FOREIGN KEY (id_consulta) REFERENCES consulta(id);


/// ALTERAÇÕES TABELA PAGAMENTO

ALTER TABLE pagamento alter column datapagamento type timestamp without time zone;

ALTER TABLE pagamento rename column valorpago to valor;

ALTER TABLE pagamento ADD COLUMN forma_pagamento enum_tipopagamento;

-- Dentista
INSERT INTO dentista (nome, cpf, endereco, datanascimento, celular, observacao, sexo, email, especialidade, cro)
VALUES
  ('Dr. Felipe Passagem', '12345678901', ('Rua Gedor Silveira', 888, 'Centro', 'Apartamento', 'Sao Sebastiao do Paraiso', 'MG'),   '1993-09-01', '999999999', 'Graduado pela USP', 'M', 'felipe@gmail.com', 'Implantodontia', '12345'),
  ('Dra. Josiane Elida de Paula', '1234543901', ('Avenida Humberto Bombarda', 123, 'Centro', 'Casa', 'Araraquara', 'SP'),   '1999-10-10', '999996599', 'Graduada pela Unifran', 'F', 'josiane@gmail.com', 'Endondontia', '12345'),
  ('Dra. Jessica Lirian', '12345646501', ('Rua Alameda Araras', 456, '', 'Vila Romana', 'Passos', 'MG'),   '1993-09-01', '954332213', 'Graduado pela USP', 'O', 'jessica@gmail.com', 'Implantodontia', '12345'),
  ('Dr. Rafael Vinícius', '12345632901', ('Avenida Maestro Herve Cordovil', 222, 'Antônio Marincek', 'Casa', 'Ribeirao Preto', 'SP'),   '1998-12-01', '954323434', 'Graduado pela UEMG', 'M', 'rafavini@gmail.com', 'Endondontia', '12345');


-- Pacientes
INSERT INTO paciente (nome, cpf, endereco, datanascimento, celular, observacao, sexo, email)
VALUES
    ('Patricia Godoy', '12345678901', ('Rua Sao Sebastiao', 5, 'Sao Judas', 'casa', 'Sao Sebastiao do Paraiso', 'MG'), '1980-07-31', '(35) 3456-7890', 'Paciente Ligado', 'F', 'patricia@gmail.com'),
    ('Thaynara Cunha', '23456789012', ('Rua Captiao de Padua', 12, 'Centro', 'fundos', 'Sao Sebastiao do Paraiso', 'MG'), '1979-09-19', '(35) 3567-8901', 'Paciente Ligado', 'F', 'thaynara@gmail.com'),
    ('Wesley Safadao', '34567890123', ('Rua Sebastiao Soares neto', 22, 'centro', 'Casa', 'Sao Sebastiao do Paraiso', 'MG'), '1980-03-01', '(35) 3678-9012', 'Paciente Ligado', 'M', 'wesley@gmail.com'),
    ('Mateus Ribeiro', '45678901234', ('Av. Zeze Amaral', 9, 'Sao Jose', 'Casa','Sao Sebastiao do Paraiso', 'MG'), '2931-03-01', '(35) 3789-0123', 'Paciente ausente', 'M', 'mateus@gmail.com'),
    ('Leide ribeiro', '56789012345', ('Av. Darcio Cantieri', 1000, 'Jardim Europa', 'casa', 'Sao Sebastiao do Paraiso', 'MG'), '1993-05-25', '(35) 3890-1234', 'Paciente Ligado', 'F', 'leide@gmail.com'),
    ('Lucas Rafael', '67890123456', ('Rua Portugal', 42, 'Jardim Europa', 'apt 125', 'Sao Sebastiao do Paraiso', 'MG'), '1990-05-25', '(35) 3901-2345', 'Paciente Ligado', 'M', 'lucas@gmail.com'),
    ('Augusto Neto', '78901234567', ('Av. Oliveira Rezende', 567, 'Braz', 'casa', 'Sao Sebastiao do Paraiso', 'MG'), '1933-01-20', '(35) 3012-3456', 'Paciente ausente', 'M', 'augusto@gmail.com'),
    ('Fernanda Vitorio', '89012345678', ('Rua Paraiba', 74, 'Vila Helana', 'casa', 'Sao Sebastiao do Paraiso', 'MG'), '2000-05-08', '(35) 3123-4567', 'Paciente Ausente', 'F', 'fernanda@gmail.com'),
    ('Fabio José', '90123456789', ('Rua Jose Mandrini', 221, 'Vila Helena', 'fundos', 'Sao Sebastiao do Paraiso', 'MG'), '1854-01-06', '(35) 3234-5678', 'Paciente Ligado', 'M', 'fabio@gmail.com'),
    ('Jenifer Almeida', '01234567890', ('Rua Amazonas', 123, 'Vila Helena', 'Casa', 'Sao Sebastiao do Paraiso', 'MG'), '1900-04-22', '(35) 3345-6789', 'Paciente Ligado', 'F', 'jenifer@gmail.com'),
    ('Joana Costa', '11223344556', ('Av. Oliveira Rezende', 1053, 'Vila Operaria', 'Edificio', 'Sao Sebastiao do Paraiso', 'MG'), '1920-11-11', '(35) 3233-4455', 'Paciente Ligado', 'M', 'joana@gmail.com'),
    ('William Souza', '22334455667', ('Rua Franca', 100, 'Jardim Europa', 'Casa', 'Sao Sebastiao do Paraiso', 'MG'), '1926-10-14', '(35) 3344-5566', 'Paciente Ligado', 'M', 'william@gmail.com'),
    ('Luiz Carvalho', '33445566778', ('Rua Santa Luzia', 1, 'Jardim Europa', 'Casa', 'Sao Sebastiao do Paraiso', 'MG'), '1791-02-02', '(35) 3455-6677', 'Paciente Ausente', 'F', 'luiz@gmail.com'),
    ('Wagner Alvarenga', '44556677889', ('Rua Italia', 1, 'Jardim Europa', 'Edificio', 'Sao Sebastiao do Paraiso', 'MG'), '2968-09-22', '(35) 3566-7788', 'Paciente Ligado', 'M', 'wagner@gmail.com'),
    ('Priscila Teixeira', '55667788990', ('Rua Dr Antonio Carlos', 727, 'Vila Santa Rosa', 'Casa', 'Sao Sebastiao do Paraiso', 'MG'), '1940-12-01', '(35) 3677-8899', 'Paciente Ausente', 'F', 'priscila@gmail.com');
    


--  Inserir consultas
INSERT INTO consulta (data, idpaciente, iddentista, observacoes, tratamento)
VALUES
    ('2023-08-01 10:00:00', 1, 1, 'Consulta de rotina', '{"descricao": "Limpeza Dentaria", "valor": 100.00, "duracao": "1 hour"}'),
    ('2023-08-02 14:30:00', 2, 2, 'Avaliacao cirúrgica', '{"descricao": "Obturacao", "valor": 150.00, "duracao": "45 minutes"}'),
    ('2023-08-03 11:15:00', 3, 3, 'Tratamento de canal', '{"descricao": "Tratamento de Canal", "valor": 350.00, "duracao": "1.5 hours"}'),
    ('2023-08-04 16:00:00', 4, 4, 'Avaliacao ortodôntica', '{"descricao": "Aparelho Ortodôntico", "valor": 1800.00, "duracao": "1 year"}'),
    ('2023-08-05 09:30:00', 5, 1, 'Extracao de dente', '{"descricao": "Extracao de Dente", "valor": 200.00, "duracao": "30 minutes"}'),
    ('2023-08-06 12:45:00', 6, 2, 'Consulta de rotina', '{"descricao": "Limpeza Dentaria", "valor": 100.00, "duracao": "1 hour"}'),
    ('2023-08-07 15:20:00', 7, 3, 'Avaliacao cirúrgica', '{"descricao": "Obturacao", "valor": 150.00, "duracao": "45 minutes"}'),
    ('2023-08-08 10:30:00', 8, 4, 'Tratamento de canal', '{"descricao": "Tratamento de Canal", "valor": 350.00, "duracao": "1.5 hours"}'),
    ('2023-08-09 13:00:00', 9, 1, 'Avaliacao ortodôntica', '{"descricao": "Aparelho Ortodôntico", "valor": 1800.00, "duracao": "1 year"}'),
    ('2023-08-10 08:15:00', 10, 2, 'Extracao de dente', '{"descricao": "Extracao de Dente", "valor": 200.00, "duracao": "30 minutes"}'),
    ('2023-08-11 11:30:00', 11, 3, 'Consulta de rotina', '{"descricao": "Limpeza Dentaria", "valor": 100.00, "duracao": "1 hour"}'),
    ('2023-08-12 14:45:00', 12, 4, 'Avaliacao cirúrgica', '{"descricao": "Obturacao", "valor": 150.00, "duracao": "45 minutes"}'),
    ('2023-08-13 09:00:00', 13, 3, 'Tratamento de canal', '{"descricao": "Tratamento de Canal", "valor": 350.00, "duracao": "1.5 hours"}'),
    ('2023-08-14 16:30:00', 14, 1, 'Avaliacao ortodôntica', '{"descricao": "Aparelho Ortodôntico", "valor": 1800.00, "duracao": "1 year"}'),
    ('2023-08-15 10:45:00', 15, 2, 'Extracao de dente', '{"descricao": "Extracao de Dente", "valor": 200.00, "duracao": "30 minutes"}'),
    ('2023-08-16 12:00:00', 1, 3, 'Consulta de rotina', '{"descricao": "Limpeza Dentaria", "valor": 100.00, "duracao": "1 hour"}'),
    ('2023-08-17 14:15:00', 2, 2, 'Avaliacao cirúrgica', '{"descricao": "Obturacao", "valor": 150.00, "duracao": "45 minutes"}'),
    ('2023-08-18 11:30:00', 3, 3, 'Tratamento de canal', '{"descricao": "Tratamento de Canal", "valor": 350.00, "duracao": "1.5 hours"}'),
    ('2023-08-19 16:45:00', 4, 4, 'Avaliacao ortodôntica', '{"descricao": "Aparelho Ortodôntico", "valor": 1800.00, "duracao": "1 year"}'),
    ('2023-08-20 09:15:00', 5, 1, 'Extracao de dente', '{"descricao": "Extracao de Dente", "valor": 200.00, "duracao": "30 minutes"}');


-- Inserir faturas
INSERT INTO fatura (data, valor, idconsulta, data_vencimento, forma_pagamento, statuspago)
VALUES
    ('2023-08-01 10:00:00', 100.00, 1, '2023-08-15 10:00:00', 'Débito', TRUE),
    ('2023-08-02 14:30:00', 150.00, 2, '2023-08-16 11:30:00', 'Crédito', TRUE),
    ('2023-08-03 11:15:00', 350.00, 3, '2023-08-17 14:15:00', 'PIX', TRUE),
    ('2023-08-04 16:00:00', 1800.00, 4, '2023-08-18 15:45:00', 'Dinheiro', FALSE),
    ('2023-08-05 09:30:00', 200.00, 5, '2023-08-19 17:30:00', 'Débito', TRUE),
    ('2023-08-06 12:45:00', 100.00, 6, '2023-08-20 10:00:00', 'Crédito', TRUE),
    ('2023-08-07 15:20:00', 150.00, 7, '2023-08-21 11:30:00', 'PIX', TRUE),
    ('2023-08-08 10:30:00', 350.00, 8, '2023-08-22 14:15:00', 'Dinheiro', FALSE),
    ('2023-08-09 13:00:00', 1800.00, 9, '2023-08-23 15:45:00', 'Débito', TRUE),
    ('2023-08-10 08:15:00', 200.00, 10, '2023-08-24 17:30:00', 'Crédito', TRUE),
    ('2023-08-11 11:30:00', 100.00, 11, '2023-08-25 10:00:00', 'PIX', TRUE),
    ('2023-08-12 14:45:00', 1500.00, 12, '2023-08-26 11:30:00', 'Dinheiro', FALSE),
    ('2023-08-13 09:00:00', 350.00, 13, '2023-08-27 14:15:00', 'Débito', TRUE),
    ('2023-08-14 16:30:00', 1800.00, 14, '2023-08-28 15:45:00', 'Crédito', TRUE),
    ('2023-08-15 10:45:00', 200.00, 15, '2023-08-29 17:30:00', 'PIX', TRUE),
    ('2023-08-16 12:00:00', 100.00, 16, '2023-08-30 10:00:00', 'Dinheiro', FALSE),
    ('2023-08-17 14:15:00', 150.00, 17, '2023-09-03 17:30:00', 'Dinheiro', FALSE),
    ('2023-08-18 11:30:00', 350.00, 18, '2023-08-31 11:30:00', 'Débito', TRUE),
    ('2023-08-19 16:45:00', 1800.00, 19, '2023-09-01 14:15:00', 'Crédito', TRUE),
    ('2023-08-20 09:15:00', 200.00, 20, '2023-09-02 15:45:00', 'PIX', TRUE),
    ('2023-08-21 09:15:00', 200.00, 1, '2023-09-03 15:45:00', 'PIX', TRUE),
    ('2023-08-22 09:15:00', 2300.00, 2, '2023-09-04 15:45:00', 'PIX', TRUE);
    

-- Inserir pagamento
INSERT INTO pagamento (idfatura, datapagamento, valor, forma_pagamento)
VALUES
    (1, '2023-09-15 10:00:00', 2500.00, 'Débito'),
    (2, '2023-09-16 11:30:00', 180.00, 'Crédito'),
    (3, '2023-09-17 14:15:00', 300.00, 'PIX'),
    (4, '2023-09-18 15:45:00', 3500.00, 'Dinheiro'),
    (5, '2023-09-19 17:30:00', 4500.00, 'Débito'),
    (6, '2023-09-20 10:00:00', 2500.00, 'Crédito'),
    (7, '2023-09-21 11:30:00', 180.00, 'PIX'),
    (8, '2023-09-22 14:15:00', 300.00, 'Dinheiro'),
    (9, '2023-09-23 15:45:00', 350.00, 'Débito'),
    (10, '2023-09-24 17:30:00', 4500.00, 'Crédito'),
    (11, '2023-09-25 10:00:00', 2500.00, 'PIX'),
    (12, '2023-09-26 11:30:00', 180.00, 'Dinheiro'),
    (13, '2023-09-27 14:15:00', 300.00, 'Débito'),
    (14, '2023-09-28 15:45:00', 4500.00, 'Crédito'),
    (15, '2023-09-29 17:30:00', 2500.00, 'PIX'),
    (16, '2023-09-30 10:00:00', 180.00, 'Dinheiro'),
    (17, '2023-10-01 11:30:00', 300.00, 'Débito'),
    (18, '2023-10-02 14:15:00', 150.00, 'Crédito'),
    (19, '2023-10-03 15:45:00', 350.00, 'PIX'),
    (20, '2023-10-04 17:30:00', 4500.00, 'Dinheiro'),
    (21, '2023-10-03 15:45:00', 150.00, 'PIX'),
    (22, '2023-10-04 17:30:00', 230.00, 'Dinheiro');

select nome from dentista;

SELECT DISTINCT tratamento->>'descricao' AS descricaoTratamento
    FROM consulta;

select nome from paciente;

select observacoes from consulta;

select idfatura from fatura;
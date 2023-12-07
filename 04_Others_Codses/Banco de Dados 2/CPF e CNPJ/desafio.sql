-- ✅ O CPF possui 11 dígitos.
-- ✅ Para calcular o primeiro dígito verificador, você pega os primeiros 9 dígitos do CPF
-- ✅ Multiplica cada dígito da esquerda para a direita por números de 2 a 9 
-- ✅ Some os resultados das multiplicações 
-- ✅ Divida por 11, considerando apenas o quociente inteiro.
-- ✅O primeiro dígito verificador é calculado subtraindo-se o resto da divisão de 11.
-- ✅ Para calcular o segundo dígito verificador, você usa o primeiro dígito calculado e multiplica os 9 primeiros dígitos do CPF da mesma forma que no primeiro passo.
-- ✅Novamente, some os resultados das multiplicações e divida por 11, considerando apenas o quociente inteiro.
-- ✅ O segundo dígito verificador é calculado subtraindo-se o resto da divisão de 11.
-- ✅ O CPF válido é composto pelos 9 primeiros dígitos, seguidos pelos dois dígitos verificadores calculados.




create or replace function verificaCPF (CPF text)
	returns text as $$
    declare
        lista integer[] := ARRAY[10, 9, 8, 7, 6, 5, 4, 3, 2];
        total int := 0;
        verificacao1 text;
        verificacao2 text;
        result int;
        resto int;
        digito int;
begin 
    CPF := REPLACE(CPF, '.', '');
    CPF := REPLACE(CPF, '-', '');
    if  length(CPF) = 11 then
    --111444777 35
        for i in 1..9 loop
           total := total + cast(SUBSTRING(CPF, i, 1)as integer) * lista [i];
        end loop;
        result := total / 11;
        resto := total % 11;
        
            digito = cast(SUBSTRING(CPF, 10, 1)as integer);
            if (resto < 2 and digito = 0) then
                verificacao1 := 'OK';
            elsif (resto >= 2 and digito = (11-resto))then
                verificacao1 := 'OK';
                end if;
    total := 0;
        lista := array_prepend(11, lista);
    --1114447773    5
    for i in 1..10 loop
           total := total + cast(SUBSTRING(CPF, i, 1)as integer) * lista [i];
        end loop;
        result := total / 11;
        resto := total % 11;
        
            digito = cast(SUBSTRING(CPF, 11, 1)as integer);
            if (resto < 2 and digito = 0) then
                verificacao2 := 'OK';
            elsif (resto >= 2 and digito = (11-resto))then
                verificacao2 := 'OK';
            end if;

            if verificacao1 = 'OK' and verificacao2 = 'OK' then 
                return 'CPF OK';
            else 
                return 'CPF INVÁLIDO';
            end if;

    else 
        return 'CARACTERES INVÁLIDO';
    end if;
    end; 
$$ language plpgsql;

select consultaCPF('111.444.777-35');




create or replace function verificaCNPJ (CNPJ text)
	returns text as $$
    declare
        lista integer[] := ARRAY[5,4,3,2,9,8,7,6,5,4,3,2];
        total int := 0;
        verificacao1 text;
        verificacao2 text;
        result int;
        resto int;
        digito int;
begin 
    CNPJ := REPLACE(CNPJ, '.', '');
    CNPJ := REPLACE(CNPJ, '/', '');
    CNPJ := REPLACE(CNPJ, '-', '');
    if  length(CNPJ) = 14 then
    --25.173.733/0001-      59
        for i in 1..12 loop
           total := total + cast(SUBSTRING(CNPJ, i, 1)as integer) * lista [i];
        end loop;
        result := total / 11;
        resto := total % 11;
        
            digito = cast(SUBSTRING(CNPJ, 13, 1)as integer);
            if (resto < 2 and digito = 0) then
                verificacao1 := 'OK';
            elsif (resto >= 2 and digito = (11-resto))then
                verificacao1 := 'OK';
                end if;
    total := 0;
        lista := array_prepend(6, lista);
    --25.173.733/0001-59
    for i in 1..13 loop
           total := total + cast(SUBSTRING(CNPJ, i, 1)as integer) * lista [i];
        end loop;
        result := total / 11;
        resto := total % 11;
        
            digito = cast(SUBSTRING(CNPJ, 14, 1)as integer);
            if (resto < 2 and digito = 0) then
                verificacao2 := 'OK';
            elsif (resto >= 2 and digito = (11-resto))then
                verificacao2 := 'OK';
            end if;

            if verificacao1 = 'OK' and verificacao2 = 'OK' then 
                return 'CNPJ OK';
            else 
                return 'CNPJ INVÁLIDO';
            end if;

    else 
        return 'CARACTERES INVÁLIDO';
    end if;
    end; 
$$ language plpgsql;

select verificaCNPJ('11.222.333/0001-81');

SELECT verificaCNPJ('53.807.019/0001-00') AS resultado
UNION ALL
SELECT verificaCNPJ('31.227.465/0001-03') AS resultado
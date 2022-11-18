def calcula_status (a):
    if a >= 6:
        return 'aprovado'
    elif a < 6 and a >= 4:
        return 'de verificação suplementar'
    else:
        return 'reprovado'


nota = float(input('Digite a nota do aluno: '))

while nota > 10 or nota < 0:
    print('Informe valores de 0 a 10.')
    nota = float(input('Digite a nota do aluno: '))

status = calcula_status(nota)
print(f'O aluno(a) está {status}!')
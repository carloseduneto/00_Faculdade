def fatorial(numero):   
    resultado=1
    for i in range(1,numero+1):
        resultado *= i
    return resultado

def combinacao(b, c, d):
    return b / (c * d)

n = int(input('Informe a quantidade de alunos da turma: '))
m = int(input('Informe a quantidade de alunos do grupo 1: '))

x = n - m

if m >= n:
    input('Valor inválido!')

print(f'Turma: {n}, grupo 1: {m}, grupo 2: {x}')

fat_n = fatorial(n)
fat_m = fatorial(m)
fat_x = fatorial(x)

comb = combinacao(fat_n, fat_m, fat_x)
print(f'Número de combinações possíveis: {comb}')
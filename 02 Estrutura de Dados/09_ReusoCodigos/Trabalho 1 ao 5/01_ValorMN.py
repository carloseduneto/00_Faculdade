# Combinção de números
# O professor deseja dividir uma turma com N alunos
#em dois grupos: um com M alunos e outro com (N-M)
#alunos. Faça o programa que lê o valor de N e M e
#informa o número de combinações possíveis
#– Número de combinações é igual a N!/(M! * (N-M)!)
#– Use funções para evitar repetição de código
def grupos(M, N):
    N=int(input("Valor total da turma: "))
    M=int(input("Valor de um grupo: "))
    outroGrupo=N-M
    variavel=1
    for i in range(1, N):
        variavel=variavel*N
    print(variavel)

    variavel2=1
    for j in range(1, M):
        variavel2=variavel2*M
    print(variavel2)

grupos(1,4)
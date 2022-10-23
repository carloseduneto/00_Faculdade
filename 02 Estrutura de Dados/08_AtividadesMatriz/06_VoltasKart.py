'''6. Uma pista de Kart permite 10 voltas para cada um de 6 
corredores. Faça um programa que leia os nomes e os 
tempos (em segundos) de cada volta de cada corredor e 
guarde as informações em uma matriz. Ao final, o programa 
deve informar: 
a. De quem foi a melhor volta da prova, e em que volta
b. Classificação final em ordem (1º o campeão)
c. Qual foi a volta com a média mais rápida'''
from random import randint

#'Jéssica','Alexandre','Bianca','Johnathan', 'Heloísa', 'Maria'
nomesETemposDeCadaCorredor = []
voltas = 10
corredores = 6

# Adiciona os corredores na matriz
for i in range(1):
    nomesETemposDeCadaCorredor.append([])

    for j in range(corredores):
        nomeDoCorredor=input(f"Insira o nome do {j+1}º corredor: ")
        nomesETemposDeCadaCorredor[i].append(nomeDoCorredor)
        print(nomesETemposDeCadaCorredor)
print(nomesETemposDeCadaCorredor)

# Adiciona as voltas na matriz
# for i in range(voltas):
#     for i in range(corredores):
#         for j in range(1):
#             voltaCorredor = int(randint(1, 10))
#             nomesETemposDeCadaCorredor[i].append(voltaCorredor)
# print(nomesETemposDeCadaCorredor)

# for i in range(0, corredores, +1):
#     for j in range(1, voltas, +1):
#             print(f"{i}, {j}")
#             print(nomesETemposDeCadaCorredor[i][j])

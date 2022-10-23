#🕒Tempo:3h51min
'''6. Uma pista de Kart permite 10 voltas para cada um de 6 
corredores. Faça um programa que leia os nomes e os 
tempos (em segundos) de cada volta de cada corredor e 
guarde as informações em uma matriz. Ao final, o programa 
deve informar: 
a. De quem foi a melhor volta da prova, e em que volta ✔️
b. Classificação final em ordem (1º o campeão)✔️
c. Qual foi a volta com a média mais rápida✔️'''

from random import randint

#'Jéssica','Alexandre','Bianca','Johnathan', 'Heloísa', 'Maria'
nomesETempos = [['Jéssica','Alexandre','Bianca','Johnathan', 'Heloísa', 'Maria']]
voltas = 6
corredores = 6


#  Adiciona os corredores na matriz
# for i in range(1):
#     nomesETempos.append([])

#     for j in range(corredores):
#         nomeDoCorredor=input(f"Insira o nome do {j+1}º corredor: ")
#         nomesETempos[i].append(nomeDoCorredor)
#         print(nomesETempos)
# print(nomesETempos)

voltas+=1
# Adiciona as voltas na matriz
for i in range(1,voltas,+1):
    nomesETempos.append([])
    for j in range(0,corredores, +1):
        # print(f"volta:{i+1}, corredor: {j+1}")
        voltaCorredor = int(randint(1, 1000))
        nomesETempos[i].append(voltaCorredor)  # type: ignore


voltaMaisCurta=nomesETempos[1][0]    
indiceNome=0
indiceVolta=0
print("*"*15)
for i in range(1, voltas, +1):
    for j in range(corredores):
        # print(f"\033[1m{i}, {j}\033[0m")
        # print(nomesETempos[i][j],"\n")
        if nomesETempos[i][j]<voltaMaisCurta:
            voltaMaisCurta=nomesETempos[i][j]
            indiceNome=j
            indiceVolta=i
# print(voltaMaisCurta, indiceNome)
print(f"{nomesETempos[0][indiceNome]} fez {nomesETempos[indiceVolta][indiceNome]} segundos na {indiceVolta}ª volta")

#Somar cada volta
listaVoltas=[0]*corredores
for i in range(1, voltas, +1):
    for j in range(corredores):
        if j==0:
            listaVoltas[j]= listaVoltas[j]+nomesETempos[i][j]
        if j==1:
            listaVoltas[j]= listaVoltas[j]+nomesETempos[i][j]
        if j==2:
            listaVoltas[j]= listaVoltas[j]+nomesETempos[i][j]
        if j==3:
            listaVoltas[j]= listaVoltas[j]+nomesETempos[i][j]
        if j==4:
            listaVoltas[j]= listaVoltas[j]+nomesETempos[i][j]
        if j==5:
            listaVoltas[j]= listaVoltas[j]+nomesETempos[i][j]

            

#Associar tempos à corredores
listaNomes=[]
for i in range(corredores):
    listaNomes.append([])
    for j in range(1):
        listaNomes[i].append(listaVoltas[i])
        listaNomes[i].append(nomesETempos[0][i])

#Decidir a posição
print("*"*15)
listaNomes.sort()
for i in range(corredores):
    if (i==0):
        print(f"\033[1m{i+1}º lugar: {listaNomes[i][1]} CAMPEÃO!!!\033[0m  ")
    else:
        print(f"{i+1}º lugar: {listaNomes[i][1]}  ")

#A volta com a média mais rápida
print("*"*15)
tempoVoltas=[]
menorVolta=[0]
for i in range(1,voltas, +1):
    tempoVoltas.append((sum(nomesETempos[i]))/voltas-1)  # type: ignore

voltas-=1
menorVolta=tempoVoltas[0]  
indiceMenor=0
for i in range(voltas):
    if tempoVoltas[i]<menorVolta:
        menorVolta=tempoVoltas[i]
        indiceMenor=i
print(f"A {indiceMenor+1}ª volta foi a mais rápida")
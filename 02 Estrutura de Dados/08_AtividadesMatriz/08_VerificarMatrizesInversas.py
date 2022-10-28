#🕒Tempo:0h34min
"""8. Faça um programa que leia duas matrizes A e B e verifica 
se B é a inversa de A (ou seja, se a multiplicação de A por 
B é a matriz identidade). """
from random import randint

matrizA=[]
matrizB=[]
matrizIdentidade=[]
# tamanho=int(input("Qual o tamnho das matrizes? "))
tamanho=8
#Matriz A
for i in range(tamanho):
    matrizA.append([])
    for j in range(tamanho):
        valor=randint(1, 2)
        matrizA[i].append(valor)

#Matriz B
for i in range(tamanho):
    matrizB.append([])
    for j in range(tamanho):
        valor=randint(1, 10)
        matrizB[i].append(valor)

#Matriz Identidade
for i in range(tamanho):
    matrizIdentidade.append([])
    for j in range(tamanho):
        valor=matrizA[i][j]*matrizB[i][j]
        matrizIdentidade[i].append(valor)

condicao=0
for i in range(tamanho):
    for j in range(tamanho):
        if (i==j):
            if (matrizA[i][j]*matrizB[i][j]==matrizA[i][j] or matrizA[i][j]*matrizB[i][j]==matrizB[i][j]):
                condicao+=1

for i in matrizA:
    print(i)

print("\n")    
for i in matrizB:
    print(i)

if condicao==tamanho:
    print("A matriz B é a inversa de matriz A")

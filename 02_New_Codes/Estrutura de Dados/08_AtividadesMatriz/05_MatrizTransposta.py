'''5. Faça um programa que leia a ordem de uma matriz quadrada 
A (até 100), posteriormente leia seus valores e escreva sua 
transposta AT, onde AT[i][j] = A[j][i] '''
from random import randint

matrizA=[]
matrizTransposta=[]
tamanho=5

for i in range (tamanho):
    matrizA.append([])
    for j in range (tamanho):
        valor=randint(0, 100)
        matrizA[i].append(valor)

for i in range (tamanho):
    matrizTransposta.append([])
    for j in range (tamanho):
        valor=matrizA[j][i]
        matrizTransposta[i].append(valor)

for i in matrizA:
    print(i)

print("\n")
for i in matrizTransposta:
    print(i)

print(matrizA)
print(matrizTransposta)
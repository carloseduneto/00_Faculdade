'''2. Faça um programa que leia duas matrizes A e B 2x2 e imprima a matriz C que é a soma das matrizes A e B.'''
from random import randint

matirzA=[]
matrizB=[]
matrizC=[]
dimensoes=2

for i in range(dimensoes):
    matirzA.append([])
    for a in range(dimensoes):
            valor=(randint(0,999))
            matirzA[i].append(valor)

for i in range(dimensoes):
    matrizB.append([])
    for b in range(dimensoes):
            valor=(randint(0,999))
            matrizB[i].append(valor)

for i in (matirzA):
    print(i)      

print("\n")
for i in (matrizB):
    print(i)    

for i in range(dimensoes):
     matrizC.append([])
     for c in range(dimensoes):
          valor=matirzA[i][c]+matrizB[i][c]
          matrizC[i].append(valor)

print("\n")
for i in matrizC:
     print(i)          
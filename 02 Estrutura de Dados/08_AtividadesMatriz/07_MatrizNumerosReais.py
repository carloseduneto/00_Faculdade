#🕒Tempo:0h19min
"""7. Faça um programa que leia uma matriz 6x3 com 
números reais, calcule e mostre: 
(a) o maior elemento da matriz e sua respectiva posição (linha e coluna);
(b) o menor elemento da matriz e sua respectiva posição. 
"""
from random import randint

matriz=[]
tamanhoX=6
tamanhoY=3
for i in range(tamanhoX):
    matriz.append([])
    for j in range(tamanhoY):
        valor=randint(-100,100)
        matriz[i].append(valor)

for i in range (tamanhoX):
    print(" ")
    for j in range(tamanhoY):
        print(matriz[i][j], end="\t")

maiorElemento=matriz[0][0]
posicaoX=0
posicaoY=0
for i in range(tamanhoX):
    for j in range(tamanhoY):
        if (matriz[i][j]>maiorElemento):
            maiorElemento=matriz[i][j]
            posicaoX=i
            posicaoY=j
print(f"\nO maior elemeto é \033[1m{maiorElemento}\033[0m e está na posição \033[1m{posicaoX},{posicaoY}\033[0m na matriz")

menorElemento=matriz[0][0]
posicaoX=0
posicaoY=0
for i in range(tamanhoX):
    for j in range(tamanhoY):
        if (matriz[i][j]<menorElemento):
            menorElemento=matriz[i][j]
            posicaoX=i
            posicaoY=j
print(f"O menor elemento é \033[1m{menorElemento}\033[0m e está na posição \033[1m{posicaoX},{posicaoY}\033[0m na matriz ")
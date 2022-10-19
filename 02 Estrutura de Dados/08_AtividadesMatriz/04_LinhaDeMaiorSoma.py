"""4. Faça um programa que leia uma matriz 3x3 de inteiros e 
retorne a linha de maior soma. Imprima na tela a matriz, a 
linha de maior soma e a soma."""
from random import randint

dimensao=3
matriz=[]

for i in range (dimensao):
    matriz.append([])
    for j in range(dimensao):
        valor=randint(0, 100)
        matriz[i].append(valor)

for linha in matriz:
    print(linha)

linha1, linha2, linha3 = 0, 0, 0    
for linha in range (dimensao):
    for coluna in range(dimensao):
        if (linha==0):
            linha1=linha1+matriz[linha][coluna]
        if (linha==1):
            linha2=linha2+matriz[linha][coluna]
        if (linha==2):
            linha3=linha3+matriz[linha][coluna]

if (linha1>linha2 and linha1> linha3):
    print(f"A linha de maior some é a \033[1mprimeira\033[0m linha com total: {linha1}")
elif (linha2>linha3):
    print(f"A linha de maior soma é a \033[1msegunda\033[0m linha com total: {linha2} ")
else:
    print(f"A linha de maior soma é a \033[1mterceira\033[0m linha com total: {linha3} ")
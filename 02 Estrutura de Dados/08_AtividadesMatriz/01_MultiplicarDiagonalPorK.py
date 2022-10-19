'''1. Faça um programa que leia uma matriz 3x3 e multiplique
os elementos da diagonal principal da matriz por um
número k. Imprima a matriz na tela antes e depois da
multiplicação.'''


NumeroDimensao=3
matriz=[]
k=int(input("Defina o valor de K:"))
for i in range(NumeroDimensao):
    matriz.append([])
    print(matriz)
    for j in range(NumeroDimensao):
        NumeroAuxiliar=input(f"Insira o valor da linha {i} e coluna{j}: ")
        NumeroAuxiliar = abs(int(NumeroAuxiliar)) #O abs pega apenas o módulo de um número
        matriz[i].append( NumeroAuxiliar)
    print(" ")
    
print("Antes de mulplicar:")
for i in range(len(matriz)):
    print(matriz[i])


print("+"*10)
print(f"Multiplicando as diagonais por {k}:")
for i in range (len(matriz)):
    for c in range(len(matriz)):
        if (i==c or i+c==2):
            matriz[i][c]=matriz[i][c]*k

for i in range(len(matriz)):
    print(matriz[i])
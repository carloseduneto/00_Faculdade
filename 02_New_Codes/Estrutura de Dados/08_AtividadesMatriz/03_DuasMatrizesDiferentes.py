'''3. Faça um programa que leia as dimensões de duas 
matrizes A e B, e depois leia as duas matrizes. Se as 
matrizes forem de tamanhos compatíveis para 
multiplicação, multiplique as matrizes. Imprima as 
matrizes A, B e a matriz resultante da multiplicação. '''
from random import randint

matrizA=[]
matrizB=[]
matrizMultiplicada=[]

tamanhoMatrizA=int(input("Qual o tamanho da matriz A? "))
tamanhoMatrizB=int(input("Qual o tamanho da matriz B? "))

for i in range(tamanhoMatrizA):
    matrizA.append([])
    for a in range(tamanhoMatrizA):
        valor=(randint(0,9))
        matrizA[i].append(valor)

for i in range(tamanhoMatrizB):
    matrizB.append([])
    for b in range(tamanhoMatrizB):
        valor=(randint(0,9))
        matrizB[i].append(valor)

if tamanhoMatrizA==tamanhoMatrizB:
    for i in range(tamanhoMatrizA):
        matrizMultiplicada.append([])
        for multiplicada in range (tamanhoMatrizB):
            matrizMultiplicada[i].append(matrizA[i][multiplicada]*matrizB[i][multiplicada])
    
    print("Matriz A")
    for a in (matrizA):
        print(a, end="\n")
    
    print("-"*15)
    print("Matriz B")
    for b in (matrizB):
        print(b)

    print("-"*15)       
    print("Matriz multiplicada entre A e B")     
    for multiplicada in (matrizMultiplicada):
        print(multiplicada)

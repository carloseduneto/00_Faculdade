#Leia um vetor de 10 posições e ordene o vetor, usando 3 algoritmos diferentes (crie um programa para cada algoritmo)
# a. Insertion Sort
#b. Selection Sort
#c. Bubble Sort
#– Revisite a aula 3, de Introdução à Programação, para relembrar os algoritmos
#– Em cada alternativa, conte o número de comparações realizadas, e imprima o número de comparações junto com o vetor ordenado
#– Observe qual dos algoritmos executou a ordenação com o menor número de comparações
import random
import time
def insertionSort(vetor): #aumenta virtualmente colocando na posição correta
    contador = 1 
    while contador < len (vetor):
        temporario = vetor[contador]
        trocou = False
        anteriorI = contador - 1 #em oposição à I
        while anteriorI >=0 and vetor[anteriorI] > temporario:
            vetor[anteriorI + 1] = vetor[anteriorI]
            trocou=True
            anteriorI -= 1

        if trocou:
            vetor[anteriorI+1] = temporario

        contador+=1

def OrdenacaoPorSelecao(Valor):
    for i in range(len(Valor)-1):
        IndiceMinimo = i
        for j in range(i+1, len(Valor)-1):
            if Valor[j] < Valor[IndiceMinimo]:
                IndiceMinimo = j
        Valor[i], Valor[IndiceMinimo] = Valor[IndiceMinimo], Valor[i]

def OrdenacaoBolha(Valor):
    n = len(Valor)
    Troca = False
    for i in range(n-1):
        for j in range(0, n-i-1):
            if Valor[j] > Valor[j + 1]:
                Troca = True
            Valor[j],Valor[j + 1] = Valor[j + 1], Valor[j]
         
        if not Troca:
            return


import string

#Ordenação por Inserção
vetor=list(range(0,9))
random.shuffle(vetor)

antes= time.time()
print(vetor)
insertionSort(vetor)
depois=time.time()
diferencaInsercao= (depois-antes)*1000

print(vetor)

print("O tempo total no Ordenação por Inserção (Insertion Sort) foi: %0.20f ms" %diferencaInsercao)


#Ordenação por Seleção
vetorSelecao=list(range(0,9))
random.shuffle(vetorSelecao)

antesSelecao= time.time()
print(vetorSelecao)
OrdenacaoPorSelecao(vetorSelecao)
depoisSelecao=time.time()
diferencaSelecao= (depoisSelecao-antesSelecao)*1000
print(vetorSelecao)
print("O tempo total no Ordenação por Seleção (Seletion Sort) foi: %0.20f ms" %diferencaSelecao)


#Ordenação por Bolha
vetorBolha=list(range(0,9))
random.shuffle(vetorBolha)

antesBolha= time.time()
print(vetorBolha)
OrdenacaoBolha(vetorBolha)
depoisBolha=time.time()
diferencaBolha= (depoisBolha-antesBolha)*1000
print(vetorBolha)
print("O tempo total no Ordenação por Bolha (Bubble Sort) foi: %0.20f ms" %diferencaBolha)

if diferencaSelecao> diferencaInsercao and diferencaSelecao>diferencaBolha:
    print("A Ordenação por Seleção é mais rápida!" )
elif diferencaBolha>diferencaInsercao:
    print("A Ordenação por Bolha é mais rápida!" )
else:
    print("A Ordenação por Inserção é mais rápida!" )
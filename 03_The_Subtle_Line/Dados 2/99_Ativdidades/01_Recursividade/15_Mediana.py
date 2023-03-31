import math


def encontrarMediana(lista):
    lista = (ordenacaoSelecao(lista))
    tamanhoLista = len(lista)
    if (tamanhoLista == 0):
        return None
    elif (tamanhoLista % 2 == 0):
        soma = lista[int((tamanhoLista/2)-1)]+lista[int((tamanhoLista/2))]
        total = soma/2
        return total
    elif (tamanhoLista % 2 == 1):
        meio = math.floor(tamanhoLista/2)
        meio = int(meio)
        total = lista[meio]/2
        return total


def ordenacaoSelecao(lista):
    for i in range(len(lista)):
        indiceMenor = i
        for j in range(i+1, len(lista)):
            if lista[j] < lista[indiceMenor]:
                indiceMenor = j
        lista[i], lista[indiceMenor] = lista[indiceMenor], lista[i]
    return lista


def insertion_sort(lista):
    for i in range(1, len(lista)):
        chave = lista[i]
        j = i - 1

        while j >= 0 and chave < lista[j]:
            lista[j+1] = lista[j]
            j -= 1

        lista[j+1] = chave


lista = [1, 2, 4, 5, 3]
print(encontrarMediana(lista))

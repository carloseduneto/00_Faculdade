def intercala(lista, inicio, meio, fim):
    i = inicio
    j = meio +1

    auxiliar = []

    while i <= meio and j <= fim:
        if lista[i] < lista[j]:
            auxiliar.append(lista[i])
            i += 1
        else:
            auxiliar.append(lista[j])
            j += 1

        while i <=meio:
            auxiliar.append(lista[i])
            i += 1
            

        while j <=fim:
            auxiliar.append(lista[j])
            j += 1

        # print("-----------")


        return (auxiliar)


print("Início\t|fim\t|fim-1\t|meio")


def mergeSort(inicio, fim, lista):

    # if inicio < fim-1:
    #     meio = (inicio+fim)//2
    #     print(f"{inicio}\t|{fim}\t|{fim-1}\t|{meio}", end="\t")
    #     print(lista[inicio:fim])
    #     mergeSort(inicio, meio, lista)
    #     mergeSort(meio, fim, lista)
    #     intercala(lista, inicio, meio, fim)

    if inicio != fim: 
        meio = (inicio+fim)//2
        mergeSort(inicio, fim, lista)
        mergeSort(meio + 1, fim, lista)
        intercala(lista, inicio, meio, fim)


lista = [1, 3, 44, 22, 29, 13, 2000, 3432, 98, 12]
# mergeSort(0, 10, lista)
# lista ordenada = [1, 3, 13, 22, 29, 44, 2000, 3432 ]
# print(intercala(lista, 0, 4, 8))
mergeSort(0, 9, lista)

# intercala(lista)

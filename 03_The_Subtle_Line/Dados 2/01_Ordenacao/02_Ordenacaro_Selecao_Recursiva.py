lista = [6, 5, 4, 9, 1, 2, 10, 12, 3]
valorMenor = lista[0]
posicaoMenor = ""
contador2 = 0

def OrdenacaoRecursivaCrescente(lista, tamanho=0):
    global valorMenor
    global posicaoMenor
    global contador
    if tamanho == len(lista):
        return print("fim")
    else:
        print(lista[tamanho])
        if (lista[tamanho] < valorMenor):
            valorMenor = lista[tamanho]
            posicaoMenor = tamanho
            print(valorMenor, " está na posição: ", posicaoMenor)
            posicaoFrontal = contador2
            valorFrontal = lista[contador2]
            print(valorFrontal, " está na posição ", posicaoFrontal)
        return OrdenacaoRecursivaCrescente(lista, tamanho=tamanho + 1)


def FuncaoDupla(lista, contador=0):
    global contador2
    if (contador == len(lista)):
        return print("Fim", lista)
    else:
        OrdenacaoRecursivaCrescente(lista, contador)
        contador2 = contador2 + 1
        return FuncaoDupla(lista, contador=contador + 1)



FuncaoDupla(lista)


def OrdenacaoRecursivaDecrescente(lista, tamanho):
    if tamanho == 0:
        return print(lista[0])
    else:
        print(lista[tamanho])
        # print("tamanho", tamanho)
        return OrdenacaoRecursivaDecrescente(lista, tamanho-1)

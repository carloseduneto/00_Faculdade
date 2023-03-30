oMaiorValor = 1000000000000000000000000000000000000000000


def acharOMenorValorDeUmaLista(lista):
    global contador, oMaiorValor
    if (len(lista) == 0):
        return oMaiorValor
    else:
        if lista[-1] < oMaiorValor:
            oMaiorValor = lista[-1]
        # contador = contador - 1
        lista.pop(-1)
        return acharOMenorValorDeUmaLista(lista)


lista = [1, 3, 6, 77, 6, 333, 22, 1, 33, 55, 66, 1]
print(f"O menor valor da lista é {acharOMenorValorDeUmaLista(lista)}")

oMaiorValor = 0


def achaOMaiorValorDeUmaLista(lista):
    global contador, oMaiorValor
    if (len(lista) == 0):
        return oMaiorValor
    else:
        if lista[0] > oMaiorValor:
            oMaiorValor = lista[0]
        # contador = contador - 1
        lista.pop(0)
        return achaOMaiorValorDeUmaLista(lista)


lista = [1, 3, 6, 77, 6, 333, 22, 1, 33, 55, 66, 1]
print(f"O maior valor da lista é {achaOMaiorValorDeUmaLista(lista)}")

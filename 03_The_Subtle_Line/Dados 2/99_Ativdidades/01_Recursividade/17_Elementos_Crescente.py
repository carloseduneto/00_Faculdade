def maiorSubcrescente(lista):
    subcrescente = []
    for elemento in lista:
        if not subcrescente or elemento >= subcrescente[-1]:
            subcrescente.append(elemento)
        else:
            subcrescente = [elemento]
    return subcrescente


lista = [2, 9, 12, 24, 11, 99, 88, 15, 2, 3, 5, 6]
print(maiorSubcrescente(lista))

def maiorK(lista, k):
    pivo = lista[0]
    maior = [numero for numero in lista[1:] if numero > pivo]
    menorOuIgual = [numero for numero in lista[1:] if numero <= pivo]
    if len(maior) == k - 1:
        return pivo
    elif len(maior) >= k:
        return maiorK(maior, k)
    else:
        return maiorK(menorOuIgual, k - len(maior) - 1)


lista=[2,66,5,3,211,3,445,6,5,4,4,3,2]
k = 66
print(maiorK(lista, k))
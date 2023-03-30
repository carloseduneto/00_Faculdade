def listaMaximadeSoma(lista):
    if len(lista) == 1:
        return lista[0]
    else:
        meio = len(lista) // 2
        somaEsquerda = listaMaximadeSoma(lista[:meio])
        somaDireita = listaMaximadeSoma(lista[meio:])
        somaCruzada = somaCruzadaMaxima(lista)
        return max(somaEsquerda, somaDireita, somaCruzada)


def somaCruzadaMaxima(lista):
    meio = len(lista) // 2
    somaTemporaria = 0
    for i in range(meio-1, -1, -1):
        somaTemporaria += lista[i]
        somaEsquerda = max(somaEsquerda, somaTemporaria)
    somaTemporaria = 0
    for i in range(meio, len(lista)):
        somaTemporaria += lista[i]
        somaDireita = max(somaDireita, somaTemporaria)
    return somaEsquerda + somaDireita


lista = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
result = listaMaximadeSoma(lista)
print(result)
# Output: 6

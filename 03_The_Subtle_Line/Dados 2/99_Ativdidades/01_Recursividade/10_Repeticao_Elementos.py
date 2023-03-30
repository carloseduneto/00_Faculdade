contador, quantidadeRepeticoes = -1, 0


def contaElementosRepetidos(lista, elemento):
    global contador, quantidadeRepeticoes
    if contador == -(len(lista))-1:
        return quantidadeRepeticoes
    else:
        if lista[contador] == elemento:
            quantidadeRepeticoes = quantidadeRepeticoes+1
        contador -= 1
        return contaElementosRepetidos(lista, elemento)


lista = ["a", "w", "k", "a", "q", "w", "a", 1, 4, 5, 7, 8, 9, 2, 22, 0]
elemento = "w"
print(f"O elemento '{elemento}', repete {contaElementosRepetidos(lista, elemento)} vezes.")
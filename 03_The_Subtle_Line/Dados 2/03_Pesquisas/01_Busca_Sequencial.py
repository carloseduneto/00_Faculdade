lista = ["A", "K", "S", "Q", "L"]


def sequencial(vetor, chave):
    print(vetor)
    for i in range(len(vetor)):
        if chave == vetor[i]:
            return i
    return -1


print(sequencial(lista, "Q"))

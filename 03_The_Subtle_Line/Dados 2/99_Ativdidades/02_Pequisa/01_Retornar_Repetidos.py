'''
Refaça as funções de busca sequencial e busca binária assumindo que a lista possui chaves que podem ocorrer múltiplas
vezes na lista. Neste caso, você deve retornar uma lista com todas as posições onde a chave foi encontrada. Se a chave
não for encontrada na lista, retornar uma lista vazia.
'''
def buscaSequencialRepetidos (lista, chave):
    # print(lista)
    novaLista = []
    for i in range(len(lista)):
        if chave == lista[i]:
            novaLista.append(i)
    if len(novaLista)> 0:
        return novaLista
    else:
        return -1

nomes = ["Jorge", "Carlos", "Felipe", "João Vinícius",
         "Murilo", "Brunin", "☕", "🙄", "🔗", "👁️","👁️","👁️"]

print(buscaSequencialRepetidos(nomes, "👁️"))


def buscaBinaria2(lista, esquerda, direita, chave):
    if esquerda > direita:
        return -1  # * Elemento fora da lista
    else:
        meio = (esquerda+direita)//2
        if lista[meio].upper() == chave.upper():
            return meio
        elif chave.upper() > lista[meio].upper():
            return (buscaBinaria2(lista, meio + 1, direita, chave))
        else:
            return (buscaBinaria2(lista, esquerda, meio-1, chave))


def buscaBinaria(lista, chave):
    return buscaBinaria2(lista, 0, len(lista)-1, chave)


index = buscaBinaria(nomes, "🙄")
print(index)

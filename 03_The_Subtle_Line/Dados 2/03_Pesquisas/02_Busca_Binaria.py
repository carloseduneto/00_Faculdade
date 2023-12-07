nomes = ["Jorge", "Carlos", "Felipe", "João Vinícius",
         "Murilo", "Brunin", "☕", "🙄", "🔗"]
nomes.sort()
# print(nomes)

#O tamanho da tabela é divida ao meio

# TODO esquerda e direita pode ser inicio e fim
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

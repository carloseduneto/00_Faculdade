def ordenacaoInsercao(lista):
    contador = 0
    n = len(lista)
    # Percorre a lista a partir do segundo elemento
    for i in range(1, n):
        chave = lista[i]
        # Move os elementos maiores que a chave uma posição para a direita
        j = i - 1
        while j >= 0 and lista[j] > chave:
            contador += 1
            lista[j+1] = lista[j]
            j -= 1
        # Insere a chave na posição correta
        lista[j+1] = chave
        print(f"Contei {contador} vezes")
    return lista


def merge_sort(lista):
    if len(lista) <= 1:
        return lista

    meio = len(lista) // 2
    esquerda = lista[:meio]
    direita = lista[meio:]

    esquerda = merge_sort(esquerda)
    direita = merge_sort(direita)

    return merge(esquerda, direita)


def merge(esquerda, direita):
    lista = []

    while len(esquerda) > 0 and len(direita) > 0:
        if esquerda[0] < direita[0]:
            lista.append(esquerda[0])
            esquerda = esquerda[1:]
        else:
            lista.append(direita[0])
            direita = direita[1:]

    lista += esquerda
    lista += direita

    return lista

lista = [5, 2, 8, 4, 6, 1]
print(ordenacaoInsercao(list))

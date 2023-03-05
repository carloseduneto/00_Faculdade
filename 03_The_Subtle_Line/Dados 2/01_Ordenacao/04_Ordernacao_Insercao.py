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


lista = [5, 2, 8, 4, 6, 1]
print(ordenacaoInsercao(list))

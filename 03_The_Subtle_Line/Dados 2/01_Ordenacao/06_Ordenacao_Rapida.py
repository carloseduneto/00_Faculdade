def quicksort(lista):
    if len(lista) <= 1:  # Caso base: se da lista tiver tamanho 0 ou 1, ele já está ordenado
        return lista
    else:
        # Escolha um elemento como pivô. Neste caso, usamos o último elemento a lista.
        pivot = lista[-1]

        # Separe o lista em duas partes: elementos menores que o pivô e elementos maiores que o pivô.
        menores = []
        maiores = []
        # Percorra todos os elementos a lista, exceto o pivô.
        for elemento in lista[:-1]:
            if elemento <= pivot:
                # Adicione o elemento à lista de menores.
                menores.append(elemento)
            else:
                # Adicione o elemento à lista de maiores.
                maiores.append(elemento)

        print(lista)
        print(f"maiores: {maiores}")
        print(f"menores: {menores}")

        # Recursivamente, aplique o Quicksort em cada uma das metades.
        menores_ordenados = quicksort(menores)
        maiores_ordenados = quicksort(maiores)
        print(f"maiores_ordenados: {maiores_ordenados}")
        print(f"menores_ordenados: {menores_ordenados}")


        # Combine as duas listas ordenadas com o pivô no meio.
        return menores_ordenados + [pivot] + maiores_ordenados


lista = ["a", "jk",   "lk"]

print(quicksort(lista))

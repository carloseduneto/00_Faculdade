def OrdenacaoBolha(lista):
    contador = 0
    n = len(lista)
    # Percorre a lista n vezes
    for i in range(n):
        # A cada passo, compara pares adjacentes e os troca se estiverem fora de ordem
        for j in range(0, n-i-1):
            if lista[j] > lista[j+1]:
                contador += 1
                lista[j], lista[j+1] = lista[j+1], lista[j]
    print("Contador Bolha",contador)
    return lista


lista = [5, 2, 8, 4, 6, 1]
print(OrdenacaoBolha(lista))

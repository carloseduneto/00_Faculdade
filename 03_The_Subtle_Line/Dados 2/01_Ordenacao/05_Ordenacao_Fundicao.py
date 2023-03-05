def intercala(lista, inicio, meio, fim):
    i = inicio
    j = meio
    auxiliar = []

    while i < meio and j < fim:
        if lista[i]  < lista[j]:
            auxiliar.append(lista[i])
            i +=1
        else:
            auxiliar.append(lista[j])
            j+=1

        while i<meio:
            auxiliar.append(lista[i])
            i += 1

        while j <fim:
            auxiliar.append(lista[j])
            j += 1

        return(auxiliar)


lista = [1, 3,44, 22, 29, 13, 2000, 3432]
print(intercala (lista, 0, 4, 8))

# lista ordenada = [1, 3, 13, 22, 29, 44, 2000, 3432 ]
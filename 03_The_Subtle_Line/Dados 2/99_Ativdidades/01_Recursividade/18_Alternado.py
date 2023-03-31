def sequenciaAlternada(lista):
    sequenciaCrescente = [lista[0]]
    sequencaiDecrescente = [lista[0]]
    maiorSequencia = [lista[0]]

    for i in range(1, len(lista)):
        if lista[i] > sequenciaCrescente[-1]:
            sequenciaCrescente.append(lista[i])
            sequencaiDecrescente = [lista[i]]
        elif lista[i] < sequencaiDecrescente[-1]:
            sequencaiDecrescente.append(lista[i])
            sequenciaCrescente = [lista[i]]
        if len(sequenciaCrescente) > len(maiorSequencia):
            maiorSequencia = sequenciaCrescente
        elif len(sequencaiDecrescente) > len(maiorSequencia):
            maiorSequencia = sequencaiDecrescente

    return maiorSequencia


lista = [1, 6, 3, 22, 54, 33, 12, 112, 23]
print(sequenciaAlternada(lista))

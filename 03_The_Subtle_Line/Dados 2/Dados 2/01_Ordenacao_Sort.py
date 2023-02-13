lista=[7, 4, 5, 9, 8, 2, 1]

temporario=0

for i in range(len(lista)):
    valorMenor=i
    lista[i]= lista[valorMenor]
    for j in range (i+1, len(lista)):
        if lista[j] < lista[valorMenor]:
            temporario = lista[valorMenor]
            lista[valorMenor] = lista[j]
            lista[j]=temporario

        """
            a = lista[indiceMenor]
            b = lista[j]

            temporario = b
            b = lista[j]
            a = temporario
        """

print(lista)
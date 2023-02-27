lista=list(range(10, 0,-1))
print(lista)
contador=0

for i in range(len(lista)):
    indiceMenor=i
    lista[i]= lista[indiceMenor]
    for j in range (i, len(lista)):
        if lista[j] < lista[indiceMenor]:
            contador= contador+1
            # a=lista[indiceMenor]
            # b = lista[j]
            # temporario=0

            # temporario = a
            # a = b
            # b = temporario

            temporario = lista[indiceMenor]
            lista[indiceMenor] = lista[j]
            lista[j]=temporario

        """
            a = lista[indiceMenor]

            temporario = b
            b = lista[j]
            a = temporario
        """

print(lista)
print(f"Contei {contador} vezes")
lista=[1,2, 4, 8, 9, 4]
posicao=2
e=10
listaAuxiliar=[]

for i in range (len(lista)):
    if i == posicao:
        listaAuxiliar.append(lista)
    listaAuxiliar.append(lista[i])
    lista==listaAuxiliar
print(listaAuxiliar)
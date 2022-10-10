lista=[1,2,3,4,5,6,7]
posicao=3
listaTemporaria=[]
for i in range (len(lista)):
    if i !=posicao:
        listaTemporaria.append(lista[i])
lista=listaTemporaria
print(lista)

lista=[1,2,3,4,5]
del lista[2] #remove elementos em certa posição
print(lista)

lista= [1,3,4,5,6,7]
e = lista.pop(2)
print(e)
print(lista)

lista = [1,2,3,4,5,6]
e = 4
if e in lista:
    lista.remove(e)
print(lista)

lista = [1,2,3,4,5,6]
e = 4
while e in lista:
    lista.remove(e)
print(lista)
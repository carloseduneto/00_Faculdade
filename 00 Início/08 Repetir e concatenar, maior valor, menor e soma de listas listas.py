print('ab'*5) #repete alguma coisa #
print('lobo'*6)
c= [-45, 6, 0, 72, 154]
print(c*2) #repete listas
print(2*c  ) #repete do mesmo jeito
listax=[0]*10 #repete os itens da lista
print(listax)

#concatenar é união de elementos
lista = [1, 2] + [3, 6, 9]
print(lista)
lista2= [3, 7]
lista3 = lista + [4] + lista2
print(lista3)
ordenacao=list.sort(lista3)
print(lista3)

idade=[]
for i in range (5):
    id = int(input("Digite a idade: "))
    idade.append(id)
print(idade)

print(max(idade)) #maior valor
print(min(idade)) #menor valor
print(sum(idade)) #soma de todos valores da lista

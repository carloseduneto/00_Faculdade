lista=[1,3,4,5,6,88,8,8,9]
contador= 0 #armazena as occorrencias do valor 8

for e in lista:
        if e == 8:
            contador+=1

print(f"Há {contador} ocorrências no valor 8")

# for i, e in enumerate (lista):
#     print(f'índece: {i} valor: {e}') 

# for i in range(len(lista)):
#     e = lista[i]
#     print(f"índice: {i} valor: {e}")
contador2=lista.count(8)
print(f"Há {contador2} ocorrências no valor 8")
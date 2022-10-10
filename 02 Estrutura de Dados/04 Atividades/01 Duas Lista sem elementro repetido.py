Lista1= [1,2,3,4,5,6,5,7]
Lista2=[2,4,5,6,7,8,9,90,99,4,5,6,7]
ListaNova=Lista1+Lista2

# TamanhoDaLista1= len(Lista1)
# TamanhoDaLista2= len(Lista2)
# tamanho = max (TamanhoDaLista1, TamanhoDaLista2)

# for i in range (tamanho):
#     if i <TamanhoDaLista1 and Lista1[i] not in ListaNova:
#         ListaNova.append(Lista1[i])
#         print(ListaNova)
#     if i <TamanhoDaLista2 and Lista2[i] not in ListaNova:
#         ListaNova.append(Lista2[i])
#         print(ListaNova)

# print(f"Lista 1: {Lista1}")
# print(f"Lista 2: {Lista2}")
# print(f"Lista Intercalada: {ListaNova}")
ListaSemRepetir=set(ListaNova)
print(ListaSemRepetir)

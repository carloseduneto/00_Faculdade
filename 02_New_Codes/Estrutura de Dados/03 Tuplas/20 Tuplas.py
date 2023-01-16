#São sequência de valores quaisqueres separadas por vírgulas

from re import A


a=7
b=78

# temporario=a
# a=b
# b=temporario

a,b=b,a

print(f"Valor de A: {a}")
print(f"Valor de B: {b}")

coordenadas=(2,4)

print(coordenadas[0])
print(coordenadas[1]) #Não pode ser alterado com coordenadas[0]=8
#Pode pesquisar com o in 
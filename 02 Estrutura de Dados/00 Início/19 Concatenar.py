Lista1=[1, 2, 3, 4,5,6,7,8,9]
Lista2=[10,20,30,40,50,60]
ListaIntercalada=[]

t1= len(Lista1)
t2= len(Lista2)
tamanho = max (t1 , t2)

for i in range (tamanho):
    if i <t1:
        ListaIntercalada.append(Lista1[i])
    if i <t2:
        ListaIntercalada.append(Lista2[i])

print(f"Lista 1: {Lista1}")
print(f"Lista 2: {Lista2}")
print(f"Lista Intercalada: {ListaIntercalada}")
#Alt ou Crtl+D
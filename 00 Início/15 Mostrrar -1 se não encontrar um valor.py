lista = [1,2,10,9,90,89]
i, e = 0, 89 
'''
i=0
e=89
'''

while i < len (lista) and lista[i] != e:
    i+=1
if i == len(lista):
    i= -1
print(i)
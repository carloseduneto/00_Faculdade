def Organizacao(L):
    for i in range(1, len(L)):
        j = i-1
        next_e = L[i]
        while (L[j] > next_e) and (j >= 0):
            L[j+1] = L[j]
            j = j-1
            L[j+1] = next_e


Valores= []

for i in range (5):
    ValoresDaLista = input('Digite um número: ')
    Valores.append(ValoresDaLista)
print (Valores)
Organizacao(Valores)
print(Valores)

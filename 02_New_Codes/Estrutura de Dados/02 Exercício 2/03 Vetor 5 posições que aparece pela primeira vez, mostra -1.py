print('#vetor de cinco posições')
posicoes=4
vetor=[]
contagem=0

valores=float(input(f"Insira o 1° valor: "))
vetor.append(valores)
print(f'É a primeira vez que aparece {valores} na posição {vetor.index(valores)} ')
w=1
a=0
b=1

for n in range(posicoes):
    valores=float(input(f"Insira o {w+1}° valor: "))
    vetor.append(valores)
    w=w+1

    contador=vetor.count(valores)

    if vetor[a] == vetor[b] or contador>1:
        print("-1")

    else:
        print(f'É a primeira vez que aparece {valores} na posição {n+1} ')

    a+=1
    b=b+1
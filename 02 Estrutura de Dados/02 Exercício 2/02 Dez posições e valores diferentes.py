print('#vetor dez posições')
posicoes=10
vetor=[]
contagem=0

for n in range(posicoes):
    valores=float(input(f"Insira o {n+1}° valor: "))
    vetor.append(valores)
    for w in range (n):
        if vetor[n]==vetor[w]:
            contagem+=1

resultados=posicoes-contagem
print(f"Foram {resultados} diferentes ")


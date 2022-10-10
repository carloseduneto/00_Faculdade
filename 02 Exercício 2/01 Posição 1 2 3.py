posicoes=3
vetor1=[]
vetor2=[] 

for i in range(posicoes):
    vetorUm=float(input(f"Digite o valor do primeiro vetor, posição {[i]} "))
    vetor1.append(vetorUm)

for i in range(posicoes):
    vetorDois=float(input(f"Digite o valor do segundo vetor, posição {[i]} "))
    vetor2.append(vetorDois)

soma1=vetor1[0]+vetor2[0]
print(soma1)

soma2=vetor1[1]+vetor2[1]
print(soma2)

soma3=vetor1[2]+vetor2[2]
print(soma3)
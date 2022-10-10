nomes=[]

nomes.append("Leide")
tmp=input('Digite um nome: ')
nomes.append(tmp) #append adiciona itens no fim da lista
nomes.append(input("Digite um outro nome: "))

for i in range (len(nomes)):
    print(f"Posição {i}: {nomes[i]}")
print("Separar números")
posicao=20
vet=[]
pos=[]

for n in range (posicao):
    valor=float(input(f"Insira o {n+1}º: "))
    vet.append(valor)

#parte 2, valores inteiros e positivos
for k in range (posicao):
    if vet [k] >=0:
        pos.append(vet[k])
print(f"Números inteiros e positivos: {pos}")

#Parte 3, separar números repetidos
semdup=[]
for i in pos:
    if i not in semdup:
            semdup.append(i)
semdup.sort()
print(f'Números sem duplicação: {semdup}' )

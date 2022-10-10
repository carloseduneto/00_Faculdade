numero=[""]*10
soma=0
for i in range (10):
    numero[i]=int(input(f"Digite o {i+1}º número: "))
    soma=soma+numero[i]
print(f"O valor da soma é: {soma}")

for i in range (10):
    print(f"\nNúmeros: {numero[i]}")
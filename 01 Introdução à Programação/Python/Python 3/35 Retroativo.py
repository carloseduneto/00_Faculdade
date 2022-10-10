n=int(input("Digite um numero inteiro: "))
x=int(input("Digite um outro numero inteiro: "))
if (n < x):
    for i in range(n ,x,+1):
        print(i, ", ")
    print("Não é retroativo")
else:
    for i in range(n, x , -1):
        print(i, ", ")
    print("É retroativo")
				
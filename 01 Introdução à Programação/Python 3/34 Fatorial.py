resultado=1
numero=int(input("Digite um número para saber seu valor fatorial: "))
for i in range(numero, 1, -1): #o numero que comeca, onde vai parar, de quanto em quanto ele vai
    resultado=resultado*i
print("O valor fatorial é de = ", resultado)
	
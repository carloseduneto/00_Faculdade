vetor=[""]*100
	
numero=int(input("Digite um numero qualquer:" ))
for i in range(0, 100, +1):
    vetor[i] = (numero * (i+1))
    print(" ",vetor[i])
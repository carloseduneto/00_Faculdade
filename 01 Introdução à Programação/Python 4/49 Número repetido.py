num=[""]*10


for i in range(10):
    num[i]=(input(f"\nDigite um número para a posição {i+1}: "))
    for j in range (0, i, +1):
        while num[i]==num[j]:
            print("\nNúmero já digitado!")
            num[i]=(input(f"\nDigite um número para a posição {i+1}: "))

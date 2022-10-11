#Preencher uma Matriz 3X3

NumeroDimensao=3

"""
0,0     0,1     0,2
1,0      1,1      1,2
2,0     2,1     2,2

"""
Matriz=[]
for i in range(NumeroDimensao):
    Matriz.append([])
    print(Matriz)
    for j in range(NumeroDimensao):
        NumeroAuxiliar=input(f"Insira o valor da linha {i} e coluna{j}: ")
        NumeroAuxiliar = abs(int(NumeroAuxiliar)) #O abs pega apenas o módulo de um número
        Matriz[i].append( NumeroAuxiliar)
    print(" ")

print(Matriz)
print("FINAL")

Quantidade=0
for Linha in range(NumeroDimensao):
    for Coluna in range(NumeroDimensao):
        Valor = Matriz[Linha][Coluna]
        if Valor%2 ==0:
            Quantidade+=1
print(f"Tem {Quantidade} números pares na Matriz")
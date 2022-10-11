Matriz=[]
MatrizdaMatriz=[]
Colunas=10
Linhas=2

for Coluna in range(Colunas):
    Matriz.append([])
    print(Matriz)
    for Linha in range(Linhas):
        Nome=input("Nome: ")
        Idade=input("Idade: ")

        Matriz[Coluna].append(Nome)
        Matriz[Coluna].append(Idade)
        print(Matriz)
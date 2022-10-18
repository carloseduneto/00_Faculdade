matriz=[]
colunas=3
Linhas=2

for coluna in range(colunas):
    matriz.append([])
    nome=input("Nome: ")
    idade=input("Idade: ")
    matriz[coluna].append(nome)
    matriz[coluna].append(idade)

opcao="SIM"
while (opcao not in "2NÃO" ):
    print("Desja exibir os dados cadastrados?")
    print("1 - Sim / 2 - Não")
    print(opcao)
    opcao=input(">>").upper()

    if (opcao.upper() in ("1SIM")):
        for indice in range(colunas):
            print(matriz[indice])
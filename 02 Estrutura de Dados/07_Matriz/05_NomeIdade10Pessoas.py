matriz=[]
linhas=5

for linha in range(linhas):
    matriz.append([])
    nome=input("Nome: ")
    idade=int(input("Idade: "))
    matriz[linha].append(nome)
    matriz[linha].append(idade)
    print(matriz)

# opcao="SIM"
# while (opcao not in "2NÃO" ):
#     print("Desja exibir os dados cadastrados?")
#     print("1 - Sim / 2 - Não")
#     opcao=input(">>").upper()

#     if (opcao.upper() in ("1SIM")):
#         print("###############")
#         print("# Nome# Idade #")
#         print("###############")
#         for indice in range(linhas):
#             print("#",matriz[indice][indice],"#", matriz[indice][indice+1], "#")
#             print("###############")
    

#Registro da linha 0 como sendo menor valor
menorIdade=matriz[0][1]
indiceMenor=0
for linha2 in range (len(matriz)):
    if matriz[linha2][1] < menorIdade:
        menorIdade= matriz[linha2][1]
        indiceMenor= linha2

print("========")
print(f"Menor idade")
print(f'Nome: {matriz[indiceMenor][0]}')
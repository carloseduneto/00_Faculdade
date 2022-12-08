#Uma matriz de palavras e montar uma frase com essas palavras

# palavras=[
#                                     ["cachorro","gato","onça"],
#                                     ["lindo","levado","sapeca"],
#                                     ["sabado","domingo","sexta"],
#                                     ["pegou","pulou","muro"]
#                                     ]
# frase=palavras[0][1] + " "+ palavras[2][1]#primeiro[] coluna de cima p baixo/segundo[] linhas
# print(frase)

# for indice in range(len(palavras)):
#     print(palavras[0][2])

# print(palavras[2][1])

lista=["Nome", "Idade", "CPF"]
matriz=[]

for i in range(2):
    matriz.append([input("Digite o Nome: "), input("Digite a Idade: "), input("Digite o CPF: ")])
for i in range(2):
    print(lista)
    print(matriz[i])


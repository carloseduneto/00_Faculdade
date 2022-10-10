ListaDePalavras=["bruno", "leide", "karol", "marco", "carlos"]


for i in ListaDePalavras: #Aqui ele vai passando por cada um item da lista
    print(f"\n Na palavra {i.capitalize()} temos ", end=" ")#Aqui ele roda apenas os itens da lista, na 0ª , 1ª, 2ª posição 

    for Caracter in i: #Para cada caracter em i, ou seja em 'bruno', por exemplo vai analizar o primeiro item ou seja "b", depois o segundo item e assim por diante
        
        if Caracter.lower() in "aeiou":
            print (Caracter, end=" ") #end=" ", serve para ele exibir na frente e não ir para a próxima linha

#🕒Tempo: 3H25min

'''9. Faça um programa que leia uma matriz 3x3 que 
representa um tabuleiro de jogo da velha e indique qual 
posição deveria ser jogada para ganhar o jogo (se 
possível) ou ao menos evitar uma derrota.'''


tamanho=3
tabuleiro=[]
posicoesVerticais=[0,1,2]
for i in range(3):
    tabuleiro.append([])
    for j in range(3):
        tabuleiro[i].append("_")

escolha=" "        
while(escolha not in "0SAIR"):        # type: ignore
    # print("\n   0  1  2 ")
    for i in range(3):
        print("")
        for j in range(3):
            print(tabuleiro[i][j], end=" | ")
    
    # print("\n0 - Sair")
    # print("1 - Adicionar mais posições")
    # print("2 - Ver posições para se ganhar")
    escolha="1"#input(">>").upper()
    if (escolha in ("1ADICIONARMAIS")):
        horizontal=int(input("\nEscolha a posição horizontal: "))

        vertical=int(input("Escolha a posição vertical: "))

        tabuleiro[horizontal][vertical]="X"

        #Coletar posições com "X"
        posicaoI=[]
        posicaoJ=[]
        inversoJ=[[],[],[]]
        inversoI=[[],[],[]]
        uniaoIeJ=[]
        for i in range(tamanho):
            posicaoI.append([])
            posicaoJ.append([])
            uniaoIeJ.append([])
            for j in range(tamanho):
                if(tabuleiro[i][j]=="X"):
                    posicaoI[i].append(i)
                    posicaoJ[i].append(j)

                    inversoI[j].append(i)
                    inversoJ[j].append(j)
                    
                    uniaoIeJ[i].append(i)
                    uniaoIeJ[i].append(j)

        # print("I normal",posicaoI)
        # print("J normal",posicaoJ)
        # print("J invertido", inversoJ)
        # print("I invertido", inversoI)
        # print("União I e J", uniaoIeJ)

        # jInvertido=posicaoJ
        # print(jInvertido)
        # #Inverso de J
        # for i in range(tamanho):
        #     for j in range(tamanho):
        #         print(posicaoJ[i][j])
        #         jInvertido[i].append(posicaoJ[i][j])
        # print("J invertido",jInvertido)

            #Analise apenas horizontal
            for i in range(tamanho):
                for j in range(tamanho):    
                    # print(len(posicaoI[i]))
                    if (len(posicaoI[i])==2):
                        if (posicaoI[0]>posicaoI[1] and posicaoI[0]>posicaoI[2]):
                            tabuleiro[0][j]="X"
                        elif (posicaoI[1]>posicaoI[2]):
                            tabuleiro[1][j]="X"
                        else:
                            tabuleiro[2][j]="X"
            

            #Análise vertical
            for i in range(tamanho):
                
                for j in range(tamanho):    
                    
                    if (len(inversoJ[i])==2):
                        if (inversoJ[0]>inversoJ[1] and inversoJ[0]>inversoJ[2]):
                            tabuleiro[j][0]="X"
                        elif (inversoJ[1]>inversoJ[2]):
                            tabuleiro[j][1]="X"
                        else:
                            tabuleiro[j][2]="X"
            soma=0
            for i in range(tamanho):
                print(len(uniaoIeJ[i]))
                soma=soma+(len(uniaoIeJ[i]))

            print("soma:", soma)
            #Análise diagonais
            for i in range(tamanho):
                for j in range(tamanho):
                    if (soma==4):
                        # if(i!=j):
                        #     if (uniaoIeJ[0][0]==0 and uniaoIeJ[0][1]==2 and uniaoIeJ[1][0]==1 and uniaoIeJ[1][1]==1):
                        #         tabuleiro[2][0]="X"
                        #     elif (uniaoIeJ[i][j]==2 and uniaoIeJ[i][j]==0 and uniaoIeJ[i][j]==1):
                        #         tabuleiro[0][2]="X"
                        #     elif( uniaoIeJ[i][j]==0 and uniaoIeJ[i][j]==2 and uniaoIeJ[i][j]==2 and uniaoIeJ[i][j]==0):
                        #         tabuleiro[1][1]="X" 
                        if(i==j ):
                            if (len(uniaoIeJ[0])>len(uniaoIeJ[2]) and len(uniaoIeJ[1])>len(uniaoIeJ[2])):
                                tabuleiro[2][2]="X"
                            elif (len(uniaoIeJ[1])>len(uniaoIeJ[0]) and len(uniaoIeJ[2])>len(uniaoIeJ[0])):
                                tabuleiro[0][0]="X"
                            elif(len(uniaoIeJ[2])>len(uniaoIeJ[1]) and len(uniaoIeJ[0])>len(uniaoIeJ[1])):
                                tabuleiro[1][1]="X" 



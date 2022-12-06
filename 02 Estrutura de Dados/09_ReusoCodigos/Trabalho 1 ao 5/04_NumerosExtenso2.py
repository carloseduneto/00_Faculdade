unidades=["zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"]
dez=["dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"]
dezenas=["zero","dez","vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"]
centenas=["zero","cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"]

############ RESTOS ##############

def restoDezenas(numero):
    resto=numero%10
    return resto

def restoCentenas(numero):
    resto=numero%100
    return resto

def restoMil(numero):
    resto=numero%1000
    return resto

def restoMilhao(numero):
    resto=numero%1000000
    return resto

############# INDEXAÇÃO ###############

def indexarDezenas(numero):
    numero=numero/10
    numero=int(numero)
    return numero

def indexarCentenas(numero):
    numero=numero/100
    numero=int(numero)
    return numero  

def indexarMilhares(numero):
    numero=numero/1000
    numero=int(numero)
    return numero

def indexarMilhoes(numero):
    numero=numero/1000000
    numero=int(numero)
    return numero

########## EXIBIÇÃO #############

def exibeUnidades(numero):
    algarismoUnidades=restoDezenas(numero)
    return unidades[algarismoUnidades]

def exibeDezenas(numero):
    if numero>=10 and numero <= 19:
        return list(dez[numero-10])
        
    elif numero>=20 and numero <=99:
        if(numero%10==0):
            numero=indexarDezenas(numero)
            return list(dezenas[numero])
        else:
            algarismoDezenas=valorDezenas(numero)
            variavel=dezenas[algarismoDezenas], " e ", exibeUnidades(numero)
            return list(variavel)

def exibeCentenas(numero):
    if numero <10:
        return exibeUnidades(numero)
        
    elif numero <=99:
        return exibeDezenas(numero)

    elif numero<=999:

        restoDez=numero%100
        if (numero==100):
            return "cem"
        elif(numero%100==0):
            numero=indexarCentenas(numero)
            numero=numero
            return centenas[numero]
        # elif(restoDez>=10 and restoDez<=19):
        #     algarismoCentenas=valorCentenas(numero)
        #     # algarismoCentenas-=1
        #     return centenas[algarismoCentenas], " e ", exibeDezenas(restoCentenas(numero))
        else:
            if exibeDezenas(restoCentenas(numero))==None:
                algarismoCentenas=valorCentenas(numero)
                return centenas[algarismoCentenas]," e ",exibeUnidades(restoDezenas(numero))
                
            # elif restoDezenas(numero)==0:
            #     algarismoCentenas=valorCentenas(numero)
            #     return centenas[algarismoCentenas], " e ", exibeDezenas(restoCentenas(numero))

            else:
                algarismoCentenas=valorCentenas(numero)
                variavelCentenas=[centenas[algarismoCentenas], " e "]
                variavelDezenas=exibeDezenas(restoCentenas(numero))
                for indice in variavelDezenas:
                    variavelCentenas.append(indice)

                return  variavelCentenas

def exibeMilhares(numero):
    parteUnitaria=restoMil(numero)
    parteMilhar=numero-parteUnitaria
    parteMilhar=valorMilhares(parteMilhar)
    # if numero%1000==0:
    #         if parteUnitaria==1:
    #             return "mil"
    #         else:
                
    #           return   [unidades[parteMilhar], " mil"]
    # if parteMilhar
    valorUnitario=exibeCentenas(parteUnitaria)
    valorMilhar=list(exibeCentenas(parteMilhar))
    valorMilhar.append(" mil e ")
    for i in valorUnitario:
        valorMilhar.append(i)
    return valorMilhar

def exibeMilhoes(numero):
    parteMilhar=restoMilhao(numero)
    parteMilhonaria=numero-parteMilhar
    parteMilhonaria=valorMilhoes(parteMilhonaria)
    valorMilhares=exibeMilhares(parteMilhar)
    valorMilhonario=list(exibeCentenas(parteMilhonaria))
    valorMilhonario.append(" milhões e ")
    for i in valorMilhares:
        valorMilhonario.append(i)
    return valorMilhonario


        
        

############## VALORES #########
def valorCentenas(numero):
    subtracao=numero-restoCentenas(numero)
    subtracao=indexarCentenas(subtracao)
    return subtracao


def valorDezenas(numero):
    subtracao=numero-restoDezenas(numero)
    subtracao=indexarDezenas(subtracao)
    return subtracao

def valorMilhares(numero):
    subtracao=numero-restoMil(numero)
    subtracao=indexarMilhares(subtracao)
    return subtracao

def valorMilhoes(numero):
    subtracao=numero-restoMil(numero)
    subtracao=indexarMilhoes(subtracao)
    return subtracao

##### PARA CADA UM #####
def para(valor):
    for i in valor:
        print(i, end="")
    print("\n")

def retornar(valor):
    lista=[]
    for i in valor:
        lista.append(i)
        
#####UNITÁRIOS #######
def unitarios(numero):
    if numero <10:
        print(exibeUnidades(numero))
        
    elif numero <=99:
        para(exibeDezenas(numero))

    elif numero<=999:
        para(exibeCentenas(numero))

numero=""
while numero !=-1:
    numero=int(input("😄 Insira um valor: "))
    if numero <10:
        print(exibeUnidades(numero))
        
    elif numero <=99:
        para(exibeDezenas(numero))

    elif numero<=999:
        para(exibeCentenas(numero))

    elif numero<=999999:
        para(exibeMilhares(numero))

    elif numero<=999999999:
        para(exibeMilhoes(numero))


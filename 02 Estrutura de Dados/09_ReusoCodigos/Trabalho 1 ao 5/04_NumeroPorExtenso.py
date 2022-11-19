n2=5
backup=5
unidades=["zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"]
dez=["dez", "onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"]
dezenas=["zero","dez","vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"]
centenas=["cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"]

def menu():
    print(30 * '-')
    print('1 - Somar')
    print('2 - Subtrair')
    print('3 - Multiplicar')
    print('4 - Dividir')
    print('5 - Limpar memória')
    print('6 - Número por extenso')
    print("7- Sair")
    print(30 * '-')

def somar(n1):
    global n2
    soma = n1 + n2
    return soma

def subtrair(n1):
    global n2
    sub = n1 - n2
    return sub

def multiplicar(n1):
    global n2
    multi = n1 * n2
    return multi

def dividir(n1):
    global n2
    div = n1 / n2
    return div

def limpar():
    global n2, backup
    n2=backup

def indexarDezenas(numero):
    numero=numero/10
    numero=int(numero)
    return numero

def indexarCentenas(numero):
    numero=numero/100
    numero=int(numero)
    return numero    

def valorCentenas(numero):
    subtracao=numero-valorDezenas(numero)
    subtracao=indexarCentenas(subtracao)
    return subtracao


def valorDezenas(numero):
    subtracao=numero-restoDezenas(numero)
    subtracao=indexarDezenas(subtracao)
    return subtracao

def restoDezenas(numero):
    resto=numero%10
    return resto

def restoCentenas(numero):
    resto=numero%100
    return resto


def retornarCentenas(numero):
    numero=numero/100
    numero=int(numero)
    return numero

def escreveDezenas(numero):
    if numero>=10 and numero <= 19:
        return dez[numero-10]
        
    elif numero>=20 and numero <=99:
        if(numero%10==0):
            numero=indexarDezenas(numero)
            return dezenas[numero]
        else:
            algarismoDezenas=valorDezenas(numero)
            return dezenas[algarismoDezenas]

def escreveUnidades(numero):
    algarismoUnidades=restoDezenas(numero)
    return unidades[algarismoUnidades]



# 
# num_2 = int(input('Digite o segundo número: '))

def opcao():
    global n2
    operacao = 0
    
    while operacao != 7:
        num_1 = int(input('Digite o primeiro número: '))
        menu()
        operacao = int(input('Escolha uma opção: '))
        if operacao < 1 or operacao > 7:
            print('Opção inválida!')
        elif operacao == 1:
            print(somar(num_1))
            n2=somar(num_1)

        elif operacao == 2:
            print(subtrair(num_1))
            n2=subtrair(num_1)
        
        elif operacao == 3:
            print(multiplicar(num_1))
            n2=multiplicar(num_1)
            
        elif operacao == 4:
            print(dividir(num_1))
            n2=dividir(num_1)    

        elif operacao == 5:
            print(limpar())
        
        elif operacao == 6:
            escolha="S"
            while escolha=="S":
                numeroPorExtenso=int(input("Digite um valor:"))
                # print(10**(len(str(numeroPorExtenso))))    
                if numeroPorExtenso <= 999999999:
                    if  numeroPorExtenso>=0 and numeroPorExtenso <=9:
                        print(escreveUnidades(numeroPorExtenso))

                    if numeroPorExtenso>=10 and numeroPorExtenso <=99:
                        print(escreveDezenas(numeroPorExtenso))

                    if numeroPorExtenso>=100 and numeroPorExtenso <=999:
                        if (numeroPorExtenso==100):
                            print("cem")
                        elif(numeroPorExtenso%100==0):
                            numero=indexarCentenas(numeroPorExtenso)
                            numero=numero-1
                            print(centenas[numero])
                            
                        else:
                            if escreveDezenas(restoCentenas(numeroPorExtenso))==None:
                                algarismoCentenas=valorCentenas(numeroPorExtenso)
                                print(centenas[algarismoCentenas]," e ",escreveUnidades(restoDezenas(numeroPorExtenso)))
                                
                            elif restoDezenas(numeroPorExtenso)==0:
                                algarismoCentenas=valorCentenas(numeroPorExtenso)
                                print(centenas[algarismoCentenas], " e ", escreveDezenas(restoCentenas(numeroPorExtenso)))

                            else:
                                algarismoCentenas=valorCentenas(numeroPorExtenso)
                                print(centenas[algarismoCentenas], " e ", escreveDezenas(restoCentenas(numeroPorExtenso)), " e ",escreveUnidades(restoDezenas(numeroPorExtenso)))


                    if numeroPorExtenso>=1000 and numeroPorExtenso <=9999:
                        pass

                    if numeroPorExtenso>=10000 and numeroPorExtenso <= 99999:
                        pass

                    if numeroPorExtenso>=100000 and numeroPorExtenso <= 999999:
                        pass

                    if numeroPorExtenso>=1000000 and numeroPorExtenso<= 9999999:
                        pass

                    if numeroPorExtenso>=10000000 and numeroPorExtenso<= 99999999:
                        pass

                    if numeroPorExtenso>= 100000000 and numeroPorExtenso<=999999999:
                        pass
                            
                            
                    

                    

                
                escolha=input("Deseja continuar a operação? <S> <N>").upper()

                    


        elif operacao == 7:
            print('Finalizando o programa...')

        

            
opcao()


'''                    if numeroPorExtenso <=9:
                        print(unidades[numeroPorExtenso])
                    if numeroPorExtenso >=10 and numeroPorExtenso <=19:
                        print(dez[numeroPorExtenso-10])
                    outrasDezenas(numeroPorExtenso)
                    cem(numeroPorExtenso)

                    if numeroPorExtenso >100 and numeroPorExtenso<=999:
                        if numeroPorExtenso%100==0:
                            numero=retornarCentenas(numeroPorExtenso)
                            print(centenas[numero])
                        else:
                            restoCentenas=numeroPorExtenso%100
                            subtracaoCentenas=numeroPorExtenso-restoCentenas

                            restoDezenas=subtracaoCentenas%10
                            subtracaoDezenas=subtracaoCentenas-restoDezenas

                            print()'''
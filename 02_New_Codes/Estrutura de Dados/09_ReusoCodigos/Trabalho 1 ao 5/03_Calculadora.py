n2=5
backup=5

def menu():
    print(30 * '-')
    print('1 - Somar')
    print('2 - Subtrair')
    print('3 - Multiplicar')
    print('4 - Dividir')
    print('5 - Limpar memória')
    print('6 - Sair do programa')
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


# 
# num_2 = int(input('Digite o segundo número: '))

def opcao():
    global n2
    operacao = 0
    
    while operacao != 6:
        num_1 = int(input('Digite o primeiro número: '))
        menu()
        operacao = int(input('Escolha uma opção: '))
        if operacao < 1 or operacao > 6:
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
            print('Finalizando o programa...')

            
opcao()
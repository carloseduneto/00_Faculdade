def calculaFibonacci(valor):

    if (valor==1 or valor==2):
        return 1
    else:
        # print(calculaFibonacci(valor))
        return calculaFibonacci(valor-1)+calculaFibonacci(valor-2)
    

def exibeNumeros(numero):
    for i in range (1, numero+1):
        print(calculaFibonacci(i))


exibeNumeros(9)
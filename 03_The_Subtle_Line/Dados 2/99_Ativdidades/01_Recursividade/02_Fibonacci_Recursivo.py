def calculaFibonacci(numero):
    if (numero == 1 or numero == 2):
        return 1
    else:
        return calculaFibonacci(numero - 1) + calculaFibonacci(numero - 2)


def mostraFibonacci(exibir):
    if exibir == 0:
        return "fim"
    else:
        # exibir = exibir -1
        print(calculaFibonacci(exibir))
        return mostraFibonacci(exibir - 1)


print(mostraFibonacci(10))

def calculaFatorial(numero):
    if numero == 0:
        return 1
    else:
        return numero *  calculaFatorial(numero-1)


print(calculaFatorial(5))

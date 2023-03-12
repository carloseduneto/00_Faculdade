contador = 0
divisores = 0


def numerosPrimos(numero, contador):
    global divisores
    if (contador != 0):
        resultado = numero % contador
        if (resultado == 0):
            divisores = divisores + 1

    if (contador == 0):
        if (divisores == 2):
            return True
        else:
            return False
    else:
        return numerosPrimos(numero, contador-1)


valor = 71
print(numerosPrimos(valor, valor))

resultado = 1


def calculaPotencia(base, expoente):
    global resultado
    if expoente == 0:
        return resultado
    else:
        resultado = resultado * base
        return calculaPotencia(base, expoente-1)


base = 3
potencia = 500
print(calculaPotencia(base, potencia))

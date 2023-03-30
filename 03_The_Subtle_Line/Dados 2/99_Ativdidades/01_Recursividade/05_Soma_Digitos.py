novoValor = 0
contador = 0


def somaNumerosInteiros(valor):
    global contador, novoValor

    valor = str(valor)
    lista = list(valor)

    if len(lista) == 0:
        return novoValor

    else:
        contador = len(lista) - 1
        novoValor = novoValor + int(lista[contador])
        lista.pop(-1)
        valor = "".join(lista)
        # print(valor)
        # valor= int(valor)
        contador = contador - 1
        return somaNumerosInteiros(valor)


valor = 7852654565464164524814885148586584969659514851489519514895189514000250505058205820582236987412
print(
    f"A soma dos algarimos de {valor} é igual à {somaNumerosInteiros(valor)}")

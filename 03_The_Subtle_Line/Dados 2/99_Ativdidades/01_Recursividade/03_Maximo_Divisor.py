contador = 0
divisores = 0


def verificaPrimos(numero, contador):
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
        return verificaPrimos(numero, contador-1)


listaPrimos = []


def cicloNumeros(contadorCiclo):
    global divisores
    if (contadorCiclo == 0):
        return listaPrimos
    else:
        divisores = 0
        if (verificaPrimos(contadorCiclo, contadorCiclo) == True):
            listaPrimos.append(contadorCiclo)
        return cicloNumeros(contadorCiclo-1)


listaPrimosSalvos = []
listaValores = []
minimoDivisorComum = 1

indice = -1


def maximoDivisorEntreDoisNumeros(numero1, numero2):
    global divisores, indice, minimoDivisorComum

    # print(numero1)
    if numero1 > numero2:
        listaPrimos = []
        divisores = 0
        listaPrimos = cicloNumeros(numero1)
    else:
        listaPrimos = []
        divisores = 0
        listaPrimos = cicloNumeros(numero2)

    if numero1 == 1 and numero2 == 1:
        print("1, 1 \t| 1")
        return minimoDivisorComum

    else:
        if (numero1 % listaPrimos[indice] == 0 or numero2 % listaPrimos[indice] == 0):
            print(f"{numero1}, {numero2} \t| {listaPrimos[indice] }")

            if numero1 % listaPrimos[indice] == 0 and numero2 % listaPrimos[indice] == 0:
                numero1 = int(numero1 / listaPrimos[indice])
                numero2 = int(numero2 / listaPrimos[indice])
                minimoDivisorComum = minimoDivisorComum * listaPrimos[indice]

            elif numero1 % listaPrimos[indice] == 0:
                numero1 = int(numero1 / listaPrimos[indice])

            elif numero2 % listaPrimos[indice] == 0:
                numero2 = int(numero2 / listaPrimos[indice])

        else:
            indice = indice - 1

        return maximoDivisorEntreDoisNumeros(numero1, numero2)


# print(cicloNumeros(500))
# print(" ")
# listaPrimos = []
# print(cicloNumeros(132))
listaPrimos = []
valor1 = int(input("Valor 1 >>"))
valor2 = int(input("Valor 1 >>"))
print(
    f"O MDC entre {valor1} e {valor2} é: {maximoDivisorEntreDoisNumeros(valor1, valor2)}")

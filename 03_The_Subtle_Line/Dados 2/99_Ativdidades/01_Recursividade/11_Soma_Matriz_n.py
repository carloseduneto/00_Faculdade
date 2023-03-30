contador = 0
soma = 0


def somaMatriz(matriz):
    global contador, soma
    outroEixo = 0
    if contador == len(matriz):
        return soma
    else:

        while outroEixo != len(matriz[contador]):
            print(matriz[contador])
            soma = soma + matriz[contador][outroEixo]
            outroEixo = outroEixo + 1

        contador += 1
        return somaMatriz(matriz)


matriz = [
    [1, 2, 3],
    [4, 5],
    [7, 7, 7, 8]
]

print(somaMatriz(matriz))

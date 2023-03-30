contador = 0

def combinacaoUnica(lista, numero):
    if numero == 0:
        return [[]]
    elif not lista or numero < 0:
        return None

    resultado = []
    for i, numeros in enumerate(lista):
        resto = lista[i+1:]
        outrasCombinacoes = combinacaoUnica(resto, numero - numeros)
        if outrasCombinacoes is not None:
            for combinacao in outrasCombinacoes:
                resultado.append([numeros] + combinacao)

    return resultado if resultado else None


lista = [1, 2, 3, 4, 5, 6, 7, 8, 9]
valor = 9
print(combinacaoUnica(lista, valor))
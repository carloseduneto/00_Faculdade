contador, soma = 0, 0


def calculaMediaLista(lista):
    global contador, soma
    if (contador == len(lista)):
        return int(soma/len(lista))
    else:
        soma = soma + lista[contador]
        contador += 1
        return calculaMediaLista(lista)


lista = [1, 3, 6, 22, 34, 28, 99, 88, 21, 45, 66, 55, 99, 100]
print(f"A média da lista é {calculaMediaLista(lista)}")

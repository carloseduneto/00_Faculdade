def fatorialIterativo(numero):
    resultado = 1
    for index in range (1, numero+1):
        resultado = resultado * index
    return resultado

def fatorialRecursivo(numero):
    # caso base
    if numero == 0:
        return 1
    else:
        return numero*fatorialRecursivo(numero-1)

print(fatorialIterativo(10))
print(fatorialRecursivo(10))


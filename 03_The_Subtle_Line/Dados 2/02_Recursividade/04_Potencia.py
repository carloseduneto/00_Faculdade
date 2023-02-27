def potencia(numero, expoente):
    if expoente ==1:
        return numero
    else:
        return numero * potencia(numero, expoente-1)
    
print(potencia(2, 3))
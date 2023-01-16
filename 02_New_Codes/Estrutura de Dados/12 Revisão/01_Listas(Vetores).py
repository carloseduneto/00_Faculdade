""""Listas ou vetores
> Armazenam dados e podem ser acessados por posições
    Começa no 0 e vai até o tamanho dessa lista

"""

listaTimesQuartasDeFinal=["Holanda", "Agentina", "Croácia","Brasil", "Inglaterra", "França", "Marrocos", "Portugal" ]

ultimoTime=listaTimesQuartasDeFinal[-1]
print(ultimoTime)

primeiroTime=listaTimesQuartasDeFinal[0]
print(primeiroTime)

listaTimesQuartasDeFinal[-1]="Suiça"
print(listaTimesQuartasDeFinal)

for posicao in listaTimesQuartasDeFinal:
    print(posicao)

for indice in range(len(listaTimesQuartasDeFinal)):
    print(listaTimesQuartasDeFinal[indice])
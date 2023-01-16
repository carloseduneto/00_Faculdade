def lerMatriz(matriz):
    for i in range (len(matriz)):
        for j in range(len(matriz)):
            print(matriz[i][j], end="")

def somar(numero1, numero2):
    soma=(numero1+numero2)
    return soma

def nomeLeide():
    print("Leideane")

def calculaMedia(valor:list):
    soma=0
    for i in valor:
        soma+=i
    media=soma/len(valor)
    media2=media*media
    media=media**2
    print( media2)
    print( media)

def calculaTempo(velocidade, distancia):
    tempo=distancia/velocidade
    return tempo

def calculaDistancia(velocidade, tempo):
    distancia = velocidade * tempo
    return distancia


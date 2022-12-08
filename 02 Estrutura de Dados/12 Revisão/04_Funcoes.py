texto="Olá, seja bem vindo"

def dizerOla (aCachorrinhaChamaMel):
    global texto
    return texto, aCachorrinhaChamaMel

print(dizerOla("Carl"))

numero=2
numero1=5
def soma ():
    global numero
    global numero1
    return numero+numero1
print(soma())

def somar(Numero1,Numero2):
    return Numero1+Numero2
print(somar(8,9))

valor1=int(input("Digite um valor:"))
valor2=int(input("Digite valor 2:"))
print(somar(valor1,valor2))

    
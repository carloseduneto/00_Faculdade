def menu():
    print(30 * '-')
    print('1 - Circunferencia')
    print('2 -Triângulo')
    print('3 - Retangulo')
    print("4- Sair")
    print(30 * '-')


def circunferencia(raio):
    circ=2*3.14*raio
    return circ

def areaCirculo(raio):
    area=3.14*(raio*raio)
    return area

def perimetroTriangulo(lado1, lado2, lado3):
    perimetroTriangulo=lado1+lado2+lado3
    return perimetroTriangulo




 
menu()
escolha=int(input("Qual figura você quer?"))
while escolha != 4:
    menu()
    escolha=int(input("Qual figura você quer?"))
    if escolha<0 or escolha>4:
        print("Esolha inválida!")
    elif escolha==1:
        raio=float(input("Digite o valor do raio: "))
        print("Perímetro do círculo",circunferencia(raio))
        print("Área do círculo:", areaCirculo(raio))
    elif escolha==2:
        lado1=int(input("Digite o lado 1:"))
        lado2=int(input("Digite o lado 2:"))
        lado3=int(input("Digite o lado 3:"))
        perimetroTriangulo(lado1, lado2, lado3)


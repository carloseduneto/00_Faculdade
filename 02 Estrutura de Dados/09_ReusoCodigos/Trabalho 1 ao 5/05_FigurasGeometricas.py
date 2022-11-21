def menu():
    print(30 * '-')
    print('1 - Circunferencia')
    print('2 - Triângulo')
    print('3 - Retangulo')
    print("4 - Sair")
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

escolha=0
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
        lados=[]
        lado1=int(input("Digite o lado 1:"))
        lados.append(lado1)
        
        lado2=int(input("Digite o lado 2:"))
        lados.append(lado2)
        
        lado3=int(input("Digite o lado 3:"))
        lados.append(lado3)

        perimetroTriangulo(lado1, lado2, lado3)



        #calcula área
        if (lado1==lado2 and lado1==lado3 and lado2==lado3):
            print("é equilatero")
            area=((lado1**2)*(3**1/2))/4
            print(f"🔺A área é igual a: {area} ")
            #✅

        elif(lado1==lado2 or lado1==lado3 or lado2==lado3):    
            if (lado1==lado2):
                altura=(lado1*lado1)-((lado3/2)**2)
                area=(lado3*altura)/2
                print(f"🔺A área é igual a: {area} ")

            if (lado1==lado3):
                altura=(lado1*lado1)-((lado2/2)**2)
                area=(lado2*altura)/2
                print(f"🔺A área é igual a: {area} ")

            if (lado2==lado3):
                altura=(lado2*lado2)-((lado1/2)**2)
                area=(lado1*altura)/2
                print(f"🔺A área é igual a: {area} ")
        #✅

        elif(lado1!=lado2 and lado1!=lado3 and lado2!=lado3):
            semiPerimetro=(lado1+lado2+lado3)/2
            area=1/2**(semiPerimetro*((semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3)))
            print(f"🔺A área é igual a: {area} ")

        else:
            print("Não é um triangulo")

    elif escolha==3:
        altura=float(input("Digite a altura: "))
        base=float(input("Digite a base:"))
        perimetro=altura+altura+base+base
        print(f"🟥 O perímetro do retângulo é: {perimetro} ")
        area=base*altura
        print(f"🟥 A área do retângulo é: {area} ")
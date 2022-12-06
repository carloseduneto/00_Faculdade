import math

def menu():
    print("Escolha uma opção: ")
    print("1 Calcular juros simples")
    print("2 Calcular juros compostos")
    print("")

def submenu():
    print("Escolha uma opção: ")
    print("1 Calcular juros")
    print("2 Calcular taxa")
    print("3 Calcular período")
    print("0 Voltar")

escolhaSimplesOuComposto=""
while escolhaSimplesOuComposto!=0:
    menu()
    escolhaSimplesOuComposto=int(input(">>"))
    if escolhaSimplesOuComposto==1:
        escolhaTipodoCalculo=""
        while escolhaTipodoCalculo!=0:
            submenu()
            escolhaTipodoCalculo=int(input(">>"))
            if escolhaTipodoCalculo==1:
                capital=float(input("Digite o capital: "))
                taxa=float(input("Digite a taxa em %: "))
                periodo=float(input("Digite o período: "))
                print(f"Os juros serão {capital*(taxa/100)*periodo}")
            if escolhaTipodoCalculo==2:
                juros=float(input("Digite o taxa: "))
                taxa=float(input("Digite a taxa em %: "))
                periodo=float(input("Digite o período: "))
                print(f"A taxa serão {juros/(capital*periodo)}")
            if escolhaTipodoCalculo==3:
                juros=float(input("Digite o taxa: "))
                capital=float(input("Digite capital: "))
                taxa=float(input("Digite a taxa em %: "))
                print(f"O período será {juros/(capital*(taxa/100))}")

    if escolhaSimplesOuComposto==2:
            escolhaTipodoCalculo=""
            while escolhaTipodoCalculo!=0:
                submenu()
                escolhaTipodoCalculo=int(input(">>"))
                if escolhaTipodoCalculo==1:
                    montante=float(input("Digite o montante: "))
                    capital=float(input("Digite o capital: "))
                    taxa=float(input("Digite a taxa em %: "))
                    periodo=float(input("Digite o período: "))
                    print(f"Os juros serão {(capital*(1+taxa)**periodo)-capital}")

                if escolhaTipodoCalculo==2:
                    montante=float(input("Digite o montante: "))
                    capital=float(input("Digite o capital: "))
                    taxa=float(input("Digite a taxa em %: "))
                    periodo=float(input("Digite o período: "))
                    print(f"A taxa serão {((montante/capital)**(1/periodo))-1}")
                    
                if escolhaTipodoCalculo==3:
                    montante=float(input("Digite o montante: "))
                    capital=float(input("Digite capital: "))
                    taxa=float(input("Digite a taxa em %: "))
                    print(f"O período será {math.log(montante/capital)/math.log(1+(taxa/100))}")


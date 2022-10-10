import string


def potência (base, expoente):
    baseFixa=base
    for i in range (expoente):
        base=baseFixa*base
    print(f"{baseFixa}^{expoente}={base}")

print("Deseja fazer exponenciação ou radiciação?")
escolha=input("EXP // RAD // DIV \n >>").upper()

if escolha == 'EXP' :
    print("Exponeciação")
    base=int(input(">>"))

    print(f"Exponeciação \n {base} ^ ")
    expoente=int(input(">>"))

    potência(base,expoente)

elif escolha== 'RAD':
    print("Radiciação")
    base=int(input("Base="))

    print("Radiciação")
    índice=int(input(f"√{base} (índice)="))

    resultado=base**(1/índice)
    resultadoExpr=f"{resultado:.2f}"
    resultadoVirg=resultadoExpr.replace(".", ",")

    print(f"Resultado:{índice}√{base}=\033[1m{resultadoVirg}\033[0m ")

elif escolha=="DIV":
    div=int(input("Número X/0: "))
    resultado=div/0
    print(resultado)
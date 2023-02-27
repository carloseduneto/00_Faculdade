def contagemRegressiva (numero):
    print(f"---dentro da recrusão: {numero}")
    if numero==0:
        print("Recursão")

    elif numero == -1:
        print("Recursão infinita")

    else:
        print(numero)
        contagemRegressiva(numero-1)
        # contagemRegressiva(numero-2)
    print(f"--fora da recursão: {numero}")

contagemRegressiva(10)

print("*"*20)


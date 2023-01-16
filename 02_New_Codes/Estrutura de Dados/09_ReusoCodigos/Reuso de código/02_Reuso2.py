def imprimeAsterisco(tamanho):
    print("*"*tamanho)

def menu():
    imprimeAsterisco(15)
    print("1-Subtrair")
    print("2-Somar")
    print("3-Sair")
    imprimeAsterisco(15)


def subtracao():
    pass

def adicao(x, y=2):
    return x+y

def opcaoFuncao():
    opcao=0
    while opcao!=3:
        menu()
        opcao=int(input("Digite sua opção: "))
        if opcao < 1 or opcao>3:
            print('Opção inválida')
        elif opcao==1:
            subtracao()
        elif opcao==2:
            r = adicao(10)
            print(f"O valor da soma é: {r}")
        elif opcao==3:
            print("Saindo...")

if __name__ =="__main__":
    opcaoFuncao()
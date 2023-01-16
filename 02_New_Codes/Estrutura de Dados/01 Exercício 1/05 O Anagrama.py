print("O ANAGRAMA")
expressao1=input("Insira uma expressão para analisarmos: ").lower()
expressao2=input("Insira outra expressão para analisarmos: ").lower()

expressaoA= expressao1.replace(" ", "")
primeiraListagem = list(expressaoA)
primeiraOrdenacao=list.sort(primeiraListagem)

expressaoB= expressao2.replace(" ", "")
segundaListagem=list(expressaoB)
segundaOrdenacaso=list.sort(segundaListagem)

if primeiraListagem==segundaListagem: 
    print('É um anagrama!')
else:
    print("Não é anagrama coisa nenhuma!")
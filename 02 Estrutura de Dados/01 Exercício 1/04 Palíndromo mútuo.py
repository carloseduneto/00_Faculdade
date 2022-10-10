expressao=input("Insira uma expressão para analisarmos: ")
outraExpressao=input("Insira outra expressão para analisarmos: ")[::-1]
if expressao == outraExpressao:
    print("É um palíndromo mútuo!!!")
else:
    print("Não é um palíndromo!!!")

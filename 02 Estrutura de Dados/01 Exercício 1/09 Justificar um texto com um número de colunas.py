print("#justificar um texto com um número de colunas\n")
texto=input("Insira o texto a ser justificado: ")
colunas=int(input("Defina o limite da justificativa: "))
tamanho=len(texto)

qualquer=0
valorMovelColunas=colunas
print("\n")
while(qualquer<=tamanho):
    print(texto[qualquer:valorMovelColunas])
    qualquer=qualquer+colunas
    valorMovelColunas=valorMovelColunas+colunas
print('\n')
print("#escada_de_nomes")
nome=input("Insira um nome: ").upper()
tamanho=len(nome)
for i in range (tamanho):
    print(nome[0:i+1])

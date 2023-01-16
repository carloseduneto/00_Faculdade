preco=float(input("Valor do produto: "))
quantidade=float(input("Quantidade de produtos: "))
desconto=float(input("Qual o valor do desconto: "))
resultado=preco*quantidade
cdesconto=resultado*(desconto/100)
print("O valor total é R$", resultado)
print("O valor desconto é R$", resultado-cdesconto)
print("Foi descontado R$", cdesconto)
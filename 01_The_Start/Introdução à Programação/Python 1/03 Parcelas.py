preco=float(input("Valor do produto: "))
quantidade=float(input("Quantidade de produtos: "))
desconto=float(input("Qual o valor do desconto: "))
parcelas=float(input("Quantas parcelas: "))
resultado=preco*quantidade
cdesconto=resultado*(desconto/100)
cparcela=resultado/parcelas
print("O valor total é R$", resultado)
print("O valor desconto é R$", resultado-cdesconto)
print("Foi descontado R$", cdesconto)
print("O valor de cada parcela é R$", cparcela)
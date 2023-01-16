"""
Basicamente listas associadas à palavras ou valores
"""

dicionario={}

dicionario["1AB"]= {"nome" : "Mouse", "Preço" : 87.5}
dicionario["6JH"]={"nome": "Tapete", "Preço": 123.6}
dicionario["2XC"]= {"nome": "Teclado", "Preço": 95.0}
dicionario["3AV"]={"nome": "Monitor", "Preço": 1234.6}

print("***",dicionario["1AB"]["nome"])
print(dicionario["2XC"]["Preço"])

print(dicionario)


for chave in dicionario:
    # print(chave)
    print (dicionario[chave]["Preço"])


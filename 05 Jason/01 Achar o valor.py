produtos={}
produtos["1AB"]= {"nome" : "Mouse", "Preço" : 87.5}
produtos["6JH"]={"nome": "Tapete", "Preço": 123.6}
produtos["2XC"]= {"nome": "Teclado", "Preço": 95.0}
produtos["3AV"]={"nome": "Monitor", "Preço": 1234.6}



for chave in produtos:
    valor=produtos[chave]
    if valor["nome"]=="Tapete":
        print("Nome: ",valor["nome"])
        print("Chave:", chave)
        print("Valor:", valor["Preço"])
    else:
        print("Produto inexistente!")

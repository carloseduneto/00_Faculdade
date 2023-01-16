class Fila:
    def __init__(self): #criando o tipo de dado
        print('construtor')
        self.__dados = []
        
    def adicionar(self, conteudo): #tem que ter o self
        #adicionar no final
        self.__dados.append(conteudo)
        print(f"Adicionado no final")
        print(self.info())

    def remover(self):#apaga dados temporariamente
        #remove no início
        if len(self.__dados)>0:
            return self.__dados.pop(0)
        else:
            print( "Pane no sistema")
            print(self.info())
            return None

    def info(self): #retorna a lista toda
        return self.__dados

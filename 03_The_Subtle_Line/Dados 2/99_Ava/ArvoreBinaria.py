class no (object):
    def __init__(self, chave):
        self.chave = chave
        self.esquerda = None
        self.direita = None
        
class Arvore (object):
    def __init__(self):
        self.raiz = None
        self.conteudoEspaco = 10

    def inserir(self, chave : int) -> None:
        #Cria novo nó
        novo = no(chave)
        if self.raiz == None:
            self.raiz = novo

        else:
            atual = self.raiz
            while True
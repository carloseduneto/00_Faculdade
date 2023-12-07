class Pessoa:
    def __init__(self, nome, codigo, preco, quantidadeEstoque):
        self.nome = nome
        self.codigo = codigo
        self.preco = preco
        self.quantidadeEstoque = quantidadeEstoque
        self.listaProdutos = []

    def apresentar(self):
        print(f"Olá, meu nome é {self.nome} e eu tenho {self.idade} anos.")

    def adicionarProduto(item):
        listaProdutos.append(item)


# Criando uma instância da classe Pessoa
pessoa1 = Pessoa("João", 30)

# Chamando o método apresentar da instância pessoa1
pessoa1.apresentar()

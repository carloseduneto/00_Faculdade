
#PROGRAMAÇÃO ORIENTADA A OBJETOS
from Fila import Fila
if __name__=='__main__':
    estruturaDeDados=Fila()
    # objeto clientes do tipo Fila
    clientes= Fila()
    clientes.adicionar("Leidiane")
    # print(clientes.info())
    clientes.adicionar("Carlos")
    # print(clientes.info())
    clientes.adicionar("Monica")

    #atender
    elemento = clientes.remover() #Leide
    print('----ATENDEU-----')
    print(elemento)
    print("------------------------------")
    print(clientes.info())
    print('**********')
    print(clientes.remover()) #Carlos
    print(clientes.remover()) #Monica
    print(clientes.remover()) #Erro


    
    

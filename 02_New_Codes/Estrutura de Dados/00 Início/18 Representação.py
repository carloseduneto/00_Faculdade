def funcao(temporario):
    temporario[1]=70


listaA=[1,3,4,6,7,8]
print(listaA)
funcao(listaA)
print(listaA)

listaC=[]
listaC= listaA[:] #torna uma cópia de outra lista
print(listaC) 
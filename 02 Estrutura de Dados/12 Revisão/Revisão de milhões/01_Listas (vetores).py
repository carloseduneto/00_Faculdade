#Fazer uma lista de 10 valores e retornar o total da soma de todos os valores
ListaNum=[1,4,6,2,5,7,2,4,0,8]
variavel=0

# for indice in range(comeco, fim, acressimo(+1)/decressimo(-1))
for indice in range( (len (ListaNum))-1 , 0,-1 ):

# [9],[0],-1

# for indice in range(len(ListaNum)):
    variavel=ListaNum[indice]+variavel
    print("Valor na lista ",ListaNum[indice]) #exibe os números da lista
    print("Somas ", variavel) #exibe os valores somados


# variavel ListaNum   variavel        indice
# 0               1               + 0                     0
# 1               4               + 1                       1
# 5               6               + 5                     2


# Soma=ListaNum[0]+ListaNum[1]+ListaNum[2]+ListaNum[3]...+ListaNum[9]
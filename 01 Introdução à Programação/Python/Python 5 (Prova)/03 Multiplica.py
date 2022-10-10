def Multiplica (numero1, numero2):
    return numero1 * numero2
    
numero=int(input("Digite o número: "))
for i in range(11):
    r= Multiplica(numero, i)
    print("\n", numero, " x ", i, " = ", r)
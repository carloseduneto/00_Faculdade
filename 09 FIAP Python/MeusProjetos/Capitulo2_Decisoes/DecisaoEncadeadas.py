nome=input('Nome do paciente: ')
idade=int(input("Idade do " + nome + ": "))
doenca=input('Tem doença infecto-contadiosa? ').upper()
if idade >= 65:
    print("Paciente COM prioridade")
    if doenca=="SIM":
        print("Encaminhar o paciente para sala AMARELA")
    elif doenca=='NÃO':
        print("Encaminhar o paciente para sala BRANCA")
    else:
        print("Responda se tem doença infecciosa SIM ou NÃO")

else:
    print("Paciente SEM prioridade")
    if doenca=="SIM":
        print("Encaminhar o paciente para sala AMARELA")
    elif doenca=='NÃO':
        print("Encaminhar o paciente para sala BRANCA")
    else:
        print("Responda se tem doença infecciosa SIM ou NÃO")
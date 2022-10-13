nome=input("Digite o nome: ")
idade=int(input("Digite a idade: "))
doenca=input("Suspeita de doença infectocontagiosa? ").upper()

# PRIMEIRO PROBLEMA A SER RESOLVIDO
if doenca=="SIM":
    print("Encaminhar o paciente para sala AMARELA")
elif doenca=="NÃO":
    print("Encaminhar o paciente para sala BRANCA")
else:
    print("Responda se há suspeita de doença infectocontagiosa com SIM ou NÃO")

# SEGUNDO PROBLEMA A SER RESOLVIDO
if idade >= 65:
    print("Paciente COM prioridade")
else:
    genero=input("Digite o gênero do paciente: ").upper()
    if genero=="FEMININO" and idade>10:
        gravidez=input("A paciente está grávida? ").upper()
        if gravidez=="SIM":
            print("Paciente COM prioridade")
        else:
            print("Paciente SEM prioridade")
    else:
        print("Paciente SEM prioridade")
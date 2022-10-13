nome=input("Nome do paciente: ")
idade=int(input("A idade de "+ nome + ": "))
prioridade="NÃO"
if idade>=65:
    prioridade="SIM"
print(f"O paciente {nome} tem prioridade de atendimento? ", prioridade)

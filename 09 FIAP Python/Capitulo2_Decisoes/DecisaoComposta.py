nome=input('Nome do paciente: ')
idade=int(input("Idade do " + nome + ": "))
doenca=input('Tem doença infecto-contadiosa? ').upper()
if idade >= 65 and doenca=="NÃO":
    print(nome, " deve ser encaminhado à sala BRANCA, com atendimento PRIORITÁRIO")
elif idade > 65 and doenca=="SIM":
    print(nome, " deve ser encaminhado à sala AMARELA, com atendimento PRIORITÁRIO")
elif idade <= 65 and doenca=="NÃO":
    print(nome, " deve ser encaminhado à sala BRANCA, sem atendimento PRIORITÁRIO")
elif idade > 65 and doenca=="SIM":
    print(nome, " deve ser encaminhado à sala AMARELA, sem atendimento PRIORITÁRIO")
else:
    print("Responda, para doença infecciosa SIM ou NÃO")
nomeCompleto=input("Digite o nome completo: ")
parteNome=nomeCompleto.split(" ") #Dentro do parênsteses fica o separador
print(parteNome)
primeiroNome=parteNome[0]
sobrenome=parteNome[-1]
domínio="email.com"
email=primeiroNome+"."+sobrenome+"@"+domínio
email=email.lower()
print(email)

nomeCompleto=input("Digite o nome completo: ")
parteNome=nomeCompleto.split(" ") #Dentro do parênsteses fica o separador
print(parteNome)
primeiroNome=parteNome[0]
tamanho=len(parteNome)
sobrenome=parteNome[tamanho-1] #-1 acessa a última posição
domínio="email.com"
email=primeiroNome+"."+sobrenome+"@"+domínio #junta as strings
email=email.lower()
print(email)

'''
Márcia Ferreira Matos       >marcia.ferreira@email.com
Ana Laura Teixeira          >ana.teixeira@email.com

wps


'''
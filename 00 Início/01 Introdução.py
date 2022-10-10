nome = "Leide"
print(nome[0])
print(nome[1])
print(nome[2])
print(nome[3])
print(nome[4])
print('')

nome="Carlos"
print(nome[0])
print(nome[1])
print(nome[2])
print(nome[3])
print(nome[4])
print(nome[5])
print('')

nome="Alysson"
print(nome[2:5])
print(nome[:5])
print(nome[6:])
print('')

print("A" in nome) 
print("w" in nome)
print("z" in nome)  
'''
buscar = input("Digite trecho a ser buscado: ") #Procura os dados
if buscar in nome:
    print(f"Trecho: {buscar} está presente em {nome}")
else:
    print(f"Trecho: {buscar} não está presente em {nome}")'''

'''
buscar = input("Digite email ") #verifica se tem o valor
if "@" in buscar:
    print(f"{buscar} é email")
else:
    print(f"{buscar} não é email")'''
    
        
nome="Leide" #conta o tamanho
print(len(nome))

nome = "Leidiane" + " " "Rodrigues" #junta as palavras
print (nome)

n=3
n2=4
print("Soma entre 3 e 4 é",  n + n2)

nome="Leide"
nome_repetido=nome*10
print(nome_repetido)


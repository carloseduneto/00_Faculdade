#ADM, USR ou GUEST + o gênero dessa pessoa
'''Olá administrador// Olá administradora'''
'''Olá usuário// Olá usurária'''
"""Olá vistante"""
"""Olá desonhecido// Olá desconhecida"""

nivel=input("Qual o nível de acesso? (ADM, USR ou GUEST) ") .upper()
genero=input("Qual o seu gênero? ").upper()

#Nível de acesso ADM
if nivel=="ADM":
    if genero=="FEMININO":
        print("Olá administradora!")
    else:
        print('Olá administrador!')

#Nível de acesso USR
elif nivel=='USR':
    if genero=='FEMININO':
        print("Olá usuária!")
    else:
        print('Olá usuário!')

#Nível de acesso GUEST
elif nivel=="GUEST":
    print("Olá visitante")

#Nível de acesso UNKNOW
else:
    print("Olá desconhecid(a)!")
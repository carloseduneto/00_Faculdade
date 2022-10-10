#len= mede o tamanho de uma expressão

nome = "Leidiane"
i=0
tamanho = len(nome)
print("Percorrendo com WHILE")
while i < tamanho: #len mede o tamanho da expressão
    print(f'{i} : {nome[i]}', end=" ") #end determinar com o que ele termina
    #atualizar i
    i=i+1 #i+=1

print("\nPercorrendo com FOR")
for i in range (tamanho):
    print(nome[i], end=" ")

print("\n Percorrendo string (palavra) com for - no index")
for caracter in nome:
    print(caracter, end=" ")

print("\n")
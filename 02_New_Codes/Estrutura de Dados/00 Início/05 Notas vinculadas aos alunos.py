'''Código que calcula a média dos alunos e retornas quem está acima da média da turma'''
from posixpath import normcase


alunos=3
somaNotas=0
nomes=[] #guarda nomes e notas
notas=[] 
media=0

for i in range(alunos):
    auxiliarNome=input("Digite o nome: ")
    auxiliarNota=float(input(f"Digite a nota de {auxiliarNome}: "))
    nomes.append(auxiliarNome)
    notas.append(auxiliarNota)

###############################

print("-"*25)
print(f'Nomes: {nomes} ')
print(f'Notas: {notas} ')

media=sum(notas)/len (notas) #sum(notas)/n_alunos // sum=soma os valores de um vetor
print("-"*25)
print("Pessoas acima da média")
print("-"*25)

for k, nota in enumerate (notas): 
#for k in range (len (notas)):
#    nota=notas[i]    
    if nota > media:
        print(f'Nome: {nomes[i]} ')
print("-"*25)
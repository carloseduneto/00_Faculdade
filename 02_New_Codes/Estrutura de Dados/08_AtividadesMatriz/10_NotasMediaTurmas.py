#🕒Tempo: 0h55min
"""10.Faça um programa que lê duas notas para cada aluno de duas turmas. Cada turma tem 3 
alunos. Armazene os dados em uma matriz M. Cada aluno deve ter três notas (as duas
digitadas e a média dessas duas). Calcule a média de cada turma e armazene em um vetor
TURMA. Informe qual turma tem maior média, e quais alunos tiveram média maior que a 
média de sua turma."""
from random import randint

alunos=3
turmas=2
matrizW=[[[1,2,3],[1,2,3],[1,2,3]],[[4,5,6],[4,5,6],[4,5,6]]]
matrizM=[]
vetorTurma=[]
for i in range(turmas):
    matrizM.append([])
    for j in range(alunos):
        matrizM[i].append([])
        for k in range(1):
            nota1=randint(0,100)
            nota2=randint(0,100)
            media=(nota1+nota2)/2
            matrizM[i][j].append(nota1)
            matrizM[i][j].append(nota2)
            matrizM[i][j].append(media)

            
turma1=0
turma2=0
for i in range(turmas):
    for j in range(alunos):
        for k in range(1):
            if i==0:
                turma1+=matrizM[i][j][2]
            if i==1:
                turma2=turma2+matrizM[i][j][2]

                
turma1=round((turma1/alunos),2)
turma2=round((turma2/alunos),2)
vetorTurma.append(turma1)
vetorTurma.append(turma2)

if(vetorTurma[0]>vetorTurma[1]):
    print("A primeira turma tem a média maior")
else:
    print("A segunda turma tem a média maior")
    
for i in range(turmas):
    for j in range(alunos):
        for k in range(1):
            if i==0:
                if matrizM[i][j][2]>vetorTurma[i]:
                    print(f"O {j+1}º aluno teve nota ({matrizM[i][j][2]}) acima da média da turma {i+1} ({vetorTurma[i]}) ")
            if i==1:
                if matrizM[i][j][2]>vetorTurma[i]:
                    print(f"O {j+1}º aluno teve nota ({matrizM[i][j][2]}) acima da média da turma {i+1} ({vetorTurma[i]})")
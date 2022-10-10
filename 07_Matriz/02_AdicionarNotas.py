Notas=[] #para armazenar as notas da turma
NumeroDeAlunos=3
NumeroDeProvas=5

for Linha in range (NumeroDeAlunos):
    print(f"Notas do Aluno {Linha+1}")
    NotasAlunos=[]
    for Coluna in range (NumeroDeProvas):
        Nota = float(input(f"Nota {Coluna+1}"))
        NotasAlunos.append(Nota)
    Notas.append(NotasAlunos)
print("+"*20)
print(Notas)
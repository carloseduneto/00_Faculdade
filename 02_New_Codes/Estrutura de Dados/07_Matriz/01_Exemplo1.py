Notas=[[7, 5, 6, 10],
                [9, 7, 6, 7]]



print(len(Notas[0]))
print(Notas[0][0])

for Linha in range(len(Notas)):
    print(f"Notas do(a) aluno(a) {Linha+1}")
    print(Notas[Linha])
    Soma=0
    SomaGeral=0
    for Coluna in range(len(Notas[Linha])):
        # print(f"{Linha} | {Coluna}: ", end=" ")
        # print(Notas[Linha][Coluna])
        Soma +=Notas[Linha][Coluna]


    Media = Soma/len(Notas[Linha])
    SomaGeral+=Media
    print(f"Média do {Linha+1}: {Media:.1f}")

MediaTurma=SomaGeral/len(Notas)
print("-"*15)
print(f"Média turma: {MediaTurma:.1f}")
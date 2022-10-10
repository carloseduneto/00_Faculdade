nome1= input("Informe o nome do aluno 1: ")
nome2= input("Informe o nome do aluno 2: ")
nome3= input("Informe o nome do aluno 3: ")

nota1= float (input(f"Insira a nome do aluno {nome1} "))
nota2= float (input(f"Insira a nome do aluno {nome2} "))
nota3= float (input(f"Insira a nome do aluno {nome3} "))

media=(nota1 + nota2 + nota3)/3
print(f"A média da turma é {media:.2f} ")

if nota1 > media:
    print(f"Parabéns {nome1} ")

elif nota2 > media:
    print(f"Parabéns {nome2} ")

elif nota3 > media:
    print(f"Parabéns {nome3} ")    
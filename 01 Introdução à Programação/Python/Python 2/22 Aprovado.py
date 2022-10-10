nota=float(input("Digite a primeira nota: "))
nota2=float(input("Digite a segunda nota: "))
faltas=float(input("Digite a quantidade de faltas: "))
media_notas=((nota+nota2)/2)
if media_notas>=6 and 20>faltas:
    print("Aprovado!!!")	
else:
    print("Reprovado!!!")
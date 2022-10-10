notas= []
tamanho=3
notas2 = [0]*3 #não usar o append

for bicicleta in range(tamanho):
    valor=float(input(f"Insira a {bicicleta+1}ª nota:"))
    notas.append(valor)
    media=(sum(notas))/3
print(f"A média da turma é {media:.2f}")


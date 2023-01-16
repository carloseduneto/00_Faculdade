N=int(input("Digite a dimensão n da matriz: "))
M=int(input("Digite a dimensão m da matriz: "))

Matriz=[]
for i in range(N):
    Linha=[]
    for j in range (M):
        Linha.append(0)
    Matriz.append(Linha)

for k in range (len(Matriz)):
    print(Matriz[k])

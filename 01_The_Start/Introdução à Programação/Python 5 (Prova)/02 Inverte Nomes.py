nomes=[""]*5
for i in range (5):
    nomes[i]=input(f"Digite o {i+1}º nome: ")
    
for i in range(0, 5, +1):
    print(f"\n Nome: {nomes[i]}")
    
for i in range(4, 0, -1):
    print(f"\n Nome: {nomes[i]}")
escolha=int(input("Escolha o que fazer: \n1) Transformar taxa anual em mensal \n2) Transformar a taxa de porcentagem para decimal \n3) Calcular o juros \n4) Calcular o montante \n5) Descobrir o período \n6) Descobrir a taxa (Resposta em taxa mensal) \n>>"))

if escolha==1:
    taxaAnual=float(input("Qual a taxa anual? "))
    taxaMensal=taxaAnual/12
    print(f"A taxa mensal é {taxaMensal:.2f}%")

elif escolha==2:
    taxaPorc=float(input("Qual a taxa de porcentagem? "))
    taxaReal=taxaPorc/100
    print(f"{taxaPorc} em decimal é {taxaReal}")

elif escolha==3:
    capital=float(input("Qual o capital inicial? R$"))
    taxaJuros=float(input("Qual a taxa de juros? %"))
    tempo=float(input("Quanto tempo vai fcar aplicado? a.m."))
    juros=capital*(taxaJuros/100)*tempo
    print(f"O valor dos juros ao mês é R${juros}")

elif escolha==4:
    capital=float(input("Qual o capital inicial? R$"))
    taxaJuros=float(input("Qual a taxa de juros? %"))
    tempo=float(input("Quanto tempo vai fcar aplicado? a.m."))
    juros=capital+(capital*(taxaJuros/100)*tempo)
    print(f"O valor do montante ao mês é R${juros}")

elif escolha==5:
    capital=float(input("Qual o capital inicial? R$"))
    taxaJuros=float(input("Qual é a taxa de juros? %"))
    juros=float(input("Qual foi o valor arrecado? R$"))
    tempo=juros/(capital*taxaJuros)
    
    print(f"Vai demorar {tempo*100:.0f} meses")

elif escolha==6:
    capital=float(input("Qual o capital inicial? R$"))
    tempo=float(input("Quanto tempo? a.m."))
    juros=float(input("Qual foi o valor arrecado? R$"))
    taxaJuros=juros/(capital*tempo)
    print(f"É {taxaJuros*100:.2f}% a.m.")

else:
    print("Opção inválida!")
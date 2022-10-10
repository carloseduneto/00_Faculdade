Taxa=float(input("Taxa"))
Taxa=Taxa/100
Mes=int(input("Mês"))
i=((1+Taxa)**(1/Mes))-1
print(i*100)


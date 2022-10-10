volta1=float(input("Digite o tempo da volta 1: "))
volta2=float(input("Digite o tempo da volta 2: "))
volta3=float(input("Digite o tempo da volta 3: "))
if volta1<=volta2 and volta1<=volta3:
	print("A volta 1 é mais rápida")	
elif volta2<=volta3:
	print("A volta 2 é mais rápida")
else:
	print("A volta 3 é mais rápida")
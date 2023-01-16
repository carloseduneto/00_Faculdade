valor1= 10
valor2= 20
valor3= 30
T_LINHAS=0
valores=[True, False]
for a in valores:
	for b in valores:
		for c in valores:
			if (valor1 < valor2) or (valor2 < valor3) or (valor1 == valor3):
				FORMULA="Verdadeiro"
			else:
				FORMULA="Falso"
			print (f"{a} \t {b} \t {c} \t {FORMULA}")
			T_LINHAS+=1
print(f'Total de linhas: {T_LINHAS}')
valor1= 10
valor2= 20
valor3= 30

print("Testador de fórmulas Jequitinhonha 1.1")
print ("~(A v ~B) ^ (~A ^ C )\n")
T_LINHAS=0
valores=[True, False]
for a in valores:
	for b in valores:
		for c in valores:
			#if not (valor1 < valor2) and ((valor2 < valor3) or (valor1 == valor3)):
			if (not (a or not b )) and (not a and c):
				FORMULA="Verdadeiro"
			else:
				FORMULA="Falso"
			print (f"A = {a} \t B = {b} \t C = {c} \t FÓMULA = {FORMULA}")
			T_LINHAS+=1

print(f'Total de linhas: {T_LINHAS}')
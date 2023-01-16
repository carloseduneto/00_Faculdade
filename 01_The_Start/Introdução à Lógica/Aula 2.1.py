BEBIDAS = ['4','5', "6"]

print("Lista de números: ")
print("--------------------------")
for BEBER in BEBIDAS:
	print (BEBER)

print(" ")

COMIDAS = ['D', 'E', 'F']
print("Lista de comidas: ")
for COMER in COMIDAS:
	print (f"item : {COMER}")
	
print (' ')
contando=0

print("Conbinador 2.0.1 - Sistema combinador de números e letras: ")
print("==================================")

for A in BEBIDAS:
	for B in COMIDAS:
		contando += 1
		print(f"Combinação {contando}: {A} e {B}")
print (f"Foram totalizadas {contando} combinação de números.")
		
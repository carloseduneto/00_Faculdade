BEBIDAS = ['limonada', 'guaraná', 'vinho', 'conhaque', "Brunin", "Karol"]

print("Lista de bebidas: ")
print("--------------------------")
for BEBER in BEBIDAS:
	print (BEBER)

print(" ")

COMIDAS = ['alface', 'espinafre', 'arroz', 'batata', 'frango']
print("Lista de comidas: ")
for COMER in COMIDAS:
	print (f"item : {COMER}")
	
print (' ')
contando=0

print("Conbinador 2.0.1 - Sistema combinador de comidas: ")
print("==================================")

for A in BEBIDAS:
	for B in COMIDAS:
		contando += 1
		print(f"Combinação {contando}: {A} e {B}")
print (f"Foram totalizadas {contando} combinação de pratos.")
		
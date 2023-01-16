T_LINHAS=0
valores=[True, False]
for a in valores:
	for b in valores:
		for c in valores:
			print (f"{a} \t {b} \t {c}")
			T_LINHAS+=1
print(f'Total de linhas: {T_LINHAS}')
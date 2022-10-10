febre=input("Olá, você está com febre alta? (Sim ou Não) ")
manchas=input("Ok , agora me diga, você tem manchas pelo corpo? (Sim ou Não) ")
dor=input("Para finalizar, me diga você sente dor no corpo? (Sim ou Não) ")

if febre=="Sim"and dor=="Sim":
	print("Tu tá com Dengue irmão!")	
elif (manchas=="Sim" and dor=="Sim"): 
	print("Parece que você pegou Zika!")
elif (manchas=="Sim" and febre=="Sim"):
	print("É, a Chickungunnya veio!")
else:
	print("Deve ser uma gripezinha e um resfriadinho")
	
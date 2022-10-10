#upper MAIÚSCULO
texto="Hoje é Ene-feira"
print(texto.upper())
print(texto)
texto=texto.upper()
print(texto)

#lower minúsculo
minusculo=texto.lower()
print(minusculo)

#capitalize Cada Inicial Com Maiúsculo
texto2=texto.capitalize()
print(texto2)

#find p-rocurar algo
#strip 
textoEspaco=" leide@gmail.com                 "
print(len(textoEspaco))
textoSemEspaco=textoEspaco.strip()
print(textoSemEspaco)
print(len(textoSemEspaco))
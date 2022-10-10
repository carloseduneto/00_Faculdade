alvo = input ("Primeira palvra: ")
palavra= input ("Segunda palavra: ")

espacoAlvo= alvo.lower().replace(" ", "")
espacoPalavra= palavra.lower().replace(' ','')
anagrama=True


if len(espacoAlvo) != len(espacoPalavra):
    print (f"{palavra} não é anagrama de {alvo}")

else:
        for letra in espacoPalavra:
            if letra not in espacoPalavra:
                print (f"{palavra} não é um anagrama")
                anagrama= False
                break

def Alfabeto (letra):
    if (letra == "a" or letra == "A"):
        return True
    if (letra == "e" or letra == "E"):
        return True
    if (letra == "i" or letra == "I"):
        return True
    if (letra == "o" or letra == "O"):
        return True
    if (letra == "u" or letra == "U"):
        return True
    
letra=input("Digite uma letra: ")
print(f"Essa lertra é uma vogal: {Alfabeto(letra)}")
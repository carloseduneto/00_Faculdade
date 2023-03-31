def distanciaEdicao(string1, string2):
    if len(string1) == 0:
        return len(string2)
    elif len(string2) == 0:
        return len(string1)
    elif string1[0] == string2[0]:
        return distanciaEdicao(string1[1:], string2[1:])
    else:
        return 1 + min(distanciaEdicao(string1, string2[1:]),  # inserção
                       distanciaEdicao(string1[1:], string2),  # remoção
                       distanciaEdicao(string1[1:], string2[1:]))  # substituição


print(distanciaEdicao("Maria", "Jessicamaria"))

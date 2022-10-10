vetor=[2.5, 7.5, 10.0, 4.0, 9, 7, 5, 4, 6,9,8,6]
soma=sum(vetor)
media=soma/len(vetor)
print(media)

listaAcimaMedia=[]
listaAcimaMedia2=[]
for i in range (len(vetor)):
    if vetor[i]>media:
        listaAcimaMedia.append(vetor[i])
        list.sort(listaAcimaMedia)
        print(listaAcimaMedia)
    elif vetor[i]<media:
        listaAcimaMedia2.append(vetor[i])
        list.sort(listaAcimaMedia2)
        print(listaAcimaMedia2)


print(f"O número mais próximo da média é {listaAcimaMedia[0]} ")
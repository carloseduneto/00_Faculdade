texto= "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque euismod dignissim eros vel posuere. Lorem Nunc cursus cursus laoreet. Cras vel libero nisl. Proin volutpat elementum turpis non ultricies. Maecenas at purus commodo, suscipit lorem commodo, pulvinar dui. Vestibulum ac purus elementum, pretium nisi vel, volutpat ipsum. Etiam pulvinar ligula vulputate facilisis condimentum. Etiam mattis auctor tellus vel interdum. Donec nec ligula libero. Aliquam quis nunc facilisis, maximus dui sed, molestie augue. Suspendisse vel odio dignissim, rutrum ex ac, tempus ligula. Cras porttitor aliquet odio non pulvinar. Fusce rhoncus elit a mi laoreet posuere. Phasellus nec feugiat neque."

termo= input("Digite termo a ser procurado: ")
posicao=texto.find(termo)
print(f"Posição: {posicao}")

if posicao>=0:
    print(f"O termo:{termo} está na posição {posicao} do texto")

else:
    print(f"O termo:{termo} NÃO está no texto")
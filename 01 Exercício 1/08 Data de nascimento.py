print("#substituir data de nascimento")
data=input("Qual a sua data de nascimento mesmo (dd/mm/aaaa)? ")
quebraData=data.split("/")

if quebraData[1]=="01":
    print(quebraData[0]+ " de janeiro "+ quebraData[2])

elif quebraData[1]=="02":
    print(quebraData[0]+ " de fevereiro "+ quebraData[2])

elif quebraData[1]=="03":
    print(quebraData[0]+ " de março "+ quebraData[2])

elif quebraData[1]=="04":
    print(quebraData[0]+ " de abril "+ quebraData[2])

elif quebraData[1]=="05":
    print(quebraData[0]+ " de maio "+ quebraData[2])

elif quebraData[1]=="06":
    print(quebraData[0]+ " de junho "+ quebraData[2])

elif quebraData[1]=="07":
    print(quebraData[0]+ " de julho "+ quebraData[2])

elif quebraData[1]=="08":
    print(quebraData[0]+ " de agosto "+ quebraData[2])

elif quebraData[1]=="09":
    print(quebraData[0]+ " de setembro "+ quebraData[2])

elif quebraData[1]=="10":
    print(quebraData[0]+ " de outubro "+ quebraData[2])

elif quebraData[1]=="11":
    print(quebraData[0]+ " de novembro "+ quebraData[2])

elif quebraData[1]=="12":
    print(quebraData[0]+ " de desembro "+ quebraData[2])

else:
    print("Mês selecionado inválido")
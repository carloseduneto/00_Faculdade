numerador=5
denomidador=3
divisao=numerador/denomidador
print(f"{numerador} / {denomidador} = {divisao:.2f}") #:.Xf casas depois da vírgula
print(f"{numerador} / {denomidador} = {int(divisao)}") #int() converte para inteiros
print(divisao-int(divisao))

divisao_str=f"R$ {divisao:.2f}"
print(divisao_str)
#print(type(divisao_str))
DivisaoVirg= divisao_str.replace(".", ",") #substituir . por ,
print(DivisaoVirg)

#upper MAIÚSCULO
#lower minúsculo
#capitalize Cada Inicial Com Maiúsculo
#find procurar algo
#strip ]
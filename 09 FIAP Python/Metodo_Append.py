
Inventario=[]
Resposta="S"
while Resposta=="S":
    Inventario.append(input("Equipamento: "))
    Inventario.append(float(input("Valor: ")))
    Inventario.append(int(input("Número Serial: ")))
    Inventario.append(input("Departamento: "))
    Resposta=input('Digite "S" para continuar: ').upper()
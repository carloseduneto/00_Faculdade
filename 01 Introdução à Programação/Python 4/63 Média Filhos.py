def Sal (valorTotalSalario, qtTotalRespostas):
    mediaSalario = valorTotalSalario / qtTotalRespostas
    print("A média dos salários é de R$ ", mediaSalario)

def Fil (qtdTotalFilhos, qtTotalRespostas):
    mediaFilhos = qtdTotalFilhos / qtTotalRespostas
    print("\nA média de filhos é de ",mediaFilhos)

def Men (salarioMenor, qtTotalRespostas):
    porcSalarioMenor = ((salarioMenor / qtTotalRespostas) * 100)
    print(salarioMenor)
    print(qtTotalRespostas)
    print("\nO percentual de pessoas com salário abaixo de R$350,00 é ",porcSalarioMenor , "%")


auxiliar = 1
qtTotalRespostas = 0
qtdTotalFilhos =0 
valorTotalSalario = 0
maiorSalario = 0
mediaSalario = 0
mediaFilhos = 0
salarioMenor = 0
porcSalarioMenor = 0
	
while(auxiliar == 1):
    filhos = 0
    salario = 0
    salario=float(input("Qual o seu salário? "))
    filhos=int(input("Quantos filhos você tem? "))
    qtTotalRespostas=+1
    qtdTotalFilhos += filhos 
    valorTotalSalario += salario
	    
    if salario>maiorSalario:
        maiorSalario = salario
    elif salario<=350:
        salarioMenor=+1
	    
    print("Deseja enviar mais uma resposta?")
    auxiliar=int(input("\nDigite '1' para Sim e '2' para Não \n >>"))

Sal (valorTotalSalario, qtTotalRespostas)
Fil (qtdTotalFilhos, qtTotalRespostas)
print("\nO maior salário é de R$ ",maiorSalario)
Men (salarioMenor, qtTotalRespostas)
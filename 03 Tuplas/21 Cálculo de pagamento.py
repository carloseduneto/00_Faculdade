def CalculoPagamento (HorasTrabalhadas, ValorHora):
    SalarioBase= HorasTrabalhadas*ValorHora*4
    INSS= SalarioBase*0.08
    return SalarioBase, INSS

SalarioBruto, Desconto = CalculoPagamento(40, 50.00)

print(f'Salário Bruto: R$ {SalarioBruto}')
print(f'Desconto: {Desconto} ')
print(f'Salário Líquido: {SalarioBruto-Desconto}')
print(':'*20)
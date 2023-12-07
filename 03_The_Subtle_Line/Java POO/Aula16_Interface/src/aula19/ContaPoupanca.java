package aula19;

public class ContaPoupanca implements Conta {
	private double saldo;

	public double getSaldo() {
		return saldo;
	}
	public void deposito(double valor) {
		saldo += valor;
	}
	public void saque(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
}
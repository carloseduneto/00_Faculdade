package aula19;

public class ContaCorrente  implements Conta{
	private double saldo;
	private double limitePadrao;

	public ContaCorrente(double limitePadrao) {
		this.limitePadrao = limitePadrao;
	}
	public double getSaldo() {
		return saldo;
	}
	public void deposito(double valor) {
		saldo += valor;
	}
	public void saque(double valor) {
		if (valor <= saldo + limitePadrao) {
			saldo -= valor;
		}else {
			System.out.println("Saldo Insuficiente");
		}
	}
}
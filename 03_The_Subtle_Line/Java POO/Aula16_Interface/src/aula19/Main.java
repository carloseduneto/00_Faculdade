package aula19;

public class Main {
	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente(1000);
		contaCorrente.deposito(1000);
		contaCorrente.saque(500);
		System.out.println("Saldo da conta corrente: "+contaCorrente.getSaldo());
		
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.deposito(2000);
		contaPoupanca.saque(1000);
		System.out.println("Saldo da conta Poupança: "+contaPoupanca.getSaldo());

	}

}
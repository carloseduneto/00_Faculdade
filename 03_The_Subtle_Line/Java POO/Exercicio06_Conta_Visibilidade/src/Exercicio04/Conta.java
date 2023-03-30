package Exercicio04;

public class Conta {

	String dono;
	int numero;
	double saldo;
	double limite;
	

	
	private void saque(double quantidade) {
		saldo = saldo - quantidade;
	}
	
	private void deposito (double quantidade) {
		saldo = saldo + quantidade;
	}
	
	public double verificaSaldo() {
		return saldo;
	}
	
	public double verificaLimite() {
		return limite;
	}
	
	private void alteraLimite(double novoLimite) {
		limite = novoLimite;
	}
	
	private void aumentaLimite(double quantidade) {
		limite = limite + quantidade;
	}
	
	private void diminuiLimite(double quantidade) {
		limite = limite - quantidade;
	}
	
	public Conta(String dono, int numero, double saldo, double limite) {
		// TODO Auto-generated constructor stub
	}

}

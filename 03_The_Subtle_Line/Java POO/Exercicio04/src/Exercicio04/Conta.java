package Exercicio04;

public class Conta {

	String dono = "João Vinícius";
	int numero = 324;
	double saldo = 0;
	double limite = 600.00;
	
	void saque(double quantidade) {
		saldo = saldo - quantidade;
	}
	
	void deposito (double quantidade) {
		saldo = saldo + quantidade;
	}
	
	double verificaSaldo() {
		return saldo;
	}
	
	double verificaLimite() {
		return limite;
	}
	
	void alteraLimite(double novoLimite) {
		limite = novoLimite;
	}
	
	void aumentaLimite(double quantidade) {
		limite = limite + quantidade;
	}
	
	void diminuiLimite(double quantidade) {
		limite = limite - quantidade;
	}
	public Conta() {
		// TODO Auto-generated constructor stub
	}

}

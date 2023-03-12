package Aula04_Sobrecarga;

public class Conta {

	String dono = "Sicrano", mensagem;
	int numero = 123; 
	double saldo = 0, limite = 100;
	
	public Conta(String dono, int numero, double saldo, double limite) {
		this.dono = dono;
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	void saque (float quantidade) {
		saldo = saldo - quantidade;
	}
	
	void deposito (double quantidade) {
		saldo = saldo + quantidade;
	}
	
	double verficaSaldo () {
		return saldo;
	}
	
	double vericaLimite() {
		return limite;
	}
	
	void alteraLimite(double novoLimite) {
		limite = novoLimite;
	}
	
	void aumentaLimite(double quantidade) {
		limite = limite +quantidade;
	}
	
	void diminuiLimite (double quantidade) {
		limite = limite - quantidade;
	}
	
	String retorno () {
		mensagem = dono;
		return mensagem;
	}

}

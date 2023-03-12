package Aula04_Sobrecarga;

public class Main {

	public static void main(String[] args) {
		new Pessoa();
		new Pessoa("João Vinícius");
		new Pessoa("João Vinícius", 30);

		
		Conta novaConta = new Conta("João Vinicius", 696, 0, 200);
		novaConta.deposito(50);
		novaConta.saque(23);
		novaConta.alteraLimite(3000);
		System.out.println(novaConta.retorno());
		System.out.println(novaConta.verficaSaldo());
		System.out.println(novaConta.vericaLimite());
		
	}

}

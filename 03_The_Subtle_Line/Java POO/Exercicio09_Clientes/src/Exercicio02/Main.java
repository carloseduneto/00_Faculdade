package Exercicio02;

public class Main {

	public static void main(String[] args) {
		Endereco endereco01 = new Endereco("Rua Disney", 200);
		Cliente cliente01 = new Cliente("Luizinho", endereco01);
		Cliente cliente02 = new Cliente("Higuinho", endereco01);
		Cliente cliente03 = new Cliente("Zezinho", endereco01);
		
		endereco01.exibir();
		

	}

}

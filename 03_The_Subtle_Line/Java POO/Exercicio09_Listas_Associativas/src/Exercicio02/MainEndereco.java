package Exercicio02;

public class MainEndereco {

	public static void main(String[] args) {
		Endereco endereco01 = new Endereco("Disney", 200);
		Cliente cliente01 = new Cliente("Luizinho");
		Cliente cliente02 = new Cliente("Huguinho");
		Cliente cliente03 = new Cliente("Zezinho");
		
		endereco01.adicionarCliente(cliente01);
		endereco01.adicionarCliente(cliente02);
		endereco01.adicionarCliente(cliente03);
		
		cliente01.adicionaEndereco(endereco01);
		cliente02.adicionaEndereco(endereco01);
		cliente03.adicionaEndereco(endereco01);
		
		endereco01.exibir();
		
		for(Cliente todosClientes : endereco01.getClientes()) {
			System.out.println("Nome: " + todosClientes.getNome());
			System.out.println("Endereço: Rua "+ endereco01.getRua() + ", Nº" + endereco01.getNumero() + "\n");
		}
		
		endereco01.exibir();

	}

}

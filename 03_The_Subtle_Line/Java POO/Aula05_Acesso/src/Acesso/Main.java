package Acesso;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa novaPessoa = new Pessoa();
		novaPessoa.nome ="Jorge";
		System.out.println("Nome: "+novaPessoa.PegaNome());
		System.out.println("Idade: "+novaPessoa.AumentaIdade(22));
		
	}

}

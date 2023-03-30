package Acesso;

public class Pessoa {
	public String nome;
	private int idade;

	public Pessoa() {
		// TODO TODO TODO TODO TODO TODO TODO TODO 
		// TODO Auto-generated constructor stub
	}
	
	public String PegaNome() {
		return nome;
	}
	
	protected int AumentaIdade (int aumento) {
		int novaIdade = idade + aumento;
		return novaIdade;
	}

}

package exemplo01;

public abstract class Empregado {
	private String nome;
	private int idade;

	public Empregado(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public abstract double Ganha();

}

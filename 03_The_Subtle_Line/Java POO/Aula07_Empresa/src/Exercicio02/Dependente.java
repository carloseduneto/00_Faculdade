package Exercicio02;

public class Dependente {
	private String nome;
	private int idade;
	private Socio socio;

	public Dependente(String nome, int idade, Socio socio) {
		this.nome = nome;
		this.idade = idade;
		this.socio = socio;
		socio.adicionarDependente(this);
	}

	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public Socio getSocio () {
		return socio;
	}
}

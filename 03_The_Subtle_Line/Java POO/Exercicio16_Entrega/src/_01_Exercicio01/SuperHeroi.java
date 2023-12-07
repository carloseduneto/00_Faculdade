package _01_Exercicio01;

public abstract class SuperHeroi {
	private String nome;
	private String poder;
	private String identidadeSecreta;
	
	public SuperHeroi() {
		
	}

	public SuperHeroi(String nome, String poder, String identidadeSecreta) {
		this.nome = nome;
		this.poder = poder;
		this.identidadeSecreta = identidadeSecreta;
	}
	
	public String usarPoder() {
		return "Poder usado";
	}

}

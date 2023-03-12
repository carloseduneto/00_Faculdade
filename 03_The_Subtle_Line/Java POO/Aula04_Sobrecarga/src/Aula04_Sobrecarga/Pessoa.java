package Aula04_Sobrecarga;

public class Pessoa {

	String nome;
	int idade;
	
	public Pessoa() {
		System.out.println("Olá pessoa pessoa desconhecida que não conheço.");
	}
	
	public Pessoa(String nome){
		this.nome = nome;
		System.out.println("Olá " + nome);
		
	}
	
	public Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
		System.out.println("Olá " + nome + " e você tem " + idade + " anos!");
	}

}

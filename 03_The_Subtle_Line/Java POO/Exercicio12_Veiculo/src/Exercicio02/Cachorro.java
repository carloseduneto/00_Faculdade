package Exercicio02;

public class Cachorro extends Mamiferos{
	
	public Cachorro(String nome, int idade, String corDoPelo, String raca){
		super(nome, idade, corDoPelo, raca);
	}
	
	public void latir() {
		System.out.println("🐶 Latiu!");
	}
}

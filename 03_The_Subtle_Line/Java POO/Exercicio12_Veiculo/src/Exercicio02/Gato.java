package Exercicio02;

public class Gato extends Mamiferos{
	
	public Gato(String nome, int idade, String corDoPelo, String raca){
		super(nome, idade, corDoPelo, raca);
	}
	
	public void miar() {
		System.out.println("😺 Miou!");
	}
}

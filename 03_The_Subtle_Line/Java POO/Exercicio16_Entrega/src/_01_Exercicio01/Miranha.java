package _01_Exercicio01;

public class Miranha extends SuperHeroi {

	public Miranha(String nome, String poder, String identidadeSecreta) {
		super(nome, poder, identidadeSecreta);
	}
	
	@Override
	public String usarPoder() {
		return "🕷️🕸️Vai teia";
	}
	
	

}
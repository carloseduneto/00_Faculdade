package _01_Exercicio01;

public class Wanda extends SuperHeroi {

	public Wanda(String nome, String poder, String identidadeSecreta) {
		super(nome, poder, identidadeSecreta);
	}
	
	@Override
	public String usarPoder() {
		return "🦹‍♀️ Wanda atirou raios";
	}
	
	

}

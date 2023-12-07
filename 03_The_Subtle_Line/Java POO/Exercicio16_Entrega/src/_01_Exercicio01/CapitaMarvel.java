package _01_Exercicio01;

public class CapitaMarvel extends SuperHeroi {

	public CapitaMarvel(String nome, String poder, String identidadeSecreta) {
		super(nome, poder, identidadeSecreta);
	}
	
	@Override
	public String usarPoder() {
		return "💪🏋️ Jogou um carro!!!";
	}
	
	

}
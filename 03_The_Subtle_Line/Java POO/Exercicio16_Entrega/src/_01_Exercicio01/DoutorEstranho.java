package _01_Exercicio01;

public class DoutorEstranho extends SuperHeroi {

	public DoutorEstranho(String nome, String poder, String identidadeSecreta) {
		super(nome, poder, identidadeSecreta);
	}
	
	@Override
	public String usarPoder() {
		return "✨ Mágica!!!";
	}
	
	

}
package Exercicio02;

public class Peixes extends Animais {
	private String corDasEscamas;
	
	public Peixes(String nome, int idade, String corDaEscamas) {
		super(nome, idade);
		this.corDasEscamas = corDaEscamas;
	}

	public String getCorDasEscamas() {
		return corDasEscamas;
	}

	public void setCorDasEscamas(String corDasEscamas) {
		this.corDasEscamas = corDasEscamas;
	}
	
	public void nadar() {
		System.out.println("🐟 Nadou!");
	}

}

package Exercicio02;

public class Mamiferos extends Animais {
	private String corDoPelo;
	private String raca;
	
	public Mamiferos(String nome, int idade, String corDoPelo, String raca) {
		super(nome, idade);
		this.corDoPelo = corDoPelo;
		this.raca = raca;
	}

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void andar() {
		System.out.println("Andou!");
	}

}

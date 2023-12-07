package Exercicio02;

public class Aves extends Animais{
	private String especie;
	private String corDasPenas;
	
	public Aves(String nome, int idade, String especie, String corDasPenas) {
		super (nome, idade);
		this.corDasPenas = corDasPenas;
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getCorDasPenas() {
		return corDasPenas;
	}

	public void setCorDasPenas(String corDasPenas) {
		this.corDasPenas = corDasPenas;
	}
	
	public void voar() {
		System.out.println("🐦 Voou!");
	}

}

package _01_Exemplo;

public class Nota {
	private double prova01;
	private double prova02;
	private final static double media = 7; 
	
	
	public Nota(double prova01, double prova02) {
		this.prova01 = prova01;
		this.prova02 = prova02;
	}


	public double getProva01() {
		return prova01;
	}


	public double getProva02() {
		return prova02;
	}


	public static double getMedia() {
		return media;
	}
	

}

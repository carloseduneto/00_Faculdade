package Sobrecarga;

public class Main {
	public static void main(String[] args) {
		Sobrecarga pessoa01 = new Sobrecarga("Cauã", 22, 1.80, 75);
		System.out.println(pessoa01.calculaImc());
		
		Sobrecarga pessoa02 = new Sobrecarga("Jéssica", 12);
		System.out.println(pessoa02.calculaImc(1.64, 65));
	
	}
}

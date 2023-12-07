package Brinquedos;

public class Main {

	public static void main(String[] args) {
		Brinquedo brinquedo01 = new Brinquedo();
		brinquedo01.setAceleracao(10);
		brinquedo01.setVelocidade(70);
		brinquedo01.mover();
		
		double aceleracao02 = 10;
		double velocidade02 = 80;
		Brinquedo brinquedo02 = new Brinquedo(velocidade02, aceleracao02);
		brinquedo02.mover();
		
		double velocidade03 = 60;
		double aceleracao03 = 12;
		Brinquedo brinquedo03 = new Brinquedo();
		brinquedo03.mover(velocidade03, aceleracao03);
	}

}

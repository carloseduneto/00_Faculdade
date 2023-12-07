package Brinquedos2;

public class Main {

	public static void main(String[] args) {
		Aviao aviao01 = new Aviao(90, 9);
		aviao01.mover();
		
		Barco barco01 = new Barco(70, 8);
		barco01.mover();
		
		Carro carro01 = new Carro(100, 12);
		carro01.mover();
	}

}

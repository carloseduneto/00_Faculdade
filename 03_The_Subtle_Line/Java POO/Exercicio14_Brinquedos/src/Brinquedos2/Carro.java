package Brinquedos2;

public class Carro extends Brinquedo {

	public Carro(double velocidade, double aceleracao) {
		super(velocidade, aceleracao);
	}

	@Override
	public void mover() {
		System.out.println("🚗 Andou");
	}
}
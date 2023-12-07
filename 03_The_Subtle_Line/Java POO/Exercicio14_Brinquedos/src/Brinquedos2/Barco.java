package Brinquedos2;

public class Barco extends Brinquedo {

	public Barco(double velocidade, double aceleracao) {
		super(velocidade, aceleracao);
	}

	@Override
	public void mover() {
		System.out.println("🛥️ Navegou");
	}
}
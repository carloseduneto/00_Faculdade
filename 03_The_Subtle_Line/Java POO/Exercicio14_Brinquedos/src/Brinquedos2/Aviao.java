package Brinquedos2;

public class Aviao extends Brinquedo {

	public Aviao(double velocidade, double aceleracao) {
		super(velocidade, aceleracao);
	}

	@Override
	public void mover() {
		System.out.println("✈️ Voou");
	}
}

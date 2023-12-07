package Exercicio01;

public class Carro extends Veiculo{
	private int numPortas;

	public Carro(double velocidade, String marca, int distancia, int numPortas) {
		super(velocidade, marca, distancia);
		this.numPortas = numPortas;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	@Override
	public String Mover() {
		System.out.println("Moveu carro!!!");
		return null;
	}
	
	
	
	

}

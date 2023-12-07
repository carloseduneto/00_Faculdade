package Exercicio01;

public class Carro extends Veiculo {
	private int numeroPortas;
	
	public Carro(String marca, double velocidade, int numeroPortas) {
		super(marca, velocidade);
		this.numeroPortas = numeroPortas;
	}

	public int getNumeroPortas() {
		return numeroPortas;
	}

	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}

	
	
}

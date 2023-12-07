package Exercicio01;

public abstract class Veiculo {
	private double velocidade;
	private String marca;
	private int distancia;
	
	public Veiculo() {
	
	}

	public Veiculo(double velocidade, String marca, int distancia) {
		this.velocidade = velocidade;
		this.marca = marca;
		this.distancia = distancia;
	}
	
	public abstract String Mover();
	

}

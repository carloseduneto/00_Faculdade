package Exercicio01;

public class Moto extends Veiculo {
	private String tamanho;
	
	public Moto(String marca, double velocidade, String tamanho) {
		super(marca, velocidade);
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	

}

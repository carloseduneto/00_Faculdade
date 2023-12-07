package Brinquedos;

public class Brinquedo {
	private double velocidade;
	private double aceleracao;
	
	public Brinquedo() {
	}
	
	public Brinquedo(double velocidade) {
		this.aceleracao = aceleracao;
	}
	
	public Brinquedo(double velocidade, double aceleracao) {
		this.aceleracao = aceleracao;
		this.velocidade = velocidade;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getAceleracao() {
		return aceleracao;
	}

	public void setAceleracao(double aceleracao) {
		this.aceleracao = aceleracao;
	}
	
	public void mover() {
		System.out.println("Moveu à "+ velocidade + "km/h e  " + aceleracao + "m/s²");
	}
	
	public void mover(double aceleracao) {
		System.out.println("Moveu à "+ velocidade + "km/h e " + aceleracao + "m/s²");
	}
	
	public void mover(double velocidade, double aceleracao) {
		System.out.println("Moveu à "+ velocidade + "km/h e " + aceleracao + "m/s²");
	}
	
	

}

package aula20;

public class Carro extends VeiculoMotorizado{
	private int numPortas;
	
	public Carro() {
		// TODO Auto-generated constructor stub
	}

	public Carro(int numPortas, String marca, String modelo) {
		super(marca, modelo);
		this.numPortas = numPortas;
	}

	public int getNumPortas() {
		return numPortas;
	}
	
	public void acelerar() {
		System.out.println("O carro está acelerando!");
	}
	public void frear() {
		System.out.println("O carro está freando!");
	}
	
	

}

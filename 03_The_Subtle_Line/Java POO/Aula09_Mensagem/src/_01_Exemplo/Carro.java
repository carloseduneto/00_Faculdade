package _01_Exemplo;



public class Carro {
	private String modelo;
	private Motor motor = new Motor();
	
	
	public Carro(String modelo) {
		this.modelo = modelo;
	}
	
	public void Andar() {
		motor.Ligar();
		System.out.println("Carro andando...");
	}
	
	public void Parar() {
		System.out.println("Carro Parando...");
		motor.Desligado();
	}

}

package _01_Exemplo;

public void print( Object linha) {
	System.out.println(linha);
}
public class Motor {
	private String potencia;
	private Boolean ligado;

	public Motor() {
	
	}

	public void Ligar() {
		ligado = true;
		System.out.println("Motor Ligado!");
	}
	
	public void Desligado() {
		ligado = false;
		System.out.println("Motor Desligado");
	}
}

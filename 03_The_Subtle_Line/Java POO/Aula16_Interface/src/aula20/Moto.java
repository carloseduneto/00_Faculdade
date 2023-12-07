package aula20;

public class Moto extends VeiculoMotorizado{
	private boolean partidaEletrica ;
	
	public Moto() {
		// TODO Auto-generated constructor stub
	}

	public Moto(boolean partidaEletrica, String marca, String modelo) {
		super(marca, modelo);
		this.partidaEletrica = partidaEletrica;
	}

	public boolean getParidaEletrica() {
		return partidaEletrica;
	}
	
	public void acelerar() {
		System.out.println("A moto está acelerando!");
	}
	public void frear() {
		System.out.println("A moto está freando!");
	}
	
	

}

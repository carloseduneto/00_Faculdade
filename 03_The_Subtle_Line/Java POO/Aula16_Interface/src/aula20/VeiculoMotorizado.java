package aula20;

public abstract class VeiculoMotorizado implements Veiculo {
	private String marca;
	private String modelo;
	
	public VeiculoMotorizado() {
		
	}

	public VeiculoMotorizado(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	

}

package Exercicio02;

public class ModeloTV extends TV implements ControleRemoto {
	private String marca;
	private String modelo;
	
	public ModeloTV() {
		
	}
	
	public ModeloTV(int tamanho) {
		super(tamanho);
	}

	@Override
	public void AumentaVolume(int taxa) {
		System.out.println("O volume foi para " + taxa);
		
	}

	@Override
	public void DiminiuVolume(int taxa) {
		System.out.println("O volume foi para " + taxa);
		
	}

	@Override
	public boolean Ligar() {
		System.out.println("Televisão ligada");
		return false;
	}

	@Override
	public boolean Desligar() {
		System.out.println("Televisão desligada");
		return false;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}

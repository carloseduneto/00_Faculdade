package EmpresaVeiculos;

public class Veiculo {
	private String marca;
	private String modelo;
	private String cor;
	
	
	public Veiculo(String marca, String modelo, String cor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
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


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public void descricao() {
		System.out.println(
				"Marca: " + marca +
				"Modelo: " + modelo +
				"Cor: " + cor
				);
		
	}

}

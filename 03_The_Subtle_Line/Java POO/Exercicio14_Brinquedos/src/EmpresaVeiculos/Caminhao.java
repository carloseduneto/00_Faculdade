package EmpresaVeiculos;

public class Caminhao extends Veiculo {
	private int capacidadeCarga;
	
	public Caminhao(String marca, String modelo, String cor, int capacidadeCarga) {
		super(marca, modelo, cor);
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	
	@Override
	public void descricao() {
		System.out.println(
				"Marca: " + getMarca() +
				"\nModelo: " + getModelo() +
				"\nCor: " + getCor() +
				"\nCapacidade de Carga: " + getCapacidadeCarga() + " toneladas"
				);
		
	}

}

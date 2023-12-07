package EmpresaVeiculos;

public class Onibus extends Veiculo {
	private int numeroPassageiros;

	public Onibus(String marca, String modelo, String cor, int numeroPassageiros) {
		super(marca, modelo, cor);
		this.numeroPassageiros = numeroPassageiros;
	}

	public int getNumeroPassageiros() {
		return numeroPassageiros;
	}

	public void setNumeroPassageiros(int numeroPassageiros) {
		this.numeroPassageiros = numeroPassageiros;
	}
	
	@Override
	public void descricao() {
		System.out.println(
				"Marca: " + getMarca() +
				"\nModelo: " + getModelo() +
				"\nCor: " + getCor() +
				"\nQuantidade de passgeiros: " + getNumeroPassageiros()
				);
	}

}

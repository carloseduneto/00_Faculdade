package _01_Exercicio;

public class Motorista extends Pessoa {
	private String carteiraHabilitacao;
	private Veiculo veiculo;

	public Motorista(String nome, int idade, String carteiraHabilitacao) {
		super(nome, idade);
		if (carteiraHabilitacao == "A" ||carteiraHabilitacao == "B" ||carteiraHabilitacao == "C" ||carteiraHabilitacao == "D") {
			this.carteiraHabilitacao = carteiraHabilitacao;
		}else {
			carteiraHabilitacao = "Indefinido";
		}
	}

	public String getCarteiraHabilitacao() {
		return carteiraHabilitacao;
	}

	public void setCarteiraHabilitacao(String carteiraHabilitacao) {
		this.carteiraHabilitacao = carteiraHabilitacao;
	}

	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void printarObjeto() {
		System.out.println(
				"Nome: " + getNome() +
				"\nIdade: " + getIdade() +
				"\nCarteira de Habilitação: " + carteiraHabilitacao + 
				"\nVeículo: "   + veiculo.getModelo()
				);
	}

}

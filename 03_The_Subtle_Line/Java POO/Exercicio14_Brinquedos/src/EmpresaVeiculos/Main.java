package EmpresaVeiculos;

public class Main {

	public static void main(String[] args) {
		Veiculo caminhao01 = new Caminhao("Merceges", "1313", "Amarelo", 23);
		Veiculo onibus01 = new Onibus("Volkswagen", "1234", "Verde", 40);
		
		caminhao01.descricao();
		System.out.println("");
		onibus01.descricao();
	}

}

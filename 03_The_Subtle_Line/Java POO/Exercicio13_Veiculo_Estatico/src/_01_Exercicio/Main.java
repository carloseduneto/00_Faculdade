package _01_Exercicio;

public class Main {

	public static void main(String[] args) {
		Motorista motorista01 = new Motorista("Jorge", 33, "B");
		Veiculo veiculo01 = new Veiculo("AAAA-999", "2003", "Chevolet", "Agile", 25000.99);
		
		motorista01.setVeiculo(veiculo01);
		veiculo01.setMotoristas(motorista01);
		
		motorista01.printarObjeto();
		veiculo01.printarObjeto();

	}

}

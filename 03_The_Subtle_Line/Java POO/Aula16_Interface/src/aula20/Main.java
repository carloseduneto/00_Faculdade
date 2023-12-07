package aula20;

public class Main {

	public static void main(String[] args) {
		Veiculo carro = new Carro(9, "Ferrari", "Azul");
		System.out.println("Marca: "+ ((VeiculoMotorizado) carro).getMarca());
		System.out.println("Modelo: "+ ((VeiculoMotorizado) carro).getModelo());
		System.out.println("Número de portas: "+ ((Carro) carro).getNumPortas());
		carro.frear();
		carro.acelerar();
		
		System.out.println("*********");
		
		
		Veiculo moto = new Moto(true, "Honda", "NXR 160");
		System.out.println("Marca: "+ ((VeiculoMotorizado) moto).getMarca());
		System.out.println("Modelo: "+ ((VeiculoMotorizado) moto).getModelo());
		System.out.println("Número de portas: "+ ((Moto) moto).getParidaEletrica());
		moto.frear();
		moto.acelerar();

	}

}

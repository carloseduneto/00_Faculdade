package Exercicio02;

public class Main {

	public static void main(String[] args) {
		ModeloTV tv = new ModeloTV(56);
		
		tv.setCanal(51);
		tv.setMarca("Samsung");
		tv.setModelo("LED");
		tv.setVolume(34);
		
		System.out.println(
				"Modelo: " + tv.getModelo() +
				"\nCanal: " + tv.getCanal() +
				"\nMarca: " + tv.getModelo() +
				"\nModelo: " + tv.getVolume()
				);
		
		tv.AumentaVolume(37);
		tv.DiminiuVolume(31);
		tv.Ligar();
		tv.Desligar();
		

	}

}

package Exercicio01;

public class Main {

	public static void main(String[] args) {
		Moto moto01 = new Moto("Honda", 300, "1,80 m");
		System.out.println("Marca: " + moto01.getMarca()+
						   "\nVelocidade: " + moto01.getVelocidade()+
						   "\nTamanho: " + moto01.getTamanho()
				);
		
		System.out.println(" ");
		
		Carro carro01 = new Carro("Fiat", 200, 4);
		System.out.println("Marca: " + carro01.getMarca()+
				"\nVelocidade: " + carro01.getVelocidade()+
				"\nNúmero de portas: " + carro01.getNumeroPortas()
				);
		
				
	}

}

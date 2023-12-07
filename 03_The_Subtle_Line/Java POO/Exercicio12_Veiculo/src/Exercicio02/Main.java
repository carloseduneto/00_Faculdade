package Exercicio02;

public class Main {

	public static void main(String[] args) {
		Cachorro cachorro01 = new Cachorro("Pluto", 5 , "Caramelo", "Bloodhound");
		System.out.println("Nome:" + cachorro01.getNome()+
							"\nIdade: " + cachorro01.getIdade()+ " anos " +
							"\nCor: "+ cachorro01.getCorDoPelo()+
							"\nRaça: "+ cachorro01.getRaca());
		cachorro01.andar();
		cachorro01.latir();
		System.out.println("");
		
		////////////////////////////////////////////////
		
		Gato gato01 = new Gato("Garfield", 4, "Laranja", "Gato Persa");
		System.out.println("Nome:" + gato01.getNome()+
				"\nIdade: " + gato01.getIdade()+ " anos " +
				"\nCor: "+ gato01.getCorDoPelo()+
				"\nRaça: "+ gato01.getRaca());
		gato01.andar();
		gato01.miar();
		System.out.println("");
		
		/////////////////////////////////////////////////
		
		Aves ave01 = new Aves("Patolino", 12, "Pato", "Brancas");
		System.out.println("Nome: "+ ave01.getNome() +
				"\nIdade: " + ave01.getIdade()+ " anos " +
				"\nEspécie: " + ave01.getEspecie() +
				"\nCor das Penas: " + ave01.getCorDasPenas()
				);
		ave01.voar();
		System.out.println("");
		
		
		/////////////////////////////////////////////////
		
		Peixes peixe01 = new Peixes("Nemo", 2, "Laranja");
		System.out.println("Nome: " + peixe01.getNome()+
				"\nIdade: " + peixe01.getIdade()+ " anos " +
				"\nCor das escamas: " + peixe01.getCorDasEscamas());
		peixe01.nadar();
		

	}

}

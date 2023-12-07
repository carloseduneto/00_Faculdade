package Exercicio03;

public class MainAnimaisDeEstimacao {

	public static void main(String[] args) {
		AnimalDeEstimacao cachorro = new Cachorro("Alfredo Augusto", 4);
		cachorro.brincar();
		((Cachorro)cachorro).come();
		System.out.println(((Cachorro)cachorro).getNome());
		
		AnimalDeEstimacao peixe = new Peixe(0);
		((Peixe)peixe).setNome("Skip");
		((Peixe)peixe).brincar();
		((Peixe)peixe).come();
	}

}

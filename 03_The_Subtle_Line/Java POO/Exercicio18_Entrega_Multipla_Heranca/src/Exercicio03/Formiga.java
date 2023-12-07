package Exercicio03;

public class Formiga extends Animal{

	public Formiga(int pernas) {
		super(pernas);
	}
	
	@Override
	public void come() {
		System.out.println("A formiga come.");
	}

	
	public void caminhar() {
		System.out.println("A formiga anda.");	
	}
	
	
	

}

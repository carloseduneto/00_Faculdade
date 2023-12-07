package Exercicio04;

public abstract class Animal {
	protected int pernas = 0;
	
	public Animal(int pernas) {
		this.pernas = pernas;
	}
	
	public abstract void caminhar();
	
	public abstract void come();

}

package Exercicio03;

public class Cachorro extends Animal implements AnimalDeEstimacao {
	public String nome;
	
	public Cachorro(int perna) {
		super(perna);
	}
	
	public Cachorro(String nome, int pernas) {
		super(pernas);
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
		
	}

	@Override
	public void brincar() {
		System.out.println("O titil tá brincando");
		
	}

	@Override
	public void caminhar() {
		System.out.println("O cachorrinho tá caminhando.");
		
	}

	@Override
	public void come() {
		System.out.println("O cachorrinho tá comendo.");
		
	}

}

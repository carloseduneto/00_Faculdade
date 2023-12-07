package Exercicio04;

public class Peixe extends Animal implements AnimalDeEstimacao {
	public String nome;
	
	public Peixe(int perna)  {
		super(perna);
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
		System.out.println("O peixe tá brincando");
		
	}


	@Override
	public void come() {
		System.out.println("O peixinho tá comendo.");
		
	}



	@Override
	public void caminhar() {
		// TODO Auto-generated method stub
		
	}

}

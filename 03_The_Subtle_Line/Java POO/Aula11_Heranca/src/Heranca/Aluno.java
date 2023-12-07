package Heranca;

public class Aluno extends PessoaFisica {
	private int matricula;
	
	public Aluno(String nome, int idade, String cpf, String apelido, int matricula) {
		super(nome, idade, cpf,apelido);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}
	

}

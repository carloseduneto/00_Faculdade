package Heranca;

public class Professor extends PessoaFisica{
	private String disciplina;
	
	public Professor(String nome, int idade, String cpf, String apelido, String disciplina) {
		super(nome, idade, cpf, apelido);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}
	
	

}

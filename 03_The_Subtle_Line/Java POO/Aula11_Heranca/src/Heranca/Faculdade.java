package Heranca;

public class Faculdade extends PessoaJuridica {
	private String curso;
	
	public Faculdade(String nome, int idade, String cnpj, String razaoSocial, String curso) {
		super(nome, idade, cnpj, razaoSocial);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	
}

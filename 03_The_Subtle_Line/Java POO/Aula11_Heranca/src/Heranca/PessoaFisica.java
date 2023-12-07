package Heranca;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String apelido;
	
	public PessoaFisica(String nome, int idade, String cpf, String apelido) {
		super(nome, idade);
		this.cpf = cpf;
		this.apelido = apelido;
	}

	public String getCpf() {
		return cpf;
	}

	public String getApelido() {
		return apelido;
	}

	
}

package Heranca;

public class PessoaJuridica extends Pessoa {
	private String razaoSocial;
	private String cnpj;

	public PessoaJuridica(String nome, int idade, String cnpj, String razaoSocial) {
		super(nome, idade);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	
}

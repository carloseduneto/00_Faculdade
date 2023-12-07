package Exercicio03;

public class Endereco {
	private String logradouro, numero, bairro;
	private Cidade cidade;
	private Responsavel responsavel;
	
	public Endereco(String logradouro, String numero, String bairro, Cidade cidade) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	public String getLogradouro () {
		return logradouro;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public Responsavel getResponsavel() {
		return responsavel;
	}
	
	public Cidade getCidade() {
		return cidade;
	}

}

package Empresa;

public class Departamento {
	
	private String nome;
	private String nomeDepartamento;
	
	
	public Departamento() {
		
	}
	
	public Departamento(String nome, String nomeDepartamento) {
		this.nome = nome;
		this.nomeDepartamento = nomeDepartamento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNumero() {
		return nomeDepartamento;
	}

}

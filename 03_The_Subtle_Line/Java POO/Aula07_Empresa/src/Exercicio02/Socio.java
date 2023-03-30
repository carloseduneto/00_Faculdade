package Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Socio {

	private String nome;
	private String endereco;
	private String telefone;
	private List<Dependente> dependentes;
	
	
	public Socio(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dependentes = new ArrayList<Dependente>();
		// TODO Auto-generated constructor stub
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public List<Dependente> getDependetes(){
		return dependentes;
	}
	
	public void adicionarDependente (Dependente dependente) {
		dependentes.add(dependente);
	}

}

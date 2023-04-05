package Socio;

import java.util.ArrayList;
import java.util.List;

public class Socio {
	private String nome;
	private String endereco;
	private String telefone;
	private ArrayList<Dependente> dependentes;
	
	
	public Socio(String nome, String endereco, String telefone) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dependentes = new ArrayList<Dependente>();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public List<Dependente> getDependentes() {
		return dependentes;
	}


	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = (ArrayList<Dependente>) dependentes;
	}


	public void adicionarDepedente(Dependente dependente) {
		dependentes.add(dependente);
		
	}
	
	

}

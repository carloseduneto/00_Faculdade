package Exercicio03;

import java.util.ArrayList;

public class Responsavel {
	private String nome, cpf, telefone, email;
	private Endereco endereco;
	private ArrayList<Crianca> criancas;
	
	
	public Responsavel(String nome, String cpf, String telefone, String email, Endereco endereco) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone; 
		this.email = email;
		this.endereco = endereco;
		criancas = new ArrayList<>();
	}
	
	public void adicionarCrianca(Crianca crianca) {
		criancas.add(crianca);
	}


	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}


	public String getTelefone() {
		return telefone;
	}


	public String getEmail() {
		return email;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public ArrayList<Crianca> getCriancas() {
		return criancas;
	}

}

package Exercicio02;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private ArrayList<Endereco> enderecos;

	
	
	public Cliente(String nome, Endereco endereco01) {
		this.nome = nome;
		this.enderecos = new ArrayList<>;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}



	public void setEnderecos(ArrayList<Endereco> enderecos) {
		this.enderecos = enderecos;
	}


	public void adicionarEndereco (Endereco endereco) {
		enderecos.add(endereco);
	}

	public Cliente() {
		
	}

}

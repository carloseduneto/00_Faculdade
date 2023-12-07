package Exercicio02;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private ArrayList<Endereco> enderecos;
	
	public Cliente (String nome) {
		this.nome = nome;
		this.enderecos = new ArrayList<>();
	}
	
	public void adicionaEndereco(Endereco novoEndereco) {
		enderecos.add(novoEndereco);
	}
	
	public void removerEndereco(Endereco enderecoRemover) {
		enderecos.remove(0);
	}
	
	public String getNome() {
		return nome;
	}
	
	public ArrayList<Endereco> getEndereco() {
		return enderecos;
	}
	

}

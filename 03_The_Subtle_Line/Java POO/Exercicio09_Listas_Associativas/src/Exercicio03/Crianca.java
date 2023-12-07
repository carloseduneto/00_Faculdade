package Exercicio03;

import java.util.ArrayList;

public class Crianca {
	private String nome;
	private int idade;
	private ArrayList<Responsavel> responsaveis;
	
	public Crianca(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.responsaveis = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public ArrayList<Responsavel> getResponsaveis(){
		return responsaveis;
	}

}

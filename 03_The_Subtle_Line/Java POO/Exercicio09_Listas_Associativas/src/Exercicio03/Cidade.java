package Exercicio03;

import java.util.ArrayList;

public class Cidade {
	private String nome;
	private String estado;
	private ArrayList<Endereco> enderecos;
	
	
	public Cidade(String nome, String estado ){
		this.nome= nome;
		this.estado = estado;
		this.enderecos = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public ArrayList<Endereco> getEndereco(){
		return enderecos;
	}

}

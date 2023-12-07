package _03_Fones_De_Ouvido;

import java.util.ArrayList;
import java.util.List;

public class Marca {
	private String nome;
	private String paisOrigem;
	private ArrayList<Fone> fone;
	
	public Marca(String nome, String paisOrigem, Fone fone) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.paisOrigem = paisOrigem;
		this.fone = new ArrayList<Fone>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String paisOrigem() {
		return paisOrigem;
	}
	
	public ArrayList<Fone> getFone(){
		return fone;
	}
}

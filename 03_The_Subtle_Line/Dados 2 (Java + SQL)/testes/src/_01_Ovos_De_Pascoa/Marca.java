package _01_Ovos_De_Pascoa;

import java.util.ArrayList;
import java.util.List;

public class Marca {
	private String nome;
	private List<Chocolate> chocolates;
	
	public Marca(String nome) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.chocolates = new ArrayList<>();
	}
	
	public void adicionarChocolate(Chocolate chocolate) {
		chocolates.add(chocolate);
	}
	
	public List<Chocolate> getChocolate(){
		return chocolates;
	}
	
	public String getNome(){
		return nome;
	}

}

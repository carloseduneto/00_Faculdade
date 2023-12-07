package org.libertas.objetos;

import java.util.LinkedList;

public class ListaPessoas {
	private static LinkedList<Pessoa> pessoas = new LinkedList<Pessoa>();
	
	public ListaPessoas() {
		// TODO Auto-generated constructor stub
	}
	
	public void adicionar(Pessoa p) {
		pessoas.add(p);
	}
	
	public LinkedList<Pessoa> listar() {
		return pessoas;
	}

}

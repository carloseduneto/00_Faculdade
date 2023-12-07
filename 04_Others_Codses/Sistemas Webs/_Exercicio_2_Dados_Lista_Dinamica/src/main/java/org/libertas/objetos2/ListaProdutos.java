package org.libertas.objetos2;

import java.util.LinkedList;

public class ListaProdutos {
	private static LinkedList<Produtos> produtos = new LinkedList<Produtos>();
	
	public ListaProdutos() {
		// TODO Auto-generated constructor stub
	}
	
	public void adicionar(Produtos p) {
		produtos.add(p);
	}
	
	public LinkedList<Produtos> listar() {
		return produtos;
	}

}

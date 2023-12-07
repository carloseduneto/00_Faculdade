package Exercicio01_V2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private int idCliente;
	private ArrayList<Pedido> pedidos;
	
	
	public Cliente(String nome, int idCliente) {
		this.nome = nome;
		this.idCliente = idCliente;
		this.pedidos  = new ArrayList<Pedido>();
	}

	//Métodos para adionar e remover pedidos
	public void adicionarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	public void removerPedido(Pedido pedido) {
		pedidos.remove(0);
	}

	
	//Informações dos clientes
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

		
}

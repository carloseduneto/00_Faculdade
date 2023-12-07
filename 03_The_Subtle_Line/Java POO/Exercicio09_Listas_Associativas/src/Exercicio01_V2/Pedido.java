package Exercicio01_V2;

import java.util.ArrayList;
import java.util.UUID;

public class Pedido {
	private UUID idPedido;
	private Cliente cliente;
	private String nomeProduto;
	private int quantidade;
	private ArrayList<Cliente> itens;
	
	
	public Pedido(String nomeProduto, int quantidade) {
		this.idPedido = UUID.randomUUID();
		this.cliente = cliente;
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.itens = new ArrayList<Cliente>();
		// TODO Auto-generated constructor stub
	}
	
	//Métodos para adicionar e remover itens da lista
	public void adicionarItem(Cliente item) {
		itens.add(item);
	}
	public void removerItem(Cliente item){
		itens.remove(0);
	}

	//Métodos gets e sets
	public UUID getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(UUID idPedido) {
		this.idPedido = idPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public ArrayList<Cliente> getItens() {
		return itens;
	}
	
	public void setItens(ArrayList<Cliente> itens) {
		this.itens = itens;
	}
	

	
	
	
	
	
	

}
package Exercicio01;

public class Pedido {
	private int numero;
	private String descricao;
	private double valorTotal;
	private Clientes cliente;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(int numero, String descricao, double valorTotal, Clientes cliente) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.valorTotal = valorTotal;
		this.cliente = cliente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	
	
	
	

}
